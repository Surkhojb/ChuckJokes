package com.clean.juanjo.datasource.cloud.model.mapper;

import com.clean.juanjo.datasource.cloud.model.JokeDto;
import com.clean.juanjo.domain.model.JokeModel;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public class CloudJokeTransformer {

    @Inject
    CloudJokeMapper cloudMapper;

    @Inject
    public CloudJokeTransformer(){

    }

    public List<JokeModel> transformToList(List<JokeDto> dtos){
        return null;
    }

    public JokeModel transform(JokeDto dto){
        return cloudMapper.map(dto);
    }

}
