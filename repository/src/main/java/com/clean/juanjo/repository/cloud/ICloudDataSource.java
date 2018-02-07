package com.clean.juanjo.repository.cloud;

import com.clean.juanjo.domain.model.JokeModel;

import io.reactivex.Observable;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public interface ICloudDataSource {
    Observable<JokeModel> getRandomJoke();
}
