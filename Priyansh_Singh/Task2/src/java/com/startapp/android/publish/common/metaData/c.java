package com.startapp.android.publish.common.metaData;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.e;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.h.a;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.MetaDataRequest;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.h;
import com.startapp.common.g;
import java.net.UnknownHostException;

public class c {
    private final Context a;
    private final AdPreferences b;
    private MetaDataRequest.a c;
    private MetaData d = null;
    private com.startapp.android.publish.ads.banner.c e = null;
    private com.startapp.android.publish.ads.splash.f f = null;
    private com.startapp.android.publish.cache.d g = null;
    private com.startapp.android.publish.adsCommon.adinformation.a h = null;
    private b i = null;
    private boolean j = false;

    public c(Context context, AdPreferences adPreferences, MetaDataRequest.a a2) {
        this.a = context;
        this.b = adPreferences;
        this.c = a2;
    }

    private void a(String string, String string2) {
        f.a(this.a, new e(d.b, string, string2), "");
    }
    private void d() {
        throw new IllegalStateException("Decompilation failed");
    }

    public void a() {
        g.a(g.a.b, new Runnable(){

            public void run() {
                final Boolean bl2 = c.this.c();
                new Handler(Looper.getMainLooper()).post(new Runnable(){

                    public void run() {
                        c.this.a(bl2);
                    }
                });
            }

        });
    }
    protected void a(Boolean bl2) {
        Object object;
        Object object2 = object = MetaData.getLock();
        synchronized (object2) {
            if (!this.j) {
                Context context;
                if (bl2.booleanValue() && this.d != null && (context = this.a) != null) {
                    try {
                        MetaData.update(this.a, this.d);
                    }
                    catch (Exception exception) {
                        c.super.a("GetMetaDataAsyncTask.onPostExecute-metadata update fail", exception.getMessage());
                    }
                } else {
                    MetaData.failedLoading();
                }
            }
            return;
        }
    }

    public void b() {
        this.j = true;
    }

    protected Boolean c() {
        block6 : {
            h.a(3, "Loading MetaData");
            MetaDataRequest metaDataRequest = new MetaDataRequest(this.a, this.c);
            try {
                metaDataRequest.fillApplicationDetails(this.a, this.b, false);
                metaDataRequest.fillLocationDetails(this.b, this.a);
                h.a(3, "Networking MetaData");
                String string = a.a(this.a, AdsConstants.a(AdsConstants.ApiType.METADATA), metaDataRequest, null);
                this.d = i.a(string, MetaData.class);
                if (i.a()) break block6;
                this.i = i.a(string, b.class);
                if (i.a(16L) || i.a(32L)) {
                    this.e = i.a(string, com.startapp.android.publish.ads.banner.c.class);
                }
                if (i.a(8L)) {
                    this.f = i.a(string, com.startapp.android.publish.ads.splash.f.class);
                }
                if (i.a(512L)) {
                    this.g = i.a(string, com.startapp.android.publish.cache.d.class);
                }
                if (!i.e()) break block6;
                this.h = i.a(string, com.startapp.android.publish.adsCommon.adinformation.a.class);
            }
            catch (Exception exception) {
                h.a(6, "Unable to handle GetMetaData command!!!!", exception);
                if (!(exception instanceof UnknownHostException) || !exception.getMessage().contains((CharSequence)"init.startappservice.com")) {
                    f.a(this.a, d.b, "GetMetaDataAsync.doInBackground - MetaData request failed", exception.getMessage(), "");
                }
                return Boolean.FALSE;
            }
        }
        this.d();
        return Boolean.TRUE;
    }

}

