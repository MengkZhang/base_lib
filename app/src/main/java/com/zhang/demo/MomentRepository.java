package com.zhang.demo;


import com.zhang.base_lib.bean.UserInfoBean;
import com.zhang.base_lib.repository.BaseRepository;

import io.reactivex.Observable;

/**
 * Desc MomentRepository
 *
 * @author zhangxiaolin
 * Date 2020/9/16
 */
public class MomentRepository extends BaseRepository {
    public MomentRepository() {
    }


    /**
     * 获取用户信息
     *
     */
    public Observable<UserInfoBean> getUserInfo() {
        return apiService.getUserInfo();
    }


}
