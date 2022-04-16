package com.flurry.android;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.flurry.android.b;
import com.flurry.android.c;
import com.flurry.android.d;
import com.flurry.android.e;
import com.flurry.sdk.an;
import com.flurry.sdk.ap;
import com.flurry.sdk.bf;
import com.flurry.sdk.bg;
import com.flurry.sdk.br;
import com.flurry.sdk.bs;
import com.flurry.sdk.bx;
import com.flurry.sdk.cb;
import com.flurry.sdk.cc;
import com.flurry.sdk.cx;
import com.flurry.sdk.cy;
import com.flurry.sdk.db;
import com.flurry.sdk.dh;
import com.flurry.sdk.ds;
import com.flurry.sdk.dv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class b {
    public static String a = "!SDK-VERSION-STRING!:com.flurry.android:analytics:11.6.0";
    private static final String b = "b";
    private static c c;
    private static final br<cx> d;
    private static boolean e;
    private static int f;
    private static long g;
    private static boolean h;
    private static boolean i;
    private static List<e> j;
    private static String k;
    private static String l;
    private static com.flurry.android.a m;

    static {
        d = new 1();
        e = false;
        f = 5;
        g = 10000L;
        h = true;
        i = true;
        j = new ArrayList();
        k = null;
        l = null;
        m = null;
    }

    private b() {
    }

    public static int a(String string, Map<String, String> map) {
        int n2 = d.a;
        if (!b.g()) {
            return n2;
        }
        try {
            int n3 = dv.a().a(string, map);
            return n3;
        }
        catch (Throwable throwable) {
            bx.a((String)b, (String)"Failed to log event: ".concat(String.valueOf((Object)string)), (Throwable)throwable);
            return n2;
        }
    }

    public static String a() {
        return l;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Deprecated
    private static void a(Context context, String string) {
        Class<b> class_ = b.class;
        synchronized (b.class) {
            boolean bl = b.g();
            if (!bl) {
                // ** MonitorExit[var5_2] (shouldn't be in output)
                return;
            }
            if (TextUtils.isEmpty((CharSequence)string)) {
                throw new IllegalArgumentException("API key not specified");
            }
            if (bg.a() != null) {
                bx.d((String)b, (String)"Flurry is already initialized");
            }
            try {
                ds.a();
                bg.a((Context)context, (String)string);
                // ** MonitorExit[var5_2] (shouldn't be in output)
                return;
            }
            catch (Throwable throwable) {
                bx.a((String)b, (String)"", (Throwable)throwable);
                // ** MonitorExit[var5_2] (shouldn't be in output)
                return;
            }
        }
    }

    public static /* synthetic */ void a(c c2, boolean bl, int n2, long l2, boolean bl2, boolean bl3, boolean bl4, List list, com.flurry.android.a a2, Context context, String string) {
        c = c2;
        if (b.g()) {
            c = c2;
            bs.a().a("com.flurry.android.sdk.FlurrySessionEvent", d);
        }
        e = bl;
        if (b.g()) {
            if (bl) {
                bx.b();
            } else {
                bx.a();
            }
        }
        f = n2;
        if (b.g()) {
            bx.a((int)n2);
        }
        g = l2;
        if (b.g()) {
            if (l2 < 5000L) {
                bx.b((String)b, (String)"Invalid time set for session resumption: ".concat(String.valueOf((long)l2)));
            } else {
                db.a().a("ContinueSessionMillis", (Object)l2);
            }
        }
        h = bl2;
        if (b.g()) {
            db.a().a("CaptureUncaughtExceptions", (Object)bl2);
        }
        int n3 = context.getResources().getIdentifier("FLURRY_IS_YAHOO_APP", "bool", context.getPackageName());
        boolean bl5 = false;
        if (n3 != 0) {
            bl5 = context.getResources().getBoolean(n3);
            bx.c((String)b, (String)"Found FLURRY_IS_YAHOO_APP resource id. Value: ".concat(String.valueOf((boolean)bl5)));
        }
        if (bl5) {
            db.a().a("ProtonEnabled", (Object)bl3);
            if (!bl3) {
                db.a().a("analyticsEnabled", (Object)Boolean.TRUE);
            }
        } else if (bl3) {
            bx.d((String)b, (String)"Flurry Pulse is not available anymore and the API will be removed in an upcoming release");
        }
        i = bl4;
        if (b.g()) {
            db.a().a("IncludeBackgroundSessionsInMetrics", (Object)bl4);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            cb.a((cc)((cc)((e)iterator.next())));
        }
        m = a2;
        k = string;
        b.a(context, k);
    }

    public static void a(String string) {
        if (!b.g()) {
            return;
        }
        db.a().a("VersionName", (Object)string);
    }

    public static void a(String string, String string2) {
        if (!b.g()) {
            return;
        }
        if (TextUtils.isEmpty((CharSequence)string)) {
            bx.b((String)b, (String)"Session property name was empty");
            return;
        }
        if (TextUtils.isEmpty((CharSequence)string2)) {
            bx.b((String)b, (String)"Session property value was empty");
            return;
        }
        if (bg.a() != null) {
            ap.a();
            bf bf2 = ap.b();
            if (bf2 != null) {
                bf2.a(string, string2);
            }
            return;
        }
        throw new IllegalStateException("Flurry SDK must be initialized before starting a session");
    }

    public static com.flurry.android.a b() {
        Class<b> class_ = b.class;
        synchronized (b.class) {
            com.flurry.android.a a2 = m;
            // ** MonitorExit[var2] (shouldn't be in output)
            return a2;
        }
    }

    public static boolean c() {
        if (!b.g()) {
            return false;
        }
        try {
            boolean bl = cy.a().c();
            return bl;
        }
        catch (Throwable throwable) {
            bx.a((String)b, (String)"", (Throwable)throwable);
            return false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void d() {
        an an2;
        if (!b.g()) {
            return;
        }
        try {
            dv.a();
            an2 = dv.b();
            if (an2 == null) return;
        }
        catch (Throwable throwable) {
            bx.a((String)b, (String)"", (Throwable)throwable);
            return;
        }
        an2.c();
    }

    static /* synthetic */ c e() {
        return c;
    }

    public static /* synthetic */ boolean f() {
        return b.g();
    }

    private static boolean g() {
        if (!dh.a((int)16)) {
            String string = b;
            Locale locale = Locale.getDefault();
            Object[] arrobject = new Object[]{16};
            bx.b((String)string, (String)String.format((Locale)locale, (String)"Device SDK Version older than %d", (Object[])arrobject));
            return false;
        }
        return true;
    }

    public static final class a {
        public static c a;
        public boolean b = false;
        public int c = 5;
        public long d = 10000L;
        public boolean e = true;
        public boolean f = false;
        public boolean g = true;
        public List<e> h = new ArrayList();
        public com.flurry.android.a i;
    }

}

