package com.zhang.base_lib.api;


import com.zhang.base_lib.bean.UserInfoBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Desc ApiService
 *
 * @author zhangxiaolin
 * Date 2020/9/16
 */
public interface ApiService {
    /**
     * 请求用户信息
     *
     * @return Observable
     */
    @GET("user/jsmith")
    Observable<UserInfoBean> getUserInfo();


}
