package com.clean.juanjo.repository;

import com.clean.juanjo.domain.model.JokeModel;
import com.clean.juanjo.domain.repository.IJokeRepository;
import com.clean.juanjo.repository.cloud.ICloudDataSource;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public class JokesRepository implements IJokeRepository{


    @Inject
    ICloudDataSource dataSource;

    @Inject
    public JokesRepository(){

    }

    @Override
    public Observable<JokeModel> getRandomJoke() {
        return dataSource.getRandomJoke();
    }
}
