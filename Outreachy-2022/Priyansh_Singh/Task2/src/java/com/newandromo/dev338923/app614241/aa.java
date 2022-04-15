package com.newandromo.dev338923.app614241;

import android.support.v4.a.a;
import com.newandromo.dev338923.app614241.aj;
import com.newandromo.dev338923.app614241.as;

public final class aa {
    public int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    public aa(int n2) {
        super(n2, (byte)0);
    }

    private aa(int n2, byte by) {
        this.a = n2;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = false;
    }

    private void a() {
        if (this.a != 0 && this.d == 0 && this.e == 0) {
            boolean bl = aj.c(this.a);
            this.d = aj.a(bl);
            this.e = aj.b(bl);
        }
    }

    private void b() {
        if (this.a != 0 && this.c == 0 && this.b == 0) {
            int n2 = aj.a(this.a, 255);
            int n3 = a.a((int)-1, (int)n2, (float)4.5f);
            int n4 = a.a((int)-1, (int)n2, (float)3.0f);
            if (n3 != -1 && n4 != -1) {
                this.c = aj.a(-1, n3);
                this.b = aj.a(-1, n4);
                return;
            }
            int n5 = a.a((int)-16777216, (int)n2, (float)4.5f);
            int n6 = a.a((int)-16777216, (int)n2, (float)3.0f);
            if (n5 != -1 && n5 != -1) {
                this.c = aj.a(-16777216, n5);
                this.b = aj.a(-16777216, n6);
                return;
            }
            int n7 = n3 != -1 ? aj.a(-1, n3) : aj.a(-16777216, n5);
            this.c = n7;
            int n8 = n4 != -1 ? aj.a(-1, n4) : aj.a(-16777216, n6);
            this.b = n8;
        }
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof aa)) {
            return false;
        }
        aa aa2 = (aa)object;
        boolean bl = as.a(this.a, aa2.a);
        if (bl && (this.f || aa2.f)) {
            boolean bl2 = this.c != 0 || this.b != 0 || aa2.c != 0 || aa2.b != 0;
            boolean bl3 = this.d != 0 || this.e != 0 || aa2.d != 0 || aa2.e != 0;
            if (bl3) {
                aa.super.a();
                aa2.a();
                bl = as.a(this.d, aa2.d) && as.a(this.e, aa2.e);
            }
            if (bl2) {
                aa.super.b();
                aa2.b();
                if (bl && as.a(this.b, aa2.b) && as.a(this.c, aa2.c)) {
                    return true;
                }
                bl = false;
            }
        }
        return bl;
    }

    public final int hashCode() {
        return 851 + this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append("[ backgroundColor: '");
        stringBuilder.append(aj.a(this.a));
        stringBuilder.append("', titleTextColor: '");
        stringBuilder.append(aj.a(this.b));
        stringBuilder.append("', bodyTextColor: '");
        stringBuilder.append(aj.a(this.c));
        stringBuilder.append("', primaryTextColor: '");
        stringBuilder.append(aj.a(this.d));
        stringBuilder.append("', secondaryTextColor: '");
        stringBuilder.append(aj.a(this.e));
        stringBuilder.append("', isCustom: ");
        stringBuilder.append(this.f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

