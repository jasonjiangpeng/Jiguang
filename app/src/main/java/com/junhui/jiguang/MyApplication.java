package com.junhui.jiguang;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by 骏辉出行 on 2017/5/10.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
