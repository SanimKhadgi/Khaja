package com.example.khaja;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText etEmail, etPssword;
private Button etBtnLogin, etBtnReg
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail= findViewById(R.id.Email);
        etPssword=findViewById(R.id.Password);
        etBtnLogin=findViewById(R.id.BtnLogin);
        etBtnReg=findViewById(R.id.BtnReg);

        etBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            checkEmail();
            }
        });

        private void checkUser(){
            SharedPreferences sharedPreferences = getSharedPreferences((Email ))
        }

    }
}
