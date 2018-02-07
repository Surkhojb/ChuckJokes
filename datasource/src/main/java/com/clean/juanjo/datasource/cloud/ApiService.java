package com.clean.juanjo.datasource.cloud;

import com.clean.juanjo.datasource.cloud.model.JokeDto;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public interface ApiService {

    @GET("/jokes/random")
    Observable<JokeDto> getRandomJoke();
}
