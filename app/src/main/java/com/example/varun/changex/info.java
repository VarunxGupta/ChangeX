package com.example.varun.changex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class info extends AppCompatActivity{

    private ImageButton button1_info_java;
    private ImageButton button2_info_java;
    private ImageButton button3_info_java;
    private ImageButton button4_info_java;
    private ImageButton button5_info_java;
    private ImageButton button6_info_java;
    private ImageSwitcher sw;
    private ImageButton pr;
    private ImageButton nx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        getSupportActionBar().setTitle("Statistics");

        sw = (ImageSwitcher) findViewById(R.id.info_switch);
        pr = (ImageButton) findViewById(R.id.info_switch_previous);
        nx = (ImageButton) findViewById(R.id.info_switch_next);

        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            }
        });

        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw.setImageResource(R.drawable.jan);
            }
        });

        nx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw.setImageResource(R.drawable.feb);
            }
        });

        button1_info_java=(ImageButton) findViewById(R.id.button1_xml);
        button1_info_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn1_i = new Intent (info.this, home.class);
                startActivity(btn1_i);
            }
        });

        button2_info_java=(ImageButton) findViewById(R.id.button2_xml);
        button2_info_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn2_i = new Intent (info.this, transaction.class);
                startActivity(btn2_i);
            }
        });

        button3_info_java=(ImageButton) findViewById(R.id.button3_xml);
        button3_info_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn3_i = new Intent (info.this, profile.class);
                startActivity(btn3_i);
            }
        });

        /* button4_info_java=(ImageButton) findViewById(R.id.button4_xml);
        button4_info_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn4_i = new Intent (info.this, info.class);
                startActivity(btn4_i);
            }
        }); */

        button5_info_java=(ImageButton) findViewById(R.id.button5_xml);
        button5_info_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn5_i = new Intent (info.this, list.class);
                startActivity(btn5_i);
            }
        });

        button6_info_java=(ImageButton) findViewById(R.id.button6_xml);
        button6_info_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn6_i = new Intent (info.this, settings.class);
                startActivity(btn6_i);
            }
        });

    }
}
