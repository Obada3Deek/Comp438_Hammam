package com.example.comp438_finalproject_mobileapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    public TextView txtREG;
    public Button ButtonLOGIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButtonLOGIN = findViewById(R.id.buttonLOGIN_MAIN);
        ButtonLOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGOTOMAIN = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intentGOTOMAIN);

            }
        });
        txtREG = findViewById(R.id.BackToREG);
        txtREG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBackTOREG = new Intent(LoginActivity.this,RegestrationActivity.class);
                startActivity(intentBackTOREG);
            }
        });
    }
}