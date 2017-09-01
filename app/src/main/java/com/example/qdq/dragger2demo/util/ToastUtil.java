package com.example.qdq.dragger2demo.util;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/9/1.
 */

public class ToastUtil {

    @Inject
    public ToastUtil(){

    }
    public void showToast(Context context,String text){
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show();
    }

}
