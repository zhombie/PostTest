package com.example.posttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.crashlytics.FirebaseCrashlytics;

import butterknife.ButterKnife;
import butterknife.OnClick;
import q19.kenes_widget.ui.presentation.KenesWidgetV2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    void support() {
        try {
            startActivity(KenesWidgetV2Activity.newIntent(this, "https://help.post.kz"));
        } catch (Exception e) {
            e.printStackTrace();
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

}

