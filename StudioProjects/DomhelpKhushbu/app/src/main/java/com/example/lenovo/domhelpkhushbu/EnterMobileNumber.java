package com.example.lenovo.domhelpkhushbu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EnterMobileNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_mobile_number);
    }
    public void sendOtp(View view) {
        Intent intent= new Intent(this,EnterOtp.class);
        startActivity(intent);
    }

}
