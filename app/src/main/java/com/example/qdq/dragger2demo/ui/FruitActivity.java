package com.example.qdq.dragger2demo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.qdq.dragger2demo.R;
import com.example.qdq.dragger2demo.annotation.Type;
import com.example.qdq.dragger2demo.component.DaggerFruitComponent;
import com.example.qdq.dragger2demo.entity.BananaBean;
import com.example.qdq.dragger2demo.entity.Fruits;
import com.example.qdq.dragger2demo.entity.OrangeBean;
import com.example.qdq.dragger2demo.entity.PearBean;
import com.example.qdq.dragger2demo.module.OrangeModule;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;

public class FruitActivity extends AppCompatActivity {

    private static final String TAG = "FruitActivity";

    @Inject
    Fruits fruits;
    @Inject
    OrangeBean orangeBean;
    @Type("name")
    @Inject
    BananaBean bananaBean;
    @Type("default")
    @Inject
    BananaBean banaBa;
    @Inject
    Lazy<PearBean> pearBeanA;
    @Inject
    Provider<PearBean> pearBeanB;
   /* @Inject
    OrangeBean orangeBeanA;
    @Inject
    OrangeBean orangeBeanB;

    @Inject
    BananaBean bananaBeanA;
    @Inject
    BananaBean bananaBeanB;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

//        DaggerFruitComponent.builder().build().injectFruitActivity(this);
        DaggerFruitComponent.builder().
                orangeModule(new OrangeModule(new OrangeBean(99)))
                .build().injectFruitActivity(this);
        Log.e(TAG, "onCreate: " + fruits.toString());
        Log.e(TAG, "onCreate: " + orangeBean.toString());
        Log.e(TAG, "onCreate: " + bananaBean.toString());
        Log.e(TAG, "onCreate: " + banaBa.toString());
        Log.e(TAG, "onCreate: "+pearBeanA.get() );
        Log.e(TAG, "onCreate: "+pearBeanA.get());
        Log.e(TAG, "onCreate: "+pearBeanB.get() );
        Log.e(TAG, "onCreate: "+pearBeanB.get());
       /* Log.e(TAG, "onCreate: "+orangeBeanA.toString() );
        Log.e(TAG, "onCreate: "+orangeBeanB.toString() );
        Log.e(TAG, "onCreate: "+bananaBeanA.toString() );
        Log.e(TAG, "onCreate: "+bananaBeanB.toString() );*/

    }

}
