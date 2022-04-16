/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.startapp.android.publish.adsCommon.e
 *  com.startapp.android.publish.adsCommon.h
 *  com.startapp.android.publish.common.model.AdDetails
 *  com.startapp.common.a.c
 *  com.startapp.common.a.h
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package com.startapp.android.publish.adsCommon.b;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.b.a;
import com.startapp.android.publish.adsCommon.e;
import com.startapp.android.publish.adsCommon.h;
import com.startapp.android.publish.adsCommon.l;
import com.startapp.android.publish.common.model.AdDetails;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class c {
    public static Boolean a(Context context, List<a> list, int n2, Set<String> set, List<a> list2) {
        Iterator iterator = list.iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            a a2 = (a)iterator.next();
            boolean bl = a2.b().startsWith("!");
            int n4 = 1;
            String string = bl ? a2.b().substring(n4) : a2.b();
            boolean bl2 = com.startapp.common.a.c.a((Context)context, (String)string, (int)a2.e());
            boolean bl3 = !bl && bl2 || bl && !bl2;
            if (bl3) {
                com.startapp.common.a.h.a((String)"AppPresenceUtil", (int)3, (String)"in isAppPresent, skipAd is true");
                a2.b(bl2);
                if (n2 != 0) {
                    n4 = 0;
                }
                if (n4 != 0 && !bl) {
                    set.add((Object)a2.b());
                } else if (n4 == 0 && a2.a() != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a2.a());
                    stringBuilder.append("&isShown=");
                    stringBuilder.append(a2.c());
                    stringBuilder.append("&appPresence=");
                    stringBuilder.append(a2.d());
                    a2.a(stringBuilder.toString());
                }
                n3 = n4;
            }
            list2.add((Object)a2);
        }
        if (n3 != 0) {
            for (int i2 = 0; i2 < list2.size(); ++i2) {
                ((a)list2.get(i2)).a(false);
            }
        }
        return (boolean)n3;
    }

    public static List<AdDetails> a(Context context, List<AdDetails> list, int n2, Set<String> set) {
        return c.a(context, list, n2, set, true);
    }

    public static List<AdDetails> a(Context context, List<AdDetails> list, int n2, Set<String> set, boolean bl) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator iterator = list.iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            AdDetails adDetails = (AdDetails)iterator.next();
            a a2 = new a(adDetails.getTrackingUrl(), adDetails.getAppPresencePackage(), n2, adDetails.getMinAppVersion());
            boolean bl3 = adDetails.getAppPresencePackage() != null && adDetails.getAppPresencePackage().startsWith("!");
            String string = bl3 ? adDetails.getAppPresencePackage().substring(1) : adDetails.getAppPresencePackage();
            boolean bl4 = com.startapp.common.a.c.a((Context)context, (String)string, (int)adDetails.getMinAppVersion());
            boolean bl5 = b.a().D() && (bl4 && !bl3 || !bl4 && bl3);
            arrayList3.add((Object)a2);
            if (bl5) {
                a2.b(bl4);
                a2.a(false);
                if (!bl3) {
                    arrayList2.add((Object)adDetails);
                    arrayList4.add((Object)a2);
                }
                set.add((Object)adDetails.getPackageName());
                StringBuilder stringBuilder = new StringBuilder("App Presence:[");
                stringBuilder.append(adDetails.getPackageName());
                stringBuilder.append("]");
                com.startapp.common.a.h.a((String)"AppPresenceUtil", (int)3, (String)stringBuilder.toString());
                bl2 = true;
            } else {
                arrayList.add((Object)adDetails);
            }
            StringBuilder stringBuilder = new StringBuilder("App Not Presence:[");
            stringBuilder.append(adDetails.getPackageName());
            stringBuilder.append("]");
            com.startapp.common.a.h.a((String)"AppPresenceUtil", (int)3, (String)stringBuilder.toString());
        }
        if (arrayList.size() < 5 && (list.size() != 1 || n2 > 0)) {
            int n3 = Math.min((int)(5 - arrayList.size()), (int)arrayList2.size());
            arrayList.addAll((Collection)arrayList2.subList(0, n3));
            Iterator iterator2 = arrayList4.subList(0, n3).iterator();
            while (iterator2.hasNext()) {
                ((a)iterator2.next()).a(true);
            }
        }
        if (bl2) {
            l.c(context);
            if (bl) {
                new com.startapp.android.publish.adsCommon.b.b(context, (List<a>)arrayList3).a();
            }
        }
        return arrayList;
    }

    public static List<a> a(String string, int n2) {
        int n3;
        ArrayList arrayList = new ArrayList();
        String[] arrstring = new String[]{};
        String string2 = i.a(string, "@tracking@", "@tracking@");
        if (string2 != null) {
            arrstring = string2.split(",");
        }
        String[] arrstring2 = new String[]{};
        String string3 = i.a(string, "@appPresencePackage@", "@appPresencePackage@");
        if (string3 != null) {
            arrstring2 = string3.split(",");
        }
        String[] arrstring3 = new String[]{};
        String string4 = i.a(string, "@minAppVersion@", "@minAppVersion@");
        if (string4 != null) {
            arrstring3 = string4.split(",");
        }
        for (n3 = 0; n3 < arrstring2.length; ++n3) {
            String string5 = arrstring.length > n3 ? arrstring[n3] : null;
            String string6 = arrstring2[n3];
            int n4 = arrstring3.length > n3 ? Integer.valueOf((String)arrstring3[n3]) : 0;
            arrayList.add((Object)new a(string5, string6, n2, n4));
        }
        while (n3 < arrstring.length) {
            String string7 = arrstring[n3];
            int n5 = arrstring3.length > n3 ? Integer.valueOf((String)arrstring3[n3]) : 0;
            arrayList.add((Object)new a(string7, "", n2, n5));
            ++n3;
        }
        return arrayList;
    }

    public static boolean a(Context context, Ad ad2) {
        if (ad2 != null) {
            HashSet hashSet = new HashSet();
            if (ad2 instanceof e) {
                return c.a(context, c.a(((e)ad2).e(), 0), 0, (Set<String>)hashSet, (List<a>)new ArrayList());
            }
            if (ad2 instanceof h) {
                List<AdDetails> list = c.a(context, (List<AdDetails>)((h)ad2).d(), 0, (Set<String>)hashSet, false);
                return list == null || list.size() == 0;
                {
                }
            }
        }
        return false;
    }
}

