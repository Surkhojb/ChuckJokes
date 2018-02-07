package com.clean.juanjo.presentation.mainactivity;

import com.clean.juanjo.domain.interactor.DefaultObserver;
import com.clean.juanjo.domain.interactor.GetRandomJokeUseCase;
import com.clean.juanjo.domain.model.JokeModel;
import com.clean.juanjo.presentation.base.model.mapper.JokeTransformer;

import javax.inject.Inject;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    @Inject
    MainActivityContract.View view;

    @Inject
    GetRandomJokeUseCase getRandomJoke;

    @Inject
    JokeTransformer jokeTransformer;

    @Inject
    public MainActivityPresenter(){

    }

    @Override
    public void loadOneRandomJoke() {
        getRandomJoke.execute(new GetJokeObserver(),GetRandomJokeUseCase.Params.create());
    }

    final class GetJokeObserver extends DefaultObserver<JokeModel>{
        @Override
        public void onNext(JokeModel jokeModel) {
            view.loadRandomJoke(jokeTransformer.transform(jokeModel));
        }

        @Override
        public void onComplete() {
            view.changePunchColor();
        }

        @Override
        public void onError(Throwable exception) {
            view.showError(exception.getLocalizedMessage());
        }

        @Override
        public void onTerminate() {
            super.onTerminate();
        }
    }
}
