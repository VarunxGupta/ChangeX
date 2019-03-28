package com.example.varun.changex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class accessforall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accessforall);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Explore");
    }

    public void accessforall_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Access+For+All/@19.115983,72.8390893,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7c9cfdfc3ffff:0x405ebcccbbdbed8b!8m2!3d19.115983!4d72.841278"));
        startActivity(browserIntent);
    }
}
