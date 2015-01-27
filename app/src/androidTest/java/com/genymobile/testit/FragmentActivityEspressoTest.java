package com.genymobile.testit;

import android.app.Fragment;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

import com.genymobile.testit.FragmentActivity;
import com.genymobile.testit.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class FragmentActivityEspressoTest extends ActivityInstrumentationTestCase2<FragmentActivity> {

    private FragmentActivity activity;

    public FragmentActivityEspressoTest() {
        super(FragmentActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());

        activity = getActivity();
        assertNotNull("Cannot start test acitivty is NULL", activity);
    }

    @Test
    public void checkFragmentIsShown() {
        int containerId = R.id.fragment_container;
        assertNotNull(activity.findViewById(containerId));
    }

    @Test
    public void checkThatButtonIsShown() {
        int containerId = R.id.fragment_container;
        assertNotNull(activity.findViewById(containerId));

        Fragment fragment = activity.getFragmentManager().findFragmentById(containerId);
        int buttonId = R.id.button_fragment;
        assertNotNull(activity.findViewById(buttonId));

        Button button = (Button) fragment.getView().findViewById(buttonId);
        assertEquals("Incorrect label of the button", "Click Me", button.getText());
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
