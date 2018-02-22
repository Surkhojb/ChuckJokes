package com.clean.juanjo.presentation_mvvm.mainactivity;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.clean.juanjo.domain.interactor.DefaultObserver;
import com.clean.juanjo.domain.interactor.GetRandomJokeUseCase;
import com.clean.juanjo.domain.model.JokeModel;

import com.clean.juanjo.presentation_mvvm.base.Joke;
import com.clean.juanjo.presentation_mvvm.base.mapper.JokeTransformer;

import javax.inject.Inject;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 21/02/2018.
 */

public class JokeViewModel extends ViewModel {

    private MutableLiveData<Joke> randomJoke = new MutableLiveData<>();

    GetRandomJokeUseCase getRandomeJoke;
    JokeTransformer jokeTransformer;

    public JokeViewModel(GetRandomJokeUseCase useCase,JokeTransformer transformer){
        this.getRandomeJoke = useCase;
        this.jokeTransformer = transformer;
    }

    public LiveData<Joke> joke(){
        return randomJoke;
    }

    public void loadRandomJoke() {
        getRandomeJoke.execute(new GetJokeObserver(),GetRandomJokeUseCase.Params.create());
    }

    final class GetJokeObserver extends DefaultObserver<JokeModel> {
        @Override
        public void onNext(JokeModel jokeModel) {
            randomJoke.setValue(jokeTransformer.transform(jokeModel));
        }

        @Override
        public void onComplete() {
            super.onComplete();
        }

        @Override
        public void onError(Throwable exception) {
            super.onError(exception);
        }

        @Override
        public void onTerminate() {
            super.onTerminate();
        }
    }

}
