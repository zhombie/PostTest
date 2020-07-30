package com.example.posttest;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import q19.kenes_widget.ui.presentation.KenesWidgetV2Activity

class MainKtActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(KenesWidgetV2Activity.newIntent(this, "https://help.post.kz"))
    }
}

