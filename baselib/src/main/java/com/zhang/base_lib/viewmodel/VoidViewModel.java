package com.zhang.base_lib.viewmodel;

import android.app.Application;


import com.zhang.base_lib.repository.VoidRepository;
import com.zhang.base_lib.viewmodel.BaseViewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleObserver;

/**
 * Desc VoidViewModel
 *
 * @author zhangxiaolin
 * Date 2020/9/16
 */
public class VoidViewModel extends BaseViewModel<VoidRepository> implements LifecycleObserver {

    public VoidViewModel(@NonNull Application application) {
        super(application);
    }
}
