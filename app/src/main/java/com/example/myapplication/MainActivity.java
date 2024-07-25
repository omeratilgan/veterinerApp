package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void girisYap(View view){
        Intent giris = new Intent(this, loginScreen.class);
        startActivity(giris);
        finish();
    }

    public void kayitOl(View view){
        Intent giris = new Intent(this, signinScreen.class);
        startActivity(giris);
        finish();
    }

}