package com.clean.juanjo.presentation.base.model.mapper;

import com.clean.juanjo.domain.model.JokeModel;
import com.clean.juanjo.presentation.base.Mapper;
import com.clean.juanjo.presentation.base.model.Joke;

import javax.inject.Inject;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public class JokeMapper implements Mapper<Joke,JokeModel> {

    @Inject
    public JokeMapper(){

    }

    @Override
    public Joke map(JokeModel model) {
        Joke joke = new Joke();
        joke.setTextJoke(model.getTextJoke());

        return joke;
    }

    @Override
    public JokeModel inverseMap(Joke object) {
        return null;
    }
}
