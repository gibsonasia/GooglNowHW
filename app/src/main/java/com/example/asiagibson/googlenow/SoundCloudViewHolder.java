package com.example.asiagibson.googlenow;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SoundCloudViewHolder extends RecyclerView.ViewHolder implements GoogleNowCard {
    private final static String API_KEY = BuildConfig.API_KEY;
    private final View mView;
    private final TextView soundCloudTv;
    private final ImageView soundCloudIv;


    public SoundCloudViewHolder(ViewGroup parent) {
        super(inflateview(parent));
        mView = itemView;
        soundCloudTv = (TextView) mView.findViewById(R.id.soundcloud_tv);
        soundCloudIv = (ImageView) mView.findViewById(R.id.soundcloud_iv);
    }

    private static View inflateview(ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return layoutInflater.inflate(R.layout.soundcloud_view_holder, parent, false);
    }

    public void bind(GoogleNowCard googleNowCard) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.soundcloud.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        SoundCloudApi service = retrofit.create(SoundCloudApi.class);

        Call<List<SoundCloudTrack>> call = service.getTrack(API_KEY);

        call.enqueue(new Callback<List<SoundCloudTrack>>() {
            @Override
            public void onResponse(Call<List<SoundCloudTrack>> call, Response<List<SoundCloudTrack>> response) {
                List<SoundCloudTrack> list = response.body();
                Random r = new Random();
                int randomEpisode = r.nextInt(list.size());
                final SoundCloudTrack track = list.get(randomEpisode);

                // Set image to ImageView
                String imageUrl = track.getArtwork_url();
                if (imageUrl != null) {
                    Picasso.with(mView.getContext()).load(imageUrl).into(soundCloudIv);
                } else {
                    String defaultImage = track.getUser().getAvatarUrl();
                    Picasso.with(mView.getContext()).load(defaultImage).into(soundCloudIv);
                }

                // Set text to TextView
                String trackTitle = track.getTitle();
                soundCloudTv.setText(trackTitle);

                // Setting onClickListener to navigate user to episode on SoundCloud
                mView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(track.getPermalinkUrl()));
                        mView.getContext().startActivity(browserIntent);
                    }
                });
            }

            @Override
            public void onFailure(Call<List<SoundCloudTrack>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });
    }
}
