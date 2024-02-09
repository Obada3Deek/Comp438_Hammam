package com.example.comp438_finalproject_mobileapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPageEmployeeActivity extends AppCompatActivity {
    private Button btnADMIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page_employee);
        btnADMIN = findViewById(R.id.buttonLOGINAdmin);
        btnADMIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGOTOADDITEM = new Intent(LoginPageEmployeeActivity.this,AdditemAdminActivity.class);
                startActivity(intentGOTOADDITEM);

            }
        });
    }
}