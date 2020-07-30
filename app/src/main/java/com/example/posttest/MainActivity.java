package com.example.posttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import q19.kenes_widget.ui.presentation.KenesWidgetV2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(KenesWidgetV2Activity.newIntent(this, "https://help.post.kz"));
    }
}

