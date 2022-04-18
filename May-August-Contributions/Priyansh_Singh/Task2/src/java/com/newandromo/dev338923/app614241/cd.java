/*
 *  
 * 
 * Could not load the following classes:
 *  android.support.v4.a.a
 *  android.support.v7.d.b
 *  android.support.v7.d.b$b
 *  android.support.v7.d.b$c
 *  android.support.v7.d.c
 *  android.support.v7.d.c$a
 *  com.newandromo.dev338923.app614241.cd$1
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 */
package com.newandromo.dev338923.app614241;

import android.support.v4.a.a;
import android.support.v7.d.b;
import android.support.v7.d.c;
import com.newandromo.dev338923.app614241.aj;
import com.newandromo.dev338923.app614241.cd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class cd {
    public static final c a = new c.a().i((float)1.0f).g((float)0.0f).h((float)0.0f).a().a;
    public static final c b = new c.a().d((float)0.0f).e((float)0.26f).f((float)0.45f).a((float)0.3f).b((float)0.7f).c((float)1.0f).i((float)0.45f).g((float)0.15f).h((float)0.4f).a().a;
    public static final c c = new c.a().d((float)0.5f).e((float)0.74f).f((float)1.0f).a((float)0.3f).b((float)0.7f).c((float)1.0f).i((float)0.45f).g((float)0.15f).h((float)0.4f).a().a;
    public static final c d = new c.a().d((float)0.3f).e((float)0.5f).f((float)0.7f).a((float)0.35f).b((float)1.0f).c((float)1.0f).i((float)0.4f).g((float)0.4f).h((float)0.2f).a().a;
    public static final c e = new c.a().d((float)0.3f).e((float)0.5f).f((float)0.7f).a((float)0.0f).b((float)0.3f).c((float)0.4f).i((float)0.4f).g((float)0.4f).h((float)0.2f).a().a;
    public static final c f = new c.a().d((float)0.0f).e((float)0.26f).f((float)0.5f).a((float)0.1f).b((float)0.6f).c((float)1.0f).i((float)0.18f).g((float)0.22f).h((float)0.6f).a().a;
    public static final c g = new c.a().d((float)0.5f).e((float)0.74f).f((float)1.0f).a((float)0.1f).b((float)0.7f).c((float)1.0f).i((float)0.18f).g((float)0.22f).h((float)0.6f).a().a;
    public static final c h = new c.a().d((float)0.2f).e((float)0.5f).f((float)0.8f).a((float)0.1f).b((float)0.6f).c((float)1.0f).i((float)0.18f).g((float)0.22f).h((float)0.6f).a().a;
    public static final b.b i = new 1();
    static int j = 0;
    static boolean k = false;
    private static double[] l;
    private static double[] m;

    private static int a(int n2, boolean bl) {
        double[] arrd;
        int n3 = 1;
        if (bl) {
            if (m == null) {
                m = cd.a((boolean)n3);
            }
            arrd = m;
        } else {
            if (l == null) {
                l = cd.a(false);
            }
            arrd = l;
        }
        double[] arrd2 = new double[3];
        double[] arrd3 = new double[3];
        a.a((int)n2, (double[])arrd2);
        double d2 = Double.MAX_VALUE;
        int n4 = -1;
        for (int i2 = 0; i2 < arrd.length; i2 += 3) {
            arrd3[0] = arrd[i2 + 0];
            arrd3[n3] = arrd[i2 + 1];
            arrd3[2] = arrd[i2 + 2];
            double d3 = Math.pow((double)(arrd2[0] - arrd3[0]), (double)2.0) + Math.pow((double)(arrd2[n3] - arrd3[n3]), (double)2.0) + Math.pow((double)(arrd2[2] - arrd3[2]), (double)2.0);
            if (d3 < d2) {
                d2 = d3;
                n4 = i2;
            }
            n3 = 1;
        }
        int n5 = -1;
        double d4 = Double.MAX_VALUE;
        for (int i3 = 0; i3 < arrd.length; i3 += 3) {
            arrd3[0] = arrd[i3 + 0];
            arrd3[1] = arrd[i3 + 1];
            arrd3[2] = arrd[i3 + 2];
            double d5 = Math.sqrt((double)(Math.pow((double)(arrd2[0] - arrd3[0]), (double)2.0) + Math.pow((double)(arrd2[1] - arrd3[1]), (double)2.0) + Math.pow((double)(arrd2[2] - arrd3[2]), (double)2.0)));
            if (!(d5 < d4)) continue;
            n5 = i3;
            d4 = d5;
        }
        if (n4 == n5) {
            int n6 = -1;
            double d6 = Double.MAX_VALUE;
            for (int i4 = 0; i4 < arrd.length; i4 += 3) {
                arrd3[0] = arrd[i4 + 0];
                arrd3[1] = arrd[i4 + 1];
                arrd3[2] = arrd[i4 + 2];
                double d7 = aj.a(arrd2, arrd3);
                if (!(d7 < d6)) continue;
                n6 = i4;
                d6 = d7;
            }
            if (n4 != n6) {
                a.a((double)arrd[n6 + 0], (double)arrd[n6 + 1], (double)arrd[n6 + 2]);
            } else {
                n6 = n4;
            }
            return a.a((double)arrd[n6], (double)arrd[n6 + 1], (double)arrd[n6 + 2]);
        }
        throw new RuntimeException("squared distance not working?");
    }

    public static b.c a(b.c c2, boolean bl) {
        if (c2 != null) {
            return new b.c(cd.a(c2.a, bl), c2.b);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static b.c a(b var0_1, String var1, float var2_2) {
        var3_3 = var1.split("[, ]*if[ ]*\\([ ]*|[ ]*\\)[ ]*,[ ]*");
        var4_4 = var3_3.length;
        var5_5 = 0;
        var6_6 = null;
        while (var5_5 < var4_4) {
            block25 : {
                var7_16 = var3_3[var5_5];
                if (var7_16.length() <= 0) break block25;
                var8_18 = 1.0f;
                var9_23 = var7_16.indexOf(58);
                if (var9_23 < 0) {
                    var10_26 = 0;
                    var11_7 = 0.0f;
                } else {
                    var21_14 = var7_16.substring(0, var9_23).split("[ ]*,[ ]*");
                    var22_21 = var21_14.length;
                    var11_7 = 0.0f;
                    var24_24 = 0;
                    for (var23_10 = 0; var23_10 < var22_21; ++var23_10) {
                        var25_11 = var21_14[var23_10];
                        if (var25_11.indexOf(45) >= 0) {
                            var26_9 = var25_11.split("[ ]*-[ ]*");
                            switch (var26_9.length) {
                                default: {
                                    ** break;
                                }
                                case 2: {
                                    var11_7 = Float.parseFloat((String)var26_9[0]);
                                    var8_18 = Float.parseFloat((String)var26_9[1]);
                                    ** break;
                                }
                                case 1: 
                            }
                            var11_7 = Float.parseFloat((String)var26_9[0]);
                            ** break;
lbl32: // 3 sources:
                            continue;
                        }
                        if (var25_11.contains((CharSequence)"dark")) {
                            var24_24 = 1;
                            continue;
                        }
                        if (!var25_11.contains((CharSequence)"light")) continue;
                        var24_24 = -1;
                    }
                    var7_16 = var7_16.substring(var9_23 + 1);
                    var10_26 = var24_24;
                }
                if (!(var2_2 >= var11_7) || !(var2_2 <= var8_18)) break block25;
                var12_25 = var7_16.toLowerCase().split("[ ]*,[ ]*");
                var13_19 = var12_25.length;
                var14_13 = var6_6;
                for (var15_8 = 0; var15_8 < var13_19; ++var15_8) {
                    var16_15 = var12_25[var15_8];
                    if (var0_1 == null) ** GOTO lbl-1000
                    if (var16_15.contains((CharSequence)"neutral")) {
                        var14_13 = var0_1.a(cd.h);
                    } else {
                        var18_22 = var16_15.contains((CharSequence)"vibrant");
                        var19_20 = var16_15.contains((CharSequence)"muted");
                        var20_17 = var16_15.contains((CharSequence)"dominant");
                        if (var16_15.contains((CharSequence)"dark")) {
                            var14_13 = var18_22 ? var0_1.a(c.c) : (var19_20 ? var0_1.a(c.f) : (var20_17 ? var0_1.a(cd.b) : var0_1.a(cd.f)));
                        } else if (var16_15.contains((CharSequence)"light")) {
                            var14_13 = var18_22 ? var0_1.a(c.a) : (var19_20 ? var0_1.a(c.d) : (var20_17 ? var0_1.a(cd.c) : var0_1.a(cd.g)));
                        } else if (var18_22) {
                            var14_13 = var0_1.a(c.b);
                        } else if (var19_20) {
                            var14_13 = var0_1.a(c.e);
                        } else if (var20_17) {
                            var14_13 = var0_1.a(cd.a);
                        } else lbl-1000: // 2 sources:
                        {
                            var14_13 = null;
                        }
                    }
                    if (var10_26 != 0 && var14_13 != null && var10_26 != 0) {
                        var17_12 = aj.c(var14_13.a);
                        if (var10_26 != -1 ? var10_26 == 1 && var17_12 == false : var17_12 != false) {
                            var14_13 = null;
                        }
                    }
                    if (var14_13 == null) continue;
                    return var14_13;
                }
                var6_6 = var14_13;
            }
            ++var5_5;
        }
        return var6_6;
    }

    public static void a(b b2) {
        if (!Collections.unmodifiableList((List)b2.a).isEmpty()) {
            b2.a(c.b);
            b2.a(c.c);
            b2.a(c.a);
            b2.a(c.e);
            b2.a(c.f);
            b2.a(c.d);
            if (!Collections.unmodifiableList((List)b2.a).isEmpty()) {
                Collections.max((Collection)Collections.unmodifiableList((List)b2.a), (Comparator)new Comparator<b.c>(){});
            }
            b2.a(a);
            b2.a(b);
            b2.a(c);
            b2.a(d);
            b2.a(e);
            b2.a(f);
            b2.a(h);
            b2.a(g);
        }
        ArrayList arrayList = new ArrayList((Collection)Collections.unmodifiableList((List)b2.a));
        Collections.sort((List)arrayList, (Comparator)new Comparator<b.c>(){});
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        cd.d(b2);
        cd.c(b2);
        cd.b(b2);
        cd.b(b2);
    }

    public static boolean a(b b2, b b3) {
        if (b2 != null && b3 != null) {
            List list = Collections.unmodifiableList((List)b2.a);
            List list2 = Collections.unmodifiableList((List)b3.a);
            if (list == null) {
                return list2 == null;
            }
            return list.equals((Object)list2);
        }
        return b2 == b3;
    }

    private static double[] a(boolean bl) {
        int[] arrn = cd.b(bl);
        double[] arrd = new double[3 * arrn.length];
        double[] arrd2 = new double[3];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            a.a((int)arrn[i2], (double[])arrd2);
            int n2 = i2 * 3;
            arrd[n2 + 0] = arrd2[0];
            arrd[n2 + 1] = arrd2[1];
            arrd[n2 + 2] = arrd2[2];
        }
        return arrd;
    }

    public static float b(b b2) {
        if (b2 == null) {
            return -1.0f;
        }
        Iterator iterator = Collections.unmodifiableList((List)b2.a).iterator();
        int n2 = 0;
        int n3 = 0;
        while (iterator.hasNext()) {
            b.c c2 = (b.c)iterator.next();
            if (aj.c(c2.a)) {
                n2 += c2.b;
                continue;
            }
            n3 += c2.b;
        }
        int n4 = n3 + n2;
        if (n4 > 0) {
            return (float)n2 / (float)n4;
        }
        return 0.0f;
    }

    private static int[] b(boolean bl) {
        if (bl) {
            return new int[]{-12846, -769226, -2937041, -3029783, -10011977, -11457112, -4987396, -16537100, -16611119, -3610935, -11751600, -13070788, -1596, -5317, -278483, -13124, -43230, -1684967, -3155748, -10453621, -12232092, -476208, -1499549, -4056997, -3814679, -12627531, -13615201, -5051406, -16728876, -16738393, -2298424, -7617718, -9920712, -4941, -16121, -24576, -2634552, -8825528, -10665929, -1982745, -6543440, -8708190, -4464901, -14575885, -15108398, -5054501, -16738680, -16746133, -985917, -3285959, -5262293, -8014, -26624, -689152, -657931, -6381922, -10395295};
        }
        return new int[]{-5138, -12846, -1074534, -1739917, -1092784, -769226, -1754827, -2937041, -3790808, -4776932, -1185802, -3029783, -5005861, -6982195, -8497214, -10011977, -10603087, -11457112, -12245088, -13558894, -1968642, -4987396, -8268550, -11549705, -14043402, -16537100, -16540699, -16611119, -16615491, -16689253, -1509911, -3610935, -5908825, -8271996, -10044566, -11751600, -12345273, -13070788, -13730510, -14983648, -537, -1596, -2659, -3722, -4520, -5317, -141259, -278483, -415707, -688361, -267801, -13124, -21615, -30107, -36797, -43230, -765666, -1684967, -2604267, -4246004, -1249295, -3155748, -5194043, -7297874, -8875876, -10453621, -11243910, -12232092, -13154481, -14273992, -203540, -476208, -749647, -1023342, -1294214, -1499549, -2614432, -4056997, -5434281, -7860657, -1512714, -3814679, -6313766, -8812853, -10720320, -12627531, -13022805, -13615201, -14142061, -15064194, -2033670, -5051406, -8331542, -11677471, -14235942, -16728876, -16732991, -16738393, -16743537, -16752540, -919319, -2298424, -3808859, -5319295, -6501275, -7617718, -8604862, -9920712, -11171025, -13407970, -1823, -4941, -8062, -10929, -13784, -16121, -19712, -24576, -28928, -37120, -1053719, -2634552, -4412764, -6190977, -7508381, -8825528, -9614271, -10665929, -11652050, -12703965, -793099, -1982745, -3238952, -4560696, -5552196, -6543440, -7461718, -8708190, -9823334, -11922292, -1838339, -4464901, -7288071, -10177034, -12409355, -14575885, -14776091, -15108398, -15374912, -15906911, -2034959, -5054501, -8336444, -11684180, -14244198, -16738680, -16742021, -16746133, -16750244, -16757440, -394265, -985917, -1642852, -2300043, -2825897, -3285959, -4142541, -5262293, -6382300, -8227049, -3104, -8014, -13184, -18611, -22746, -26624, -291840, -689152, -1086464, -1683200, -328966, -657931, -1118482, -2039584, -4342339, -6381922, -9079435, -10395295, -12434878, -14606047};
    }

    private static boolean c(b b2) {
        Iterator iterator = Collections.unmodifiableList((List)b2.a).iterator();
        int n2 = 0;
        int n3 = 0;
        while (iterator.hasNext()) {
            if (aj.c(((b.c)iterator.next()).a)) {
                ++n2;
                continue;
            }
            ++n3;
        }
        return n2 >= n3;
    }

    private static boolean d(b b2) {
        Iterator iterator = Collections.unmodifiableList((List)b2.a).iterator();
        int n2 = 0;
        int n3 = 0;
        while (iterator.hasNext()) {
            b.c c2 = (b.c)iterator.next();
            if (aj.c(c2.a)) {
                n2 += c2.b;
                continue;
            }
            n3 += c2.b;
        }
        return n2 >= n3;
    }

}

