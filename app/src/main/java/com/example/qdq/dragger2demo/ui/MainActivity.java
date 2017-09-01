package com.example.qdq.dragger2demo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.qdq.dragger2demo.R;
import com.example.qdq.dragger2demo.UserScope;
import com.example.qdq.dragger2demo.component.DaggerAppComponent;
import com.example.qdq.dragger2demo.util.ToastUtil;
import com.google.gson.Gson;

import javax.inject.Inject;

@UserScope
public class MainActivity extends AppCompatActivity {

    @Inject
    ToastUtil toastUtil;
    @Inject
    Gson gson;
//    @Inject
//    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerAppComponent.builder().build().injectMainActivity(this);

//        user.setUserId("1");
//        user.setName("qdq");
//        user.setPassword("123");
//
//        String data=gson.toJson(user);
//        toastUtil.showToast(this,data);
        toastUtil.showToast(this,"成功了");
    }
}
