package com.genymobile.testit;

import android.view.View;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.util.ActivityController;

import static junit.framework.Assert.assertEquals;

@RunWith(CustomRobolectricTestRunner.class)
public class MainActivityRoboTest {

    @Test
    public void testWhenActivityCreatedBatteryLevelViewIsVisible() throws Exception {
        MainActivity activity = new MainActivity();

        ActivityController.of(activity).attach().create();

        int visibility = activity.findViewById(R.id.battery_level_view).getVisibility();
        assertEquals(visibility, View.VISIBLE);
    }
}
