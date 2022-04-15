/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcelable
 *  android.support.v4.content.c
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.newandromo.dev338923.app614241;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v4.content.c;
import com.newandromo.dev338923.app614241.AudioItem;
import com.newandromo.dev338923.app614241.ck;
import com.newandromo.dev338923.app614241.f;
import com.newandromo.dev338923.app614241.z;

public abstract class InterstitialHelperBase {
    static AudioItem b;
    static boolean c;
    static Context d;
    static c e;
    static AudioServiceReceiver f;
    boolean a = true;
    private Runnable g;

    private void j() {
        if (this.g != null) {
            this.g.run();
            this.g = null;
        }
    }

    protected abstract boolean a();

    protected abstract boolean a(Activity var1);

    public final boolean a(Runnable runnable) {
        boolean bl;
        this.g = runnable;
        if (this.b() == ck.a) {
            InterstitialHelperBase.super.j();
            f.a();
        }
        if (!(bl = this.d()) || this.b() == ck.b) {
            InterstitialHelperBase.super.j();
            f.a();
        }
        return bl;
    }

    protected abstract int b();

    protected void b(Activity activity) {
    }

    protected void c(Activity activity) {
    }

    protected abstract boolean c();

    protected abstract boolean d();

    protected abstract void e();

    public String f() {
        return "developer_forgot_about_this_one";
    }

    protected final void g() {
        if (this.b() == ck.c || this.b() == ck.d) {
            this.j();
        }
        f.a();
    }

    protected final void h() {
        if (this.b() == ck.d) {
            this.j();
        }
        f.a();
    }

    protected void i() {
    }

    public static class AudioServiceReceiver
    extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "".equals((Object)intent.getAction())) {
                String string = intent.getStringExtra("");
                switch (1.a[z.a.valueOf(string).ordinal()]) {
                    default: {
                        return;
                    }
                    case 4: {
                        if (!InterstitialHelperBase.c) break;
                        InterstitialHelperBase.b = (AudioItem)intent.getParcelableExtra("");
                        InterstitialHelperBase.c = false;
                        return;
                    }
                    case 3: {
                        return;
                    }
                    case 2: {
                        return;
                    }
                    case 1: {
                        return;
                    }
                }
            }
        }
    }

}

