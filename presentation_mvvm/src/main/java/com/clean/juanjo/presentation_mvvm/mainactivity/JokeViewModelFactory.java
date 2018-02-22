package com.clean.juanjo.presentation_mvvm.mainactivity;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.clean.juanjo.domain.interactor.GetRandomJokeUseCase;
import com.clean.juanjo.presentation_mvvm.base.mapper.JokeTransformer;

import javax.inject.Inject;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 21/02/2018.
 */

public class JokeViewModelFactory implements ViewModelProvider.Factory {

    GetRandomJokeUseCase useCase;
    JokeTransformer transformer;

    @Inject
    public JokeViewModelFactory(GetRandomJokeUseCase useCase,JokeTransformer transformer){
        this.useCase = useCase;
        this.transformer = transformer;

    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(JokeViewModel.class)){
            return (T) new JokeViewModel(useCase,transformer);
        }
        throw new IllegalArgumentException("Unknow viewmodel class");
    }
}
