package com.example.sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayPositionSensor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_position_sensor);

        SensorManager sMgr;
        sMgr = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        Sensor proximity;
        proximity = sMgr.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        sMgr.registerListener((SensorEventListener) this, proximity,SensorManager.SENSOR_DELAY_NORMAL);
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }

        public void onSensorChanged(SensorEvent event) {
        }
    }
}
