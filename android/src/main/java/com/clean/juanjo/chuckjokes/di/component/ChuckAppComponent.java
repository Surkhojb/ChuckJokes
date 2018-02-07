package com.clean.juanjo.chuckjokes.di.component;

import com.clean.juanjo.chuckjokes.ChuckApp;
import com.clean.juanjo.chuckjokes.di.module.ChuckAppModule;
import com.clean.juanjo.chuckjokes.di.module.CloudDataSourceModule;
import com.clean.juanjo.datasource.cloud.CloudDataSource;
import com.clean.juanjo.domain.executor.MainThread;
import com.clean.juanjo.domain.executor.ThreadExecutor;
import com.clean.juanjo.domain.repository.IJokeRepository;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

@Singleton
@Component(modules = {ChuckAppModule.class, CloudDataSourceModule.class})
public interface ChuckAppComponent {

    void inject(ChuckApp app);

    ThreadExecutor threadExecutor();

    MainThread mainThread();

    IJokeRepository jokeRepository();
}
