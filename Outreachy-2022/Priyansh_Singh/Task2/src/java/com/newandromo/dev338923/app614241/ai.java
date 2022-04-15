package com.newandromo.dev338923.app614241;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.f.b.c;
import com.bumptech.glide.f.b.h;
import com.bumptech.glide.load.resource.a.b;

public class ai
extends c<b> {
    private int b;
    private b c;
    private ColorMatrix d;

    public ai(ImageView imageView, ColorMatrix colorMatrix) {
        super(imageView, colorMatrix, (byte)0);
    }

    private ai(ImageView imageView, ColorMatrix colorMatrix, byte by2) {
        super(imageView);
        this.b = -1;
        this.d = colorMatrix;
    }

    private void a(b b2) {
        ((ImageView)this.a).setImageDrawable((Drawable)b2);
    }

    public final void a(ColorMatrix colorMatrix) {
        this.d = colorMatrix;
        if (this.c != null && colorMatrix != null) {
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            this.c.mutate();
            this.c.setColorFilter((ColorFilter)colorMatrixColorFilter);
            this.c.a(this.b);
            ai.super.a(this.c);
        }
    }

    public final void a(Drawable drawable) {
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
        if (b2 != null && this.d != null) {
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(this.d);
            b2.mutate();
            b2.setColorFilter((ColorFilter)colorMatrixColorFilter);
        }
        super.a((Object)b2, c2);
        this.c = b2;
        b2.a(this.b);
        b2.start();
    }

    public void a(Exception exception, Drawable drawable) {
        super.a(exception, drawable);
    }

    public final void b() {
        if (this.c != null) {
            this.c.start();
        }
    }

    public void b(Drawable drawable) {
        super.b(drawable);
    }

    public final void c() {
        if (this.c != null) {
            this.c.stop();
        }
    }

    public final void c(Drawable drawable) {
        if (drawable != null && this.d != null) {
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(this.d);
            drawable.mutate();
            drawable.setColorFilter((ColorFilter)colorMatrixColorFilter);
        }
        ((ImageView)this.a).setImageDrawable(drawable);
    }
}

