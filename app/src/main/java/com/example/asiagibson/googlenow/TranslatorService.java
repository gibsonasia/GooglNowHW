package com.example.asiagibson.googlenow;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by hakeemsackes-bramble on 11/12/16.
 */

public interface TranslatorService {

    @GET("language/translate/v2")
        //source en //target de //&source=en&target=de&q=Hello%20world&q=My%20name%20is%20Jeff
    Call<Translated> getTranslation(@Query("key") String API, @Query("source") String sourceLang, @Query("target") String targetLang, @Query("q") String text);


}

/*public interface MyApiEndpointInterface {
    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter

    @GET("users/{username}")
    Call<User> getUser(@Path("username") String username);

    @GET("group/{id}/users")
    Call<List<User>> groupList(@Path("id") int groupId, @Query("sort") String sort);

    @POST("users/new")
    Call<User> createUser(@Body User user);
}*/
