
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.databinding.ObservableBoolean;
import android.view.ContextThemeWrapper;
import com.bumptech.glide.g.a;
import com.bumptech.glide.g.b;
import com.bumptech.glide.load.c;
import com.newandromo.dev338923.app614241.ao;
import com.newandromo.dev338923.app614241.bc;
import com.newandromo.dev338923.app614241.bd;
import com.newandromo.dev338923.app614241.bh;
import com.newandromo.dev338923.app614241.cv;

public final class ap
extends bd<ao> {
    private String[] a;
    private String[] b;
    private String[] c;
    private TypedArray h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private bh p;
    private int q;
    private int r;
    private String s;
    private String t;
    private String u;
    private String v;
    public ap(Context var1, bh var2, String var3) {
        throw new IllegalStateException("Decompilation failed");
    }

    private static c a(Context context, String string) {
        if (string != null) {
            return a.a((Context)context);
        }
        return null;
    }

    private static String a(Context context, int n2) {
        String string = null;
        if (n2 != 0) {
            String string2 = cv.g(context, n2);
            if ("".equals((Object)string2)) {
                return null;
            }
            string = string2;
        }
        return string;
    }

    private static String b(Context context, int n2) {
        int n3;
        if (n2 != 0 && (n3 = cv.e(context, n2)) != 0) {
            return cv.f(context, n3);
        }
        return null;
    }

    @Override
    public final bc a(Context context, int n2, int n3) {
        if (n2 < this.a.length) {
            b b2;
            String string;
            int n4;
            boolean bl2;
            int n5;
            b b3;
            b b4;
            int n6;
            int n7;
            int n8;
            int n9 = this.f;
            boolean bl3 = this.g.a;
            boolean bl4 = this.e;
            int n10 = this.i;
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, cv.a(context, context.getResources().getStringArray(n10)[n2]));
            int n11 = cv.a((Context)contextThemeWrapper, 2130968706);
            String string2 = ap.a((Context)contextThemeWrapper, this.k);
            if (string2 != null) {
                b2 = b.a();
                n7 = cv.e((Context)contextThemeWrapper, this.j);
            } else {
                string2 = ap.b((Context)contextThemeWrapper, this.j);
                b2 = ap.a((Context)contextThemeWrapper, string2);
                n7 = 0;
            }
            String string3 = ap.a((Context)contextThemeWrapper, this.o);
            if (string3 != null) {
                b3 = b.a();
                n4 = cv.e((Context)contextThemeWrapper, this.n);
            } else {
                string3 = ap.b((Context)contextThemeWrapper, this.n);
                b3 = ap.a((Context)contextThemeWrapper, string3);
                n4 = 0;
            }
            String string4 = ap.a((Context)contextThemeWrapper, this.m);
            if (string4 != null) {
                b b5 = b.a();
                n5 = cv.e((Context)contextThemeWrapper, this.l);
                bl2 = bl3;
                b4 = b5;
                string = string4;
            } else {
                string = ap.b((Context)contextThemeWrapper, this.l);
                c c2 = ap.a((Context)contextThemeWrapper, string);
                bl2 = bl3;
                b4 = c2;
                n5 = 0;
            }
            if (this.h != null) {
                TypedArray typedArray = this.h;
                n6 = n9;
                n8 = typedArray.getResourceId(n2, 0);
            } else {
                n6 = n9;
                n8 = 0;
            }
            ao.b b6 = new ao.b();
            ((ao.b)((ao.b)((ao.b)((ao.b)((ao.b)((ao.b)((ao.b)((ao.b)((ao.b)((ao.b)((ao.b)((ao.b)((ao.b)b6.a(this.a[n2])).b(this.b[n2])).c(this.c[n2])).a(string2, (c)b2, n7)).b(string, (c)b4, n5)).c(string3, (c)b3, n4)).a(n8)).b(n3)).d(n11)).a(bl4)).a(this.p)).c(n6)).b(bl2)).a(context);
            return b6.a();
        }
        if (this.q > 0) {
            ao.b b7 = (ao.b)new ao.b().a(this.e);
            String string = this.s;
            Object[] arrobject = new Object[]{n2};
            ao.b b8 = (ao.b)b7.a(String.format((String)string, (Object[])arrobject));
            String string5 = this.t;
            Object[] arrobject2 = new Object[]{n2};
            ao.b b9 = (ao.b)((ao.b)b8.b(String.format((String)string5, (Object[])arrobject2))).c(this.u);
            String string6 = this.v;
            Object[] arrobject3 = new Object[]{n2 + this.r};
            ao.b b10 = (ao.b)b9.a(String.format((String)string6, (Object[])arrobject3), (c)b.a());
            String string7 = this.v;
            Object[] arrobject4 = new Object[]{n2 + this.r};
            return ((ao.b)((ao.b)((ao.b)((ao.b)((ao.b)((ao.b)((ao.b)b10.b(String.format((String)string7, (Object[])arrobject4), (c)b.a())).b(n3)).a(this.p)).c(this.f)).b(this.g.a)).a(context)).d(cv.a(context, 2130968706))).a();
        }
        return null;
    }

    public final int getItemCount() {
        return this.a.length + this.q;
    }

    @Override
    public final long getItemId(int n2) {
        return -1L;
    }
}

