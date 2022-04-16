
package com.startapp.android.publish.cache;

import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.cache.g;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.h;

public abstract class e {
    protected g a;
    private Handler b = null;
    private Long c = null;
    private boolean d = false;

    public e(g g2) {
        this.a = g2;
    }

    private void j() {
        if (this.b != null) {
            this.b.removeCallbacksAndMessages(null);
        }
    }

    private void k() {
        this.c = null;
        this.d = false;
    }

    public void a() {
        String string = this.e();
        StringBuilder stringBuilder = new StringBuilder("Resetting for ");
        stringBuilder.append((Object)this.a.c());
        h.a(string, 4, stringBuilder.toString());
        this.g();
    }

    protected void b() {
        String string = this.e();
        StringBuilder stringBuilder = new StringBuilder("Time reached, reloading ");
        stringBuilder.append((Object)this.a.c());
        h.a(string, 3, stringBuilder.toString());
        this.k();
        this.a.b(true);
    }

    protected abstract boolean c();

    protected abstract long d();

    protected String e() {
        return "CacheScheduledTask";
    }

    public void f() {
        if (!this.d) {
            if (this.c == null) {
                this.c = System.currentTimeMillis();
            }
            if (this.c()) {
                long l2;
                if (this.b == null) {
                    Looper looper = Looper.myLooper();
                    if (looper == null) {
                        looper = Looper.getMainLooper();
                    }
                    this.b = new Handler(looper);
                }
                if ((l2 = this.d()) >= 0L) {
                    this.d = true;
                    String string = this.e();
                    StringBuilder stringBuilder = new StringBuilder("Started for ");
                    stringBuilder.append((Object)((Object)this.a.c()));
                    stringBuilder.append(" - scheduled to: ");
                    stringBuilder.append(l2);
                    h.a(string, 4, stringBuilder.toString());
                    this.b.postDelayed(new Runnable(){

                        public void run() {
                            e.this.b();
                        }
                    }, l2);
                    return;
                }
                h.a(this.e(), 3, "Can't start, scheduled time < 0");
                return;
            }
            h.a(this.e(), 3, "Not allowed");
        }
    }

    public void g() {
        this.j();
        this.k();
    }

    public void h() {
        this.j();
        this.d = false;
    }

    protected final Long i() {
        return this.c;
    }

}

