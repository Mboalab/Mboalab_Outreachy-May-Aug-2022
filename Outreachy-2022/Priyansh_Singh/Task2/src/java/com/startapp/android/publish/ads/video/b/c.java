/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.startapp.android.publish.ads.video.b;

public interface c {
    public void a();

    public void a(int var1);

    public void a(a var1);

    public void a(b var1);

    public void a(c var1);

    public void a(d var1);

    public void a(e var1);

    public void a(f var1);

    public void a(String var1);

    public void a(boolean var1);

    public void b();

    public void c();

    public int d();

    public int e();

    public boolean f();

    public void g();

    public static interface a {
    }

    public static interface b {
    }

    public static interface c {
        public void a(int var1);
    }

    public static interface d {
        public void a();
    }

    public static interface e {
        public boolean a(g var1);
    }

    public static interface f {
        public void a();
    }

    public static class g {
        private h a;
        private String b;
        private int c;

        public g(h h2, String string, int n2) {
            this.a = h2;
            this.b = string;
            this.c = n2;
        }

        public h a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }
    }

    public static final class h
    extends Enum<h> {
        public static final /* enum */ h a = new h();
        public static final /* enum */ h b = new h();
        public static final /* enum */ h c = new h();
        public static final /* enum */ h d = new h();
        private static final /* synthetic */ h[] e;

        static {
            h[] arrh = new h[]{a, b, c, d};
            e = arrh;
        }

        public static h valueOf(String string) {
            return (h)Enum.valueOf(h.class, (String)string);
        }

        public static h[] values() {
            return (h[])e.clone();
        }
    }

}

