package com.example.sensors;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayMotionSensor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_motion_sensor);

        Intent intent = getIntent();
//
//        SensorManager sMgr;
//        sMgr = (SensorManager) this.getSystemService(SENSOR_SERVICE);
//
//        Sensor motion;
//        motion = sMgr.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //sMgr.registerListener((SensorEventListener) this, motion, SensorManager.SENSOR_DELAY_NORMAL);
    }
}
