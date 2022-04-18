/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.support.v4.view.h
 *  android.support.v4.view.j
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.webkit.WebView
 *  java.lang.Math
 *  java.lang.String
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.support.v4.view.h;
import android.support.v4.view.j;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

public class NestedScrollWebView
extends WebView
implements h {
    public static final String a = "NestedScrollWebView";
    private int b;
    private final int[] c = new int[2];
    private final int[] d = new int[2];
    private int e;
    private j f;

    public NestedScrollWebView(Context context) {
        super(context);
        NestedScrollWebView.super.a();
    }

    public NestedScrollWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        NestedScrollWebView.super.a();
    }

    public NestedScrollWebView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        NestedScrollWebView.super.a();
    }

    private void a() {
        this.f = new j((View)this);
        this.setNestedScrollingEnabled(true);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean bl2) {
        return this.f.a(f2, f3, bl2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f.a(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int n2, int n3, int[] arrn, int[] arrn2) {
        return this.f.a(n2, n3, arrn, arrn2);
    }

    public boolean dispatchNestedScroll(int n2, int n3, int n4, int n5, int[] arrn) {
        return this.f.a(n2, n3, n4, n5, arrn);
    }

    public boolean hasNestedScrollingParent() {
        return this.f.a(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f.a;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = MotionEvent.obtain((MotionEvent)motionEvent);
        int n2 = motionEvent.getActionMasked();
        if (n2 == 0) {
            this.e = 0;
        }
        int n3 = (int)motionEvent.getY();
        motionEvent.offsetLocation(0.0f, (float)this.e);
        switch (n2) {
            default: {
                return false;
            }
            case 2: {
                int n4;
                int n5 = this.b - n3;
                if (this.dispatchNestedPreScroll(0, n5, this.d, this.c)) {
                    n5 -= this.d[1];
                    motionEvent2.offsetLocation(0.0f, (float)this.c[1]);
                    this.e += this.c[1];
                }
                int n6 = this.getScrollY();
                this.b = n3 - this.c[1];
                int n7 = Math.max((int)0, (int)(n6 + n5));
                if (this.dispatchNestedScroll(0, n7 - (n4 = n5 - (n7 - n6)), 0, n4, this.c)) {
                    this.b -= this.c[1];
                    motionEvent2.offsetLocation(0.0f, (float)this.c[1]);
                    this.e += this.c[1];
                }
                motionEvent2.recycle();
                return super.onTouchEvent(motionEvent2);
            }
            case 1: 
            case 3: 
            case 5: 
            case 6: {
                this.stopNestedScroll();
                return super.onTouchEvent(motionEvent);
            }
            case 0: 
        }
        this.b = n3;
        this.startNestedScroll(2);
        return super.onTouchEvent(motionEvent);
    }

    public void setNestedScrollingEnabled(boolean bl2) {
        this.f.a(bl2);
    }

    public boolean startNestedScroll(int n2) {
        return this.f.a(n2, 0);
    }

    public void stopNestedScroll() {
        this.f.b(0);
    }
}

