package com.example.qdq.dragger2demo.ui;

import android.os.Bundle;
import android.util.Log;

import com.example.qdq.dragger2demo.R;
import com.example.qdq.dragger2demo.component.DaggerAppComponent;
import com.example.qdq.dragger2demo.entity.StudentBean;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";
    @Inject
    StudentBean studentBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerAppComponent.builder().build().injectMainActivity(this);
        Log.e(TAG, "onCreate: "+studentBean.toString() );
    }
}
