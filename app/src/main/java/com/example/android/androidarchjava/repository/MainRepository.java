package com.example.android.androidarchjava.repository;

import android.arch.lifecycle.LiveData;

import com.example.android.androidarchjava.AppExecutors;
import com.example.android.androidarchjava.db.dao.MainDao;
import com.example.android.androidarchjava.model.Main;
import com.example.android.androidarchjava.model.api.Resource;
import com.example.android.androidarchjava.remote.MainService;
import com.example.android.androidarchjava.remote.util.ApiResponse;
import com.example.android.androidarchjava.remote.util.NetworkResource;

import javax.inject.Inject;

public class MainRepository {

    private final MainService mainService;
    private final MainDao mainDao;
    private final AppExecutors appExecutors;

    @Inject
    public MainRepository(MainService mainService, MainDao mainDao, AppExecutors appExecutors) {
        this.mainService = mainService;
        this.mainDao = mainDao;
        this.appExecutors = appExecutors;
    }

    public LiveData<Resource<Main>> loadMain() {
        return new NetworkResource<Main>(appExecutors) {
            @Override
            public LiveData<ApiResponse<Main>> createCall() {
                return mainService.getMain();
            }
        }.asLiveData();
    }
}
