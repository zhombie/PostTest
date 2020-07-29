package com.example.posttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import q19.kenes_widget.KenesWidget;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(KenesWidget.open(this, new KenesWidget.EntryParams("https://help.post.kz")));
    }
}

