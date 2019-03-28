package com.example.varun.changex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mitrajyoti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mitrajyoti);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Explore");
    }

    public void mitra_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Vikhroli+East,+Mumbai,+Maharashtra/@19.0895592,72.9042309,13z/data=!3m1!4b1!4m5!3m4!1s0x3be7c7bc7c814b5d:0x6ad25b348f9b9dc6!8m2!3d19.091182!4d72.9208636"));
        startActivity(browserIntent);
    }
}
