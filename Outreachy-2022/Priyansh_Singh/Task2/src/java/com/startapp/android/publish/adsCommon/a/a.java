package com.startapp.android.publish.adsCommon.a;

import com.startapp.android.publish.common.model.AdPreferences;

public class a
implements Comparable<a> {
    private long a = System.currentTimeMillis();
    private AdPreferences.Placement b;
    private String c;

    public a(AdPreferences.Placement placement, String string) {
        this.b = placement;
        if (string == null) {
            string = "";
        }
        this.c = string;
    }

    public int a(a a2) {
        long l2 = this.a - a2.a;
        if (l2 > 0L) {
            return 1;
        }
        if (l2 == 0L) {
            return 0;
        }
        return -1;
    }

    public AdPreferences.Placement a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((a)object);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdDisplayEvent [displayTime=");
        stringBuilder.append(this.a);
        stringBuilder.append(", placement=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", adTag=");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

