package com.startapp.android.publish.ads.banner.banner3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.android.publish.ads.banner.banner3d.Banner3DSize;
import com.startapp.android.publish.ads.banner.d;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.common.a.c;
import java.util.Set;

public class b
extends RelativeLayout {
    private TextView a;
    private TextView b;
    private ImageView c;
    private com.startapp.android.publish.a.b d;
    private TextView e;
    private Point f;

    public b(Context context, Point point) {
        super(context);
        this.f = point;
        b.super.a();
    }

    private void a() {
        Context context;
        int n2;
        int n3;
        RelativeLayout.LayoutParams layoutParams;
        int n4;
        int n5;
        a a2;
        block18 : {
            int n6;
            context = this.getContext();
            a2 = this.getTemplateBySize();
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int[] arrn = new int[]{com.startapp.android.publish.adsCommon.b.a().n(), com.startapp.android.publish.adsCommon.b.a().o()};
            this.setBackgroundDrawable((Drawable)new GradientDrawable(orientation, arrn));
            this.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            int n7 = h.a(context, 2);
            int n8 = h.a(context, 3);
            h.a(context, 4);
            int n9 = h.a(context, 5);
            n4 = h.a(context, 6);
            n2 = h.a(context, 8);
            h.a(context, 10);
            n5 = h.a(context, 20);
            h.a(context, 84);
            int n10 = h.a(context, 90);
            this.setPadding(n9, 0, n9, 0);
            this.setTag((Object)this);
            this.c = new ImageView(context);
            this.c.setId(1);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(n10, n10);
            layoutParams2.addRule(15);
            this.c.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
            this.a = new TextView(context);
            this.a.setId(2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(c.a((int)17), 1);
            layoutParams3.addRule(14);
            this.a.setLayoutParams((ViewGroup.LayoutParams)layoutParams3);
            this.a.setTextColor(com.startapp.android.publish.adsCommon.b.a().q().intValue());
            this.a.setGravity(c.a((int)8388611));
            this.a.setBackgroundColor(0);
            switch (2.a[a2.ordinal()]) {
                default: {
                    break;
                }
                case 4: 
                case 5: {
                    this.a.setTextSize(22.0f);
                    this.a.setPadding(n8, 0, 0, n9);
                    break;
                }
                case 3: {
                    this.a.setTextSize(17.0f);
                    this.a.setPadding(n8, 0, 0, n7);
                    Context context2 = this.getContext();
                    double d2 = this.f.x;
                    Double.isNaN((double)d2);
                    layoutParams3.width = h.a(context2, (int)(d2 * 0.65));
                    break;
                }
                case 1: 
                case 2: {
                    this.a.setTextSize(17.0f);
                    this.a.setPadding(n8, 0, 0, n7);
                    Context context3 = this.getContext();
                    double d3 = this.f.x;
                    Double.isNaN((double)d3);
                    layoutParams3.width = h.a(context3, (int)(d3 * 0.55));
                }
            }
            this.a.setSingleLine(true);
            this.a.setEllipsize(TextUtils.TruncateAt.END);
            h.a(this.a, com.startapp.android.publish.adsCommon.b.a().r());
            this.b = new TextView(context);
            this.b.setId(3);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams4.addRule(c.a((int)17), 1);
            layoutParams4.addRule(3, 2);
            layoutParams4.setMargins(0, 0, 0, n9);
            this.b.setLayoutParams((ViewGroup.LayoutParams)layoutParams4);
            this.b.setTextColor(com.startapp.android.publish.adsCommon.b.a().t().intValue());
            this.b.setTextSize(18.0f);
            this.b.setMaxLines(2);
            this.b.setLines(2);
            this.b.setSingleLine(false);
            this.b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            this.b.setHorizontallyScrolling(true);
            this.b.setPadding(n8, 0, 0, 0);
            this.d = new com.startapp.android.publish.a.b(this.getContext());
            this.d.setId(5);
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            switch (2.a[a2.ordinal()]) {
                default: {
                    n3 = n8;
                    break block18;
                }
                case 4: 
                case 5: {
                    layoutParams.addRule(c.a((int)17), 2);
                    Context context4 = this.getContext();
                    int n11 = this.f.x;
                    n6 = n8;
                    double d4 = n11;
                    Double.isNaN((double)d4);
                    layoutParams4.width = h.a(context4, (int)(d4 * 0.6));
                    break;
                }
                case 1: 
                case 2: 
                case 3: {
                    n6 = n8;
                    layoutParams.addRule(c.a((int)17), 1);
                    layoutParams.addRule(8, 1);
                }
            }
            n3 = n6;
        }
        layoutParams.setMargins(n3, n2, n3, 0);
        this.d.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        this.e = new TextView(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        switch (2.a[a2.ordinal()]) {
            default: {
                break;
            }
            case 5: {
                layoutParams5.addRule(c.a((int)17), 3);
                layoutParams5.addRule(15);
                layoutParams5.setMargins(n5 * 7, 0, 0, 0);
                this.e.setTextSize(26.0f);
                break;
            }
            case 4: {
                layoutParams5.addRule(c.a((int)17), 3);
                layoutParams5.addRule(15);
                layoutParams5.setMargins(n5, 0, 0, 0);
                this.e.setTextSize(26.0f);
                break;
            }
            case 1: 
            case 2: 
            case 3: {
                this.e.setTextSize(13.0f);
                layoutParams5.addRule(c.a((int)17), 2);
                layoutParams5.addRule(15);
            }
        }
        this.e.setPadding(n4, n4, n4, n4);
        this.e.setLayoutParams((ViewGroup.LayoutParams)layoutParams5);
        this.setButtonText(false);
        this.e.setTextColor(-1);
        this.e.setTypeface(null, 1);
        this.e.setId(4);
        this.e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)){

            protected void onDraw(Shape shape, Canvas canvas, Paint paint) {
                paint.setColor(-11363070);
                paint.setMaskFilter((MaskFilter)new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
                super.onDraw(shape, canvas, paint);
            }
        };
        this.e.setBackgroundDrawable((Drawable)shapeDrawable);
        this.addView((View)this.c);
        this.addView((View)this.a);
        switch (2.a[a2.ordinal()]) {
            default: {
                break;
            }
            case 4: 
            case 5: {
                this.addView((View)this.e);
                this.addView((View)this.b);
                break;
            }
            case 1: 
            case 2: 
            case 3: {
                this.addView((View)this.e);
            }
        }
        this.addView((View)this.d);
    }

    private String[] a(String string) {
        int n2;
        String[] arrstring = new String[2];
        int n3 = string.length();
        if (n3 > (n2 = 55)) {
            int n4;
            boolean bl;
            block3 : {
                char[] arrc = string.substring(0, n2).toCharArray();
                n4 = arrc.length - 1;
                for (int i2 = n4 - 1; i2 > 0; --i2) {
                    if (arrc[i2] != ' ') continue;
                    n4 = i2;
                    bl = true;
                    break block3;
                }
                bl = false;
            }
            if (bl) {
                n2 = n4;
            }
            arrstring[0] = string.substring(0, n2);
            arrstring[1] = string.substring(n2 + 1, string.length());
            return arrstring;
        }
        arrstring[0] = string;
        arrstring[1] = null;
        return arrstring;
    }

    private a getTemplateBySize() {
        a a2 = a.b;
        if (this.f.x > Banner3DSize.Size.SMALL.getSize().a() || this.f.y > Banner3DSize.Size.SMALL.getSize().b()) {
            a2 = a.c;
        }
        if (this.f.x > Banner3DSize.Size.MEDIUM.getSize().a() || this.f.y > Banner3DSize.Size.MEDIUM.getSize().b()) {
            a2 = a.d;
        }
        if (this.f.x > Banner3DSize.Size.LARGE.getSize().a() || this.f.y > Banner3DSize.Size.LARGE.getSize().b()) {
            a2 = a.e;
        }
        return a2;
    }

    public void a(int n2, int n3, int n4) {
        this.c.setImageResource(n2);
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.width = n3;
        layoutParams.height = n4;
        this.c.setLayoutParams(layoutParams);
    }

    public void a(Bitmap bitmap, int n2, int n3) {
        this.c.setImageBitmap(bitmap);
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.width = n2;
        layoutParams.height = n3;
        this.c.setLayoutParams(layoutParams);
    }

    public void setButtonText(boolean bl) {
        if (bl) {
            this.e.setText((CharSequence)"OPEN");
            return;
        }
        this.e.setText((CharSequence)"DOWNLOAD");
    }

    public void setDescription(String string) {
        if (string != null && string.compareTo("") != 0) {
            String[] arrstring = b.super.a(string);
            String string2 = arrstring[0];
            String string3 = "";
            if (arrstring[1] != null) {
                string3 = b.super.a(arrstring[1])[0];
            }
            if (string.length() >= 110) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append("...");
                string3 = stringBuilder.toString();
            }
            TextView textView = this.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("\n");
            stringBuilder.append(string3);
            textView.setText((CharSequence)stringBuilder.toString());
        }
    }

    public void setImage(Bitmap bitmap) {
        this.c.setImageBitmap(bitmap);
    }

    public void setRating(float f2) {
        try {
            this.d.setRating(f2);
            return;
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
    }

    public void setText(String string) {
        this.a.setText((CharSequence)string);
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        private static final /* synthetic */ a[] f;

        static {
            a[] arra = new a[]{a, b, c, d, e};
            f = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])f.clone();
        }
    }

}

