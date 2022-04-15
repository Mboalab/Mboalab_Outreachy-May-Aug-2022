package com.startapp.android.publish.inappbrowser;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.android.publish.inappbrowser.c;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class b
extends RelativeLayout {
    private static final int p = Color.rgb((int)78, (int)86, (int)101);
    private static final int q = Color.rgb((int)148, (int)155, (int)166);
    private RelativeLayout a;
    private ImageView b;
    private ImageView c;
    private ImageView d;
    private ImageView e;
    private Bitmap f;
    private Bitmap g;
    private Bitmap h;
    private Bitmap i;
    private Bitmap j;
    private Bitmap k;
    private TextView l;
    private TextView m;
    private Boolean n = Boolean.FALSE;
    private Map<String, c> o;

    public b(Context context) {
        super(context);
    }

    private Map<String, c> d() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"BACK", (Object)new c(this.h, 14, 22, "back_.png"));
        hashMap.put((Object)"BACK_DARK", (Object)new c(this.j, 14, 22, "back_dark.png"));
        hashMap.put((Object)"FORWARD", (Object)new c(this.i, 14, 22, "forward_.png"));
        hashMap.put((Object)"FORWARD_DARK", (Object)new c(this.k, 14, 22, "forward_dark.png"));
        hashMap.put((Object)"X", (Object)new c(this.g, 23, 23, "x_dark.png"));
        hashMap.put((Object)"BROWSER", (Object)new c(this.f, 28, 28, "browser_icon_dark.png"));
        return hashMap;
    }

    private void e() {
        for (c c2 : this.o.values()) {
            Bitmap bitmap = h.a(this.getContext(), c2.c());
            if (bitmap == null) {
                StringBuilder stringBuilder = new StringBuilder("Error getting navigation bar bitmap - ");
                stringBuilder.append(c2.c());
                stringBuilder.append(" from resources ");
                com.startapp.common.a.h.a("NavigationBarLayout", 6, stringBuilder.toString());
                continue;
            }
            c2.a(Bitmap.createScaledBitmap((Bitmap)bitmap, (int)h.a(this.getContext(), c2.a()), (int)h.a(this.getContext(), c2.b()), (boolean)true));
        }
    }

    private void f() {
        this.e.setImageBitmap(((c)this.o.get((Object)"BACK_DARK")).d());
        this.addView((View)this.e, (ViewGroup.LayoutParams)h.a(this.getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
        this.addView((View)this.c, (ViewGroup.LayoutParams)h.a(this.getContext(), new int[]{9, 0, 0, 0}, new int[]{15}, 1, 2105));
        this.removeView((View)this.a);
        this.a.removeView((View)this.m);
        this.a.removeView((View)this.l);
        this.a.addView((View)this.l, (ViewGroup.LayoutParams)h.a(this.getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
        this.a.addView((View)this.m, (ViewGroup.LayoutParams)h.a(this.getContext(), new int[]{0, 0, 0, 0}, new int[]{14}, 3, 2102));
        RelativeLayout.LayoutParams layoutParams = h.a(this.getContext(), new int[]{16, 0, 16, 0}, new int[]{15}, 1, 2106);
        layoutParams.addRule(0, 2104);
        this.addView((View)this.a, (ViewGroup.LayoutParams)layoutParams);
    }

    public void a() {
        this.setDescendantFocusability(262144);
        this.setBackgroundColor(Color.parseColor((String)"#e9e9e9"));
        this.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, h.a(this.getContext(), 60)));
        this.setId(2101);
        this.o = this.d();
    }

    public void a(WebView webView) {
        if (this.n.booleanValue()) {
            this.b(webView);
            return;
        }
        if (webView.canGoBack()) {
            b.super.f();
            this.n = Boolean.TRUE;
        }
    }

    public void b() {
        Typeface typeface = Typeface.DEFAULT;
        this.l = h.a(this.getContext(), this.l, typeface, 1, 16.46f, p, 2102);
        this.m = h.a(this.getContext(), this.l, typeface, 1, 12.12f, q, 2107);
        this.l.setText((CharSequence)"Loading...");
        this.a = new RelativeLayout(this.getContext());
        this.a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.a.addView((View)this.l, (ViewGroup.LayoutParams)h.a(this.getContext(), new int[]{0, 0, 0, 0}, new int[0]));
        this.a.addView((View)this.m, (ViewGroup.LayoutParams)h.a(this.getContext(), new int[]{0, 0, 0, 0}, new int[0], 3, 2102));
        this.e();
        this.b = h.a(this.getContext(), this.b, ((c)this.o.get((Object)"X")).d(), 2103);
        this.d = h.a(this.getContext(), this.d, ((c)this.o.get((Object)"BROWSER")).d(), 2104);
        this.e = h.a(this.getContext(), this.e, ((c)this.o.get((Object)"BACK")).d(), 2105);
        this.c = h.a(this.getContext(), this.c, ((c)this.o.get((Object)"FORWARD")).d(), 2106);
        int n2 = h.a(this.getContext(), 10);
        this.c.setPadding(n2, n2, n2, n2);
        this.e.setPadding(n2, n2, n2, n2);
        this.addView((View)this.b, (ViewGroup.LayoutParams)h.a(this.getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
        this.addView((View)this.d, (ViewGroup.LayoutParams)h.a(this.getContext(), new int[]{0, 0, 17, 0}, new int[]{15}, 0, 2103));
        this.addView((View)this.a, (ViewGroup.LayoutParams)h.a(this.getContext(), new int[]{16, 6, 16, 0}, new int[]{9}, 0, 2104));
    }

    void b(WebView webView) {
        if (webView.canGoBack()) {
            this.e.setImageBitmap(((c)this.o.get((Object)"BACK_DARK")).d());
        } else {
            this.e.setImageBitmap(((c)this.o.get((Object)"BACK")).d());
        }
        if (webView.canGoForward()) {
            this.c.setImageBitmap(((c)this.o.get((Object)"FORWARD_DARK")).d());
        } else {
            this.c.setImageBitmap(((c)this.o.get((Object)"FORWARD")).d());
        }
        if (webView.getTitle() != null) {
            this.l.setText((CharSequence)webView.getTitle());
        }
    }

    public void c() {
        if (Build.VERSION.SDK_INT < 11) {
            ((BitmapDrawable)this.b.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable)this.d.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable)this.e.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable)this.c.getDrawable()).getBitmap().recycle();
        }
        this.o = null;
        this.h = null;
        this.j = null;
        this.i = null;
        this.k = null;
    }

    public TextView getTitleTxt() {
        return this.l;
    }

    public TextView getUrlTxt() {
        return this.m;
    }

    public void setButtonsListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
        this.e.setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
        this.d.setOnClickListener(onClickListener);
    }
}

