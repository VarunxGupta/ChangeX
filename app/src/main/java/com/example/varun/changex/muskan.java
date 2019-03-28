package com.example.varun.changex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class muskan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.muskan);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Explore");
    }

    public void muskan_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Muskan+Foundation/@19.1677158,72.8404998,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7b651202a553b:0x2d2afcd1770f964d!8m2!3d19.1677158!4d72.8426885"));
        startActivity(browserIntent);
    }
}
