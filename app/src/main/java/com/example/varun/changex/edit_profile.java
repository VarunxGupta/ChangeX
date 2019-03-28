package com.example.varun.changex;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.util.Calendar;

public class edit_profile extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private ImageButton cancel_java;
    private Spinner spinner_java;
    private EditText username_java;
    private EditText email_java;
    private EditText phone_java;
    private FirebaseAuth mAuth;
    private String currentId;
    private DatabaseReference databaseRef;
    private Button save_java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profile);

        username_java = findViewById(R.id.profile_edit_name);
        email_java = findViewById(R.id.profile_edit_email);
        phone_java = findViewById(R.id.profile_edit_number);
        mAuth = FirebaseAuth.getInstance();
        currentId = mAuth.getCurrentUser().getUid();
        databaseRef = FirebaseDatabase.getInstance().getReference().child("user").child(currentId);

        databaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists())
                {
                    FirebaseUser user = mAuth.getCurrentUser();
                    String profName = dataSnapshot.child("name").getValue().toString();
                    String profEmail = dataSnapshot.child("email").getValue().toString();
                    String profNumber = dataSnapshot.child("phone").getValue().toString();

                    email_java.setText(profEmail);
                    username_java.setText(profName);
                    phone_java.setText(profNumber);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        Button button = (Button) findViewById(R.id.change_dob);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View V){
            DialogFragment datePicker = new edit_profile_date();
            datePicker.show(getSupportFragmentManager(), "date picker");
        }
        });

        cancel_java=(ImageButton) findViewById(R.id.cancel);
        cancel_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancel_i = new Intent (edit_profile.this, profile.class);
                startActivity(cancel_i);
            }
        });

        save_java=(Button) findViewById(R.id.save);
        save_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent save_i = new Intent (edit_profile.this, profile.class);
                startActivity(save_i);
            }
        });

        spinner_java = (Spinner) findViewById(R.id.profile_edit_gender);
        String[] cards = {"Male","Female","Other"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,cards);
        spinner_java.setAdapter(adapter);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        TextView textview = (TextView) findViewById(R.id.profile_edit_dob);
        textview.setText(currentDateString);
    }
}
