package com.clean.juanjo.domain.repository;

import com.clean.juanjo.domain.model.JokeModel;

import io.reactivex.Observable;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public interface IJokeRepository {
    Observable<JokeModel> getRandomJoke();
}
