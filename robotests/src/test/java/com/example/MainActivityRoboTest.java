package com.example;

import android.view.View;

import com.genymobile.testit.MainActivity;
import com.genymobile.testit.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.util.ActivityController;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(CustomRobolectricTestRunner.class)
public class MainActivityRoboTest {

    @Test
    public void testWhenActivityCreatedBatteryLevelViewIsVisible() throws Exception {

        MainActivity activity = new MainActivity();
        ActivityController.of(activity).attach().create();
        int visibility = activity.findViewById(R.id.battery_level_view).getVisibility();

        assertThat(visibility).isEqualTo(View.VISIBLE);
    }
}
