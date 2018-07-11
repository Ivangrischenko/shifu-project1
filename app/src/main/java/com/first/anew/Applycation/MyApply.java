package com.first.anew.Applycation;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MyApply extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        Realm.init(this);

        RealmConfiguration conff = new RealmConfiguration.Builder().name("Appe").build();

        Realm.setDefaultConfiguration(conff);
    }
}
