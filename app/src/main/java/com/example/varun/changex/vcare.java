package com.example.varun.changex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class vcare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vcare);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Explore");
    }

    public void vcare_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/V+Care+Foundation/@19.0049607,72.8408202,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7cee44e1fc6c5:0x992b1ae7cf9c21fc!8m2!3d19.0049607!4d72.8430089"));
        startActivity(browserIntent);
    }
}
