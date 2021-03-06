package com.example.android.androidarchjava.di;

import android.content.Context;

import com.example.android.androidarchjava.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private App mApp;

    public AppModule(App app){
        mApp = app;
    }

    @Provides
    @Singleton
    App providesApp() {
        return mApp;
    }

    @Provides
    @Singleton
    Context providesContext() {
        return mApp.getApplicationContext();
    }
}
