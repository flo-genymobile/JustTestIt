package com.genymobile.testit;

import android.app.Activity;
import android.os.Bundle;

public class FragmentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        DummyFragment fragment = new DummyFragment();
        loadFragment(fragment);
    }

    private void loadFragment(DummyFragment fragment) {
        getFragmentManager().beginTransaction().add(R.id.fragment_container, fragment).commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
