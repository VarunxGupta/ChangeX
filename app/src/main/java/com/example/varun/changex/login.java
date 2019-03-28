package com.example.varun.changex;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity{
    private Button register_java;
    private Button login_java;
    private EditText editTextEmail, editTextPassword;
    private FirebaseAuth mAuth;
    private ProgressBar progressBar;
    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

//        email_login_java = findViewById(R.id.username_signup_xml);
//        password_login_java = findViewById(R.id.password_signup_xml);

        FirebaseApp.initializeApp( login.this );
        mAuth = FirebaseAuth.getInstance();
        editTextEmail = (EditText) findViewById( R.id.username_signup_xml);
        editTextPassword = (EditText) findViewById( R.id.password_signup_xml);
        login_java = (Button) findViewById( R.id.login_xml );

        register_java = findViewById(R.id.register_xml);
        register_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg_i = new Intent(login.this, signup.class);
                startActivity(reg_i);
            }
        });

//        login_java = findViewById(R.id.login_xml);
//        login_java.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int i = validate(email_login_java.getText().toString(), password_login_java.getText().toString());
//                if (i != 1) {
//                    Intent log_i = new Intent(login.this, home.class);
//                    startActivity(log_i);
//                }
//            }
//        });

        progressBar = new ProgressBar( this );

        login_java.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }

        } );

        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() != null) {
                    startActivity( new Intent( login.this, home.class ) );
                }
            }
        };
    }

//    private int validate(String username, String password) {
//        if (username.isEmpty() || password.isEmpty()) {
//            Toast t1 = Toast.makeText(this, "Enter Username or password", Toast.LENGTH_SHORT);
//            t1.show();
//            return 1;
//        }
//        return 0;
//    }

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener( authStateListener );
    }




    private void loginUser() {

        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        if (editTextEmail.getText().toString().trim().length() < 0) {
            editTextEmail.setError( "Email is required" );
            editTextEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher( email ).matches()) {
            editTextEmail.setError( "Please Enter a Valid Email ID" );
            editTextEmail.requestFocus();
            return;
        }

        if (editTextPassword.getText().toString().trim().length() < 0) {
            editTextPassword.setError( "Password id required" );
            editTextPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {
            editTextPassword.setError( "Minimum Length of Password is 6" );
            editTextPassword.requestFocus();
            return;
        }

             progressBar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword( email, password ).addOnCompleteListener( new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText( getApplicationContext(), "Login Successfull", Toast.LENGTH_LONG ).show();
                    Intent i = new Intent( login.this, home.class );
                    startActivity( i );
                } else {
                    Toast.makeText( login.this, "Error: Login Failed", Toast.LENGTH_LONG ).show();
                }
                progressBar.setVisibility(View.GONE);
            }
        } );

    }
}



