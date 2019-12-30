package com.example.khaja;

import android.os.Bundle;

public class Register {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail= findViewById(R.id.Email);
        etPssword=findViewById(R.id.Password);
        etBtnLogin=findViewById(R.id.BtnLogin);
        etBtnReg=findViewById(R.id.BtnReg);
};
