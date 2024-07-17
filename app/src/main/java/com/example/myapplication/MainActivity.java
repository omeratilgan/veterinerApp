package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        deneme();
        calculator();
    }


    public void deneme(){
        int x = 7;
        System.out.println(x);
    }

    public void calculator(){
        int a = 5;
        int b = 4;
        System.out.println(a+b);
    }
}