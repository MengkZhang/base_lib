package com.zhang.base_lib.repository;


import com.zhang.base_lib.api.ApiService;
import com.zhang.base_lib.repository.AbstractRepository;
import com.zhang.testlib.http.HttpHelper;

/**
 * Desc BaseRepository
 *
 * @author zhangxiaolin
 * Date 2020/9/16
 */
public class BaseRepository extends AbstractRepository {

    protected ApiService apiService;


    public BaseRepository() {
        apiService = HttpHelper.getInstance().create(ApiService.class);
    }


}
