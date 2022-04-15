/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.startapp.android.publish.adsCommon.e;

import com.startapp.android.publish.adsCommon.Utils.c;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.e;
import com.startapp.common.a.a;

public class b
extends e {
    private String a;
    private String b;
    private boolean c;
    private String d;

    public b(d d2) {
        super(d2);
    }

    public String a() {
        return this.a;
    }

    public void a(String string) {
        if (string != null) {
            this.a = a.c(string);
        }
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    public String b() {
        return this.b;
    }

    public void b(String string) {
        if (string != null) {
            this.b = a.c(string);
        }
    }

    public void c(String string) {
        this.d = string;
    }

    public boolean c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    @Override
    public com.startapp.android.publish.adsCommon.Utils.e getNameValueJson() {
        com.startapp.android.publish.adsCommon.Utils.e e2 = super.getNameValueJson();
        if (e2 == null) {
            e2 = new c();
        }
        e2.a("sens", this.a(), false);
        e2.a("bt", this.b(), false);
        e2.a("isService", this.c(), false);
        e2.a("packagingType", this.d(), false);
        return e2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" DataEventRequest [sensors=");
        stringBuilder.append(this.a);
        stringBuilder.append(", bluetooth=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isService=");
        stringBuilder.append(this.c);
        stringBuilder.append(", packagingType=");
        stringBuilder.append(this.d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

