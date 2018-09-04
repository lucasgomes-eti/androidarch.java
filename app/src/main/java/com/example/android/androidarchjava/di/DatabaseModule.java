package com.example.android.androidarchjava.di;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.android.androidarchjava.db.Database;
import com.example.android.androidarchjava.db.dao.MainDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {

    private Context mContext;

    public DatabaseModule(Context context) {
        mContext = context;
    }

    @Provides
    @Singleton
    Database provideDatabase() {
        return Room.databaseBuilder(mContext, Database.class, "androidarchjava.db").build();
    }

    @Provides
    @Singleton
    MainDao providesMainDao(Database database) {
        return database.mainDao();
    }
}