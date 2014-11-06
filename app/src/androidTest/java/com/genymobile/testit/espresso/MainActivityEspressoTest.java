package com.genymobile.testit.espresso;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;

import com.genymobile.testit.MainActivity;
import com.genymobile.testit.R;

import static android.test.ViewAsserts.assertOnScreen;

public class MainActivityEspressoTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private View batteryLevelView;
    private MainActivity mainActivity;

    public MainActivityEspressoTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
        batteryLevelView = mainActivity.findViewById(R.id.battery_level_view);
    }

    public void testBatteryLevelViewIsShown() {
        assertOnScreen(mainActivity.getWindow().getDecorView(), batteryLevelView);
    }
}
