/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.support.v7.widget.RecyclerView
 *  android.support.v7.widget.RecyclerView$Adapter
 *  android.support.v7.widget.RecyclerView$ItemDecoration
 *  android.support.v7.widget.RecyclerView$LayoutParams
 *  android.support.v7.widget.RecyclerView$State
 *  android.support.v7.widget.RecyclerView$ViewHolder
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class SelectiveDividerItemDecoration
extends RecyclerView.ItemDecoration {
    private Drawable a;
    private int b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;

    public SelectiveDividerItemDecoration(Context context, AttributeSet attributeSet, int n2) {
        int n3;
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, new int[]{16843284});
        this.a = typedArray.getDrawable(0);
        typedArray.recycle();
        if (n2 != 0 && n2 != 1) {
            throw new IllegalArgumentException("invalid orientation");
        }
        this.b = n2;
        this.d = true;
        this.f = n3 = context.getResources().getDimensionPixelOffset(2131165353);
        this.e = n3;
    }

    private boolean a(View view, RecyclerView recyclerView) {
        RecyclerView.ViewHolder viewHolder = recyclerView.getChildViewHolder(view);
        if (viewHolder instanceof a) {
            return (viewHolder).a();
        }
        return this.c;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void getItemOffsets(Rect var1_1, View var2_4, RecyclerView var3_3, RecyclerView.State var4) {
        block5 : {
            var5_5 = var3_3.getChildLayoutPosition(var2_4);
            var3_3.getAdapter().getItemCount();
            if (var5_5 != this.d) break block5;
            var7_6 = this.e;
            ** GOTO lbl12
        }
        if (var5_5 == var3_3.getAdapter().getItemCount() - 1) {
            var8_7 = this.e;
            var7_6 = 0;
        } else {
            var7_6 = 0;
lbl12: // 2 sources:
            var8_7 = 0;
        }
        if (var5_5 > 0 && SelectiveDividerItemDecoration.super.a(var2_4, var3_3)) {
            var9_8 = var7_6 + this.f;
            if (this.b == 1) {
                var1_1.set(0, this.a.getIntrinsicHeight(), 0, 0);
                var1_1.set(0, var9_8 + this.a.getIntrinsicHeight(), 0, var8_7);
                return;
            }
            var1_1.set(this.a.getIntrinsicWidth(), 0, 0, 0);
            var1_1.set(var9_8 + this.a.getIntrinsicWidth(), 0, var8_7, 0);
            return;
        }
        if (this.b == 1) {
            var1_1.set(0, var7_6, 0, var8_7);
            return;
        }
        var1_1.set(var7_6, 0, var8_7, 0);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int n2 = this.b;
        int n3 = 1;
        if (n2 == n3) {
            int n4 = recyclerView.getPaddingLeft();
            int n5 = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int n6 = recyclerView.getChildCount();
            int n7 = this.a.getIntrinsicHeight();
            while (n3 < n6) {
                View view = recyclerView.getChildAt(n3);
                if (SelectiveDividerItemDecoration.super.a(view, recyclerView)) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)view.getLayoutParams();
                    int n8 = (int)(0.5f + view.getTranslationY()) + (view.getTop() - layoutParams.topMargin);
                    int n9 = n8 + n7;
                    this.a.setBounds(n4, n8, n5, n9);
                    this.a.draw(canvas);
                }
                ++n3;
            }
            return;
        }
        int n10 = recyclerView.getPaddingTop();
        int n11 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int n12 = recyclerView.getChildCount();
        int n13 = this.a.getIntrinsicHeight();
        while (n3 < n12) {
            View view = recyclerView.getChildAt(n3);
            if (SelectiveDividerItemDecoration.super.a(view, recyclerView)) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)view.getLayoutParams();
                int n14 = (int)(0.5f + view.getTranslationX()) + (view.getLeft() - layoutParams.leftMargin);
                int n15 = n14 + n13;
                this.a.setBounds(n14, n10, n15, n11);
                this.a.draw(canvas);
            }
            ++n3;
        }
    }

}

