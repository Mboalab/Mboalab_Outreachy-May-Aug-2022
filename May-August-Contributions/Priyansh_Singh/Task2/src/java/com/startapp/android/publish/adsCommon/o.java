/*
 *  
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  java.lang.Math
 *  java.lang.Object
 */
package com.startapp.android.publish.adsCommon;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class o {
    private final Rect a = new Rect();

    private boolean a(View view) {
        return Build.VERSION.SDK_INT >= 11 && view.getAlpha() == 0.0f;
    }

    private static boolean a(View view, View view2, int n2) {
        int[] arrn = new int[2];
        int[] arrn2 = new int[2];
        view.getLocationOnScreen(arrn);
        view2.getLocationOnScreen(arrn2);
        Rect rect = new Rect(arrn[0], arrn[1], arrn[0] + view.getWidth(), arrn[1] + view.getHeight());
        Rect rect2 = new Rect(arrn2[0], arrn2[1], arrn2[0] + view2.getWidth(), arrn2[1] + view2.getHeight());
        int n3 = Math.max((int)0, (int)(Math.min((int)rect.right, (int)rect2.right) - Math.max((int)rect.left, (int)rect2.left)));
        int n4 = Math.max((int)0, (int)(Math.min((int)rect.bottom, (int)rect2.bottom) - Math.max((int)rect.top, (int)rect2.top)));
        long l2 = (long)n3 * (long)n4;
        long l3 = (long)view.getHeight() * (long)view.getWidth();
        return l2 > 0L && l2 * 100L > l3 * (long)n2;
    }

    public boolean a(View view, int n2) {
        if (view != null && view.hasWindowFocus() && view.isShown() && !o.super.a(view) && view.getRootView() != null) {
            if (view.getRootView().getParent() == null) {
                return false;
            }
            if (!view.getGlobalVisibleRect(this.a)) {
                return false;
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup)view.getParent();
                for (int i2 = 1 + viewGroup.indexOfChild((View)view); i2 < viewGroup.getChildCount(); ++i2) {
                    View view2 = viewGroup.getChildAt(i2);
                    if (view2.getVisibility() != 0 || !o.a(view, view2, 0)) continue;
                    return false;
                }
            }
            long l2 = (long)this.a.height() * (long)this.a.width();
            long l3 = (long)view.getHeight() * (long)view.getWidth();
            return l3 > 0L && l2 * 100L >= l3 * (long)n2;
        }
        return false;
    }
}

