package com.example.statusbarvirtualkey.mybattery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MyBattery myBattery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBattery = (MyBattery) findViewById(R.id.user_charge);

        myBattery.setBatteryValue(84);  //84%的电量
        myBattery.animalStart(1000);    //1秒动画
    }
}
