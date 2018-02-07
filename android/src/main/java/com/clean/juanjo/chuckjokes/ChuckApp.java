package com.clean.juanjo.chuckjokes;

import android.app.Application;

import com.clean.juanjo.chuckjokes.di.component.ChuckAppComponent;
import com.clean.juanjo.chuckjokes.di.component.DaggerChuckAppComponent;
import com.clean.juanjo.chuckjokes.di.module.ChuckAppModule;

import com.clean.juanjo.chuckjokes.di.module.CloudDataSourceModule;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 22/01/2018.
 */

public class ChuckApp extends Application{

    ChuckAppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerChuckAppComponent.builder()
                .chuckAppModule(new ChuckAppModule(this))
                .cloudDataSourceModule(new CloudDataSourceModule(this))
                .build();
        appComponent.inject(this);
    }

    public ChuckAppComponent getAppComponent(){
        return appComponent;
    }
}
