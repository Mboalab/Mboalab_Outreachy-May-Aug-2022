package com.newandromo.dev338923.app614241.a;
import android.databinding.ViewDataBinding;
import android.databinding.f;
import android.databinding.m;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.Space;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public final class c
extends ViewDataBinding {
    private static final ViewDataBinding.b p;
    private static final SparseIntArray q;
    public final m f;
    public final ImageView g;
    public final FrameLayout h;
    public final View i;
    public final View j;
    public final Space k;
    public final LinearLayout l;
    public final DrawerLayout m;
    public final CoordinatorLayout n;
    public final m o;
    private long r = -1L;

    static {
        SparseIntArray sparseIntArray;
        q = sparseIntArray = new SparseIntArray();
        sparseIntArray.put(2131296309, 2);
        q.put(2131296301, 3);
        q.put(2131296423, 4);
        q.put(2131296313, 5);
        q.put(2131296312, 6);
        q.put(2131296311, 7);
        q.put(2131296310, 8);
        q.put(2131296332, 9);
    }

    public c(f f2, View view) {
        super(f2, view, 0);
        Object[] arrobject = c.a((f)f2, (View)view, (int)10, (ViewDataBinding.b)p, (SparseIntArray)q);
        this.f = new m((ViewStub)arrobject[3]);
        this.f.e = this;
        this.g = (ImageView)arrobject[2];
        this.h = (FrameLayout)arrobject[8];
        this.i = (View)arrobject[7];
        this.j = (View)arrobject[6];
        this.k = (Space)arrobject[5];
        this.l = (LinearLayout)arrobject[9];
        this.m = (DrawerLayout)arrobject[0];
        this.m.setTag(null);
        this.n = (CoordinatorLayout)arrobject[1];
        this.n.setTag(null);
        this.o = new m((ViewStub)arrobject[4]);
        this.o.e = this;
        this.b_(view);
        this.e();
    }

    public final boolean a(int n2, int n3) {
        return false;
    }

    public final boolean a(int n2, Object object) {
        return true;
    }
    public final void d() {
        c c2 = this;
        this.r = 0L;
        if (this.f.b != null) {
            c.a((ViewDataBinding)this.f.b);
        }
        if (this.o.b == null) return;
        c.a((ViewDataBinding)this.o.b);
    }
    public final void e() {
        c c2 = this;
        synchronized (c2) {
            this.r = 1L;
        }
        this.h();
    }
    public final boolean f() {
        c c2 = this;
        synchronized (c2) {
            return this.r != 0L;
            {
            }
        }
    }
}

