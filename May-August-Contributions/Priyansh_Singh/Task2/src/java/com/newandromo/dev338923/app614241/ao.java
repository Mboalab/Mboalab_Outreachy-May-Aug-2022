
package com.newandromo.dev338923.app614241;

import com.bumptech.glide.load.c;
import com.newandromo.dev338923.app614241.bc;

public final class ao
extends bc {
    public static final ao a = new b().a();
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final c o;
    private final int p;
    private final String q;
    private final c r;
    private final int s;
    private final String t;
    private final c u;
    private final int v;
    private final int w;

    private <T extends ao, B extends a<T, B>> ao(a<T, B> a2) {
        super(a2);
        this.k = a2.l;
        this.l = a2.m;
        this.m = a2.n;
        this.n = a2.o;
        this.o = a2.p;
        this.p = a2.q;
        this.q = a2.r;
        this.r = a2.s;
        this.s = a2.t;
        this.t = a2.u;
        this.u = a2.v;
        this.v = a2.w;
        this.w = a2.x;
    }

    ao(a a2, byte by2) {
        super(a2);
    }

    @Override
    public final bc.a b() {
        bc.a a2 = new bc.a();
        a2.a = this;
        a2.b = this.t;
        a2.c = this.u;
        a2.h = this.v;
        a2.s = 1048576 | a2.s;
        a2.d = -1;
        return a2;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append("[ title: '");
        stringBuilder.append(this.k);
        stringBuilder.append("', subtitle: '");
        stringBuilder.append(this.l);
        stringBuilder.append("', description: '");
        stringBuilder.append(this.m);
        stringBuilder.append(", extending: ");
        stringBuilder.append(super.toString());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static abstract class a<T extends ao, B extends a<T, B>>
    extends bc.a<T, B> {
        private static String k = "DashboardItem.AbstractBuilder";
        private String l = "";
        private String m = "";
        private String n = "";
        private String o;
        private c p;
        private int q;
        private String r;
        private c s;
        private int t;
        private String u;
        private c v;
        private int w;
        private int x;

        public final B a(int n2) {
            this.x = n2;
            return (B)((a)this.b());
        }

        public final B a(String string) {
            this.l = string;
            return (B)((a)this.b());
        }

        public final B a(String string, c c2) {
            return this.a(string, c2, 0);
        }

        public final B a(String string, c c2, int n2) {
            this.o = string;
            this.p = c2;
            this.q = n2;
            return (B)((a)this.b());
        }

        public final B b(String string) {
            this.m = string;
            return (B)((a)this.b());
        }

        public final B b(String string, c c2) {
            return this.c(string, c2, 0);
        }

        public final B b(String string, c c2, int n2) {
            this.r = string;
            this.s = c2;
            this.t = n2;
            return (B)((a)this.b());
        }

        public final B c(String string) {
            this.n = string;
            return (B)((a)this.b());
        }

        public final B c(String string, c c2, int n2) {
            this.u = string;
            this.v = c2;
            this.w = n2;
            return (B)((a)this.b());
        }
    }

    public static final class b
    extends a<ao, b> {
        private static String k = "DashboardItem.Builder";

        public final ao a() {
            return new ao(this, 0);
        }
    }

}

