package com.newandromo.dev338923.app614241.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.databinding.ViewDataBinding;
import android.databinding.a.a.a;
import android.databinding.a.a.b;
import android.databinding.f;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import com.newandromo.dev338923.app614241.aa;
import com.newandromo.dev338923.app614241.ad;
import com.newandromo.dev338923.app614241.ag;
import com.newandromo.dev338923.app614241.aj;
import com.newandromo.dev338923.app614241.bc;
import com.newandromo.dev338923.app614241.bh;
import com.newandromo.dev338923.app614241.bi;
import com.newandromo.dev338923.app614241.bj;
import com.newandromo.dev338923.app614241.cv;
import java.lang.ref.WeakReference;

public class b
extends ViewDataBinding
implements a.a,
b.a {
    private static final ViewDataBinding.b h;
    private static final SparseIntArray i;
    public final ImageView f;
    public final ConstraintLayout g;
    private bc j;
    private b k;
    private int l;
    private bj m;
    private final View.OnLongClickListener n;
    private final View.OnClickListener o;
    private long p = -1L;

    public b(f f2, View view) {
        super(f2, view, 2);
        Object[] arrobject = b.a((f)f2, (View)view, (int)2, (ViewDataBinding.b)h, (SparseIntArray)i);
        this.f = (ImageView)arrobject[1];
        this.f.setTag(null);
        this.g = (ConstraintLayout)arrobject[0];
        this.g.setTag(null);
        this.b_(view);
        this.n = new android.databinding.a.a.b((b.a)this);
        this.o = new a((a.a)this);
        this.e();
    }

    
    private boolean b(int n2) {
        if (n2 == 0) {
            void var5_2 = this;
            synchronized (var5_2) {
                this.p = 1L | this.p;
                return true;
            }
        }
        if (n2 == 2) {
            void var5_3 = this;
            synchronized (var5_3) {
                this.p = 16L | this.p;
                return true;
            }
        }
        if (n2 == 54) {
            void var5_4 = this;
            synchronized (var5_4) {
                this.p = 32L | this.p;
                return true;
            }
        }
        return false;
    }

    
    private boolean c(int n2) {
        if (n2 == 0) {
            void var3_2 = this;
            synchronized (var3_2) {
                this.p = 2L | this.p;
                return true;
            }
        }
        return false;
    }

    public final void a(View view) {
        bc bc2 = this.j;
        bj bj2 = this.m;
        boolean bl2 = bc2 != null;
        if (bl2 && bc2.h != null) {
            bc2.h.onItemClick(view, bj2);
        }
    }

    public final boolean a() {
        bc bc2 = this.j;
        boolean bl2 = bc2 != null;
        boolean bl3 = false;
        if (bl2) {
            bi bi2 = bc2.i;
            bl3 = false;
            if (bi2 != null) {
                bl3 = bc2.i.a();
            }
        }
        return bl3;
    }

    public final boolean a(int n2, int n3) {
        switch (n2) {
            default: {
                return false;
            }
            case 1: {
                return b.super.c(n3);
            }
            case 0: 
        }
        return b.super.b(n3);
    }

    public final boolean a(int n2, Object object) {
        if (9 == n2) {
            bc bc2 = (bc)object;
            ViewDataBinding.a a2 = ViewDataBinding.b;
            if (bc2 == null) {
                super.g();
            } else {
                ViewDataBinding.f f2 = this.c[0];
                if (f2 == null) {
                    super.a((Object)bc2, a2);
                } else if (f2.c != bc2) {
                    super.g();
                    super.a((Object)bc2, a2);
                }
            }
            this.j = bc2;
            void var10_6 = this;
            synchronized (var10_6) {
                this.p = 1L | this.p;
            }
            this.a(9);
            super.h();
            return true;
        }
        if (35 == n2) {
            this.k = (b)((Object)object);
            return true;
        }
        if (14 == n2) {
            this.l = (Integer)object;
            return true;
        }
        if (49 != n2) return false;
        this.m = (bj)object;
        void var10_7 = this;
        synchronized (var10_7) {
            this.p = 8L | this.p;
        }
        this.a(49);
        super.h();
        return true;
    }
    public final void d() {
        block19 : {
            block18 : {
                var15_1 = this;
                var2_2 = this.p;
                this.p = 0L;
                var4_3 = this.j;
                var5_4 = 0;
                if ((113L & var2_2) == 0L) break block18;
                var7_5 = (var2_2 & 97L) != 0L && var4_3 != null && var4_3.f != null ? var4_3.f.a(1) : null;
                if ((var2_2 & 81L) == 0L) ** GOTO lbl-1000
                if (var4_3 != null) {
                    var5_4 = var4_3.c;
                    if (var4_3.g != null) {
                        var4_3.g.get();
                    }
                    var9_6 = var4_3.b();
                } else {
                    var9_6 = null;
                }
                if (var4_3 != null) {
                    var11_7 = this.d.getContext();
                    var12_8 = aj.c(var5_4) != false ? -1 : -16777216;
                    var13_9 = aj.d(var12_8);
                    var10_10 = aj.b(var13_9, cv.b(var11_7, var13_9));
                } else {
                    var10_10 = null;
                }
                if (var9_6 != null) {
                    var9_6.n = 1;
                } else {
                    var9_6 = null;
                }
                if (var9_6 != null) {
                    var9_6.q = var5_4;
                } else {
                    var9_6 = null;
                }
                if (var9_6 != null) {
                    var6_11 = var9_6.c(var10_10);
                } else lbl-1000: // 2 sources:
                {
                    var6_11 = null;
                }
                break block19;
            }
            var6_11 = null;
            var7_5 = null;
        }
        if ((81L & var2_2) != 0L) {
            bc.a(this.f, var6_11);
        }
        if ((var2_2 & 97L) != 0L) {
            var8_12 = this.f;
            if (var7_5 != null && var7_5.a != 0) {
                ag.a((View)var8_12, (Drawable)new ColorDrawable(var7_5.a));
            } else {
                ag.a((View)var8_12, null);
            }
        }
        if ((var2_2 & 64L) == 0L) return;
        this.g.setOnClickListener(this.o);
        this.g.setOnLongClickListener(this.n);
    }
    public final void e() {
        b b2 = this;
        synchronized (b2) {
            this.p = 64L;
        }
        this.h();
    }
    public final boolean f() {
        b b2 = this;
        synchronized (b2) {
            return this.p != 0L;
            {
            }
        }
    }
}

