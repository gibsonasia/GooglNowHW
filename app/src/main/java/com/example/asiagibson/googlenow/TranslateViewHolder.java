package com.example.asiagibson.googlenow;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.asiagibson.googlenow.BuildConfig.API_KEY2;

public class TranslateViewHolder extends RecyclerView.ViewHolder implements GoogleNowCard {
    private final View mView;
    private final Button btnSpeak;
    private final EditText editText;
    private final TextView mtext;
    private String textFromUser;

    public TranslateViewHolder(ViewGroup parent) {
        super(inflateview(parent));
        mView = itemView;
        btnSpeak = (Button) mView.findViewById(R.id.btnSpeak);
        editText = (EditText) mView.findViewById(R.id.editText);
        btnSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textFromUser = editText.getText().toString();
                startTranslation(textFromUser);
            }
        });

        mtext = (TextView) mView.findViewById(R.id.textview);

    }

    private static View inflateview(ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return layoutInflater.inflate(R.layout.translate_view_holder, parent, false);
    }

    public void bind(GoogleNowCard googleNowCard) {
    }

    public void startTranslation(String text) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://translation.googleapis.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TranslatorService service = retrofit.create(TranslatorService.class);
        Call<Translated> call = service.getTranslation(API_KEY2, "en", "es", text);
        call.enqueue(new Callback<Translated>() {
            @Override
            public void onResponse(Call<Translated> call, Response<Translated> response) {
                Translated transText = response.body();
                System.out.println("eeeee");
                String translated = transText.getData().getTranslations().get(0).getTranslatedText();
                System.out.println(translated);
                mtext.setText(translated);
            }

            @Override
            public void onFailure(Call<Translated> call, Throwable t) {
                Log.d("error", t.getMessage());
                System.out.println("hey");
            }
        });

    }

    public String changeSpaces(String text) {
        text.replaceAll(" ", "%20");
        return text;
    }
}
