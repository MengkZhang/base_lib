package com.zhang.demo;

import android.app.Application;

import com.zhang.testlib.http.HttpHelper;
import com.zhang.testlib.http.URL;

/**
 * @author zhang
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initOkHttp();
    }

    private void initOkHttp() {
        new HttpHelper.Builder(this)
                .initOkHttp()
                .createRetrofit(URL.BASE_URL)
                .build();
    }
}
