package com.clean.juanjo.datasource.base;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public interface Mapper<A extends Object,B extends Object> {
    A map(B object);
    B inverseMap(A object);
}
