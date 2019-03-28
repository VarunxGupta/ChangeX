package com.example.varun.changex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class rateus extends AppCompatActivity {

    Button submit_java;
    TextView rating_java;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rateus);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        rating_java = (TextView) findViewById(R.id.rating_xml);
        submit_java = (Button) findViewById(R.id.rate_submit);

        submit_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int noofstars = ratingBar.getNumStars();
                float getrating = ratingBar.getRating();
                rating_java.setText("Rating: "+getrating+"/"+noofstars);
            }
        });

    }
}
