package com.example.android.androidarchjava.db;

import android.arch.persistence.room.RoomDatabase;

import com.example.android.androidarchjava.db.dao.MainDao;
import com.example.android.androidarchjava.db.model.MainEntity;

@android.arch.persistence.room.Database(entities = {MainEntity.class}, version = 1)
public abstract class Database extends RoomDatabase {
    public abstract MainDao mainDao();
}
