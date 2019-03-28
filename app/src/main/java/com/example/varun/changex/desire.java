package com.example.varun.changex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class desire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desire);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Explore");
    }

    public void desire_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/DESIRE+Society/@19.1641636,72.8368583,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7b656c926bba3:0xdad899833fb78313!8m2!3d19.1641636!4d72.839047"));
        startActivity(browserIntent);
    }
}
