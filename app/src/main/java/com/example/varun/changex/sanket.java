package com.example.varun.changex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sanket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sanket);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Explore");
    }

    public void sanket_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Malad+East,+Mumbai,+Maharashtra/@19.1839052,72.8515168,14z/data=!3m1!4b1!4m5!3m4!1s0x3be7b5ce2b93d7db:0x879a5e5cfe9bb7a8!8m2!3d19.1808735!4d72.8574558"));
        startActivity(browserIntent);
    }
}
