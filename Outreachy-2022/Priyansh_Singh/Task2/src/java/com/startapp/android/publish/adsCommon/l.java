/*
 *  
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Pair
 *  com.startapp.android.publish.adsCommon.l$2
 *  com.startapp.android.publish.common.metaData.MetaData
 *  com.startapp.android.publish.common.metaData.d
 *  com.startapp.android.publish.common.metaData.h
 *  com.startapp.common.Constants
 *  com.startapp.common.a.c
 *  com.startapp.common.a.h
 *  com.startapp.common.f
 *  com.startapp.common.g
 *  com.startapp.common.g$a
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package com.startapp.android.publish.adsCommon;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Pair;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.adsCommon.l;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.d;
import com.startapp.android.publish.common.metaData.h;
import com.startapp.common.Constants;
import com.startapp.common.a.c;
import com.startapp.common.f;
import com.startapp.common.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class l {
    private static final Object a = new Object();
    private static Pair<String, String> b = null;
    private static Pair<String, String> c = null;
    private static List<PackageInfo> d;
    private static List<PackageInfo> e;
    private static boolean f;
    private static long g;
    private static String h;
    private static boolean i;
    private static boolean j;

    static {
        f = false;
        h = "token";
    }

    public static long a() {
        return g;
    }

    private static List<String> a(List<PackageInfo> list) {
        com.startapp.common.a.h.a((String)"SimpleToken", (int)3, (String)"getPackagesNames entered");
        ArrayList arrayList = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)((PackageInfo)iterator.next()).packageName);
        }
        return arrayList;
    }

    public static void a(Context context) {
        l.c(context);
        i = true;
        j = true;
        h = "token";
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        context.getApplicationContext().registerReceiver(new BroadcastReceiver(){

            public final void onReceive(Context context, Intent intent) {
                f = false;
                l.c(context);
            }
        }, intentFilter);
        MetaData.getInstance().addMetaDataListener((d)new 2(context));
    }

    public static void a(Context context, boolean bl) {
        com.startapp.common.a.h.a((String)"SimpleToken", (int)3, (String)"initSimpleToken entered");
        if (!f && bl) {
            f = true;
            try {
                l.i(context);
                b = new Pair((Object)"token", (Object)f.a(l.a(d)));
                c = new Pair((Object)"token2", (Object)f.a(l.a(e)));
                StringBuilder stringBuilder = new StringBuilder("simpleToken : [");
                stringBuilder.append(b);
                stringBuilder.append("]");
                com.startapp.common.a.h.a((String)"SimpleToken", (int)3, (String)stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder("simpleToken2 : [");
                stringBuilder2.append(c);
                stringBuilder2.append("]");
                com.startapp.common.a.h.a((String)"SimpleToken", (int)3, (String)stringBuilder2.toString());
                return;
            }
            catch (Exception exception) {
                com.startapp.common.a.h.a((String)"SimpleToken", (int)6, (String)"initSimpleToken failed", (Throwable)exception);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void a(PackageInfo packageInfo, PackageManager packageManager, Set<String> set) {
        String string;
        try {
            string = packageManager.getInstallerPackageName(packageInfo.packageName);
            if (set == null) return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder("addToPackagesFromInstallers - can't add app to list ");
            stringBuilder.append(exception.getMessage());
            com.startapp.common.a.h.a((String)"SimpleToken", (int)6, (String)stringBuilder.toString());
            return;
        }
        if (!set.contains((Object)string)) return;
        e.add((Object)packageInfo);
    }

    public static void a(Pair<String, String> pair) {
        com.startapp.common.a.h.a((String)"SimpleToken", (int)3, (String)"errorSendingToken entered");
        if (((String)pair.first).equals((Object)"token")) {
            h = "token";
            i = true;
            return;
        }
        h = "token2";
        j = true;
    }

    private static List<PackageInfo> b(List<PackageInfo> list) {
        if (list.size() <= 100) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        l.c((List<PackageInfo>)arrayList);
        return arrayList.subList(0, 100);
    }

    public static void b() {
        b = null;
        c = null;
        f = false;
    }

    public static void b(Context context) {
        l.a(context, MetaData.getInstance().getSimpleTokenConfig().b(context));
    }

    public static Pair<String, String> c() {
        if (b != null) {
            return b;
        }
        return new Pair((Object)"token", (Object)"");
    }

    public static void c(final Context context) {
        com.startapp.common.a.h.a((String)"SimpleToken", (int)3, (String)"initSimpleTokenAsync entered");
        if (!f && MetaData.getInstance().getSimpleTokenConfig().b(context)) {
            g.a((g.a)g.a.b, (Runnable)new Runnable(){

                public final void run() {
                    l.a(context, MetaData.getInstance().getSimpleTokenConfig().b(context));
                }
            });
        }
    }

    private static void c(List<PackageInfo> list) {
        if (Build.VERSION.SDK_INT >= 9) {
            Collections.sort(list, (Comparator)new Comparator<PackageInfo>(){

                @SuppressLint(value={"InlinedApi"})
                public final int a(PackageInfo packageInfo, PackageInfo packageInfo2) {
                    long l2 = packageInfo.firstInstallTime;
                    long l3 = packageInfo2.firstInstallTime;
                    if (l2 > l3) {
                        return -1;
                    }
                    return l2 != l3;
                }

                @SuppressLint(value={"InlinedApi"})
                public final /* synthetic */ int compare(Object object, Object object2) {
                    return this.a((PackageInfo)object, (PackageInfo)object2);
                }
            });
        }
    }

    public static Pair<String, String> d() {
        if (c != null) {
            return c;
        }
        return new Pair((Object)"token2", (Object)"");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Pair<String, String> d(Context context) {
        Pair<String, String> pair;
        boolean bl;
        block7 : {
            boolean bl2;
            block6 : {
                com.startapp.common.a.h.a((String)"SimpleToken", (int)3, (String)"getSimpleToken entered");
                pair = new Pair<String, String>((Object)"token", (Object)"");
                if (!i.a()) {
                    if (MetaData.getInstance().getSimpleTokenConfig().a(context)) return pair;
                }
                bl2 = l.g(context);
                bl = l.h(context);
                if (bl2 || bl) break block6;
                return pair;
            }
            if (!h.equals((Object)"token")) break block7;
            if (!bl2) return l.f(context);
            return l.e(context);
        }
        Pair<String, String> pair2 = l.e(context);
        if (!bl) return pair2;
        try {
            return l.f(context);
        }
        catch (Exception exception) {
            com.startapp.common.a.h.a((String)"SimpleToken", (int)6, (String)"failed to get simpleToken ", (Throwable)exception);
        }
        return pair;
    }

    private static Pair<String, String> e(Context context) {
        k.b(context, "shared_prefs_simple_token", (String)l.b.second);
        h = "token2";
        i = false;
        return new Pair((Object)"token", l.b.second);
    }

    private static Pair<String, String> f(Context context) {
        k.b(context, "shared_prefs_simple_token2", (String)l.c.second);
        h = "token";
        j = false;
        return new Pair((Object)"token2", l.c.second);
    }

    private static boolean g(Context context) {
        boolean bl;
        block3 : {
            block4 : {
                block2 : {
                    if (i.a()) break block2;
                    boolean bl2 = MetaData.getInstance().getSimpleTokenConfig().b(context);
                    bl = false;
                    if (!bl2) break block3;
                }
                if (MetaData.getInstance().isAlwaysSendToken() || i) break block4;
                boolean bl3 = new Pair((Object)"token", (Object)k.a(context, "shared_prefs_simple_token", "")).equals(b);
                bl = false;
                if (bl3) break block3;
            }
            bl = true;
        }
        return bl;
    }

    private static boolean h(Context context) {
        boolean bl;
        block2 : {
            block3 : {
                boolean bl2 = MetaData.getInstance().isSimpleToken2();
                bl = false;
                if (!bl2) break block2;
                if (MetaData.getInstance().isAlwaysSendToken() || j) break block3;
                boolean bl3 = new Pair((Object)"token2", (Object)k.a(context, "shared_prefs_simple_token2", "")).equals(c);
                bl = false;
                if (bl3) break block2;
            }
            bl = true;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void i(Context context) {
        Object object;
        com.startapp.common.a.h.a((String)"SimpleToken", (int)3, (String)"getPackages entered");
        Object object2 = object = a;
        synchronized (object2) {
            List list;
            long l2;
            PackageManager packageManager = context.getPackageManager();
            Set set = MetaData.getInstance().getInstallersList();
            Set set2 = MetaData.getInstance().getPreInstalledPackages();
            d = new CopyOnWriteArrayList();
            e = new CopyOnWriteArrayList();
            try {
                list = c.a((PackageManager)packageManager);
                l2 = Build.VERSION.SDK_INT >= 9 ? Long.MAX_VALUE : 0L;
            }
            catch (Exception exception) {
                com.startapp.common.a.h.a((String)"SimpleToken", (int)6, (String)"Could not complete getInstalledPackages", (Throwable)exception);
                return;
            }
            g = l2;
            PackageInfo packageInfo = null;
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                PackageInfo packageInfo2 = (PackageInfo)iterator.next();
                if (Build.VERSION.SDK_INT >= 9 && g > packageInfo2.firstInstallTime) {
                    g = packageInfo2.firstInstallTime;
                }
                if (!c.a((PackageInfo)packageInfo2)) {
                    d.add((Object)packageInfo2);
                    l.a(packageInfo2, packageManager, (Set<String>)set);
                    continue;
                }
                if (set2.contains((Object)packageInfo2.packageName)) {
                    d.add((Object)packageInfo2);
                    continue;
                }
                if (!packageInfo2.packageName.equals((Object)Constants.a)) continue;
                packageInfo = packageInfo2;
            }
            d = l.b(d);
            e = l.b(e);
            if (packageInfo != null) {
                d.add(0, packageInfo);
            }
            return;
        }
    }

}

