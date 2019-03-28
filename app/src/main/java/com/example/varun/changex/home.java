package com.example.varun.changex;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class home extends AppCompatActivity{

    final String TAG = this.getClass().getName();
    private ImageButton button1_home_java;
    private ImageButton button2_home_java;
    private ImageButton button3_home_java;
    private ImageButton button4_home_java;
    private ImageButton button5_home_java;
    private ImageButton button6_home_java;
    private Button muskan_btn_feed_java, desire_btn_feed_java, nabet_btn_feed_java, helpage_btn_feed_java, sos_btn_feed_java, mitra_btn_feed_java;
    private Button globalvision_btn_feed_java, india_btn_feed_java, sanket_btn_feed_java, msacs_btn_feed_java, accessforall_btn_feed_java, vcare_btn_feed_java;
    private FloatingActionButton fab_java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        fab_java= findViewById(R.id.fab_xml);
        fab_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chat_i = new Intent (home.this, chat.class);
                startActivity(chat_i);
            }
        });


        muskan_btn_feed_java = (Button) findViewById(R.id.muskan_btn_feed_xml);
        muskan_btn_feed_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ngo1_home_btn = new Intent(home.this, muskan.class);
                startActivity(ngo1_home_btn);
            }
        });

        desire_btn_feed_java = (Button) findViewById(R.id.desire_btn_feed_xml);
        desire_btn_feed_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ngo1_home_btn = new Intent(home.this, desire.class);
                startActivity(ngo1_home_btn);
            }
        });

        nabet_btn_feed_java = (Button) findViewById(R.id.nabet_btn_feed_xml);
        nabet_btn_feed_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ngo1_home_btn = new Intent(home.this, nabet.class);
                startActivity(ngo1_home_btn);
            }
        });

        helpage_btn_feed_java = (Button) findViewById(R.id.helpage_btn_feed_xml);
        helpage_btn_feed_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ngo1_home_btn = new Intent(home.this, helpageindia.class);
                startActivity(ngo1_home_btn);
            }
        });

        sos_btn_feed_java = (Button) findViewById(R.id.sos_btn_feed_xml);
        sos_btn_feed_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ngo1_home_btn = new Intent(home.this, soundofsilence.class);
                startActivity(ngo1_home_btn);
            }
        });

        mitra_btn_feed_java = (Button) findViewById(R.id.mitra_btn_feed_xml);
        mitra_btn_feed_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ngo1_home_btn = new Intent(home.this, mitrajyoti.class);
                startActivity(ngo1_home_btn);
            }
        });

        globalvision_btn_feed_java = (Button) findViewById(R.id.globalvision_btn_feed_xml);
        globalvision_btn_feed_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ngo1_home_btn = new Intent(home.this, globalvision.class);
                startActivity(ngo1_home_btn);
            }
        });

        india_btn_feed_java = (Button) findViewById(R.id.india_btn_feed_xml);
        india_btn_feed_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ngo1_home_btn = new Intent(home.this, indiahiv.class);
                startActivity(ngo1_home_btn);
            }
        });

        sanket_btn_feed_java = (Button) findViewById(R.id.sanket_btn_feed_xml);
        sanket_btn_feed_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ngo1_home_btn = new Intent(home.this, sanket.class);
                startActivity(ngo1_home_btn);
            }
        });

        msacs_btn_feed_java = (Button) findViewById(R.id.msacs_btn_feed_xml);
        msacs_btn_feed_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ngo1_home_btn = new Intent(home.this, msacs.class);
                startActivity(ngo1_home_btn);
            }
        });

        accessforall_btn_feed_java= (Button) findViewById(R.id.accessforall_btn_feed_xml);
        accessforall_btn_feed_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ngo1_home_btn = new Intent(home.this, accessforall.class);
                startActivity(ngo1_home_btn);
            }
        });

        vcare_btn_feed_java= (Button) findViewById(R.id.vcare_btn_feed_xml);
        vcare_btn_feed_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ngo1_home_btn = new Intent(home.this, vcare.class);
                startActivity(ngo1_home_btn);
            }
        });
        
        /* button1_home_java=(ImageButton) findViewById(R.id.button1_xml);
        button1_home_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn1_i = new Intent (home.this, home.class);
                startActivity(btn1_i);
            }
        }); */

        button2_home_java=(ImageButton) findViewById(R.id.button2_xml);
        button2_home_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn2_i = new Intent (home.this, transaction.class);
                startActivity(btn2_i);
            }
        });

        button3_home_java=(ImageButton) findViewById(R.id.button3_xml);
        button3_home_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn1_i = new Intent (home.this, profile.class);
                startActivity(btn1_i);
            }
        });


        button4_home_java=(ImageButton) findViewById(R.id.button4_xml);
        button4_home_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn4_i = new Intent (home.this, info.class);
                startActivity(btn4_i);
            }
        });

        button5_home_java=(ImageButton) findViewById(R.id.button5_xml);
        button5_home_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn5_i = new Intent (home.this, list.class);
                startActivity(btn5_i);
            }
        });

        button6_home_java=(ImageButton) findViewById(R.id.button6_xml);
        button6_home_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn6_i = new Intent (home.this, settings.class);
                startActivity(btn6_i);
            }
        });


    }

    boolean twice = false;
    @Override
    public void onBackPressed() {

        Log.d(TAG, "Click");

        if(twice == true){
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            System.exit(0);
        }

        twice = true;
        Log.d(TAG, "twice: " + twice);

        //super.onBackPressed();
        Toast.makeText(home.this, "Please press BACK again to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                twice = false;
                Log.d(TAG, "twice: " + twice);
            }
        }, 3000);
        twice = true;
    }
}
