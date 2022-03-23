package com.release.calculator_rk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class lol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lol1);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                //This method will be executed once the timer is over
//                // Start your app main activity
//                Intent i = new Intent(lol.this, MainActivity.class);
//                startActivity(i);
//                // close this activity
//                finish();
//            }
//        }, 5000);
    }
}