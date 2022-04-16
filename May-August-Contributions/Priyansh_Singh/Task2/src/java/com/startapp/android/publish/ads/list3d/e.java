package com.startapp.android.publish.ads.list3d;

import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.android.publish.ads.list3d.ListItem;
import com.startapp.android.publish.ads.list3d.a;
import com.startapp.android.publish.ads.list3d.g;
import com.startapp.android.publish.adsCommon.d.b;
import com.startapp.android.publish.common.model.AdDetails;
import java.util.ArrayList;
import java.util.List;

public class e {
    private a a = new a();
    private List<ListItem> b;
    private String c = "";

    public Bitmap a(int n2, String string, String string2) {
        return this.a.a(n2, string, string2);
    }

    public void a() {
        this.b = new ArrayList();
        this.c = "";
    }

    public void a(Context context, String string, String string2, b b2, long l2) {
        a a2 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(this.c);
        a2.a(context, string, stringBuilder.toString(), b2, l2);
    }

    public void a(g g2, boolean bl) {
        this.a.a(g2, bl);
    }

    public void a(AdDetails adDetails) {
        ListItem listItem = new ListItem(adDetails);
        this.b.add((Object)listItem);
        this.a.a(-1 + this.b.size(), listItem.a(), listItem.i());
    }

    public void a(String string) {
        a a2 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(this.c);
        a2.a(stringBuilder.toString());
    }

    public void b() {
        this.a.b();
    }

    public void b(String string) {
        this.c = string;
    }

    public void c() {
        this.a.c();
    }

    public void d() {
        this.a.d();
    }

    public List<ListItem> e() {
        return this.b;
    }
}

