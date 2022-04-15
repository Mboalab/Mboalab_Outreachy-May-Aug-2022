/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Point
 *  android.graphics.Typeface
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.Display
 *  android.view.WindowManager
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 */
package com.startapp.android.publish.adsCommon.Utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.android.publish.adsCommon.Utils.a;
import java.util.Set;

public class h {
    public static int a(Context context, int n2) {
        return Math.round((float)TypedValue.applyDimension((int)1, (float)n2, (DisplayMetrics)context.getResources().getDisplayMetrics()));
    }

    public static Bitmap a(Context context, String string) {
        return a.a(context, string);
    }

    public static ImageView a(Context context, ImageView imageView, Bitmap bitmap, int n2) {
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setId(n2);
        return imageView2;
    }

    public static RelativeLayout.LayoutParams a(Context context, int[] arrn, int[] arrn2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        for (int i2 = 0; i2 < arrn2.length; ++i2) {
            layoutParams.addRule(arrn2[i2]);
        }
        for (int i3 = 0; i3 < arrn.length; ++i3) {
            int n2 = arrn[i3] == 0 ? 0 : h.a(context, arrn[i3]);
            arrn[i3] = n2;
        }
        layoutParams.setMargins(arrn[0], arrn[1], arrn[2], arrn[3]);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams a(Context context, int[] arrn, int[] arrn2, int n2, int n3) {
        RelativeLayout.LayoutParams layoutParams = h.a(context, arrn, arrn2);
        layoutParams.addRule(n2, n3);
        return layoutParams;
    }

    public static TextView a(Context context, TextView textView, Typeface typeface, int n2, float f2, int n3, int n4) {
        TextView textView2 = new TextView(context);
        textView2.setTypeface(typeface, n2);
        textView2.setTextSize(1, f2);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setTextColor(n3);
        textView2.setId(n4);
        return textView2;
    }

    public static void a(Context context, WindowManager windowManager, Point point) {
        if (Build.VERSION.SDK_INT >= 13) {
            windowManager.getDefaultDisplay().getSize(point);
        } else {
            point.x = windowManager.getDefaultDisplay().getWidth();
            point.y = windowManager.getDefaultDisplay().getHeight();
        }
        point.x = h.b(context, point.x);
        point.y = h.b(context, point.y);
    }

    public static void a(WindowManager windowManager, Point point) {
        if (Build.VERSION.SDK_INT >= 13) {
            windowManager.getDefaultDisplay().getSize(point);
            return;
        }
        point.x = windowManager.getDefaultDisplay().getWidth();
        point.y = windowManager.getDefaultDisplay().getHeight();
    }

    public static void a(TextView textView, Set<String> set) {
        int n2;
        if (set.contains((Object)"UNDERLINE")) {
            textView.setPaintFlags(8 | textView.getPaintFlags());
        }
        if (set.contains((Object)"BOLD") && set.contains((Object)"ITALIC")) {
            n2 = 3;
        } else if (set.contains((Object)"BOLD")) {
            n2 = 1;
        } else {
            boolean bl = set.contains((Object)"ITALIC");
            n2 = 0;
            if (bl) {
                n2 = 2;
            }
        }
        textView.setTypeface(null, n2);
    }

    public static int b(Context context, int n2) {
        return Math.round((float)((float)n2 / context.getResources().getDisplayMetrics().density));
    }
}

