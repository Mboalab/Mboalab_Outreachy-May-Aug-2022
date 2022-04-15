/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.widget.LinearLayout
 */
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.newandromo.dev338923.app614241.ba;

public class MaxTextureSizeLinearLayout
extends LinearLayout {
    public MaxTextureSizeLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setWillNotDraw(false);
    }

    public MaxTextureSizeLinearLayout(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT >= 14 && canvas.isHardwareAccelerated()) {
            ba.a = canvas.getMaximumBitmapWidth();
            ba.b = canvas.getMaximumBitmapHeight();
        }
        this.setWillNotDraw(true);
    }
}

