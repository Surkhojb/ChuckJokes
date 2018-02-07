package com.clean.juanjo.chuckjokes.di.module;

import com.clean.juanjo.chuckjokes.di.scope.PerActivity;
import com.clean.juanjo.chuckjokes.ui.MainActivity;
import com.clean.juanjo.presentation.mainactivity.MainActivityContract;
import com.clean.juanjo.presentation.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

@Module
public class MainActivityModule {
    private  MainActivity view;

    public MainActivityModule(MainActivity view) {
        this.view = view;
    }

    @PerActivity
    @Provides
    MainActivityContract.View providesView(){
        return view;
    }

    @PerActivity
    @Provides
    MainActivityContract.Presenter providesPresenter(MainActivityPresenter presenter){
        return presenter;
    }
}
