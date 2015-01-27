package com.genymobile.testit;

import android.app.Fragment;
import android.support.test.InstrumentationRegistry;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

import org.junit.After;
import org.junit.Before;

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

    public void testCheckFragmentIsShown() {
        int containerId = R.id.fragment_container;
        assertNotNull(activity.findViewById(containerId));
    }

    public void testCheckThatButtonIsShown() {
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
