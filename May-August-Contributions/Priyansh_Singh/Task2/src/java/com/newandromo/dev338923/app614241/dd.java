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

public final class dd
implements d {
    private static int A = 0;
    private static int B = 0;
    private static int C = 0;
    private static int D = 0;
    private static int E = 0;
    private static int F = 0;
    private static int G = 0;
    private static int H = 0;
    private static int I = 0;
    private static int J = 0;
    private static boolean K = false;
    private static g L;
    private static k M;
    private static av N;
    private static bo O;
    private static bk P;
    private static bl Q;
    private static p R;
    private static co S;
    private static n T;
    private static m U;
    private static cs V;
    private static final int W = 0;
    static boolean a = false;
    static boolean b = false;
    static boolean c = false;
    static boolean d = false;
    static boolean e = false;
    static boolean f = false;
    static boolean g = false;
    static boolean h = false;
    static boolean i = true;
    static boolean j;
    static boolean k;
    static final boolean l;
    static boolean m;
    static int n;
    static int o;
    static int p;
    static int q;
    static int r;
    static int s;
    static int t;
    static int u;
    static int v;
    static int w;
    static int x;
    static int y;
    private static int z;

    static {
        boolean bl2 = a || b || c || d || e || g || h || i || j || k || f;
        l = bl2;
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
        J = -1;
        n = -1;
        o = -1;
        p = -1;
        q = -1;
        r = -1;
        s = -1;
        t = -1;
        u = -1;
        v = -1;
        w = -1;
        x = -1;
        K = false;
        W = Math.max((int)dd.c(), (int)9);
    }

    static void a(Activity activity) {
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
        if (V != null) {
            V.a(activity);
        }
    }

    static void a(Context context) {
        if (i) {
            co.a(context, "202817720");
        }
    }

    static void b() {
        if (m) {
            K = false;
            n = -1;
            o = -1;
            p = -1;
            q = -1;
            r = -1;
            s = -1;
            t = -1;
            u = -1;
            v = -1;
            w = -1;
            x = -1;
        }
        m = false;
    }

    public static int c() {
        int n2 = a && !m ? 1 : 0;
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
        return n2;
    }

    static void d() {
        int n2;
        int n3 = dd.c();
        int n4 = a && !m ? 0 + z : 0;
        if (b) {
            n4 += A;
        }
        if (c) {
            n4 += B;
        }
        if (d) {
            n4 += C;
        }
        if (e) {
            n4 += D;
        }
        if (g) {
            n4 += F;
        }
        if (h) {
            n4 += G;
        }
        if (i) {
            n4 += H;
        }
        if (j) {
            n4 += I;
        }
        if (k) {
            n4 += J;
        }
        if (f) {
            n4 += E;
        }
        if (n4 != (n2 = 100) && n3 > 0) {
            int n5 = n2 % n3;
            if (n3 != 1) {
                n2 /= n3;
            }
            if (a && !m) {
                z = n5 + n2;
                n5 = 0;
            }
            if (b) {
                A = n5 + n2;
                n5 = 0;
            }
            if (c) {
                B = n5 + n2;
                n5 = 0;
            }
            if (d) {
                C = n5 + n2;
                n5 = 0;
            }
            if (e) {
                D = n5 + n2;
                n5 = 0;
            }
            if (g) {
                F = n5 + n2;
                n5 = 0;
            }
            if (h) {
                G = n5 + n2;
                n5 = 0;
            }
            if (i) {
                H = n5 + n2;
                n5 = 0;
            }
            if (j) {
                I = n5 + n2;
                n5 = 0;
            }
            if (k) {
                J = n5 + n2;
                n5 = 0;
            }
            if (f) {
                E = n2 + n5;
            }
        }
        if (!K) {
            boolean bl2 = a;
            int n6 = 0;
            if (bl2) {
                boolean bl3 = m;
                n6 = 0;
                if (!bl3) {
                    n = 0 + z;
                    n6 = 0 + z;
                }
            }
            if (b) {
                o = n6 + A;
                n6 += A;
            }
            if (c) {
                p = n6 + B;
                n6 += B;
            }
            if (d) {
                q = n6 + C;
                n6 += C;
            }
            if (e) {
                r = n6 + D;
                n6 += D;
            }
            if (g) {
                s = n6 + F;
                n6 += F;
            }
            if (h) {
                t = n6 + G;
                n6 += G;
            }
            if (i) {
                u = n6 + H;
                n6 += H;
            }
            if (j) {
                v = n6 + I;
                n6 += I;
            }
            if (k) {
                w = n6 + J;
                n6 += J;
            }
            if (f) {
                x = n6 + E;
            }
            new StringBuilder("initAdPercentages mAdMobPercentage: ").append(z);
            new StringBuilder("initAdPercentages mAerServPercentage: ").append(A);
            new StringBuilder("initAdPercentages mFacebookPercentage: ").append(B);
            new StringBuilder("initAdPercentages mMillennialMediaPercentage: ").append(C);
            new StringBuilder("initAdPercentages mJavascriptAdPercentage: ").append(D);
            new StringBuilder("initAdPercentages mLeadBoltPercentage: ").append(F);
            new StringBuilder("initAdPercentages mAmazonPercentage: ").append(G);
            new StringBuilder("initAdPercentages mStartAppPercentage: ").append(H);
            new StringBuilder("initAdPercentages mAirpushPercentage: ").append(I);
            new StringBuilder("initAdPercentages mAirpush360Percentage: ").append(J);
            new StringBuilder("initAdPercentages mStaticAdPercentage: ").append(E);
            new StringBuilder("initAdPercentages mAdMobCutOff: ").append(n);
            new StringBuilder("initAdPercentages mAerServCutOff: ").append(o);
            new StringBuilder("initAdPercentages mFacebookCutOff: ").append(p);
            new StringBuilder("initAdPercentages mMillennialMediaCutOff: ").append(q);
            new StringBuilder("initAdPercentages mJavascriptAdCutOff: ").append(r);
            new StringBuilder("initAdPercentages mLeadBoltCutOff: ").append(s);
            new StringBuilder("initAdPercentages mAmazonCutOff: ").append(t);
            new StringBuilder("initAdPercentages mStartAppCutOff: ").append(u);
            new StringBuilder("initAdPercentages mAirpushCutOff: ").append(v);
            new StringBuilder("initAdPercentages mAirpush360CutOff: ").append(w);
            new StringBuilder("initAdPercentages mStaticAdCutOff: ").append(x);
        }
    }

    static void e() {
    }

    static void f() {
    }

    static void g() {
    }

    static void h() {
    }

    static af i() {
        if (L == null) {
            L = new g();
        }
        return L;
    }

    static af j() {
        if (M == null) {
            M = new k();
        }
        return M;
    }

    static af k() {
        if (N == null) {
            N = new av();
        }
        return N;
    }

    static af l() {
        if (O == null) {
            O = new bo();
        }
        return O;
    }

    static af m() {
        if (P == null) {
            P = new bk();
        }
        return P;
    }

    static af n() {
        if (Q == null) {
            Q = new bl();
        }
        return Q;
    }

    static af o() {
        if (R == null) {
            R = new p();
        }
        return R;
    }

    static af p() {
        if (S == null) {
            S = new co("202817720");
        }
        return S;
    }

    static af q() {
        if (T == null) {
            T = new n();
        }
        return T;
    }

    static af r() {
        if (U == null) {
            m m2;
            U = m2 = new m();
            m2.c = true;
        }
        return U;
    }

    static af s() {
        if (V == null) {
            V = new cs();
        }
        return V;
    }

    public static boolean t() {
        return i;
    }

    public static void u() {
        h = false;
        c = false;
    }

    @Override
    public final void a() {
        StringBuilder stringBuilder = new StringBuilder("resetting mCurrentFallbackIndex from ");
        stringBuilder.append(y);
        stringBuilder.append(" to 0");
        y = 0;
    }

    @Override
    public final void a(Activity activity, View view) {
        if (view != null) {
            int n2;
            View view2;
            af af2;
            new StringBuilder("getNextFallbackNetwork - mCurrentFallbackIndex is: ").append(y);
            new StringBuilder("getNextFallbackNetwork starting from: ").append(1 + y);
            y = n2 = 1 + y;
            do {
                int n3 = W;
                af2 = null;
                if (n2 > n3) break;
                if (a && !m && n2 == 1) {
                    y = n2;
                    af2 = dd.i();
                    break;
                }
                if (b && n2 == -1) {
                    y = n2;
                    af2 = dd.j();
                    break;
                }
                if (c && n2 == 2) {
                    y = n2;
                    af2 = dd.k();
                    break;
                }
                if (d && n2 == -1) {
                    y = n2;
                    af2 = dd.l();
                    break;
                }
                if (e && n2 == -1) {
                    y = n2;
                    af2 = dd.m();
                    break;
                }
                if (g && n2 == -1) {
                    y = n2;
                    af2 = dd.n();
                    break;
                }
                if (h && n2 == 3) {
                    y = n2;
                    af2 = dd.o();
                    break;
                }
                if (i && n2 == 8) {
                    y = n2;
                    af2 = dd.p();
                    break;
                }
                if (j && n2 == -1) {
                    y = n2;
                    af2 = dd.q();
                    break;
                }
                if (k && n2 == -1) {
                    y = n2;
                    af2 = dd.r();
                    break;
                }
                if (f && n2 == -1) {
                    y = n2;
                    af2 = dd.s();
                    break;
                }
                ++n2;
            } while (true);
            if (af2 != null) {
                af2.a = this;
                af2.b = false;
            }
            if (af2 != null && (view2 = e.a(view, af2.b())) != null) {
                af2.a(activity, view2);
            }
        }
    }
}

