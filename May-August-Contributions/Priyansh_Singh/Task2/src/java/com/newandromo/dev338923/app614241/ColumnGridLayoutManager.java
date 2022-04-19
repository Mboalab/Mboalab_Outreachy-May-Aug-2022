/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.support.v7.widget.GridLayoutManager
 *  android.support.v7.widget.RecyclerView
 *  android.support.v7.widget.RecyclerView$LayoutManager
 *  android.support.v7.widget.RecyclerView$Recycler
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import com.newandromo.dev338923.app614241.cv;
import java.lang.ref.WeakReference;

public class ColumnGridLayoutManager
extends GridLayoutManager {
    protected int a;
    protected WeakReference<RecyclerView> b = new WeakReference(null);

    public ColumnGridLayoutManager(Context context, int n2) {
        super(context, n2);
    }

    protected final int a(int n2) {
        RecyclerView recyclerView = (RecyclerView)this.b.get();
        if (recyclerView == null) {
            return n2;
        }
        if (recyclerView.getWidth() == 0) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(recyclerView){
                private RecyclerView b;
                {
                    this.b = recyclerView;
                }

                public final void onGlobalLayout() {
                    RecyclerView recyclerView = this.b;
                    if (Build.VERSION.SDK_INT < 16) {
                        recyclerView.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                    } else {
                        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                    }
                    ((GridLayoutManager)this.b.getLayoutManager()).setSpanCount(ColumnGridLayoutManager.this.a(ColumnGridLayoutManager.this.a));
                }
            });
            return n2;
        }
        Context context = recyclerView.getContext();
        if (cv.c(context)) {
            int n3 = recyclerView.getWidth();
            int n4 = cv.e(context) / n2;
            int n5 = Integer.MAX_VALUE;
            int n6 = n2;
            int n7 = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < 9; ++i2) {
                int n8 = n2 + i2;
                int n9 = Math.abs((int)(n3 / n8 - n4));
                if (n9 < n5) {
                    n6 = n8;
                    n5 = n9;
                } else if (n9 > n7) break;
                n7 = n9;
            }
            return n6;
        }
        recyclerView.getWidth();
        return n2;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.b = new WeakReference((Object)recyclerView);
        this.setSpanCount(this.a(this.a));
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        this.b = new WeakReference(null);
    }

    public void setSpanCount(int n2) {
        super.setSpanCount(n2);
        this.a = n2;
    }

}

