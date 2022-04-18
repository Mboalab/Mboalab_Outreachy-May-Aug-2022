/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.widget.ImageView
 *  com.bumptech.glide.f.a.c
 *  com.bumptech.glide.f.b.c
 *  com.bumptech.glide.f.b.h
 *  com.bumptech.glide.load.resource.a.b
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 */
package com.newandromo.dev338923.app614241;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.f.b.c;
import com.bumptech.glide.f.b.h;
import com.bumptech.glide.load.resource.a.b;
import com.newandromo.dev338923.app614241.TintableImageView;

public class cw
extends c<b> {
    private int b = -1;
    private b c;
    private final ColorStateList d;
    private final ColorStateList e;
    private final ColorStateList f;
    private final int g;

    public cw(ImageView imageView, ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int n2) {
        this(imageView, colorStateList, colorStateList2, colorStateList3, n2, 0);
    }

    private cw(ImageView imageView, ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int n2, byte by2) {
        super(imageView);
        this.e = colorStateList;
        this.d = colorStateList2;
        this.f = colorStateList3;
        this.g = n2;
    }

    private boolean a(int n2) {
        return (n2 & this.g) != 0;
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            if (this.a instanceof TintableImageView) {
                if (this.d != null || cw.super.a(128)) {
                    ((TintableImageView)this.a).a(this.d, PorterDuff.Mode.SRC_IN);
                }
            } else if (this.d != null) {
                drawable.mutate();
                drawable.setColorFilter(this.d.getDefaultColor(), PorterDuff.Mode.SRC_IN);
            } else {
                drawable.clearColorFilter();
            }
        }
        super.a(drawable);
    }

    public void a(b b2, com.bumptech.glide.f.a.c<? super b> c2) {
        if (!b2.a()) {
            float f2 = (float)((ImageView)this.a).getWidth() / (float)((ImageView)this.a).getHeight();
            float f3 = (float)b2.getIntrinsicWidth() / (float)b2.getIntrinsicHeight();
            if (Math.abs((float)(f2 - 1.0f)) <= 0.05f && Math.abs((float)(f3 - 1.0f)) <= 0.05f) {
                b2 = new h(b2, ((ImageView)this.a).getWidth());
            }
        }
        if (b2 != null) {
            if (this.a instanceof TintableImageView) {
                if (this.e != null || cw.super.a(4)) {
                    ((TintableImageView)this.a).a(this.e, PorterDuff.Mode.SRC_IN);
                }
            } else if (this.e != null) {
                b2.mutate();
                b2.setColorFilter(this.e.getDefaultColor(), PorterDuff.Mode.SRC_IN);
            } else {
                b2.clearColorFilter();
            }
        }
        super.a((Object)b2, c2);
        this.c = b2;
        b2.a(this.b);
        b2.start();
    }

    public void a(Exception exception, Drawable drawable) {
        if (drawable != null) {
            if (this.a instanceof TintableImageView) {
                if (this.d != null || cw.super.a(131072)) {
                    ((TintableImageView)this.a).a(this.f, PorterDuff.Mode.SRC_IN);
                }
            } else if (this.f != null) {
                drawable.mutate();
                drawable.setColorFilter(this.f.getDefaultColor(), PorterDuff.Mode.SRC_IN);
            } else {
                drawable.clearColorFilter();
            }
        }
        super.a(exception, drawable);
    }

    public final /* synthetic */ void a(Object object) {
        b b2 = (b)object;
        ((ImageView)this.a).setImageDrawable((Drawable)b2);
    }

    public final void b() {
        if (this.c != null) {
            this.c.start();
        }
    }

    public final void b(Drawable drawable) {
        if (drawable != null) {
            if (this.a instanceof TintableImageView) {
                if (this.d != null || cw.super.a(128)) {
                    ((TintableImageView)this.a).a(this.d, PorterDuff.Mode.SRC_IN);
                }
            } else if (this.d != null) {
                drawable.mutate();
                drawable.setColorFilter(this.d.getDefaultColor(), PorterDuff.Mode.SRC_IN);
            } else {
                drawable.clearColorFilter();
            }
        }
        super.b(drawable);
    }

    public final void c() {
        if (this.c != null) {
            this.c.stop();
        }
    }
}

