package com.clean.juanjo.chuckjokes.di.module;

import com.clean.juanjo.chuckjokes.di.scope.PerActivity;
import com.clean.juanjo.domain.interactor.GetRandomJokeUseCase;
import com.clean.juanjo.presentation_mvvm.base.mapper.JokeTransformer;
import com.clean.juanjo.presentation_mvvm.mainactivity.JokeViewModelFactory;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

@Module
public class MainActivityModule {

    @PerActivity
    @Provides
    JokeViewModelFactory providesViewModelFactory(GetRandomJokeUseCase useCase,JokeTransformer transformer){
        return new JokeViewModelFactory(useCase,transformer);
    }
}
