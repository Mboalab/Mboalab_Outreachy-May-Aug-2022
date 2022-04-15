package com.startapp.android.publish.ads.banner;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

class b {
    private Context a;
    private String b;

    b(Context context, AttributeSet attributeSet) {
        this.a = context;
        this.b = b.super.a(attributeSet, "adTag");
    }
    private String a(AttributeSet attributeSet, String string) {
        int n2;
        try {
            n2 = attributeSet.getAttributeResourceValue(null, string, -1);
            if (n2 == -1) return attributeSet.getAttributeValue(null, string);
        }
        catch (Exception exception) {
            return null;
        }
        return this.a.getResources().getString(n2);
    }

    public String a() {
        return this.b;
    }
}

