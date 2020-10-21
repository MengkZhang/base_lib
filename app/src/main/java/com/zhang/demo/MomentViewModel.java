package com.zhang.demo;

import android.app.Application;
import android.content.Context;


import com.zhang.base_lib.BaseResObserver;
import com.zhang.base_lib.bean.UserInfoBean;
import com.zhang.base_lib.viewmodel.BaseViewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.MutableLiveData;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Desc MomentViewModel
 *
 * @author zhangxiaolin
 * Date 2020/9/16
 */
public class MomentViewModel extends BaseViewModel<MomentRepository> implements LifecycleObserver {

    private MutableLiveData<UserInfoBean> userInfoData;


    public MomentViewModel(@NonNull Application application) {
        super(application);
        userInfoData = new MutableLiveData<>();
    }


    public MutableLiveData<UserInfoBean> getUserInfoData() {
        if (userInfoData == null) {
            userInfoData = new MutableLiveData<>();
        }
        return userInfoData;
    }

    /**
     * 获取用户信息
     *
     * @param context Context
     */
    public void getUserInfo(Context context) {
        mRepository.getUserInfo().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new BaseResObserver<UserInfoBean>(context) {
            @Override
            protected void onSuccess(UserInfoBean s) {
                userInfoData.setValue(s);
            }

            @Override
            protected void onFailure(Throwable e) {
                super.onFailure(e);
                userInfoData.setValue(null);
            }
        });

    }


}
