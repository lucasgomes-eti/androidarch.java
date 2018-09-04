package com.example.android.androidarchjava.db.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.example.android.androidarchjava.model.Main;

@Entity(tableName = "main")
public class MainEntity {

    @PrimaryKey
    @NonNull
    public String hello;

    public MainEntity(String hello) {
        this.hello = hello;
    }

    public Main map() {
        return new Main(hello);
    }
}