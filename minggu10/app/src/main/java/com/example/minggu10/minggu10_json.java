package com.example.minggu10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class minggu10_json extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minggu10_json);
        ImageView showJson = findViewById(R.id.json);
        ImageView showJsonAPI = findViewById(R.id.json_api);
        ImageView showMovieDB = findViewById(R.id.moviedb);

        showJson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(minggu10_json.this, JsonParseActivity.class);
                startActivity(intent);
            }
        });
        showJsonAPI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(minggu10_json.this, JsonAPIActivity.class);
                startActivity(intent);
            }
        });
        showMovieDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(minggu10_json.this, moviedb.class);
                startActivity(intent);
            }
        });

    }
}