package com.example.android.androidarchjava.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import com.example.android.androidarchjava.App;
import com.example.android.androidarchjava.R;
import com.example.android.androidarchjava.repository.MainRepository;

import javax.inject.Inject;

public class MainViewModel extends AndroidViewModel {

    @Inject
    public MainRepository mainRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        ((App) application).component.inject(this);
        _hello.postValue(getApplication().getString(R.string.app_name));
    }

    private MutableLiveData<String> _hello = new MutableLiveData<>();
    public LiveData<String> getHello() {
        return _hello;
    }
}
