package com.example.qdq.dragger2demo.component;

import com.example.qdq.dragger2demo.ui.BaseActivity;
import com.example.qdq.dragger2demo.ui.MainActivity;

import dagger.Component;

/**
 * Created by Administrator on 2017/9/1.
 */

@Component()
public interface AppComponent {

    void injectActivity(BaseActivity activity);

    void injectMainActivity(MainActivity mainActivity);

}
