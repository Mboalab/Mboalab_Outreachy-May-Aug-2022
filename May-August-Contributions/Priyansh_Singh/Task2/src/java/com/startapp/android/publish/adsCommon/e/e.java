/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.telephony.CellInfo
 *  android.telephony.TelephonyManager
 *  android.util.Pair
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  org.json.JSONArray
 */
package com.startapp.android.publish.adsCommon.e;

import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.startapp.android.publish.adsCommon.BaseRequest;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.l;
import com.startapp.common.a.a;
import com.startapp.common.a.c;
import com.startapp.common.a.h;
import java.util.List;
import org.json.JSONArray;

public class e
extends BaseRequest {
    private d a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private Long h;
    private String i;
    private String j;
    private JSONArray k;

    public e(d d2) {
        super(d2, "", "");
    }

    public e(d d2, String string, String string2) {
        this.a = d2;
        this.b = string;
        this.c = string2;
    }

    private void a(com.startapp.android.publish.adsCommon.Utils.e e2) {
        String string = a.d();
        e2.a(a.a(), string, true);
        e2.a(a.b(), a.b(string), true);
        e2.a("category", this.e().a(), true);
        e2.a("value", this.f(), false);
        e2.a("d", this.h(), false);
        e2.a("orientation", this.i(), false);
        e2.a("usedRam", this.j(), false);
        e2.a("freeRam", this.k(), false);
        e2.a("sessionTime", (Object)this.l(), false);
        e2.a("appActivity", this.m(), false);
        e2.a("details", this.g(), false);
        e2.a("details_json", (Object)this.n(), false);
        e2.a("cellScanRes", this.o(), false);
        Pair<String, String> pair = l.c();
        Pair<String, String> pair2 = l.d();
        e2.a((String)pair.first, pair.second, false);
        e2.a((String)pair2.first, pair2.second, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void a(Context context) {
        TelephonyManager telephonyManager;
        try {
            telephonyManager = (TelephonyManager)context.getSystemService("phone");
            if (telephonyManager == null) return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder("Cannot fillCellDetails ");
            stringBuilder.append(exception.getMessage());
            h.a(6, stringBuilder.toString());
            return;
        }
        List<CellInfo> list = c.a(context, telephonyManager);
        if (list == null) return;
        if (list.size() <= 0) return;
        this.i(a.c(list.toString()));
    }

    public void a(JSONArray jSONArray) {
        this.k = jSONArray;
    }

    public void d(String string) {
        this.b = string;
    }

    public d e() {
        return this.a;
    }

    public void e(String string) {
        this.d = string;
    }

    public String f() {
        return this.b;
    }

    public void f(String string) {
        this.e = string;
    }

    public String g() {
        return this.c;
    }

    public void g(String string) {
        this.f = string;
    }

    @Override
    public com.startapp.android.publish.adsCommon.Utils.e getNameValueJson() {
        com.startapp.android.publish.adsCommon.Utils.e e2 = super.getNameValueJson();
        if (e2 == null) {
            e2 = new com.startapp.android.publish.adsCommon.Utils.c();
        }
        this.a(e2);
        return e2;
    }

    public String h() {
        return this.d;
    }

    public void h(String string) {
        this.g = string;
    }

    public String i() {
        return this.e;
    }

    public void i(String string) {
        this.j = string;
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.g;
    }

    public Long l() {
        return this.h;
    }

    public String m() {
        return this.i;
    }

    public JSONArray n() {
        return this.k;
    }

    public String o() {
        return this.j;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("InfoEventRequest [category=");
        stringBuilder.append(this.a.a());
        stringBuilder.append(", value=");
        stringBuilder.append(this.b);
        stringBuilder.append(", details=");
        stringBuilder.append(this.c);
        stringBuilder.append(", d=");
        stringBuilder.append(this.d);
        stringBuilder.append(", orientation=");
        stringBuilder.append(this.e);
        stringBuilder.append(", usedRam=");
        stringBuilder.append(this.f);
        stringBuilder.append(", freeRam=");
        stringBuilder.append(this.g);
        stringBuilder.append(", sessionTime=");
        stringBuilder.append((Object)this.h);
        stringBuilder.append(", appActivity=");
        stringBuilder.append(this.i);
        stringBuilder.append(", details_json=");
        stringBuilder.append((Object)this.k);
        stringBuilder.append(", cellScanRes=");
        stringBuilder.append(this.j);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

