package com.simplecity.amp_library.http.lastfm;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class LastFmAlbum implements LastFmResult {

    @SerializedName("album")
    public Album album;

    public static class Album {
        @SerializedName("image")
        public List<LastFmImage> images = new ArrayList<>();
    }

    @Override
    public String getImageUrl() {
        if (album != null) {
            return LastFmUtils.getBestImageUrl(album.images);
        } else {
            return null;
        }
    }
}