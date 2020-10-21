package com.zhang.demo;

import android.os.Bundle;
import android.util.Log;

import com.zhang.base_lib.ui.AbstractLifecycleActivity;
import com.zhang.testlib.TestUtil;


/**
 * @author zhang
 */
public class MainActivity extends AbstractLifecycleActivity<MomentViewModel> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel.getUserInfo(this);
    }

    @Override
    protected void dataObserver() {
        super.dataObserver();
        mViewModel.getUserInfoData().observe(this, userInfoBean -> {
            if (userInfoBean != null) {
                TestUtil.showToast(MainActivity.this,userInfoBean.getUsername());
            } else {
                Log.e("===z","data = " + userInfoBean);
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }
}