package com.example.varun.changex;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity implements View.OnClickListener {
    private Button sign_up_java;
    private EditText username_signup_java;
    private EditText email_java;
    private EditText phone_java;
    private EditText password_signup_java;
    private EditText dob_java;
    private FirebaseAuth mAuth;
    ProgressBar progressBar;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        username_signup_java = findViewById(R.id.username_signup_xml);
        password_signup_java = findViewById(R.id.confirm_password_xml);
        email_java = findViewById(R.id.email_xml);
        phone_java = findViewById(R.id.phone_xml);
        dob_java = findViewById(R.id.password_signup_xml);
        progressBar = (ProgressBar) findViewById(R.id.progressbar_xml);
        databaseReference = FirebaseDatabase.getInstance().getReference();

        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.signup_xml).setOnClickListener(this);
    }

        private void registerUser() {
            final String name = username_signup_java.getText().toString().trim();
            final String password = password_signup_java.getText().toString().trim();
            final String email = email_java.getText().toString().trim();
            final String phone = phone_java.getText().toString().trim();
            final String dob = dob_java.getText().toString().trim();

            if (name.isEmpty()) {
                username_signup_java.setError("Username is Required");
                username_signup_java.requestFocus();
                return;
            }
            if (email.isEmpty()) {
                email_java.setError("Email is required");
                email_java.requestFocus();
                return;
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                email_java.setError("Please enter a valid email");
                email_java.requestFocus();
                return;
            }

            if (phone.isEmpty()) {
                phone_java.setError("Phone is required");
                phone_java.requestFocus();
                return;
            }

            if (!Patterns.PHONE.matcher(phone).matches()) {
                phone_java.setError("Please enter a valid phone number");
                phone_java.requestFocus();
                return;
            }

            if (password.isEmpty()) {
                password_signup_java.setError("Password is required");
                password_signup_java.requestFocus();
                return;
            }

            if (password.length() < 6) {
                password_signup_java.setError("Minimum length is 6");
                password_signup_java.requestFocus();
                return;
            }

            if (dob.isEmpty()) {
                dob_java.setError("Date Of Birth is required");
                dob_java.requestFocus();
                return;
            }

            progressBar.setVisibility(View.VISIBLE);

            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        User user = new User(email, password, phone, name, dob);
                        FirebaseDatabase.getInstance().getReference("user")
                                .child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(user)
                                .addOnCompleteListener(new OnCompleteListener<Void>() {

                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        progressBar.setVisibility(View.GONE);
                                        if (task.isSuccessful()) {
                                            Toast.makeText(getApplicationContext(), "User Registered", Toast.LENGTH_SHORT).show();
                                            Intent i = new Intent(signup.this, home.class);
                                            startActivity(i);
                                        } else {
                                            if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                                                Toast.makeText(getApplicationContext(), "User already Registered", Toast.LENGTH_SHORT).show();
                                            } else {
                                                Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    }
                                });
                    }
                }});
        }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signup_xml:
                registerUser();
                break;

        }
    }
}
