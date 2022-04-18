package com.startapp.android.publish.ads.banner.banner3d;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewParent;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.ads.banner.banner3d.Banner3D;
import com.startapp.android.publish.ads.banner.d;
import com.startapp.common.a.h;

public class Banner3DSize {
    private static d a(Context var0, ViewParent var1, BannerOptions var2, Banner3D var3) {
        throw new IllegalStateException("Decompilation failed");
    }

    private static void a(Context context, Point point, View view) {
        point.y = com.startapp.android.publish.adsCommon.Utils.h.b(context, view.getMeasuredHeight() - view.getPaddingBottom() - view.getPaddingTop());
    }

    public static boolean a(Context context, ViewParent viewParent, BannerOptions bannerOptions, Banner3D banner3D, d d2) {
        h.a((String)"Banner3DSize", (int)3, (String)"============== Optimize Size ==========");
        d d3 = Banner3DSize.a(context, viewParent, bannerOptions, banner3D);
        d2.a(d3.a(), d3.b());
        Size[] arrsize = Size.values();
        int n2 = arrsize.length;
        boolean bl = false;
        for (int i2 = 0; i2 < n2; ++i2) {
            Size size = arrsize[i2];
            if (size.getSize().a() > d3.a() || size.getSize().b() > d3.b()) continue;
            StringBuilder stringBuilder = new StringBuilder("BannerSize [");
            stringBuilder.append(size.getSize().a());
            stringBuilder.append(",");
            stringBuilder.append(size.getSize().b());
            stringBuilder.append("]");
            h.a((String)"Banner3DSize", (int)3, (String)stringBuilder.toString());
            bannerOptions.a(size.getSize().a(), size.getSize().b());
            bl = true;
        }
        if (!bl) {
            bannerOptions.a(0, 0);
        }
        StringBuilder stringBuilder = new StringBuilder("============== Optimize Size [");
        stringBuilder.append(bl);
        stringBuilder.append("] ==========");
        h.a((String)"Banner3DSize", (int)3, (String)stringBuilder.toString());
        return bl;
    }

    private static void b(Context context, Point point, View view) {
        point.x = com.startapp.android.publish.adsCommon.Utils.h.b(context, view.getMeasuredWidth() - view.getPaddingLeft() - view.getPaddingRight());
    }

    private static void c(Context context, Point point, View view) {
        point.x = com.startapp.android.publish.adsCommon.Utils.h.b(context, view.getMeasuredWidth());
        point.y = com.startapp.android.publish.adsCommon.Utils.h.b(context, view.getMeasuredHeight());
    }

    public static final class Size
    extends Enum<Size> {
        private static final Size[] $VALUES;
        public static final Size LARGE;
        public static final Size MEDIUM;
        public static final Size SMALL;
        public static final Size XLARGE;
        public static final Size XSMALL;
        public static final Size XXSMALL;
        private d size;

        static {
            XXSMALL = new Size(new d(280, 50));
            XSMALL = new Size(new d(300, 50));
            SMALL = new Size(new d(320, 50));
            MEDIUM = new Size(new d(468, 60));
            LARGE = new Size(new d(728, 90));
            XLARGE = new Size(new d(1024, 90));
            Size[] arrsize = new Size[]{XXSMALL, XSMALL, SMALL, MEDIUM, LARGE, XLARGE};
            $VALUES = arrsize;
        }

        private Size(d d2) {
            this.size = d2;
        }

        public static Size valueOf(String string) {
            return (Size)Enum.valueOf(Size.class, (String)string);
        }

        public static Size[] values() {
            return (Size[])$VALUES.clone();
        }

        public final d getSize() {
            return this.size;
        }
    }

}

