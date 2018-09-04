package com.example.android.androidarchjava;

import android.app.Application;

import com.example.android.androidarchjava.di.AppComponent;
import com.example.android.androidarchjava.di.DaggerAppComponent;
import com.example.android.androidarchjava.di.DatabaseModule;
import com.example.android.androidarchjava.di.RemoteModule;

public class App extends Application {
    public AppComponent component =
            DaggerAppComponent.builder()
                    .databaseModule(new DatabaseModule(this))
                    .remoteModule(new RemoteModule())
                    .build();

    @Override
    public void onCreate() {
        super.onCreate();
        component.inject(this);
    }
}
