package com.example.varun.changex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class transaction extends AppCompatActivity{

    private ImageButton button1_trans_java;
    private ImageButton button2_trans_java;
    private ImageButton button3_trans_java;
    private ImageButton button4_trans_java;
    private ImageButton button5_trans_java;
    private ImageButton button6_trans_java;
    private Spinner spinner_ngos_java;
    private Spinner spinner_card_java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaction);

        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // android:parentActivityName=".list"

        Button b1 = (Button) findViewById(R.id.confirm_transaction_xml);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(transaction.this, confirmation.class));
            }
        });


        button1_trans_java=(ImageButton) findViewById(R.id.button1_xml);
        button1_trans_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn1_i = new Intent (transaction.this, home.class);
                startActivity(btn1_i);
            }
        });

        /*button2_trans_java=(ImageButton) findViewById(R.id.button2_xml);
        button2_trans_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn2_i = new Intent (transaction.this, transaction.class);
                startActivity(btn2_i);
            }
        }); */

        button3_trans_java=(ImageButton) findViewById(R.id.button3_xml);
        button3_trans_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn3_i = new Intent (transaction.this, profile.class);
                startActivity(btn3_i);
            }
        });

        button4_trans_java=(ImageButton) findViewById(R.id.button4_xml);
        button4_trans_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn4_i = new Intent (transaction.this, info.class);
                startActivity(btn4_i);
            }
        });

        button5_trans_java=(ImageButton) findViewById(R.id.button5_xml);
        button5_trans_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn5_i = new Intent (transaction.this, list.class);
                startActivity(btn5_i);
            }
        });

        button6_trans_java=(ImageButton) findViewById(R.id.button6_xml);
        button6_trans_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn6_i = new Intent (transaction.this, settings.class);
                startActivity(btn6_i);
            }
        });

        spinner_ngos_java = (Spinner) findViewById(R.id.ngo_spinner);
        String[] ngos = {"Select Non-Profit","Muskan Foundation","Desire Society","National Association for the Blind","HelpAge India","Sounds of Silence","Mitra Jyothi","Global Vision","India HIV/AIDS Alliance","Sanket Foundation","Maharashtra State AIDS Control Society", "Access for ALL","V Care Foundation"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,ngos);
        spinner_ngos_java.setAdapter(adapter);

        spinner_card_java = (Spinner) findViewById(R.id.card_spinner);
        String[] card = {"Select Card","Axis","Master Card","Visa","ICICI","HDFC","SBI"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,card);
        spinner_card_java.setAdapter(adapter1);
    }
}
