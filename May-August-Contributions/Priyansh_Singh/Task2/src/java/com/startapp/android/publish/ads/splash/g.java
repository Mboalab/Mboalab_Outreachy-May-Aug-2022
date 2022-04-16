package com.startapp.android.publish.ads.splash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.startapp.android.publish.ads.a.b;
import com.startapp.android.publish.ads.splash.SplashConfig;
import com.startapp.android.publish.ads.splash.h;
import com.startapp.android.publish.common.model.AdPreferences;
import java.io.Serializable;

public class g
extends b {
    private SplashConfig d = null;
    private h e;
    private boolean f = false;
    private boolean g = false;

    @Override
    public void a(Bundle bundle) {
        com.startapp.common.a.h.a("SplashMode", 3, "onCreate");
        this.d = (SplashConfig)this.a().getSerializableExtra("SplashConfig");
    }

    @Override
    public boolean a(int n2, KeyEvent keyEvent) {
        com.startapp.common.a.h.a("SplashMode", 3, "onKeyDown");
        if (this.f) {
            if (n2 == 25) {
                if (!this.g) {
                    this.g = true;
                    this.e.g();
                    Toast.makeText((Context)this.b(), (CharSequence)"Test Mode", (int)0).show();
                    return true;
                }
            } else if (n2 == 24 && this.g) {
                this.b().finish();
                return true;
            }
        }
        return n2 == 4;
    }

    @Override
    public void q() {
    }

    @Override
    public void s() {
        com.startapp.common.a.h.a("SplashMode", 3, "onPause");
        if (this.e != null) {
            this.e.a();
        }
    }

    @Override
    public void t() {
        com.startapp.common.a.h.a("SplashMode", 3, "onStop");
        if (this.e != null) {
            this.e.b();
        }
    }

    @Override
    public void u() {
        com.startapp.common.a.h.a("SplashMode", 3, "onResume");
        if (this.d != null) {
            Serializable serializable = this.a().getSerializableExtra("AdPreference");
            AdPreferences adPreferences = serializable != null ? (AdPreferences)serializable : new AdPreferences();
            this.f = this.a().getBooleanExtra("testMode", false);
            this.e = new h(this.b(), this.d, adPreferences);
            this.e.a(null);
        }
    }

    @Override
    public void v() {
        com.startapp.common.a.h.a("SplashMode", 3, "onDestroy");
    }
}

