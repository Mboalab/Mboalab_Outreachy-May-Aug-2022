/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.newandromo.dev338923.app614241.ba;

public class MaxTextureSizeView
extends View {
    public MaxTextureSizeView(Context context) {
        super(context);
        this.setWillNotDraw(false);
    }

    public MaxTextureSizeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setWillNotDraw(false);
    }

    public MaxTextureSizeView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT >= 14 && canvas.isHardwareAccelerated()) {
            ba.a = canvas.getMaximumBitmapWidth();
            ba.b = canvas.getMaximumBitmapHeight();
        }
        ((ViewGroup)this.getParent()).removeView((View)this);
        this.setWillNotDraw(true);
    }
}

