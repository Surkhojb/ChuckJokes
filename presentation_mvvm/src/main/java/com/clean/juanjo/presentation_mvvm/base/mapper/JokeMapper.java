package com.clean.juanjo.presentation_mvvm.base.mapper;

import com.clean.juanjo.domain.model.JokeModel;
import com.clean.juanjo.presentation_mvvm.base.Joke;
import com.clean.juanjo.presentation_mvvm.base.Mapper;

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
