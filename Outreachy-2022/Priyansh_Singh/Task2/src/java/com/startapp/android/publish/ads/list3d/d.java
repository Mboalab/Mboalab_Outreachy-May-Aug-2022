package com.startapp.android.publish.ads.list3d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.MaskFilter;
import android.graphics.Paint;
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
import com.startapp.android.publish.a.b;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.android.publish.common.metaData.MetaDataStyle;
import com.startapp.common.a.c;
import java.util.Set;

public class d {
    private RelativeLayout a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private b f;
    private MetaDataStyle g = null;

    public d(Context context) {
        context.setTheme(16973829);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        this.a = new RelativeLayout(context);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int[] arrn = new int[]{com.startapp.android.publish.adsCommon.b.a().n(), com.startapp.android.publish.adsCommon.b.a().o()};
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, arrn);
        this.a.setBackgroundDrawable((Drawable)gradientDrawable);
        this.a.setLayoutParams(layoutParams);
        int n2 = h.a(context, 3);
        int n3 = h.a(context, 4);
        int n4 = h.a(context, 5);
        int n5 = h.a(context, 6);
        int n6 = h.a(context, 10);
        int n7 = h.a(context, 84);
        this.a.setPadding(n6, n2, n6, n2);
        this.a.setTag((Object)this);
        this.b = new ImageView(context);
        this.b.setId(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(n7, n7);
        layoutParams2.addRule(15);
        this.b.setLayoutParams((ViewGroup.LayoutParams)layoutParams2);
        this.b.setPadding(0, 0, n5, 0);
        this.c = new TextView(context);
        this.c.setId(2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(c.a((int)17), 1);
        layoutParams3.addRule(6, 1);
        this.c.setLayoutParams((ViewGroup.LayoutParams)layoutParams3);
        this.c.setPadding(0, 0, 0, n4);
        this.c.setTextColor(com.startapp.android.publish.adsCommon.b.a().q().intValue());
        this.c.setTextSize((float)com.startapp.android.publish.adsCommon.b.a().p().intValue());
        this.c.setSingleLine(true);
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        h.a(this.c, com.startapp.android.publish.adsCommon.b.a().r());
        this.d = new TextView(context);
        this.d.setId(3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(c.a((int)17), 1);
        layoutParams4.addRule(3, 2);
        layoutParams4.setMargins(0, 0, 0, n4);
        this.d.setLayoutParams((ViewGroup.LayoutParams)layoutParams4);
        this.d.setTextColor(com.startapp.android.publish.adsCommon.b.a().t().intValue());
        this.d.setTextSize((float)com.startapp.android.publish.adsCommon.b.a().s().intValue());
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        h.a(this.d, com.startapp.android.publish.adsCommon.b.a().u());
        this.f = new b(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(c.a((int)17), 1);
        layoutParams5.addRule(8, 1);
        layoutParams5.setMargins(0, 0, 0, -n4);
        this.f.setLayoutParams((ViewGroup.LayoutParams)layoutParams5);
        this.f.setPadding(0, 0, 0, n3);
        this.f.setId(5);
        this.e = new TextView(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(c.a((int)21));
        layoutParams6.addRule(8, 1);
        this.e.setLayoutParams((ViewGroup.LayoutParams)layoutParams6);
        this.a(false);
        this.e.setTextColor(-1);
        this.e.setTextSize(12.0f);
        this.e.setTypeface(null, 1);
        this.e.setPadding(n6, n5, n6, n5);
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
        this.a.addView((View)this.b);
        this.a.addView((View)this.c);
        this.a.addView((View)this.d);
        this.a.addView((View)this.f);
        this.a.addView((View)this.e);
    }

    public RelativeLayout a() {
        return this.a;
    }

    public void a(MetaDataStyle metaDataStyle) {
        if (this.g != metaDataStyle) {
            this.g = metaDataStyle;
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int[] arrn = new int[]{metaDataStyle.getItemGradientTop(), metaDataStyle.getItemGradientBottom()};
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, arrn);
            this.a.setBackgroundDrawable((Drawable)gradientDrawable);
            this.c.setTextSize((float)metaDataStyle.getItemTitleTextSize().intValue());
            this.c.setTextColor(metaDataStyle.getItemTitleTextColor().intValue());
            h.a(this.c, (Set<String>)metaDataStyle.getItemTitleTextDecoration());
            this.d.setTextSize((float)metaDataStyle.getItemDescriptionTextSize().intValue());
            this.d.setTextColor(metaDataStyle.getItemDescriptionTextColor().intValue());
            h.a(this.d, (Set<String>)metaDataStyle.getItemDescriptionTextDecoration());
        }
    }

    public void a(boolean bl) {
        if (bl) {
            this.e.setText((CharSequence)"Open");
            return;
        }
        this.e.setText((CharSequence)"Download");
    }

    public ImageView b() {
        return this.b;
    }

    public TextView c() {
        return this.c;
    }

    public TextView d() {
        return this.d;
    }

    public b e() {
        return this.f;
    }

}

