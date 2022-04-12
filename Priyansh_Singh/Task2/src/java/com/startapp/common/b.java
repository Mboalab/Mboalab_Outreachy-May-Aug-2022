
package com.startapp.common;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class b {
    private static final Object f = new Object();
    private static b g;
    private final Context a;
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> b = new HashMap();
    private final HashMap<String, ArrayList<b>> c = new HashMap();
    private final ArrayList<a> d = new ArrayList();
    private final Handler e;

    private b(Context context) {
        this.a = context;
        this.e = new Handler(context.getMainLooper()){

            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                b.this.a();
            }
        };
    }
    public static b a(Context context) {
        Object object;
        Object object2 = object = f;
        synchronized (object2) {
            if (g != null) return g;
            g = new b(context.getApplicationContext());
            return g;
        }
    }
    protected void a() {
        block3 : do {
            HashMap<BroadcastReceiver, ArrayList<IntentFilter>> hashMap;
            Object[] arrobject;
            HashMap<BroadcastReceiver, ArrayList<IntentFilter>> hashMap2 = hashMap = this.b;
            synchronized (hashMap2) {
                int n2 = this.d.size();
                if (n2 <= 0) {
                    return;
                }
                arrobject = new a[n2];
                this.d.toArray(arrobject);
                this.d.clear();
            }
            int n3 = 0;
            do {
                if (n3 >= arrobject.length) continue block3;
                Object object = arrobject[n3];
                for (int i2 = 0; i2 < ((a)object).b.size(); ++i2) {
                    ((b)object.b.get((int)i2)).b.onReceive(this.a, ((a)object).a);
                }
                ++n3;
            } while (true);
            break;
        } while (true);
    }
    public void a(BroadcastReceiver broadcastReceiver) {
        HashMap<BroadcastReceiver, ArrayList<IntentFilter>> hashMap;
        HashMap<BroadcastReceiver, ArrayList<IntentFilter>> hashMap2 = hashMap = this.b;
        synchronized (hashMap2) {
            ArrayList arrayList = (ArrayList)this.b.remove((Object)broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            int n2 = 0;
            block3 : while (n2 < arrayList.size()) {
                IntentFilter intentFilter = (IntentFilter)arrayList.get(n2);
                int n3 = 0;
                do {
                    block12 : {
                        ArrayList arrayList2;
                        String string;
                        block13 : {
                            block11 : {
                                if (n3 >= intentFilter.countActions()) break block11;
                                string = intentFilter.getAction(n3);
                                arrayList2 = (ArrayList)this.c.get((Object)string);
                                if (arrayList2 == null) break block12;
                                break block13;
                            }
                            ++n2;
                            continue block3;
                        }
                        int n4 = 0;
                        do {
                            if (n4 < arrayList2.size()) {
                                if (((b)arrayList2.get((int)n4)).b == broadcastReceiver) {
                                    arrayList2.remove(n4);
                                    --n4;
                                }
                            } else {
                                if (arrayList2.size() > 0) break;
                                this.c.remove((Object)string);
                                break;
                            }
                            ++n4;
                        } while (true);
                    }
                    ++n3;
                } while (true);
                break;
            }
            return;
        }
    }
    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        HashMap<BroadcastReceiver, ArrayList<IntentFilter>> hashMap;
        HashMap<BroadcastReceiver, ArrayList<IntentFilter>> hashMap2 = hashMap = this.b;
        synchronized (hashMap2) {
            b b2 = new b(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList)this.b.get((Object)broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.b.put((Object)broadcastReceiver, (Object)arrayList);
            }
            arrayList.add((Object)intentFilter);
            int n2 = 0;
            while (n2 < intentFilter.countActions()) {
                String string = intentFilter.getAction(n2);
                ArrayList arrayList2 = (ArrayList)this.c.get((Object)string);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.c.put((Object)string, (Object)arrayList2);
                }
                arrayList2.add((Object)b2);
                ++n2;
            }
            return;
        }
    }
    public boolean a(Intent var1) {
        block17 : {
            block15 : {
                var37_3 = var2_2 = this.b;
                var4_4 = var1.getAction();
                var5_5 = var1.resolveTypeIfNeeded(this.a.getContentResolver());
                var6_6 = var1.getData();
                var7_7 = var1.getScheme();
                var8_8 = var1.getCategories();
                var9_9 = (8 & var1.getFlags()) != 0;
                if (var9_9) {
                    var10_10 = new StringBuilder("Resolving type ");
                    var10_10.append(var5_5);
                    var10_10.append(" scheme ");
                    var10_10.append(var7_7);
                    var10_10.append(" of intent ");
                    var10_10.append((Object)var1);
                }
                if ((var16_11 = (ArrayList)this.c.get((Object)var1.getAction())) == null) break block15;
                if (var9_9) {
                    new StringBuilder("Action list: ").append((Object)var16_11);
                }
                var18_19 = null;
                var19_15 = 0;
                while (var19_15 < var16_11.size()) {
                    block16 : {
                        var24_22 = (b)var16_11.get(var19_15);
                        if (var9_9) {
                            new StringBuilder("Matching against filter ").append((Object)var24_22.a);
                        }
                        if (!var24_22.c) break block16;
                        var26_20 = var19_15;
                        var27_17 = var16_11;
                        var28_16 = var4_4;
                        var29_14 = var5_5;
                        var30_13 = var18_19;
                        ** GOTO lbl-1000
                    }
                    var31_23 = var24_22.a;
                    var32_21 = var4_4;
                    var33_12 = var5_5;
                    var28_16 = var4_4;
                    var30_13 = var18_19;
                    var26_20 = var19_15;
                    var27_17 = var16_11;
                    var29_14 = var5_5;
                    var34_18 = var31_23.match(var32_21, var33_12, var7_7, var6_6, var8_8, "LocalBroadcastManager");
                    if (var34_18 >= 0) {
                        if (var9_9) {
                            new StringBuilder("  Filter matched!  match=0x").append(Integer.toHexString((int)var34_18));
                        }
                        var18_19 = var30_13 == null ? new ArrayList() : var30_13;
                        var18_19.add((Object)var24_22);
                        var24_22.c = true;
                    } else lbl-1000: // 2 sources:
                    {
                        var18_19 = var30_13;
                    }
                    var19_15 = var26_20 + 1;
                    var4_4 = var28_16;
                    var16_11 = var27_17;
                    var5_5 = var29_14;
                }
                var20_25 = var18_19;
                if (var20_25 != null) break block17;
            }
            return false;
        }
        for (var21_24 = 0; var21_24 < var20_25.size(); ++var21_24) {
            ((b)var20_25.get((int)var21_24)).c = false;
        }
        this.d.add((Object)new a(var1, var20_25));
        if (!this.e.hasMessages(1)) {
            this.e.sendEmptyMessage(1);
        }
        return true;
    }

    static class a {
        final Intent a;
        final ArrayList<b> b;

        a(Intent intent, ArrayList<b> arrayList) {
            this.a = intent;
            this.b = arrayList;
        }
    }

    static class b {
        final IntentFilter a;
        final BroadcastReceiver b;
        boolean c;

        b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.a = intentFilter;
            this.b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(128);
            stringBuilder.append("Receiver{");
            stringBuilder.append((Object)this.b);
            stringBuilder.append(" filter=");
            stringBuilder.append((Object)this.a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

}

