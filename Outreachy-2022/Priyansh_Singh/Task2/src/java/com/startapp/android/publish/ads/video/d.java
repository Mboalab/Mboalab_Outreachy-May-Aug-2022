/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.startapp.android.publish.ads.video.d$2
 *  com.startapp.android.publish.ads.video.d$3
 *  com.startapp.android.publish.cache.h
 *  com.startapp.common.a.d
 *  com.startapp.common.a.f
 *  com.startapp.common.a.h
 *  com.startapp.common.g
 *  com.startapp.common.g$a
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.Iterator
 *  java.util.LinkedList
 */
package com.startapp.android.publish.ads.video;

import android.content.Context;
import com.startapp.android.publish.ads.video.c;
import com.startapp.android.publish.ads.video.d;
import com.startapp.android.publish.ads.video.g;
import com.startapp.android.publish.ads.video.h;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.n;
import com.startapp.common.a.f;
import com.startapp.common.g;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;

public class d {
    private static d a = new d();
    private LinkedList<com.startapp.android.publish.cache.h> b = new LinkedList();

    private d() {
    }

    public static d a() {
        return a;
    }

    private void a(Context context) {
        if (this.b == null) {
            this.b = (LinkedList)f.a((Context)context, (String)"CachedAds", LinkedList.class);
            if (this.b == null) {
                this.b = new LinkedList();
            }
            if (this.a(b.a().G().b())) {
                d.super.b(context);
            }
        }
    }

    private void b(Context context) {
        f.b((Context)context, (String)"CachedAds", this.b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b(Context context, String string, g.a a2, c.a a3) {
        com.startapp.common.a.h.a((String)"VideoAdCacheManager", (int)3, (String)"Full cache: ".concat(String.valueOf((Object)string)));
        d.super.a(context);
        try {
            String string2;
            URL uRL = new URL(string);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(uRL.getHost());
            stringBuilder.append(uRL.getPath().replace((CharSequence)"/", (CharSequence)"_"));
            String string3 = stringBuilder.toString();
            try {
                String string4;
                String string5 = string3.substring(0, string3.lastIndexOf(46));
                String string6 = string3.substring(string3.lastIndexOf(46));
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(new String(com.startapp.common.a.d.b((byte[])MessageDigest.getInstance((String)"MD5").digest(string5.getBytes()), (int)0)).replaceAll("[^a-zA-Z0-9]+", "_"));
                stringBuilder2.append(string6);
                string2 = string4 = stringBuilder2.toString();
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                com.startapp.common.a.h.a((String)"VideoAdCacheManager", (int)6, (String)"Error applying MD5 digest to filename ".concat(String.valueOf((Object)string3)), (Throwable)noSuchAlgorithmException);
                string2 = string3;
            }
            2 var13_14 = new 2((d)this, a2, new com.startapp.android.publish.cache.h(string2), context);
            3 var14_15 = new 3((d)this, a3);
            g g2 = new g(context, uRL, string2, (g.a)var13_14, (c.a)var14_15);
            g2.a();
            return;
        }
        catch (MalformedURLException malformedURLException) {
            com.startapp.common.a.h.a((String)"VideoAdCacheManager", (int)6, (String)"Malformed url ".concat(String.valueOf((Object)string)), (Throwable)malformedURLException);
            if (a2 != null) {
                a2.a(null);
            }
            return;
        }
    }

    protected void a(Context context, com.startapp.android.publish.cache.h h2) {
        if (this.b.contains((Object)h2)) {
            this.b.remove((Object)h2);
            StringBuilder stringBuilder = new StringBuilder("cachedVideoAds already contained ");
            stringBuilder.append(h2.a());
            stringBuilder.append(" - removed. Size = ");
            stringBuilder.append(this.b.size());
            com.startapp.common.a.h.a((String)"VideoAdCacheManager", (int)3, (String)stringBuilder.toString());
        }
        this.a(-1 + b.a().G().b());
        this.b.add((Object)h2);
        d.super.b(context);
        StringBuilder stringBuilder = new StringBuilder("Added ");
        stringBuilder.append(h2.a());
        stringBuilder.append(" to cachedVideoAds. Size = ");
        stringBuilder.append(this.b.size());
        com.startapp.common.a.h.a((String)"VideoAdCacheManager", (int)3, (String)stringBuilder.toString());
    }

    public void a(final Context context, final String string, final g.a a2, final c.a a3) {
        g.a a4 = g.a.b;
        Runnable runnable = new Runnable(){

            public void run() {
                d.this.b(context, string, a2, a3);
            }
        };
        com.startapp.common.g.a((g.a)a4, (Runnable)runnable);
    }

    public boolean a(int n2) {
        Iterator iterator = this.b.iterator();
        boolean bl = false;
        while (iterator.hasNext() && this.b.size() > n2) {
            com.startapp.android.publish.cache.h h2 = (com.startapp.android.publish.cache.h)iterator.next();
            if (h.a(h2.b())) continue;
            bl = true;
            iterator.remove();
            if (h2.b() == null) continue;
            new File(h2.b()).delete();
            StringBuilder stringBuilder = new StringBuilder("cachedVideoAds reached the maximum of ");
            stringBuilder.append(n2);
            stringBuilder.append(" videos - removed ");
            stringBuilder.append(h2.a());
            stringBuilder.append(" Size = ");
            stringBuilder.append(this.b.size());
            com.startapp.common.a.h.a((String)"VideoAdCacheManager", (int)3, (String)stringBuilder.toString());
        }
        return bl;
    }

}

