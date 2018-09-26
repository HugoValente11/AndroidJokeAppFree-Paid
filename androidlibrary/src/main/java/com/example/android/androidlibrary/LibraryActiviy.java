package com.example.android.androidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class LibraryActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_activiy);

        String joke = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        TextView joketv = findViewById(R.id.jokeTextView);
        joketv.setText(joke);
    }

}
