package com.example.android.androidarchjava.remote;

import android.arch.lifecycle.LiveData;

import com.example.android.androidarchjava.model.Main;
import com.example.android.androidarchjava.remote.util.ApiResponse;

import retrofit2.http.GET;

public interface MainService {

    @GET("main")
    LiveData<ApiResponse<Main>> getMain();
}