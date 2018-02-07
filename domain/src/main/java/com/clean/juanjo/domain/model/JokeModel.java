package com.clean.juanjo.domain.model;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

public class JokeModel {

    private String iconUrl;
    private String id;
    private String urlToJoke;
    private String textJoke;

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrlToJoke() {
        return urlToJoke;
    }

    public void setUrlToJoke(String urlToJoke) {
        this.urlToJoke = urlToJoke;
    }

    public String getTextJoke() {
        return textJoke;
    }

    public void setTextJoke(String textJoke) {
        this.textJoke = textJoke;
    }
}
