package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class homeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.navigation_home) {
                    // Home seçildiğinde yapılacak işlemler
                    return true;
                } else if (itemId == R.id.navigation_pet) {
                    // Dashboard seçildiğinde yapılacak işlemler
                    return true;
                } else if (itemId == R.id.navigation_calendar) {
                    Intent giris = new Intent(homeScreen.this, dateScreen.class);
                    startActivity(giris);
                    finish();
                    // Notifications seçildiğinde yapılacak işlemler
                    return true;
                } else if (itemId == R.id.navigation_accessory) {
                    // Notifications seçildiğinde yapılacak işlemler
                    return true;
                } else if (itemId == R.id.navigation_user) {
                    // Notifications seçildiğinde yapılacak işlemler
                    return true;
                }
                return false;
            }
        });
    }
}