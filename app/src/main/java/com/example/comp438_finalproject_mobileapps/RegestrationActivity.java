package com.example.comp438_finalproject_mobileapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegestrationActivity extends AppCompatActivity {
    public TextView btnSign;
    public Button ButtonREGISTRATION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regestration);
        ButtonREGISTRATION = findViewById(R.id.buttonREG);
        ButtonREGISTRATION.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTOMain = new Intent(RegestrationActivity.this,MainActivity.class);
                startActivity(intentTOMain);

            }
        });
        btnSign = findViewById(R.id.btnSignin);
        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTOLOGIN = new Intent(RegestrationActivity.this,LoginActivity.class);
                startActivity(intentTOLOGIN);
            }
        });
    }
}