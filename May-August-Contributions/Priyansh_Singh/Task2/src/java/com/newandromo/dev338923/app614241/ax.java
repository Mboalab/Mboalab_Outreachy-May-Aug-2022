/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.support.v4.view.r
 *  android.support.v7.widget.GridLayoutManager
 *  android.support.v7.widget.GridLayoutManager$LayoutParams
 *  android.support.v7.widget.LinearLayoutManager
 *  android.support.v7.widget.RecyclerView
 *  android.support.v7.widget.RecyclerView$ItemDecoration
 *  android.support.v7.widget.RecyclerView$LayoutManager
 *  android.support.v7.widget.RecyclerView$State
 *  android.support.v7.widget.StaggeredGridLayoutManager
 *  android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;

public final class ax
extends RecyclerView.ItemDecoration {
    private static final int[] a = new int[]{16843284};
    private Drawable b;
    private final Rect c = new Rect();
    private a d;
    private final b e = new Object(){
        public int a = -1;
        public int b = -1;
    };
    private boolean f;
    private boolean g;

    public ax(Context context) {
        TypedArray typedArray = context.obtainStyledAttributes(a);
        this.b = typedArray.getDrawable(0);
        typedArray.recycle();
    }

    private static void a(RecyclerView recyclerView, View view, b b2) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams)view.getLayoutParams();
            b2.a = layoutParams.getSpanIndex();
            b2.b = layoutParams.getSpanSize();
            return;
        }
        boolean bl2 = layoutManager instanceof StaggeredGridLayoutManager;
        int n2 = 1;
        if (bl2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager)layoutManager;
            StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams)view.getLayoutParams();
            b2.a = layoutParams.getSpanIndex();
            if (layoutParams.isFullSpan()) {
                n2 = staggeredGridLayoutManager.getSpanCount();
            }
            b2.b = n2;
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            b2.a = 0;
            b2.b = n2;
            return;
        }
        throw new UnsupportedOperationException("Incompatible layout manager.");
    }

    private static boolean a(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean a(int n2, int n3, int n4) {
        return n2 + n3 == n4;
    }

    private static void b(RecyclerView recyclerView, a a2) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager)layoutManager;
            a2.a = gridLayoutManager.getSpanCount();
            a2.b = gridLayoutManager.getOrientation();
            a2.c = gridLayoutManager.getReverseLayout();
            return;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager)layoutManager;
            a2.a = staggeredGridLayoutManager.getSpanCount();
            a2.b = staggeredGridLayoutManager.getOrientation();
            a2.c = staggeredGridLayoutManager.getReverseLayout();
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager)layoutManager;
            a2.a = 1;
            a2.b = linearLayoutManager.getOrientation();
            a2.c = linearLayoutManager.getReverseLayout();
            return;
        }
        throw new UnsupportedOperationException("Incompatible layout manager.");
    }

    private static boolean b(int n2, int n3, int n4) {
        return n2 >= n3 * ((n4 - 1) / n3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void getItemOffsets(Rect var1_1, View var2_4, RecyclerView var3_3, RecyclerView.State var4) {
        block7 : {
            if (this.g) {
                var1_1.set(0, 0, 0, 0);
                return;
            }
            var3_3.getLayoutManager();
            var6_5 = var3_3.getChildAdapterPosition(var2_4);
            var7_6 = var4.getItemCount();
            if (this.d == null) {
                this.d = new Object(var3_3){
                    public int a;
                    public int b;
                    public boolean c;
                    {
                        ax.b(recyclerView, this);
                    }
                };
            } else {
                ax.b(var3_3, this.d);
            }
            var8_7 = this.d.a;
            var9_8 = this.d.b;
            var10_9 = this.d.c;
            if (var9_8 != 1) break block7;
            ax.a(var3_3, var2_4, this.e);
            if (var10_9) {
                var1_1.left = 0;
                var1_1.top = this.b.getIntrinsicHeight();
                var1_1.right = this.b.getIntrinsicWidth();
                var1_1.bottom = 0;
                return;
            }
            var1_1.left = 0;
            var1_1.top = 0;
            ** GOTO lbl-1000
        }
        if (var10_9) {
            var12_10 = ax.b(var6_5, var8_7, var7_6) != false ? 0 : this.b.getIntrinsicWidth();
            var1_1.left = var12_10;
            var1_1.right = 0;
            var1_1.top = 0;
            var1_1.bottom = this.b.getIntrinsicHeight();
            return;
        }
        var1_1.left = 0;
        var1_1.top = 0;
        if (ax.b(var6_5, var8_7, var7_6)) {
            var11_11 = 0;
        } else lbl-1000: // 2 sources:
        {
            var11_11 = this.b.getIntrinsicWidth();
        }
        var1_1.right = var11_11;
        var1_1.bottom = this.b.getIntrinsicHeight();
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int n2;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.d == null) {
            this.d = new /* invalid duplicate definition of identical inner class */;
        } else {
            ax.b(recyclerView, this.d);
        }
        int n3 = this.d.a;
        int n4 = this.d.b;
        boolean bl2 = this.d.c;
        int n5 = 1;
        if (n4 == n5) {
            if (bl2) {
                canvas.save();
                int n6 = recyclerView.getChildCount();
                int n7 = state.getItemCount();
                if (n6 >= state.getItemCount()) {
                    n2 = 0;
                } else {
                    n5 = 0;
                }
                while (n2 < n6) {
                    View view = recyclerView.getChildAt(n2);
                    int n8 = recyclerView.getChildAdapterPosition(view);
                    recyclerView.getDecoratedBoundsWithMargins(view, this.c);
                    int n9 = this.c.left + Math.round((float)r.j((View)view));
                    int n10 = this.c.right + Math.round((float)r.j((View)view));
                    int n11 = this.c.top + Math.round((float)r.k((View)view));
                    int n12 = n11 + this.b.getIntrinsicHeight();
                    if (n5 != 0 || !ax.b(n8, n3, n7)) {
                        this.b.setBounds(n9, n11, n10, n12);
                        this.b.draw(canvas);
                    }
                    if ((n5 != 0 || this.f) && ax.a(n8, n3)) {
                        int n13 = this.c.bottom + Math.round((float)r.k((View)view));
                        int n14 = n13 - this.b.getIntrinsicHeight();
                        this.b.setBounds(n9, n14, n10, n13);
                        this.b.draw(canvas);
                    }
                    ax.a(recyclerView, view, this.e);
                    if (!ax.a(this.e.a, this.e.b, n3)) {
                        int n15 = this.c.top + Math.round((float)r.k((View)view));
                        int n16 = this.c.bottom + Math.round((float)r.k((View)view));
                        int n17 = n10 - this.b.getIntrinsicWidth();
                        this.b.setBounds(n17, n15, n10, n16);
                        this.b.draw(canvas);
                    }
                    ++n2;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            int n18 = recyclerView.getChildCount();
            int n19 = state.getItemCount();
            if (n18 >= state.getItemCount()) {
                n2 = 0;
            } else {
                n5 = 0;
            }
            while (n2 < n18) {
                View view = recyclerView.getChildAt(n2);
                int n20 = recyclerView.getChildAdapterPosition(view);
                recyclerView.getDecoratedBoundsWithMargins(view, this.c);
                int n21 = this.c.left + Math.round((float)r.j((View)view));
                int n22 = this.c.right + Math.round((float)r.j((View)view));
                int n23 = this.c.bottom + Math.round((float)r.k((View)view));
                int n24 = n23 - this.b.getIntrinsicHeight();
                if (n5 != 0 || !ax.b(n20, n3, n19)) {
                    this.b.setBounds(n21, n24, n22, n23);
                    this.b.draw(canvas);
                }
                if ((n5 != 0 || this.f) && ax.a(n20, n3)) {
                    int n25 = this.c.top + Math.round((float)r.k((View)view));
                    int n26 = n25 + this.b.getIntrinsicHeight();
                    this.b.setBounds(n21, n25, n22, n26);
                    this.b.draw(canvas);
                }
                ax.a(recyclerView, view, this.e);
                if (!ax.a(this.e.a, this.e.b, n3)) {
                    int n27 = this.c.top + Math.round((float)r.k((View)view));
                    int n28 = this.c.bottom + Math.round((float)r.k((View)view));
                    int n29 = n22 - this.b.getIntrinsicWidth();
                    this.b.setBounds(n29, n27, n22, n28);
                    this.b.draw(canvas);
                }
                ++n2;
            }
            canvas.restore();
            return;
        }
        if (bl2) {
            canvas.save();
            int n30 = recyclerView.getChildCount();
            int n31 = state.getItemCount();
            state.getItemCount();
            for (n2 = 0; n2 < n30; ++n2) {
                View view = recyclerView.getChildAt(n2);
                recyclerView.getDecoratedBoundsWithMargins(view, this.c);
                int n32 = this.c.left + Math.round((float)r.j((View)view));
                int n33 = this.c.right + Math.round((float)r.j((View)view));
                int n34 = this.c.bottom + Math.round((float)r.k((View)view));
                int n35 = n34 - this.b.getIntrinsicHeight();
                this.b.setBounds(n32, n35, n33, n34);
                this.b.draw(canvas);
                if (ax.b(recyclerView.getChildAdapterPosition(view), n3, n31)) continue;
                int n36 = this.c.top + Math.round((float)r.k((View)view));
                int n37 = this.c.bottom + Math.round((float)r.k((View)view));
                int n38 = n32 + this.b.getIntrinsicWidth();
                this.b.setBounds(n32, n36, n38, n37);
                this.b.draw(canvas);
            }
            canvas.restore();
            return;
        }
        canvas.save();
        int n39 = recyclerView.getChildCount();
        int n40 = state.getItemCount();
        state.getItemCount();
        while (n2 < n39) {
            View view = recyclerView.getChildAt(n2);
            int n41 = recyclerView.getChildAdapterPosition(view);
            recyclerView.getDecoratedBoundsWithMargins(view, this.c);
            int n42 = this.c.left + Math.round((float)r.j((View)view));
            int n43 = this.c.right + Math.round((float)r.j((View)view));
            int n44 = this.c.bottom + Math.round((float)r.k((View)view));
            int n45 = n44 - this.b.getIntrinsicHeight();
            this.b.setBounds(n42, n45, n43, n44);
            this.b.draw(canvas);
            if (!ax.b(n41, n3, n40)) {
                int n46 = this.c.top + Math.round((float)r.k((View)view));
                int n47 = this.c.bottom + Math.round((float)r.k((View)view));
                int n48 = n43 - this.b.getIntrinsicWidth();
                this.b.setBounds(n48, n46, n43, n47);
                this.b.draw(canvas);
            }
            ++n2;
        }
        canvas.restore();
    }

}

