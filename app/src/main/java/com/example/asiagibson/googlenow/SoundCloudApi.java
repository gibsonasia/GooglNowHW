package com.example.asiagibson.googlenow;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SoundCloudApi {

    @GET("users/248722812/tracks") // http://api.soundcloud.com/users/248722812/tracks?client_id=API_KEY
    Call<List<SoundCloudTrack>> getTrack(@Query("client_id") String token);

}
