package com.ugorji.ui;

import android.os.Bundle;
import android.view.ViewGroup;

import com.ugorji.R;
import com.ugorji.VelcroApp;
import com.ugorji.ui.AppContainer;
import com.ugorji.ui.misc.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject AppContainer appContainer;

    private ViewGroup container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        VelcroApp app = VelcroApp.get(this);

        container = appContainer.get(this, app);

        getLayoutInflater().inflate(R.layout.activity_main, container);
    }
}
