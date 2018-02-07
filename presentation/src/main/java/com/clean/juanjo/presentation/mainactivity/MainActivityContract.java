package com.clean.juanjo.presentation.mainactivity;

import com.clean.juanjo.presentation.base.model.Joke;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public interface MainActivityContract {

    interface View{
        void changePunchColor();
        void showError(String error);
        void loadRandomJoke(Joke joke);
    }

    interface Presenter{
        void loadOneRandomJoke();
    }
}
