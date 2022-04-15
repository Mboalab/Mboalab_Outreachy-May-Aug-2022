/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.WindowManager
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.newandromo.dev338923.app614241;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;

public final class e {
    public static View a(View view, int n2) {
        ViewGroup viewGroup;
        LayoutInflater layoutInflater;
        if (view != null && (layoutInflater = (LayoutInflater)view.getContext().getSystemService("layout_inflater")) != null && (viewGroup = (ViewGroup)view.getParent()) != null) {
            int n3 = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            View view2 = layoutInflater.inflate(n2, viewGroup, false);
            viewGroup.addView(view2, n3);
            return view2;
        }
        return null;
    }

    public static final class a {
        public static boolean a(Context context) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (context != null) {
                if (context instanceof Activity) {
                    ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                } else {
                    Resources resources = context.getResources();
                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
                    displayMetrics = resources != null ? resources.getDisplayMetrics() : displayMetrics2;
                }
            }
            boolean bl = context == null || displayMetrics == null || displayMetrics.heightPixels > 500;
            return !bl;
        }
    }

    public static final class b
    extends Enum<b> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d;

        static {
            int[] arrn = new int[]{a, b, c};
            d = arrn;
        }

        public static int[] a() {
            return (int[])d.clone();
        }
    }

}

