 package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Support7Widget;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.newandromo.dev338923.app614241.aq;
import com.newandromo.dev338923.app614241.cv;

public class AdaptiveGridLayoutManager
extends GridLayoutManager {
    private int a,b,c,d,e,f,g;
    private int[] h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    public AdaptiveGridLayoutManager(Context context, int n2) {
        super(context, n2, 64, 64);
    }

    public AdaptiveGridLayoutManager(Context context, int n2, int n3, int n4) {
        int n5;
        int n6 = n2 > 0 ? n2 : 1;
        super(context, n6);
        this.b = Integer.MAX_VALUE;
        this.c = n5 = 64;
        this.d = n5;
        this.h = new int[2];
        this.k = true;
        this.l = true;
        this.m = false;
        this.e = n2;
        if (n3 <= 0) {
            n3 = 64;
        }
        this.c = n3;
        if (n4 > 0) {
            n5 = n4;
        }
        this.d = n5;
    }

    public AdaptiveGridLayoutManager(Context context, int n2, int n3, int n4, float f2) {
        this(context, n2, n3, n4, f2, 0.0f);
    }

    public AdaptiveGridLayoutManager(Context context, int n2, int n3, int n4, float f2, float f3) {
        int n5;
        int n6 = n2 > 0 ? n2 : 1;
        super(context, n6);
        this.b = n5 = Integer.MAX_VALUE;
        this.c = 64;
        this.d = 64;
        this.h = new int[2];
        this.k = true;
        this.l = true;
        this.m = false;
        this.e = n2;
        if (n3 <= 0) {
            n3 = 64;
        }
        this.c = n3;
        if (n4 <= 0) {
            n4 = 64;
        }
        this.d = n4;
        int n7 = f2 == 0.0f ? 0 : aq.a(context, f2);
        this.a = n7;
        if (f3 != 0.0f) {
            n5 = aq.a(context, f3);
        }
        this.b = n5;
    }

    public AdaptiveGridLayoutManager(Context context, int n2, int n3, int n4, float f2, float f3, boolean bl2) {
        this(context, n2, n3, n4, f2, f3);
        this.l = bl2;
    }

    public AdaptiveGridLayoutManager(Context context, int n2, int n3, boolean bl2) {
        int n4 = n2 > 0 ? n2 : 1;
        super(context, n4, n3, bl2);
        this.b = Integer.MAX_VALUE;
        this.c = 64;
        this.d = 64;
        this.h = new int[2];
        this.k = true;
        this.l = true;
        this.m = false;
        this.e = n2;
    }

    public AdaptiveGridLayoutManager(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.b = Integer.MAX_VALUE;
        this.c = 64;
        this.d = 64;
        this.h = new int[2];
        this.k = true;
        this.l = true;
        this.m = false;
        this.e = AdaptiveGridLayoutManager.getProperties((Context)context, (AttributeSet)attributeSet, (int)n2, (int)n3).spanCount;
    }

    private int a() {
        if (this.getOrientation() == 1) {
            return this.getWidth();
        }
        return this.getHeight();
    }

    private int a(int n2, int n3) {
        int n4;
        int n5;
        int n6 = this.g > this.a ? this.g : this.a;
        int n7 = this.e;
        int n8 = 1;
        if (n7 > 0) {
            n5 = this.e;
        } else if (this.a > 0 && n2 >= n6) {
            n5 = n2 / n6;
            if (n5 > n3) {
                n5 = n3;
            }
        } else {
            n5 = 1;
        }
        while (n2 / n5 > n6 && n5 < n3) {
            ++n5;
        }
        if (this.e > 0) {
            n8 = this.e;
        }
        while (n2 / n5 < n6 && n5 > n8) {
            --n5;
        }
        while (n2 / n5 > this.b && n5 < n3) {
            ++n5;
        }
        while (n2 / n5 < this.g && n5 > n8) {
            --n5;
        }
        if (this.m && AdaptiveGridLayoutManager.a(n4 = AdaptiveGridLayoutManager.super.b(n5, n8), n5, n2, this.b, n6)) {
            return n4;
        }
        return n5;
    }

    private int a(int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = Integer.MAX_VALUE;
        int n8 = n3;
        int n9 = Integer.MAX_VALUE;
        while (n3 <= n5) {
            int n10 = Math.abs((int)(n2 / n3 - n4));
            if (n10 < n7) {
                n8 = n3;
                n7 = n10;
            } else if (n10 > n9) break;
            ++n3;
            n9 = n10;
        }
        int n11 = this.e > 0 ? this.e : 1;
        while (n2 / n8 < this.g && n8 > n11) {
            --n8;
        }
        if (this.m && AdaptiveGridLayoutManager.a(n6 = AdaptiveGridLayoutManager.super.b(n8, n11), n8, n2, this.b, this.g)) {
            return n6;
        }
        return n8;
    }
    private void a(RecyclerView.Recycler recycler, int n2, int n3, int[] arrn) {
        View view;
        try {
            view = recycler.getViewForPosition(0);
            if (view == null) return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec((int)n2, (int)(this.getPaddingLeft() + this.getPaddingRight()), (int)layoutParams.width), ViewGroup.getChildMeasureSpec((int)n3, (int)(this.getPaddingTop() + this.getPaddingBottom()), (int)layoutParams.height));
        arrn[0] = view.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        arrn[1] = view.getMeasuredHeight() + layoutParams.bottomMargin + layoutParams.topMargin;
        recycler.recycleView(view);
    }

    private static boolean a(int n2, int n3, int n4, int n5, int n6) {
        if (n2 != n3) {
            int n7 = n4 / n2;
            boolean bl2 = n7 > n5;
            boolean bl3 = n7 < n6;
            return !bl2 && !bl3;
        }
        return false;
    }

    private int b(int n2, int n3) {
        int n4 = this.getItemCount();
        if ((n4 == this.getChildCount() || n4 / n2 <= 3) && n4 % n2 != 0) {
            int n5 = n2 - 1;
            int n6 = n2;
            for (int i2 = n5; i2 >= n3; --i2) {
                int n7 = n4 % i2;
                if (n7 == 0) {
                    if (n4 / i2 > 3) break;
                    return i2;
                }
                if (i2 - n7 <= n7 || n7 <= n4 % n6 || n4 / i2 > 3) continue;
                n6 = i2;
            }
            n2 = n6;
        }
        return n2;
    }

    private void b() {
        Context context = Support7Widget.getContext((RecyclerView.LayoutManager)this);
        int n2 = 1;
        if (context != null) {
            int n3;
            this.f = n3 = this.a();
            if (n3 == 0) {
                super.setSpanCount(this.e);
                return;
            }
            if (this.getOrientation() == n2) {
                if (cv.c(context)) {
                    if (this.l) {
                        int n4 = cv.e(context);
                        int n5 = this.a(n4, this.c);
                        int n6 = n4 / n5;
                        if (n5 > this.d) {
                            n5 = this.d;
                        }
                        n2 = this.a(n3, n5, n6, this.d);
                    } else {
                        n2 = this.a(n3, this.d);
                    }
                } else {
                    n2 = this.a(n3, this.c);
                }
            } else if (cv.c(context)) {
                n2 = this.a(n3, this.d);
            } else if (this.l) {
                int n7 = this.getWidth();
                int n8 = this.a(n7, this.d);
                int n9 = n7 / n8;
                if (n8 > this.c) {
                    n8 = this.c;
                }
                n2 = this.a(n3, n8, n9, this.c);
            } else {
                n2 = this.a(n3, this.c);
            }
        } else if (this.e > 0) {
            n2 = this.e;
        }
        int n10 = this.getItemCount();
        if (n2 <= n10 || n10 <= 0 || n10 < this.e) {
            n10 = n2;
        }
        super.setSpanCount(n10);
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
    }
    public void onLayoutChildren(RecyclerView.Recycler var1, RecyclerView.State var2_2) {
        block8 : {
            block9 : {
                block12 : {
                    block14 : {
                        block10 : {
                            block13 : {
                                block11 : {
                                    var3_3 = cv.c(Support7Widget.getContext((RecyclerView.LayoutManager)this)) != false ? this.d : this.c;
                                    if (!this.k || !this.j || this.getChildCount() != 0 || this.getSpanCount() >= var3_3) break block8;
                                    var4_4 = null;
                                    if (var1 == null) break block9;
                                    var9_5 = var2_2.getItemCount();
                                    var4_4 = null;
                                    if (var9_5 <= 0) break block9;
                                    var4_4 = new Object((AdaptiveGridLayoutManager)this, 0){
                                        public int a;
                                        public int b;
                                        public int c;
                                        final AdaptiveGridLayoutManager d;
                                        {
                                            this.d = adaptiveGridLayoutManager;
                                        }
                                    };
                                    var10_6 = var1.getViewForPosition(0);
                                    this.addView(var10_6);
                                    this.measureChildWithMargins(var10_6, 0, 0);
                                    var11_7 = this.getDecoratedMeasuredWidth(var10_6);
                                    var12_8 = this.getDecoratedMeasuredHeight(var10_6);
                                    var13_9 = var10_6.getMeasuredWidth();
                                    var14_10 = var10_6.getMeasuredHeight();
                                    var15_11 = (RecyclerView.LayoutParams)var10_6.getLayoutParams();
                                    if (this.getOrientation() != 1) break block10;
                                    var4_4.a = var11_7;
                                    var4_4.b = var13_9;
                                    if (var15_11.width <= 0) break block11;
                                    var4_4.c = var15_11.width;
                                    break block12;
                                }
                                if (var15_11.width != -2) break block13;
                                AdaptiveGridLayoutManager.super.a(var1, View.MeasureSpec.makeMeasureSpec((int)var13_9, (int)Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((int)0, (int)0), this.h);
                                if (this.h[0] < var13_9) ** GOTO lbl-1000
                                var4_4.c = var13_9;
                                break block12;
                            }
                            var4_4.c = 0;
                            break block12;
                        }
                        var4_4.a = var12_8;
                        var4_4.b = var14_10;
                        if (var15_11.height <= 0) break block14;
                        var4_4.c = var15_11.height;
                        break block12;
                    }
                    if (var15_11.height != -2) ** GOTO lbl-1000
                    AdaptiveGridLayoutManager.super.a(var1, View.MeasureSpec.makeMeasureSpec((int)0, (int)0), View.MeasureSpec.makeMeasureSpec((int)var14_10, (int)Integer.MIN_VALUE), this.h);
                    if (this.h[1] >= var14_10) {
                        var4_4.c = var14_10;
                    } else lbl-1000:
                    {
                        var4_4.c = 0;
                    }
                }
                this.detachAndScrapView(var10_6, var1);
            }
            if (var4_4 != null) {
                this.g = var4_4.c;
                var5_12 = var4_4.a;
                var6_13 = this.e;
                var7_14 = var4_4.c;
                var8_15 = 0;
                if (var5_12 != 0) {
                    if (var7_14 > var5_12) {
                        var5_12 = var7_14;
                    }
                    if ((var8_15 = this.i / var5_12) > var3_3) {
                        var8_15 = var3_3;
                    }
                    while (var7_14 > this.i / var8_15 && var8_15 > var6_13) {
                        --var8_15;
                    }
                }
                if (var8_15 > this.e && var8_15 != this.getSpanCount()) {
                    this.setSpanCount(var8_15);
                }
            }
        }
        super.onLayoutChildren(var1, var2_2);
    }

    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (this.f != AdaptiveGridLayoutManager.super.a()) {
            AdaptiveGridLayoutManager.super.b();
        }
    }

    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int n2, int n3) {
        if (this.getChildCount() == 0) {
            int n4 = View.MeasureSpec.getSize((int)n2);
            int n5 = View.MeasureSpec.getSize((int)n3);
            if (this.getOrientation() == 1) {
                this.i = n4;
                int n6 = View.MeasureSpec.getMode((int)n2);
                boolean bl2 = false;
                if (n6 == Integer.MIN_VALUE) {
                    bl2 = true;
                }
                this.j = bl2;
            } else {
                this.i = n5;
                int n7 = View.MeasureSpec.getMode((int)n3);
                boolean bl3 = false;
                if (n7 == Integer.MIN_VALUE) {
                    bl3 = true;
                }
                this.j = bl3;
            }
        }
        super.onMeasure(recycler, state, n2, n3);
    }

    public void setSpanCount(int n2) {
        if (this.c > 0) {
            if (n2 != this.e) {
                this.f = 0;
            }
            this.e = n2;
            AdaptiveGridLayoutManager.super.b();
            return;
        }
        super.setSpanCount(n2);
    }

}

