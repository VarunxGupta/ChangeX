package com.example.varun.changex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class helpageindia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helpageindia);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Explore");
    }

    public void helpage_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/HelpAge+India/@19.1273393,72.8255193,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7b61ff686831d:0x2d7e6f8085d2d43a!8m2!3d19.1273393!4d72.827708"));
        startActivity(browserIntent);
    }
}
