
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.newandromo.dev338923.app614241.cg;

public class AspectRatioImageView
extends ImageView {
    private final boolean a;
    private final boolean b;
    private final int c;
    private final double d;
    private final double e;

    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, cg.a.AspectRatioImageView, n2, 0);
        boolean bl = (1 & typedArray.getInt(0, 0)) == 1;
        this.a = bl;
        int n3 = 2 & typedArray.getInt(0, 0);
        boolean bl2 = false;
        if (n3 == 2) {
            bl2 = true;
        }
        this.b = bl2;
        this.c = typedArray.getResourceId(2, -1);
        this.d = typedArray.getFloat(3, 1.0f);
        this.e = typedArray.getFloat(1, 1.0f);
        typedArray.recycle();
    }

    protected void onMeasure(int n2, int n3) {
        Drawable drawable;
        View.MeasureSpec.getMode((int)n2);
        View.MeasureSpec.getMode((int)n3);
        View.MeasureSpec.getSize((int)n2);
        View.MeasureSpec.getSize((int)n3);
        int n4 = this.getPaddingLeft() + this.getPaddingRight();
        int n5 = this.getPaddingTop() + this.getPaddingBottom();
        double d2 = View.MeasureSpec.getSize((int)n2) - n4;
        double d3 = View.MeasureSpec.getSize((int)n3) - n5;
        if (this.c != -1 && (this.d != 1.0 || this.e != 1.0)) {
            for (View view = (View)this.getParent(); view != null; view = (View)view.getParent()) {
                double d4;
                double d5;
                if (view.getId() != this.c) continue;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) break;
                if (layoutParams.width > 0) {
                    double d6 = layoutParams.width;
                    double d7 = this.d;
                    Double.isNaN((double)d6);
                    double d8 = d6 * d7;
                    double d9 = n4;
                    Double.isNaN((double)d9);
                    d5 = d8 - d9;
                } else {
                    double d10 = view.getMeasuredWidth();
                    double d11 = this.d;
                    Double.isNaN((double)d10);
                    double d12 = d10 * d11;
                    double d13 = n4;
                    Double.isNaN((double)d13);
                    d5 = d12 - d13;
                }
                if (layoutParams.height > 0) {
                    double d14 = layoutParams.height;
                    double d15 = this.e;
                    Double.isNaN((double)d14);
                    double d16 = d14 * d15;
                    double d17 = n5;
                    Double.isNaN((double)d17);
                    d4 = d16 - d17;
                } else {
                    double d18 = view.getMeasuredHeight();
                    double d19 = this.e;
                    Double.isNaN((double)d18);
                    double d20 = d18 * d19;
                    double d21 = n5;
                    Double.isNaN((double)d21);
                    d4 = d20 - d21;
                }
                if (d5 > 0.0 && d2 > d5) {
                    d2 = d5;
                }
                if (!(d4 > 0.0) || !(d3 > d4)) break;
                d3 = d4;
                break;
            }
        }
        if ((drawable = this.getDrawable()) != null) {
            if (this.a && this.b) {
                double d22 = drawable.getIntrinsicWidth();
                double d23 = drawable.getIntrinsicHeight();
                if (d22 > 0.0 && d23 > 0.0) {
                    Double.isNaN((double)d22);
                    double d24 = Math.abs((double)(d2 / d22));
                    Double.isNaN((double)d23);
                    double d25 = Math.min((double)d24, (double)Math.abs((double)(d3 / d23)));
                    Double.isNaN((double)d22);
                    double d26 = 0.5 + d22 * d25;
                    Double.isNaN((double)d23);
                    double d27 = 0.5 + d23 * d25;
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)(n4 + (int)d26), (int)1073741824), View.MeasureSpec.makeMeasureSpec((int)(n5 + (int)d27), (int)1073741824));
                    return;
                }
                super.onMeasure(n2, n3);
                return;
            }
            if (this.a) {
                double d28 = drawable.getIntrinsicWidth();
                if (d28 > 0.0) {
                    double d29 = drawable.getIntrinsicHeight();
                    Double.isNaN((double)d29);
                    double d30 = d2 * d29;
                    Double.isNaN((double)d28);
                    super.onMeasure(n2, View.MeasureSpec.makeMeasureSpec((int)(n5 + (int)(0.5 + d30 / d28)), (int)1073741824));
                    return;
                }
                super.onMeasure(n2, n3);
                return;
            }
            if (this.b) {
                double d31 = drawable.getIntrinsicHeight();
                if (d31 > 0.0) {
                    double d32 = drawable.getIntrinsicWidth();
                    Double.isNaN((double)d32);
                    double d33 = d3 * d32;
                    Double.isNaN((double)d31);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)(n4 + (int)(0.5 + d33 / d31)), (int)1073741824), n3);
                    return;
                }
                super.onMeasure(n2, n3);
                return;
            }
            super.onMeasure(n2, n3);
            return;
        }
        super.onMeasure(n2, n3);
    }
}

