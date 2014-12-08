package com.genymobile.testit.espresso;

import android.app.Fragment;
import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;

import com.genymobile.testit.FragmentActivity;
import com.genymobile.testit.R;

public class FragmentActivityEspressoTest extends ActivityUnitTestCase<FragmentActivity> {

    private FragmentActivity activity;

    public FragmentActivityEspressoTest() {
        super(FragmentActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();

        Intent intent = new Intent(getInstrumentation().getTargetContext(),
                FragmentActivity.class);
        startActivity(intent, null, null);
        activity = getActivity();
        
        activity.getFragmentManager().executePendingTransactions();
    }

    public void testFragmentIsShown() {
        int containerId = R.id.fragment_container;
        assertNotNull(activity.findViewById(containerId));
    }

    public void testThatButtonIsShown() {
        int containerId = R.id.fragment_container;
        assertNotNull(activity.findViewById(containerId));

        Fragment fragment = activity.getFragmentManager().findFragmentById(containerId);
        int buttonId = R.id.button_fragment;
        assertNotNull(activity.findViewById(buttonId));

        Button button = (Button) fragment.getView().findViewById(buttonId);
        assertEquals("Incorrect label of the button", "Click Me", button.getText());
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
