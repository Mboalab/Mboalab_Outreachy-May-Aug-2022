/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.support.v4.view.r
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.FrameLayout
 *  java.lang.Object
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.newandromo.dev338923.app614241.cg;

public class ScrimInsetsFrameLayout
extends FrameLayout {
    private Drawable a;
    private Rect b;
    private Rect c = new Rect();
    private a d;

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ScrimInsetsFrameLayout.super.a(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        ScrimInsetsFrameLayout.super.a(context, attributeSet, n2);
    }

    private void a(Context context, AttributeSet attributeSet, int n2) {
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, cg.a.ScrimInsetsFrameLayout, n2, 0);
        if (typedArray == null) {
            return;
        }
        this.a = typedArray.getDrawable(0);
        typedArray.recycle();
        this.setWillNotDraw(true);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int n2 = this.getWidth();
        int n3 = this.getHeight();
        if (this.b != null && this.a != null) {
            int n4 = canvas.save();
            canvas.translate((float)this.getScrollX(), (float)this.getScrollY());
            this.c.set(0, 0, n2, this.b.top);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            this.c.set(0, n3 - this.b.bottom, n2, n3);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            this.c.set(0, this.b.top, this.b.left, n3 - this.b.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            this.c.set(n2 - this.b.right, this.b.top, n2, n3 - this.b.bottom);
            this.a.setBounds(this.c);
            this.a.draw(canvas);
            canvas.restoreToCount(n4);
        }
    }

    protected boolean fitSystemWindows(Rect rect) {
        this.b = new Rect(rect);
        boolean bl = this.a == null;
        this.setWillNotDraw(bl);
        r.c((View)this);
        return true;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            this.a.setCallback((Drawable.Callback)this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            this.a.setCallback(null);
        }
    }

    public void setOnInsetsCallback(a a2) {
        this.d = a2;
    }

    public static interface a {
    }

}

