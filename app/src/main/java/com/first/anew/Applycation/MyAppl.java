package com.first.anew.Applycation;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MyAppl extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        Realm.init(this);

        RealmConfiguration conf = new RealmConfiguration.Builder().name("App").build();

        Realm.setDefaultConfiguration(conf);
    }
}
