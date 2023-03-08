package com.example.minggu3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    Button layout22, layout23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout22 = findViewById(R.id.btn_acara22);
        layout23 = findViewById(R.id.btn_acara23);

        layout22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acara22layout = new Intent(MainActivity.this, list_negara.class);
                startActivity(acara22layout);
            }
        });

        layout23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acara23layout = new Intent(MainActivity.this, acara15_activity.class);
                startActivity(acara23layout);
            }
        });
    }
}