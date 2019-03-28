package com.example.varun.changex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class soundofsilence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soundofsilence);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Explore");
    }

    public void sos_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Sounds+of+Silence/@19.115379,72.8916339,14z/data=!3m1!4b1!4m5!3m4!1s0x3be7c7e63fffffff:0x52e33cf998ae429c!8m2!3d19.1153798!4d72.9091436"));
        startActivity(browserIntent);
    }
}
