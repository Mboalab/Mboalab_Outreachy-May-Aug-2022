package com.newandromo.dev338923.app614241;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class AirBopApplication
extends Application
implements SharedPreferences.OnSharedPreferenceChangeListener {
    public void onCreate() {
        super.onCreate();
        PreferenceManager.getDefaultSharedPreferences((Context)this).registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
    }
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String string) {
    }
}

