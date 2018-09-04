package com.example.android.androidarchjava.di;

import com.example.android.androidarchjava.App;
import com.example.android.androidarchjava.ui.MainActivity;
import com.example.android.androidarchjava.viewmodel.MainViewModel;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DatabaseModule.class, RemoteModule.class})

public interface AppComponent {

    void inject(App app);

    void inject(MainActivity activity);

    void inject(MainViewModel mainViewModel);
}
