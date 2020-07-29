package com.example.posttest;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import q19.kenes_widget.KenesWidget

class MainKtActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(KenesWidget.open(this, KenesWidget.EntryParams("https://help.post.kz")))
    }
}

