package com.example.comp438_finalproject_mobileapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    private Button btnStudents,btnAdmins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btnStudents = findViewById(R.id.buttonWelcome);
        btnStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWelcome = new Intent(WelcomeActivity.this,RegestrationActivity.class);
                startActivity(intentWelcome);
            }
        });
        btnAdmins = findViewById(R.id.buttonWelcomeAdmin);
        btnAdmins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWelcomeAdmins = new Intent(WelcomeActivity.this,LoginPageEmployeeActivity.class);
                startActivity(intentWelcomeAdmins);

            }
        });
    }
}