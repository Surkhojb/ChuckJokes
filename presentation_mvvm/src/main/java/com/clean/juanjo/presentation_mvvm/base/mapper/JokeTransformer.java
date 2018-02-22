package com.clean.juanjo.presentation_mvvm.base.mapper;

import com.clean.juanjo.domain.model.JokeModel;
import com.clean.juanjo.presentation_mvvm.base.Joke;

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
