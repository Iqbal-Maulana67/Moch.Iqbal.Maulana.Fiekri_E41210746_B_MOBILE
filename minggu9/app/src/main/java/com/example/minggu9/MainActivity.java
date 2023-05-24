package com.example.minggu9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button layout22, layout23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout22 = findViewById(R.id.btn_acara26);
        layout23 = findViewById(R.id.btn_acara28);

        layout22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acara22layout = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(acara22layout);
            }
        });

        layout23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acara23layout = new Intent(MainActivity.this, SensorActivity .class);
                startActivity(acara23layout);
            }
        });
    }
}