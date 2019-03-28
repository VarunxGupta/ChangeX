package com.example.varun.changex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        getSupportActionBar().setTitle("Group Chat");
    }
}
