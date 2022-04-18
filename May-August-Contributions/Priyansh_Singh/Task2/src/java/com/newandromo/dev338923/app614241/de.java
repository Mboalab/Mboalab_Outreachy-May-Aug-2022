/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.newandromo.dev338923.app614241.cp
 *  com.newandromo.dev338923.app614241.de$1
 *  com.newandromo.dev338923.app614241.de$2
 *  com.newandromo.dev338923.app614241.de$3
 *  com.newandromo.dev338923.app614241.de$4
 *  com.newandromo.dev338923.app614241.de$5
 *  com.newandromo.dev338923.app614241.de$6
 *  com.newandromo.dev338923.app614241.de$7
 *  com.newandromo.dev338923.app614241.de$8
 *  com.newandromo.dev338923.app614241.de$9
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Random
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import com.newandromo.dev338923.app614241.InterstitialHelperBase;
import com.newandromo.dev338923.app614241.cp;
import com.newandromo.dev338923.app614241.de;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class de {
    private static boolean a = false;
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d = false;
    private static boolean e = false;
    private static boolean f = true;
    private static boolean g;
    private static boolean h;
    private static boolean i;
    private static final boolean j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static Random t;

    static {
        boolean bl = a || b || c || d || e || f || g || h;
        j = bl;
        k = -1;
        l = -1;
        m = -1;
        n = -1;
        o = -1;
        p = -1;
        q = -1;
        r = -1;
        s = -1;
        t = new Random();
    }

    private static int a(List<a> list, int n2) {
        Iterator iterator = list.iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            a a2 = (a)iterator.next();
            if (a2.a < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a2.b);
                stringBuilder.append(" range: ");
                stringBuilder.append((n3 += n2) - n2);
                stringBuilder.append(" - ");
                stringBuilder.append(n3 - 1);
                stringBuilder.append(", percentage: ");
                stringBuilder.append(n2);
                stringBuilder.append(" (");
                stringBuilder.append(a2.a);
                stringBuilder.append(")");
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a2.b);
            stringBuilder.append(" range: ");
            stringBuilder.append((n3 += a2.a) - a2.a);
            stringBuilder.append(" - ");
            stringBuilder.append(n3 - 1);
            stringBuilder.append(", percentage: ");
            stringBuilder.append(a2.a);
            stringBuilder.append(" (");
            stringBuilder.append(a2.a);
            stringBuilder.append(")");
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static InterstitialHelperBase a() {
        boolean bl = j;
        InterstitialHelperBase interstitialHelperBase = null;
        if (bl) {
            block16 : {
                ArrayList arrayList = new ArrayList();
                if (i) {
                    arrayList.add((Object)new 1(k, "AppBrain"));
                    new StringBuilder("AppBrain enabled, percentage: ").append(k);
                }
                if (a) {
                    arrayList.add((Object)new 2(l, "AdMob"));
                    new StringBuilder("AdMob enabled, percentage: ").append(l);
                }
                if (b) {
                    arrayList.add((Object)new 3(m, "AerServ"));
                    new StringBuilder("AerServ enabled, percentage: ").append(m);
                }
                if (c) {
                    arrayList.add((Object)new 4(n, "Facebook"));
                    new StringBuilder("Facebook Audience Network enabled, percentage: ").append(n);
                }
                if (d) {
                    arrayList.add((Object)new 5(o, "Amazon"));
                    new StringBuilder("Amazon enabled, percentage: ").append(o);
                }
                if (e) {
                    arrayList.add((Object)new 6(p, "AppLovin"));
                    new StringBuilder("AppLovin enabled, percentage: ").append(p);
                }
                if (f) {
                    arrayList.add((Object)new 7(q, "StartApp"));
                    new StringBuilder("StartApp enabled, percentage: ").append(q);
                }
                if (g) {
                    arrayList.add((Object)new 8(r, "AirPush"));
                    new StringBuilder("AirPush enabled, percentage: ").append(r);
                }
                if (h) {
                    arrayList.add((Object)new 9(s, "MillennialMedia"));
                    new StringBuilder("MillennialMedia enabled, percentage: ").append(s);
                }
                int n2 = arrayList.size();
                int n3 = 0;
                if (n2 <= 1) {
                    int n4 = arrayList.size();
                    interstitialHelperBase = null;
                    if (n4 == 1) {
                        a a2 = (a)arrayList.get(0);
                        interstitialHelperBase = a2.a();
                        new StringBuilder("Only one network enabled: ").append(a2.b);
                    }
                } else {
                    a a3;
                    int n5 = 100 / arrayList.size();
                    int n6 = t.nextInt(de.a((List<a>)arrayList, n5));
                    Iterator iterator = arrayList.iterator();
                    do {
                        boolean bl2 = iterator.hasNext();
                        interstitialHelperBase = null;
                        if (!bl2) break block16;
                        a3 = (a)iterator.next();
                        if (a3.a < 0) {
                            n3 += n5;
                            continue;
                        }
                        n3 += a3.a;
                    } while (n6 >= n3);
                    interstitialHelperBase = a3.a();
                }
            }
            if (interstitialHelperBase != null) {
                interstitialHelperBase.a = true;
            }
        }
        return interstitialHelperBase;
    }

    static void a(Context context) {
        if (f) {
            cp.a((Context)context, (String)"202817720");
        }
    }

    public static boolean b() {
        return f;
    }

    public static void c() {
        d = false;
        c = false;
        i = false;
    }

    static abstract class a {
        final int a;
        final String b;

        public a(int n2, String string) {
            this.a = n2;
            this.b = string;
        }

        abstract InterstitialHelperBase a();
    }

}

