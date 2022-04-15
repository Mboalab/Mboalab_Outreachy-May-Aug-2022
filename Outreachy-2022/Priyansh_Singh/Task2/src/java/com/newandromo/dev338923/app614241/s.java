/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.newandromo.dev338923.app614241;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.newandromo.dev338923.app614241.af;
import com.newandromo.dev338923.app614241.av;
import com.newandromo.dev338923.app614241.bk;
import com.newandromo.dev338923.app614241.bl;
import com.newandromo.dev338923.app614241.bo;
import com.newandromo.dev338923.app614241.co;
import com.newandromo.dev338923.app614241.cs;
import com.newandromo.dev338923.app614241.d;
import com.newandromo.dev338923.app614241.e;
import com.newandromo.dev338923.app614241.g;
import com.newandromo.dev338923.app614241.k;
import com.newandromo.dev338923.app614241.m;
import com.newandromo.dev338923.app614241.n;
import com.newandromo.dev338923.app614241.p;

public final class s
implements d {
    private static int A;
    private static int B;
    private static int C;
    private static int D;
    private static int E;
    private static int F;
    private static int G;
    private static int H;
    private static int I;
    private static boolean J;
    private static g K;
    private static k L;
    private static av M;
    private static bo N;
    private static bk O;
    private static bl P;
    private static p Q;
    private static co R;
    private static n S;
    private static m T;
    private static cs U;
    private static int V;
    private static final int W;
    private static boolean a;
    private static boolean b;
    private static boolean c;
    private static boolean d;
    private static boolean e;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static boolean i;
    private static boolean j;
    private static boolean k;
    private static final boolean l;
    private static boolean m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static int z;

    static {
        boolean bl2 = a || b || c || d || e || g || h || i || j || k || f;
        l = bl2;
        n = -1;
        o = -1;
        p = -1;
        q = -1;
        r = -1;
        s = 0;
        t = -1;
        u = -1;
        v = -1;
        w = -1;
        x = -1;
        y = -1;
        z = -1;
        A = -1;
        B = -1;
        C = -1;
        D = -1;
        E = -1;
        F = -1;
        G = -1;
        H = -1;
        I = -1;
        J = false;
        boolean bl3 = a;
        int n2 = 0;
        if (bl3) {
            boolean bl4 = m;
            n2 = 0;
            if (!bl4) {
                n2 = 1;
            }
        }
        if (b) {
            ++n2;
        }
        if (c) {
            ++n2;
        }
        if (d) {
            ++n2;
        }
        if (e) {
            ++n2;
        }
        if (g) {
            ++n2;
        }
        if (h) {
            ++n2;
        }
        if (i) {
            ++n2;
        }
        if (j) {
            ++n2;
        }
        if (k) {
            ++n2;
        }
        if (f) {
            ++n2;
        }
        W = Math.max((int)n2, (int)9);
    }

    static void a(Activity activity) {
        if (K != null) {
            K.a(activity);
        }
        if (L != null) {
            L.a(activity);
        }
        if (M != null) {
            M.a(activity);
        }
        if (N != null) {
            N.a(activity);
        }
        if (O != null) {
            O.a(activity);
        }
        if (P != null) {
            P.a(activity);
        }
        if (Q != null) {
            Q.a(activity);
        }
        if (R != null) {
            R.a(activity);
        }
        if (S != null) {
            S.a(activity);
        }
        if (T != null) {
            T.a(activity);
        }
        if (U != null) {
            U.a(activity);
        }
    }

    static void a(Context context) {
        if (i) {
            co.a(context, "");
        }
    }

    static void b() {
    }

    static void c() {
    }

    static void d() {
    }

    static void e() {
    }

    @Override
    public final void a() {
        StringBuilder stringBuilder = new StringBuilder("resetting mCurrentFallbackIndex from ");
        stringBuilder.append(V);
        stringBuilder.append(" to 0");
        V = 0;
    }

    @Override
    public final void a(Activity activity, View view) {
        if (view != null) {
            int n2;
            af af2;
            View view2;
            new StringBuilder("getNextFallbackNetwork - mCurrentFallbackIndex is: ").append(V);
            new StringBuilder("getNextFallbackNetwork starting from: ").append(1 + V);
            V = n2 = 1 + V;
            do {
                int n3 = W;
                af2 = null;
                if (n2 > n3) break;
                if (a && !m && n2 == -1) {
                    V = n2;
                    if (K == null) {
                        K = new g();
                    }
                    af2 = K;
                    break;
                }
                if (b && n2 == 1) {
                    V = n2;
                    if (L == null) {
                        L = new k();
                    }
                    af2 = L;
                    break;
                }
                if (c && n2 == -1) {
                    V = n2;
                    if (M == null) {
                        M = new av();
                    }
                    af2 = M;
                    break;
                }
                if (d && n2 == -1) {
                    V = n2;
                    if (N == null) {
                        N = new bo();
                    }
                    af2 = N;
                    break;
                }
                if (e && n2 == -1) {
                    V = n2;
                    if (O == null) {
                        O = new bk();
                    }
                    af2 = O;
                    break;
                }
                if (g && n2 == -1) {
                    V = n2;
                    if (P == null) {
                        P = new bl();
                    }
                    af2 = P;
                    break;
                }
                if (h && n2 == -1) {
                    V = n2;
                    if (Q == null) {
                        Q = new p();
                    }
                    af2 = Q;
                    break;
                }
                if (i && n2 == -1) {
                    V = n2;
                    if (R == null) {
                        R = new co("");
                    }
                    af2 = R;
                    break;
                }
                if (j && n2 == -1) {
                    V = n2;
                    if (S == null) {
                        S = new n();
                    }
                    af2 = S;
                    break;
                }
                if (k && n2 == -1) {
                    V = n2;
                    if (T == null) {
                        m m2;
                        T = m2 = new m();
                        m2.c = true;
                    }
                    af2 = T;
                    break;
                }
                if (f && n2 == 2) {
                    V = n2;
                    if (U == null) {
                        U = new cs();
                    }
                    af2 = U;
                    break;
                }
                ++n2;
            } while (true);
            if (af2 != null) {
                af2.a = this;
                af2.b = true;
            }
            if (af2 != null && (view2 = e.a(view, af2.b())) != null) {
                af2.a(activity, view2);
            }
        }
    }
}

