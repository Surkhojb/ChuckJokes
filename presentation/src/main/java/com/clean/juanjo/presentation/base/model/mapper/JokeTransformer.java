package com.clean.juanjo.presentation.base.model.mapper;

import com.clean.juanjo.domain.model.JokeModel;
import com.clean.juanjo.presentation.base.model.Joke;

import javax.inject.Inject;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public class JokeTransformer {

    @Inject
    JokeMapper jokeMapper;

    @Inject
    public JokeTransformer(){

    }

    public Joke transform (JokeModel model){
        return jokeMapper.map(model);
    }
}
