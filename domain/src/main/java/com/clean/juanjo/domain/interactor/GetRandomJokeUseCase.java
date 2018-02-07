package com.clean.juanjo.domain.interactor;

import com.clean.juanjo.domain.executor.MainThread;
import com.clean.juanjo.domain.executor.ThreadExecutor;
import com.clean.juanjo.domain.model.JokeModel;
import com.clean.juanjo.domain.repository.IJokeRepository;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public class GetRandomJokeUseCase extends UseCase<JokeModel,GetRandomJokeUseCase.Params> {

    IJokeRepository jokeRepository;

    @Inject
    public GetRandomJokeUseCase(ThreadExecutor executor, MainThread mainThread,
                                IJokeRepository repository){
        super(executor,mainThread);
        this.jokeRepository = repository;
    }

    @Override
    Observable<JokeModel> buildUseCaseObservable(GetRandomJokeUseCase.Params params) {
        return jokeRepository.getRandomJoke();
    }

    public static final class Params {
        private Params(){}

        public static GetRandomJokeUseCase.Params create(){
            return new GetRandomJokeUseCase.Params();
        }

    }
}
