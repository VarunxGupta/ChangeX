package com.example.varun.changex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class nabet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nabet);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Explore");
    }

    public void nabet_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/National+Association+For+The+Blind/@19.010977,72.8140263,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7cea2acce637f:0x20dc2da02ed2d756!8m2!3d19.010977!4d72.816215"));
        startActivity(browserIntent);
    }
}
