package com.clean.juanjo.datasource.cloud;

import com.clean.juanjo.datasource.cloud.model.mapper.CloudJokeTransformer;
import com.clean.juanjo.domain.model.JokeModel;
import com.clean.juanjo.repository.cloud.ICloudDataSource;

import javax.inject.Inject;

import dagger.Lazy;
import io.reactivex.Observable;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public class CloudDataSource implements ICloudDataSource {
    @Inject
    Lazy<ApiService> apiServiceLazy;

    @Inject
    CloudJokeTransformer jokeTransformer;

    @Inject
    public CloudDataSource(){

    }

    @Override
    public Observable<JokeModel> getRandomJoke() {
        return apiServiceLazy.get().getRandomJoke()
                .map(jokeDto -> jokeTransformer.transform(jokeDto));
    }
}
