package com.example.minggu9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SensorActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgAllsensor, imgProximitySensor, imgLightSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);

        imgAllsensor = findViewById(R.id.img_list_all_sensor);
        imgLightSensor = findViewById(R.id.img_light_sensor);
        imgProximitySensor = findViewById(R.id.img_proximity_sensor);
        imgAllsensor.setOnClickListener(this);
        imgLightSensor.setOnClickListener(this);
        imgProximitySensor.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.img_list_all_sensor:
                Intent intentAll = new Intent(this, AllSensorActivity.class);
                startActivity(intentAll);
                break;
            case R.id.img_light_sensor:
                Intent intentLight = new Intent(this, LightSensorActivity.class);
                startActivity(intentLight);
                break;
            case R.id.img_proximity_sensor:
                Intent intent = new Intent(this, ProximitySensorActivity.class);
                startActivity(intent);
                break;
        }
    }
}
