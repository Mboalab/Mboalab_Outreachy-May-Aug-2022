package com.startapp.android.publish.adsCommon.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.startapp.android.publish.ads.a.b;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.h;

public class OverlayActivity
extends Activity {
    private b a;
    private boolean b;
    private int c;
    private boolean d;
    private Bundle e;
    private boolean f = false;
    private int g = -1;

    private void a() {
        int n2 = this.getIntent().getIntExtra("placement", 0);
        this.a = b.a(this, this.getIntent(), AdPreferences.Placement.getByIndex((int)n2));
    }

    public void finish() {
        if (this.a != null) {
            this.a.q();
        }
        super.finish();
    }

    public void onBackPressed() {
        if (!this.a.r()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.b) {
            OverlayActivity.super.a();
            this.a.a(this.e);
            this.a.u();
            this.b = false;
        }
    }

    protected void onCreate(Bundle bundle) {
        this.overridePendingTransition(0, 0);
        super.onCreate(bundle);
        boolean bl = this.getIntent().getBooleanExtra("videoAd", false);
        this.requestWindowFeature(1);
        if (this.getIntent().getBooleanExtra("fullscreen", false) || bl) {
            this.getWindow().setFlags(1024, 1024);
        }
        h.a((String)"AppWallActivity", (int)2, (String)"AppWallActivity::onCreate");
        this.d = this.getIntent().getBooleanExtra("activityShouldLockOrientation", true);
        if (bundle == null && !bl) {
            com.startapp.common.b.a((Context)this).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
        }
        if (bundle != null) {
            this.g = bundle.getInt("activityLockedOrientation", -1);
            this.d = bundle.getBoolean("activityShouldLockOrientation", true);
        }
        this.c = this.getIntent().getIntExtra("orientation", this.getResources().getConfiguration().orientation);
        int n2 = this.getResources().getConfiguration().orientation;
        int n3 = this.c;
        boolean bl2 = false;
        if (n2 != n3) {
            bl2 = true;
        }
        this.b = bl2;
        if (!this.b) {
            OverlayActivity.super.a();
            this.a.a(bundle);
            return;
        }
        this.e = bundle;
    }

    protected void onDestroy() {
        h.a((String)"AppWallActivity", (int)2, (String)"AppWallActivity::onDestroy");
        if (!this.b) {
            this.a.v();
            this.a = null;
            i.a(this, false);
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        if (this.a != null && !this.a.a(n2, keyEvent)) {
            return super.onKeyDown(n2, keyEvent);
        }
        return true;
    }

    protected void onPause() {
        h.a((String)"AppWallActivity", (int)2, (String)"OverlayActivity::onPause");
        super.onPause();
        if (!this.b) {
            this.a.s();
            c.a((Context)this);
        }
        this.overridePendingTransition(0, 0);
    }

    protected void onResume() {
        h.a((String)"AppWallActivity", (int)2, (String)"AppWallActivity::onResume");
        super.onResume();
        if (this.f) {
            this.a.c();
        }
        if (this.g == -1) {
            this.g = i.a(this, this.c, this.d);
        } else {
            com.startapp.common.a.c.a((Activity)this, (int)this.g);
        }
        if (!this.b) {
            this.a.u();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        h.a((String)"AppWallActivity", (int)2, (String)"AppWallActivity::onSaveInstanceState");
        super.onSaveInstanceState(bundle);
        if (!this.b) {
            this.a.b(bundle);
            bundle.putInt("activityLockedOrientation", this.g);
            bundle.putBoolean("activityShouldLockOrientation", this.d);
        }
    }

    protected void onStop() {
        h.a((String)"AppWallActivity", (int)2, (String)"AppWallActivity::onStop");
        super.onStop();
        if (!this.b) {
            this.a.t();
        }
    }
}

