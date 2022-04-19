package com.startapp.android.publish.adsCommon.adinformation;

import android.content.Context;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.adinformation.AdInformationConfig;
import com.startapp.common.b.f;
import java.io.Serializable;

public class a
implements Serializable {
    private static a a = new a();
    private static Object b = new Object();
    private static final long serialVersionUID = 1L;
    @f(a=true)
    private AdInformationConfig AdInformation = AdInformationConfig.a();
    private String adInformationMetadataUpdateVersion = AdsConstants.h;

    public a() {
        this.a().g();
    }

    public static void a(Context context) {
        a a2 = (a)com.startapp.common.a.f.a((Context)context, (String)"StartappAdInfoMetadata", a.class);
        a a3 = new a();
        if (a2 != null) {
            if (a2.f()) {
                i.a(a2, a3);
            }
            a2.e();
            a = a2;
        } else {
            a = a3;
        }
        a.b().a().g();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, a a2) {
        Object object;
        Object object2 = object = b;
        synchronized (object2) {
            a2.adInformationMetadataUpdateVersion = AdsConstants.h;
            a = a2;
            AdInformationConfig.a(a.b().AdInformation);
            a.b().a().g();
            com.startapp.common.a.f.a((Context)context, (String)"StartappAdInfoMetadata", (Serializable)a2);
            return;
        }
    }

    public static a b() {
        return a;
    }

    private void e() {
        this.AdInformation.k();
    }

    private boolean f() {
        return !AdsConstants.h.equals((Object)this.adInformationMetadataUpdateVersion);
    }

    public AdInformationConfig a() {
        return this.AdInformation;
    }

    public String c() {
        return this.AdInformation.b();
    }

    public String d() {
        return this.AdInformation.c();
    }
}

