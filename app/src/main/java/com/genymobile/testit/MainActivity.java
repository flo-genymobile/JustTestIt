package com.genymobile.testit;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    private View batteryLevelView;
    private BatteryWatcher watcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batteryLevelView = findViewById(R.id.battery_level_view);
    }

    @Override
    protected void onResume() {
        super.onResume();

        initBatteryWatcher();

        if (watcher.getColorAccordingToBatteryLevel() == 1) {
            batteryLevelView.setBackgroundColor(Color.GREEN);
        } else {
            batteryLevelView.setBackgroundColor(Color.RED);
        }
    }

    private void initBatteryWatcher() {
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryStatus = this.registerReceiver(null, intentFilter);
        watcher = new BatteryWatcher(batteryStatus);
    }
}
