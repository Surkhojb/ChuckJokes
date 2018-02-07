package com.clean.juanjo.datasource.cloud.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 06/02/2018.
 */

/*{
"icon_url" : "https://assets.chucknorris.host/img/avatar/chuck-norris.png",
"id" : "STZl_b-aRwGCe68GUKH9EA",
"url" : "https://api.chucknorris.io/jokes/STZl_b-aRwGCe68GUKH9EA"
"value" : "Chuck Norris beat Nintendo's "Where's Waldo?" on a black and white television."
}*/
public class JokeDto {
    @Expose
    @SerializedName("icon_url")
    String iconUrl;

    @Expose
    @SerializedName("id")
    String id;

    @Expose
    @SerializedName("url")
    String url;

    @Expose
    @SerializedName("value")
    String textJoke;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTextJoke() {
        return textJoke;
    }

    public void setTextJoke(String textJoke) {
        this.textJoke = textJoke;
    }
}
