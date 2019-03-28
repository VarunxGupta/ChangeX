package com.example.varun.changex;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class settings extends AppCompatActivity{

    private ImageButton button1_settings_java;
    private ImageButton button2_settings_java;
    private ImageButton button3_settings_java;
    private ImageButton button4_settings_java;
    private ImageButton button5_settings_java;
    private ImageButton button6_settings_java;
    private Button about_us_java;
    private Spinner spinner_java;
    private SeekBar sBar;
    private TextView tView;
    private Button logout_java;
    private Button delete_java;
    private Button change_password_java;
    private Button rateus_java;
    FirebaseAuth mAuth;
    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        getSupportActionBar().setTitle("Settings");

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        rateus_java = (Button) findViewById(R.id.rateus_settings);
        rateus_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_rate = new Intent(settings.this, rateus.class);
                startActivity(i_rate);
            }
        });

        change_password_java = (Button) findViewById(R.id.settings_password);
        change_password_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_change = new Intent(settings.this, change_password.class);
                startActivity(i_change);
            }
        });

        spinner_java = (Spinner) findViewById(R.id.change_spinner);
        String[] cards = {"Select Card","Axis","Master Card","Visa","ICICI","HDFC","SBI"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,cards);
        spinner_java.setAdapter(adapter);

        sBar = (SeekBar)findViewById(R.id.cap_seekbar);
        tView = (TextView) findViewById(R.id.seekbar_text);
        tView.setText(sBar.getProgress() + "/" +sBar.getMax());
        sBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int pval=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                pval = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                tView.setText(pval + "/" +seekBar.getMax());
            }
        });

        logout_java = (Button) findViewById(R.id.settings_logout);
//        logout_java.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i_logout = new Intent(settings.this, login.class);
//                startActivity(i_logout);
//            }
//        });
//
        delete_java = (Button) findViewById(R.id.settings_deleteaccount);
//        delete_java.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent i_delete = new Intent(settings.this, login.class);
//                startActivity(i_delete);
//            }
//        });

        logout_java.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signOut();
            }
        } );
         delete_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirebaseDatabase.getInstance().getReference("user")
                        .child(FirebaseAuth.getInstance().getCurrentUser().getUid()).removeValue();
                mAuth.getCurrentUser().delete().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        signOut();
                    }
                });
            }
        });

        about_us_java = (Button) findViewById(R.id.settings_about);
        about_us_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about_i = new Intent(settings.this, about_us.class);
                startActivity(about_i);
            }
        });

        button1_settings_java=(ImageButton) findViewById(R.id.button1_xml);
        button1_settings_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn1_i = new Intent (settings.this, home.class);
                startActivity(btn1_i);
            }
        });

        button2_settings_java=(ImageButton) findViewById(R.id.button2_xml);
        button2_settings_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn2_i = new Intent (settings.this, transaction.class);
                startActivity(btn2_i);
            }
        });

        button3_settings_java=(ImageButton) findViewById(R.id.button3_xml);
        button3_settings_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn3_i = new Intent (settings.this, profile.class);
                startActivity(btn3_i);
            }
        });

        button4_settings_java=(ImageButton) findViewById(R.id.button4_xml);
        button4_settings_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn4_i = new Intent (settings.this, info.class);
                startActivity(btn4_i);
            }
        });

        button5_settings_java=(ImageButton) findViewById(R.id.button5_xml);
        button5_settings_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn5_i = new Intent (settings.this, list.class);
                startActivity(btn5_i);
            }
        });

        /* button6_settings_java=(ImageButton) findViewById(R.id.button6_xml);
        button6_settings_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn6_i = new Intent (settings.this, settings.class);
                startActivity(btn6_i);
            }
        }); */
    }

    public void signOut(){
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(settings.this, login.class);
        startActivity(intent);
    }

//    @Override
//    public void onBackPressed(){
//        moveTaskToBack(false);
//    }
}
