package com.example.varun.changex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class msacs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.msacs);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Explore");
    }

    public void msacs_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Maharashtra+State+AIDS+Control+Society+MSACS/@19.0193047,72.8577933,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7cf23831b7b73:0x731076517afb51b0!8m2!3d19.0193047!4d72.859982"));
        startActivity(browserIntent);
    }
}
