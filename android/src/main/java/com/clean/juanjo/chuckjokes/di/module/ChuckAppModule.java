package com.clean.juanjo.chuckjokes.di.module;

import com.clean.juanjo.chuckjokes.ChuckApp;
import com.clean.juanjo.chuckjokes.interactor.MainThreadImpl;
import com.clean.juanjo.datasource.cloud.CloudDataSource;
import com.clean.juanjo.domain.executor.JobExecutor;
import com.clean.juanjo.domain.executor.MainThread;
import com.clean.juanjo.domain.executor.ThreadExecutor;
import com.clean.juanjo.domain.repository.IJokeRepository;
import com.clean.juanjo.repository.JokesRepository;
import com.clean.juanjo.repository.cloud.ICloudDataSource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

@Module
public class ChuckAppModule {
    ChuckApp app;

    public ChuckAppModule(ChuckApp app) {
        this.app = app;
    }

    @Provides
    @Singleton
    ChuckApp providesChuckApp(){
        return app;
    }

    @Provides
    @Singleton
    ThreadExecutor providesThreadExecutor(JobExecutor jobExecutor){
        return jobExecutor;
    }

    @Provides
    @Singleton
    MainThread providesMainThread(MainThreadImpl mainThreadImpl){
        return mainThreadImpl;
    }

    @Provides
    @Singleton
    ICloudDataSource provideCloudDataSource(CloudDataSource cloudDataSource){
        return cloudDataSource;
    }

    @Provides
    @Singleton
    IJokeRepository provideJokeRepository(JokesRepository jokesRepository){
        return jokesRepository;
    }
}
