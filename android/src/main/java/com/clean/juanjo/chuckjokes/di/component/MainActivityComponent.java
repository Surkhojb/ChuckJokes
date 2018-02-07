package com.clean.juanjo.chuckjokes.di.component;

import com.clean.juanjo.chuckjokes.di.module.MainActivityModule;
import com.clean.juanjo.chuckjokes.di.scope.PerActivity;
import com.clean.juanjo.chuckjokes.ui.MainActivity;

import dagger.Component;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

@PerActivity
@Component(dependencies = ChuckAppComponent.class,modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
