
package com.startapp.android.publish.common.metaData;

import android.content.Context;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.h.a;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.adsCommon.l;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.MetaDataRequest;
import com.startapp.android.publish.common.metaData.c;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.a.h;

public class f {
    public static void a(Context context, Runnable runnable) {
        try {
            MetaData.init(context);
            if (MetaData.getInstance().isPeriodicMetaDataEnabled()) {
                f.b(context, runnable);
            }
            return;
        }
        catch (Exception exception) {
            com.startapp.android.publish.adsCommon.e.f.a(context, d.b, "PeriodicMetaData.execute", exception.getMessage(), "");
            return;
        }
    }

    private static void b(final Context context, final Runnable runnable) {
        String string = k.a(context, "shared_prefs_appId", "");
        final AdPreferences adPreferences = new AdPreferences(k.a(context, "shared_prefs_devId", null), string);
        c c2 = new c(context, adPreferences, MetaDataRequest.a.e){
            private MetaData d;
            {
                super(context3, adPreferences3, a2);
                this.d = null;
            }

            @Override
            protected final void a(Boolean bl2) {
                try {
                    if (bl2.booleanValue() && this.d != null && context != null) {
                        MetaData.update(context, this.d);
                    }
                    if (runnable != null) {
                        runnable.run();
                    }
                    return;
                }
                catch (Exception exception) {
                    com.startapp.android.publish.adsCommon.e.f.a(context, d.b, "PeriodicMetaData.onPostExecute", exception.getMessage(), "");
                    return;
                }
            }

            @Override
            protected final Boolean c() {
                h.a(3, "Loading MetaData");
                try {
                    l.b(context);
                    MetaDataRequest metaDataRequest = new MetaDataRequest(context, MetaDataRequest.a.e);
                    metaDataRequest.fillApplicationDetails(context, adPreferences, false);
                    metaDataRequest.fillLocationDetails(adPreferences, context);
                    this.d = i.a(a.a(context, AdsConstants.a(AdsConstants.ApiType.METADATA), metaDataRequest, null), MetaData.class);
                    return Boolean.TRUE;
                }
                catch (Exception exception) {
                    h.a(6, "Unable to handle GetMetaData command!!!!", exception);
                    return Boolean.FALSE;
                }
            }
        };
        c2.a();
    }

}

