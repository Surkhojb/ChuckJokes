package com.clean.juanjo.datasource.cloud.model.mapper;

import com.clean.juanjo.datasource.base.Mapper;
import com.clean.juanjo.datasource.cloud.model.JokeDto;
import com.clean.juanjo.domain.model.JokeModel;

import javax.inject.Inject;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public class CloudJokeMapper implements Mapper<JokeModel,JokeDto> {

    @Inject
    public CloudJokeMapper(){

    }

    @Override
    public JokeModel map(JokeDto dto) {
        JokeModel joke = new JokeModel();
        joke.setIconUrl(dto.getIconUrl());
        joke.setId(dto.getId());
        joke.setUrlToJoke(dto.getUrl());
        joke.setTextJoke(dto.getTextJoke());

        return joke;
    }

    @Override
    public JokeDto inverseMap(JokeModel model) {
        return null;
    }
}
