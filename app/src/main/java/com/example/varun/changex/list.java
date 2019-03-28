package com.example.varun.changex;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class list extends AppCompatActivity{

    private ImageButton button1_list_java;
    private ImageButton button2_list_java;
    private ImageButton button3_list_java;
    private ImageButton button4_list_java;
    private ImageButton button5_list_java;
    private ImageButton button6_list_java;
    private Button ngo1,ngo2,ngo3,ngo4,ngo5,ngo6,ngo7,ngo8,ngo9,ngo10,ngo11,ngo12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        getSupportActionBar().setTitle("Explore");

        ngo1 = (Button) findViewById(R.id.ngo1);
        ngo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(list.this, muskan.class);
                startActivity(i1);
            }
        });

        ngo2 = (Button) findViewById(R.id.ngo2);
        ngo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(list.this, desire.class);
                startActivity(i2);
            }
        });

        ngo3 = (Button) findViewById(R.id.ngo3);
        ngo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(list.this, nabet.class);
                startActivity(i3);
            }
        });

        ngo4 = (Button) findViewById(R.id.ngo4);
        ngo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(list.this, helpageindia.class);
                startActivity(i4);
            }
        });

        ngo5 = (Button) findViewById(R.id.ngo5);
        ngo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(list.this, soundofsilence.class);
                startActivity(i5);
            }
        });

        ngo6 = (Button) findViewById(R.id.ngo6);
        ngo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(list.this, mitrajyoti.class);
                startActivity(i6);
            }
        });

        ngo7 = (Button) findViewById(R.id.ngo7);
        ngo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7 = new Intent(list.this, globalvision.class);
                startActivity(i7);
            }
        });

        ngo8 = (Button) findViewById(R.id.ngo8);
        ngo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8 = new Intent(list.this, indiahiv.class);
                startActivity(i8);
            }
        });

        ngo9 = (Button) findViewById(R.id.ngo9);
        ngo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9 = new Intent(list.this, sanket.class);
                startActivity(i9);
            }
        });

        ngo10 = (Button) findViewById(R.id.ngo10);
        ngo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i10 = new Intent(list.this, msacs.class);
                startActivity(i10);
            }
        });

        ngo11 = (Button) findViewById(R.id.ngo11);
        ngo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11 = new Intent(list.this, accessforall.class);
                startActivity(i11);
            }
        });

        ngo12 = (Button) findViewById(R.id.ngo12);
        ngo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i12 = new Intent(list.this, vcare.class);
                startActivity(i12);
            }
        });

        button1_list_java = (ImageButton) findViewById(R.id.button1_xml);
        button1_list_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn1_i = new Intent(list.this, home.class);
                startActivity(btn1_i);
            }
        });

        button2_list_java = (ImageButton) findViewById(R.id.button2_xml);
        button2_list_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn2_i = new Intent(list.this, transaction.class);
                startActivity(btn2_i);
            }
        });

        button3_list_java = (ImageButton) findViewById(R.id.button3_xml);
        button3_list_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn3_i = new Intent(list.this, profile.class);
                startActivity(btn3_i);
            }
        });

        button4_list_java = (ImageButton) findViewById(R.id.button4_xml);
        button4_list_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn4_i = new Intent(list.this, info.class);
                startActivity(btn4_i);
            }
        });

        /* button5_list_java = (ImageButton) findViewById(R.id.button5_xml);
        button5_list_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn5_i = new Intent(list.this, list.class);
                startActivity(btn5_i);
            }
        }); */

        button6_list_java = (ImageButton) findViewById(R.id.button6_xml);
        button6_list_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn6_i = new Intent(list.this, settings.class);
                startActivity(btn6_i);
            }
        });
    }

    public void muskanf_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Muskan+Foundation/@19.1677158,72.8404998,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7b651202a553b:0x2d2afcd1770f964d!8m2!3d19.1677158!4d72.8426885"));
        startActivity(browserIntent);
    }

    public void desire_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/DESIRE+Society/@19.1641636,72.8368583,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7b656c926bba3:0xdad899833fb78313!8m2!3d19.1641636!4d72.839047"));
        startActivity(browserIntent);
    }

    public void nabet_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/National+Association+For+The+Blind/@19.010977,72.8140263,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7cea2acce637f:0x20dc2da02ed2d756!8m2!3d19.010977!4d72.816215"));
        startActivity(browserIntent);
    }

    public void helpage_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/HelpAge+India/@19.1273393,72.8255193,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7b61ff686831d:0x2d7e6f8085d2d43a!8m2!3d19.1273393!4d72.827708"));
        startActivity(browserIntent);
    }

    public void sos_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Sounds+of+Silence/@19.115379,72.8916339,14z/data=!3m1!4b1!4m5!3m4!1s0x3be7c7e63fffffff:0x52e33cf998ae429c!8m2!3d19.1153798!4d72.9091436"));
        startActivity(browserIntent);
    }

    public void mitra_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Vikhroli+East,+Mumbai,+Maharashtra/@19.0895592,72.9042309,13z/data=!3m1!4b1!4m5!3m4!1s0x3be7c7bc7c814b5d:0x6ad25b348f9b9dc6!8m2!3d19.091182!4d72.9208636"));
        startActivity(browserIntent);
    }

    public void globalvision_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Global+Vision/@19.1872199,72.9605539,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7b91dc579c4a3:0x8a47aabd14771f24!8m2!3d19.1872199!4d72.9627426"));
        startActivity(browserIntent);
    }

    public void indiahiv_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/The+Humsafar+Trust/@19.0817345,72.7846125,12z/data=!4m8!1m2!2m1!1sindia+hiv%2Faids+alliance!3m4!1s0x3be7c8ff75e145df:0x35639d57e27915f8!8m2!3d19.0817345!4d72.8546503"));
        startActivity(browserIntent);
    }

    public void sanket_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Malad+East,+Mumbai,+Maharashtra/@19.1839052,72.8515168,14z/data=!3m1!4b1!4m5!3m4!1s0x3be7b5ce2b93d7db:0x879a5e5cfe9bb7a8!8m2!3d19.1808735!4d72.8574558"));
        startActivity(browserIntent);
    }

    public void msacs_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Maharashtra+State+AIDS+Control+Society+MSACS/@19.0193047,72.8577933,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7cf23831b7b73:0x731076517afb51b0!8m2!3d19.0193047!4d72.859982"));
        startActivity(browserIntent);
    }

    public void accessforall_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Access+For+All/@19.115983,72.8390893,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7c9cfdfc3ffff:0x405ebcccbbdbed8b!8m2!3d19.115983!4d72.841278"));
        startActivity(browserIntent);
    }

    public void vcare_loc(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/V+Care+Foundation/@19.0049607,72.8408202,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7cee44e1fc6c5:0x992b1ae7cf9c21fc!8m2!3d19.0049607!4d72.8430089"));
        startActivity(browserIntent);
    }
}
