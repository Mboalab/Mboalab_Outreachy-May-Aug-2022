/*
 *  
 * 
 * Could not load the following classes:
 *  android.databinding.ViewDataBinding
 *  android.support.v4.f.b
 *  android.support.v7.widget.RecyclerView
 *  android.support.v7.widget.RecyclerView$ViewHolder
 *  android.view.View
 *  com.bumptech.glide.f.b
 *  java.lang.Object
 *  java.util.Set
 */
package com.newandromo.dev338923.app614241;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bumptech.glide.f.b;
import com.newandromo.dev338923.app614241.ce;
import com.newandromo.dev338923.app614241.cj;
import java.util.Set;

public final class bj
extends RecyclerView.ViewHolder
implements cj {
    public final ViewDataBinding a;
    public Set<ce> b = new android.support.v4.f.b();
    private b c;

    public bj(ViewDataBinding viewDataBinding) {
        super(viewDataBinding.d);
        this.a = viewDataBinding;
        viewDataBinding.a(49, (Object)this);
    }

    @Override
    public final b a() {
        return this.c;
    }

    @Override
    public final void a(b b2) {
        this.c = b2;
    }
}

