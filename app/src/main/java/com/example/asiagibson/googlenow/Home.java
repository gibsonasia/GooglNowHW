package com.example.asiagibson.googlenow;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;


public class Home extends AppCompatActivity {
    //  public static final String USERINPUT = "userinput";
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    EditText editText;
    // ImageView button;


    // public static final String MYPREFERENCES = "MyPrefs";
    //  SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //   sharedPreferences = getSharedPreferences(MYPREFERENCES, Context.MODE_PRIVATE);

        editText = (EditText) findViewById(R.id.edit_text);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RTaskAdapter();
        recyclerView.setAdapter(adapter);


        //SharedPreferences.Editor editor = sharedPreferences.edit();
        //editor.putString(USERINPUT, editText.toString());
        //editor.apply();

    }


}
