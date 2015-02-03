package com.genymobile.testit;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityEspressoTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private View batteryLevelView;
    private MainActivity mainActivity;

    public MainActivityEspressoTest() {
        super(MainActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());

        mainActivity = getActivity();
        batteryLevelView = mainActivity.findViewById(R.id.battery_level_view);
    }

    @Test
    public void testCheckBatteryLevelViewIsShown() {
        assertEquals(0, batteryLevelView.getVisibility());
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
