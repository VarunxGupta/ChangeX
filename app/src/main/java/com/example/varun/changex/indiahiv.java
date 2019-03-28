package com.example.varun.changex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class indiahiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indiahiv);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Explore");
    }

    public void indiahiv_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/The+Humsafar+Trust/@19.0817345,72.7846125,12z/data=!4m8!1m2!2m1!1sindia+hiv%2Faids+alliance!3m4!1s0x3be7c8ff75e145df:0x35639d57e27915f8!8m2!3d19.0817345!4d72.8546503"));
        startActivity(browserIntent);
    }
}
