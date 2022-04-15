/*
 *  
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package com.startapp.android.publish.adsCommon.b;

import java.io.Serializable;

public class a
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int adAttempt = 0;
    private boolean appPresence = false;
    private boolean isShown = true;
    private int minAppVersion = 0;
    private String packageName;
    private String trackingUrl;

    public a(String string, String string2, int n2, int n3) {
        this.trackingUrl = string;
        this.packageName = string2;
        this.adAttempt = n2;
        this.minAppVersion = n3;
    }

    public String a() {
        return this.trackingUrl;
    }

    public void a(String string) {
        this.trackingUrl = string;
    }

    public void a(boolean bl) {
        this.isShown = bl;
    }

    public String b() {
        return this.packageName;
    }

    public void b(boolean bl) {
        this.appPresence = bl;
    }

    public boolean c() {
        return this.isShown;
    }

    public boolean d() {
        return this.appPresence;
    }

    public int e() {
        return this.minAppVersion;
    }
}

