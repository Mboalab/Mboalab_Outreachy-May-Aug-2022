
package com.startapp.android.publish.common.metaData;

import android.content.Context;
import com.startapp.android.publish.adsCommon.e.c;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.common.a.h;

public class e {
    public static void a(Context context, final Runnable runnable) {
        h.a("PeriodicInfoEvent", 3, "PeriodicInfoEvent execute");
        try {
            MetaData.init(context);
            MetaData.getInstance().setReady(true);
            if (MetaData.getInstance().isPeriodicInfoEventEnabled()) {
                new c(context, true, new com.startapp.common.d(){

                    @Override
                    public final void a(Object object) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }).a();
                return;
            }
            if (runnable == null) return;
        }
        catch (Exception exception) {
            f.a(context, d.b, "PeriodicInfoEvent.execute", exception.getMessage(), "");
            return;
        }
        runnable.run();
    }

}

