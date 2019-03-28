package com.example.varun.changex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class change_password extends AppCompatActivity {

    private Button confirm_password_java;
    private Button cancel_password_java;
    private Button forget_password_java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_password);

        getSupportActionBar().setTitle("Change Password");

        confirm_password_java = (Button) findViewById(R.id.password_confirm_xml);
        confirm_password_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_confirm = new Intent(change_password.this, settings.class);
                startActivity(i_confirm);
            }
        });

        cancel_password_java = (Button) findViewById(R.id.password_cancel_xml);
        cancel_password_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_cancel = new Intent(change_password.this, settings.class);
                startActivity(i_cancel);
            }
        });

        forget_password_java = (Button) findViewById(R.id.forget_password);
        forget_password_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_forget = new Intent(change_password.this, forgetpassword.class);
                startActivity(i_forget);
            }
        });
    }
}
