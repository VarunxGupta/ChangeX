package com.example.varun.changex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class profile extends AppCompatActivity{

    private ImageButton button1_profile_java;
    private ImageButton button2_profile_java;
    private ImageButton button3_profile_java;
    private ImageButton button4_profile_java;
    private ImageButton button5_profile_java;
    private ImageButton button6_profile_java;
    private Button edit_button_java;
    private TextView fullName;
    private TextView email;
    private TextView number;
    TextView headname;
    private TextView dob_profile;
    private FirebaseAuth mAuth;
    private String currentId;
    private DatabaseReference databaseRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        headname=findViewById(R.id.textView4);
        email = findViewById(R.id.profile_email1_xml);
        number = findViewById(R.id.profile_number1_xml);
        dob_profile = findViewById(R.id.profile_dob_xml1);
        mAuth = FirebaseAuth.getInstance();
        currentId = mAuth.getCurrentUser().getUid();
        databaseRef = FirebaseDatabase.getInstance().getReference().child("user").child(currentId);

        databaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists())
                {
                    FirebaseUser user = mAuth.getCurrentUser();

                    String profEmail = dataSnapshot.child("email").getValue().toString();
                    String profName = dataSnapshot.child("name").getValue().toString();
                    String profNumber = dataSnapshot.child("phone").getValue().toString();
                    String head = dataSnapshot.child("name").getValue().toString();
                    String dob = dataSnapshot.child("dob").getValue().toString();

                    email.setText(profEmail);
                    number.setText(profNumber);
                    headname.setText(head);
                    dob_profile.setText(dob);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        getSupportActionBar().setTitle("Profile");

        button1_profile_java=(ImageButton) findViewById(R.id.button1_xml);
        button1_profile_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn1_i = new Intent (profile.this, home.class);
                startActivity(btn1_i);
            }
        });

        button2_profile_java=(ImageButton) findViewById(R.id.button2_xml);
        button2_profile_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn2_i = new Intent (profile.this, transaction.class);
                startActivity(btn2_i);
            }
        });

        /* button3_profile_java=(ImageButton) findViewById(R.id.button3_xml);
        button3_profile_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn3_i = new Intent (profile.this, profile.class);
                startActivity(btn3_i);
            }
        }); */

        button4_profile_java=(ImageButton) findViewById(R.id.button4_xml);
        button4_profile_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn4_i = new Intent (profile.this, info.class);
                startActivity(btn4_i);
            }
        });

        button5_profile_java=(ImageButton) findViewById(R.id.button5_xml);
        button5_profile_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn5_i = new Intent (profile.this, list.class);
                startActivity(btn5_i);
            }
        });

        button6_profile_java=(ImageButton) findViewById(R.id.button6_xml);
        button6_profile_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn6_i = new Intent (profile.this, settings.class);
                startActivity(btn6_i);
            }
        });

        edit_button_java=(Button) findViewById(R.id.edit_profile_xml);
        edit_button_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edit_button_i = new Intent(profile.this, edit_profile.class);
                startActivity(edit_button_i);
            }
        });
    }
}
