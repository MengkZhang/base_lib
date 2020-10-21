package com.zhang.base_lib.viewmodel;

import android.app.Application;


import com.zhang.base_lib.repository.AbstractRepository;
import com.zhang.testlib.http.ObjectClassUtil;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

/**
 * Desc AbsViewModel
 *
 * @author zhangxiaolin
 * Date 2020/9/16
 */
public class BaseViewModel<T extends AbstractRepository> extends AndroidViewModel {


    public T mRepository;

    public BaseViewModel(@NonNull Application application) {
        super(application);
        mRepository = ObjectClassUtil.getNewInstance(this, 0);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (mRepository != null) {
            mRepository.unDisposable();
        }
    }

}
