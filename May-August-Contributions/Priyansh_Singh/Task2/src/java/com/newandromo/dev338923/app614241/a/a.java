package com.newandromo.dev338923.app614241.a;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableInt;
import android.databinding.ViewDataBinding;
import android.databinding.f;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.newandromo.dev338923.app614241.bc;
import com.newandromo.dev338923.app614241.bj;

public final class a
extends ViewDataBinding {
    private static final ViewDataBinding.b g;
    private static final SparseIntArray h;
    public final LinearLayout f;
    private bc i;
    private ObservableBoolean j;
    private ViewDataBinding k;
    private ObservableInt l;
    private ObservableInt m;
    private String n;
    private int o;
    private int p;
    private bj q;
    private long r = -1L;

    public a(f f2, View view) {
        super(f2, view, 5);
        this.f = (LinearLayout)a.a((f)f2, (View)view, (int)1, (ViewDataBinding.b)g, (SparseIntArray)h)[0];
        this.f.setTag(null);
        this.b_(view);
        this.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean b(int n2) {
        if (n2 == 0) {
            void var3_2 = this;
            synchronized (var3_2) {
                this.r = 1L | this.r;
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean c(int n2) {
        if (n2 == 0) {
            void var3_2 = this;
            synchronized (var3_2) {
                this.r = 2L | this.r;
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean d(int n2) {
        if (n2 == 0) {
            void var3_2 = this;
            synchronized (var3_2) {
                this.r = 4L | this.r;
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean e(int n2) {
        if (n2 == 0) {
            void var3_2 = this;
            synchronized (var3_2) {
                this.r = 8L | this.r;
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean f(int n2) {
        if (n2 == 0) {
            void var3_2 = this;
            synchronized (var3_2) {
                this.r = 16L | this.r;
                return true;
            }
        }
        return false;
    }

    public final boolean a(int n2, int n3) {
        switch (n2) {
            default: {
                return false;
            }
            case 4: {
                return a.super.f(n3);
            }
            case 3: {
                return a.super.e(n3);
            }
            case 2: {
                return a.super.d(n3);
            }
            case 1: {
                return a.super.c(n3);
            }
            case 0: 
        }
        return a.super.b(n3);
    }

    public final boolean a(int n2, Object object) {
        block11 : {
            block3 : {
                block10 : {
                    block9 : {
                        block8 : {
                            block7 : {
                                block6 : {
                                    block5 : {
                                        block4 : {
                                            block2 : {
                                                if (9 != n2) break block2;
                                                this.i = (bc)object;
                                                break block3;
                                            }
                                            if (32 != n2) break block4;
                                            this.j = (ObservableBoolean)object;
                                            break block3;
                                        }
                                        if (35 != n2) break block5;
                                        this.k = (ViewDataBinding)object;
                                        break block3;
                                    }
                                    if (38 != n2) break block6;
                                    this.l = (ObservableInt)object;
                                    break block3;
                                }
                                if (4 != n2) break block7;
                                this.m = (ObservableInt)object;
                                break block3;
                            }
                            if (11 != n2) break block8;
                            this.n = (String)object;
                            break block3;
                        }
                        if (52 != n2) break block9;
                        this.o = (Integer)object;
                        break block3;
                    }
                    if (14 != n2) break block10;
                    this.p = (Integer)object;
                    break block3;
                }
                if (49 != n2) break block11;
                this.q = (bj)object;
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        a a2 = this;
        synchronized (a2) {
            this.r = 0L;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        a a2 = this;
        synchronized (a2) {
            this.r = 512L;
        }
        this.h();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean f() {
        a a2 = this;
        synchronized (a2) {
            return this.r != 0L;
            {
            }
        }
    }
}

