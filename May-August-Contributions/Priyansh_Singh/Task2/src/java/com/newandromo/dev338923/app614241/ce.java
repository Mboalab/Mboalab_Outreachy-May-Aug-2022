/*
 *  
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.support.v7.d.b
 *  android.view.View
 *  com.bumptech.glide.f.a.c
 *  com.bumptech.glide.f.b
 *  com.bumptech.glide.f.b.a
 *  com.bumptech.glide.f.b.g
 *  com.bumptech.glide.h.h
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.newandromo.dev338923.app614241;

import android.graphics.drawable.Drawable;
import android.support.v7.d.b;
import android.view.View;
import com.bumptech.glide.f.a.c;
import com.bumptech.glide.f.b.a;
import com.bumptech.glide.f.b.g;
import com.bumptech.glide.h.h;
import com.newandromo.dev338923.app614241.ca;

public final class ce
extends a<b> {
    private ca a;
    private final View b;
    private int c;
    private final int d;
    private final int e;

    public ce(View view, ca ca2, int n2) {
        super(view, ca2, n2, (byte)0);
    }

    private ce(View view, ca ca2, int n2, byte by2) {
        this.b = view;
        this.a = ca2;
        this.c = n2;
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
    }

    public static com.bumptech.glide.f.b a(View view) {
        Object object = view.getTag(2131296378);
        if (object != null) {
            if (object instanceof com.bumptech.glide.f.b) {
                return (com.bumptech.glide.f.b)object;
            }
            throw new IllegalArgumentException("Unable to get glide request from view tag.");
        }
        return null;
    }

    public final void a(g g2) {
        if (h.a((int)this.d, (int)this.e)) {
            g2.a(this.d, this.e);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        stringBuilder.append(this.d);
        stringBuilder.append(" and height: ");
        stringBuilder.append(this.e);
        stringBuilder.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void a(com.bumptech.glide.f.b b2) {
        this.b.setTag(2131296378, (Object)b2);
    }

    public final void a(Exception exception, Drawable drawable) {
        super.a(exception, drawable);
    }

    public final /* synthetic */ void a(Object object, c c2) {
        b b2 = (b)object;
        if (this.a != null) {
            this.a.onPaletteReady(b2, this.b, this.c);
        }
    }

    public final void b(Drawable drawable) {
        super.b(drawable);
    }

    public final com.bumptech.glide.f.b e() {
        Object object = this.b.getTag(2131296378);
        if (object != null) {
            if (object instanceof com.bumptech.glide.f.b) {
                return (com.bumptech.glide.f.b)object;
            }
            throw new IllegalArgumentException("Unable to get glide request from view tag.");
        }
        return null;
    }
}

