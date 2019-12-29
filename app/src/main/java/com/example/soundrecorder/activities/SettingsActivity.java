package com.example.soundrecorder.activities;

import android.os.Bundle;

import com.example.soundrecorder.R;
import com.example.soundrecorder.fragments.SettingsFragment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //toolbar.setPopupTheme(R.style.ThemeOverlay_AppCompat_Light);
        //setSupportActionBar(toolbar);
        //ActionBar actionBar = getSupportActionBar();
        if (toolbar != null) {
            toolbar.setTitle(R.string.action_settings);
            //toolbar.setDisplayHomeAsUpEnabled(true);
            //toolbar.setDisplayShowHomeEnabled(true);
        }

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new SettingsFragment())
                .commit();
    }
}