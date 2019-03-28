package com.example.varun.changex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class globalvision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.globalvision);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Explore");
    }
    public void globalvision_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Global+Vision/@19.1872199,72.9605539,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7b91dc579c4a3:0x8a47aabd14771f24!8m2!3d19.1872199!4d72.9627426"));
        startActivity(browserIntent);
    }
}
