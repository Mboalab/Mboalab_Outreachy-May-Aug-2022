package com.startapp.android.publish.ads.list3d;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.android.publish.ads.list3d.Dynamics;
import com.startapp.android.publish.ads.list3d.List3DActivity;
import com.startapp.android.publish.ads.list3d.ListItem;
import com.startapp.android.publish.ads.list3d.SimpleDynamics;
import com.startapp.android.publish.ads.list3d.b;
import com.startapp.android.publish.ads.list3d.c;
import com.startapp.android.publish.ads.list3d.d;
import com.startapp.android.publish.ads.list3d.e;
import com.startapp.android.publish.ads.list3d.f;
import com.startapp.android.publish.ads.list3d.g;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.adinformation.b;
import com.startapp.android.publish.adsCommon.d.a;
import com.startapp.android.publish.adsCommon.m;
import com.startapp.android.publish.common.model.AdPreferences;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class List3DActivity
extends Activity
implements g {
    String a;
    String b;
    List<ListItem> c;
    private c d;
    private ProgressDialog e = null;
    private WebView f = null;
    private int g;
    private com.startapp.android.publish.adsCommon.adinformation.b h;
    private Long i;
    private Long j;
    private String k;
    private long l = 0L;
    private long m = 0L;
    private BroadcastReceiver n = new BroadcastReceiver(this){
        final /* synthetic */ List3DActivity a;
        {
            this.a = list3DActivity;
        }

        public void onReceive(Context context, Intent intent) {
            this.a.finish();
        }
    };

    private void c() {
        if (this.g == this.getResources().getConfiguration().orientation) {
            Intent intent = new Intent("com.startapp.android.HideDisplayBroadcastListener");
            com.startapp.common.b.a((Context)this).a(intent);
        }
    }

    private boolean d() {
        if (this.i != null) {
            if (this.j == null) {
                return false;
            }
            return System.currentTimeMillis() - this.i > this.j;
        }
        return false;
    }

    protected com.startapp.android.publish.adsCommon.d.b a() {
        this.l = System.currentTimeMillis();
        double d2 = this.l - this.m;
        Double.isNaN((double)d2);
        return new a(String.valueOf((double)(d2 / 1000.0)), this.b);
    }

    @Override
    public void a(int n2) {
        int n3 = this.d.getFirstItemPosition();
        View view = this.d.getChildAt(n2 - n3);
        if (view == null) {
            return;
        }
        d d2 = (d)view.getTag();
        e e2 = f.a().a(this.a);
        if (e2 != null && e2.e() != null && n2 < e2.e().size()) {
            ListItem listItem = (ListItem)e2.e().get(n2);
            Bitmap bitmap = e2.a(n2, listItem.a(), listItem.i());
            d2.b().setImageBitmap(bitmap);
            d2.b().requestLayout();
            d2.a(listItem.q());
            return;
        }
    }

    protected String b() {
        if (this.c != null && !this.c.isEmpty()) {
            if (((ListItem)this.c.get(0)).d() != null) {
                return ((ListItem)this.c.get(0)).d();
            }
            return "";
        }
        return "";
    }
    public void finish() {
        com.startapp.common.a.h.a("List3DActivity", 2, "Finishing activity.");
        this.l = System.currentTimeMillis();
        com.startapp.android.publish.adsCommon.c.b((Context)this, this.b(), this.a());
        m.a().a(false);
        this.c();
        List3DActivity list3DActivity = this;
        synchronized (list3DActivity) {
            if (this.n != null) {
                com.startapp.common.b.a((Context)this).a(this.n);
                this.n = null;
            }
        }
        f.a().a(this.a).d();
        if (!AdsConstants.OVERRIDE_NETWORK.booleanValue()) {
            f.a().b(this.a);
        }
        super.finish();
    }

    public void onBackPressed() {
        f.a().a(this.a).d();
        super.onBackPressed();
    }
    public void onCreate(Bundle bundle) {
        TextView textView;
        this.overridePendingTransition(0, 0);
        super.onCreate(bundle);
        if (this.getIntent().getBooleanExtra("fullscreen", false)) {
            this.requestWindowFeature(1);
            this.getWindow().setFlags(1024, 1024);
        }
        if (bundle == null) {
            com.startapp.common.b.a((Context)this).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
            this.i = (Long)this.getIntent().getSerializableExtra("lastLoadTime");
            this.j = (Long)this.getIntent().getSerializableExtra("adCacheTtl");
        } else {
            if (bundle.containsKey("lastLoadTime")) {
                this.i = (Long)bundle.getSerializable("lastLoadTime");
            }
            if (bundle.containsKey("adCacheTtl")) {
                this.j = (Long)bundle.getSerializable("adCacheTtl");
            }
        }
        this.k = this.getIntent().getStringExtra("position");
        this.a = this.getIntent().getStringExtra("listModelUuid");
        com.startapp.common.b.a((Context)this).a(this.n, new IntentFilter("com.startapp.android.CloseAdActivity"));
        this.g = this.getResources().getConfiguration().orientation;
        i.a((Activity)this, true);
        boolean bl2 = this.getIntent().getBooleanExtra("overlay", false);
        this.requestWindowFeature(1);
        this.b = this.getIntent().getStringExtra("adTag");
        int n2 = com.startapp.android.publish.adsCommon.b.a().e();
        int n3 = com.startapp.android.publish.adsCommon.b.a().f();
        this.d = new c((Context)this, null, this.b, this.a);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n2, n3});
        this.d.setBackgroundDrawable((Drawable)gradientDrawable);
        this.c = f.a().a(this.a).e();
        if (this.c == null) {
            this.finish();
            return;
        }
        String string = "";
        if (bl2) {
            com.startapp.common.b.a((Context)this).a(this.d.p, new IntentFilter("com.startapp.android.Activity3DGetValues"));
        } else {
            this.d.a();
            this.d.setHint(true);
            this.d.setFade(true);
            string = "back";
        }
        String string2 = string;
        b b2 = new b((Context)this, this.c, string2, this.b, this.a);
        f.a().a(this.a).a((g)this, bl2 ^ true);
        this.d.setAdapter((Adapter)b2);
        this.d.setDynamics(new SimpleDynamics(0.9f, 0.6f));
        this.d.setOnItemClickListener(new AdapterView.OnItemClickListener((List3DActivity)this){
            final /* synthetic */ List3DActivity a;
            {
                this.a = list3DActivity;
            }

            private void a(String string, String string2, String string3, String string4) {
                com.startapp.android.publish.adsCommon.c.a(string, string2, string3, (Context)this.a, new com.startapp.android.publish.adsCommon.d.b(this.a.b));
                this.a.finish();
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n2, long l2) {
                String string = ((ListItem)this.a.c.get(n2)).b();
                String string2 = ((ListItem)this.a.c.get(n2)).e();
                String string3 = ((ListItem)this.a.c.get(n2)).f();
                boolean bl2 = ((ListItem)this.a.c.get(n2)).l();
                boolean bl3 = ((ListItem)this.a.c.get(n2)).m();
                String string4 = ((ListItem)this.a.c.get(n2)).p();
                String string5 = ((ListItem)this.a.c.get(n2)).o();
                Boolean bl4 = ((ListItem)this.a.c.get(n2)).s();
                f.a().a(this.a.a).a(((ListItem)this.a.c.get(n2)).c());
                if (string4 != null && !TextUtils.isEmpty((CharSequence)string4)) {
                    2.super.a(string4, string5, string, string2);
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    boolean bl5 = com.startapp.android.publish.adsCommon.c.a(this.a.getApplicationContext(), AdPreferences.Placement.INAPP_OFFER_WALL);
                    if (bl2 && !bl5) {
                        com.startapp.android.publish.adsCommon.c.a((Context)this.a, string, string2, string3, this.a.a(), com.startapp.android.publish.adsCommon.b.a().A(), bl3, bl4, new Runnable(this){
                            final /* synthetic */ 2 a;
                            {
                                this.a = var1;
                            }

                            public void run() {
                                this.a.a.finish();
                            }
                        });
                        return;
                    }
                    List3DActivity list3DActivity = this.a;
                    com.startapp.android.publish.adsCommon.d.b b2 = this.a.a();
                    boolean bl6 = bl3 && !bl5;
                    com.startapp.android.publish.adsCommon.c.a((Context)list3DActivity, string, string2, b2, bl6);
                    this.a.finish();
                    return;
                }
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout((Context)this);
        relativeLayout.setContentDescription((CharSequence)"StartApp Ad");
        relativeLayout.setId(1475346432);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout((Context)this);
        linearLayout.setOrientation(1);
        relativeLayout.addView((View)linearLayout, (ViewGroup.LayoutParams)layoutParams2);
        RelativeLayout relativeLayout2 = new RelativeLayout((Context)this);
        relativeLayout2.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -2));
        relativeLayout2.setBackgroundColor(com.startapp.android.publish.adsCommon.b.a().h().intValue());
        linearLayout.addView((View)relativeLayout2);
        TextView textView2 = new TextView((Context)this);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(13);
        textView2.setLayoutParams((ViewGroup.LayoutParams)layoutParams3);
        textView2.setPadding(0, h.a((Context)this, 2), 0, h.a((Context)this, 5));
        textView2.setTextColor(com.startapp.android.publish.adsCommon.b.a().k().intValue());
        textView2.setTextSize((float)com.startapp.android.publish.adsCommon.b.a().j().intValue());
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText((CharSequence)com.startapp.android.publish.adsCommon.b.a().i());
        textView2.setShadowLayer(2.5f, -2.0f, 2.0f, -11513776);
        h.a(textView2, com.startapp.android.publish.adsCommon.b.a().l());
        relativeLayout2.addView((View)textView2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(11);
        layoutParams4.addRule(15);
        Bitmap bitmap = com.startapp.android.publish.adsCommon.Utils.a.a((Context)this, "close_button.png");
        if (bitmap != null) {
            textView = new ImageButton((Context)this, null, 16973839);
            ((ImageButton)textView).setImageBitmap(Bitmap.createScaledBitmap((Bitmap)bitmap, (int)h.a((Context)this, 36), (int)h.a((Context)this, 36), (boolean)true));
        } else {
            TextView textView3 = textView = new TextView((Context)this);
            textView3.setText((CharSequence)"   x   ");
            textView3.setTextSize(20.0f);
        }
        textView.setLayoutParams((ViewGroup.LayoutParams)layoutParams4);
        textView.setOnClickListener(new View.OnClickListener((List3DActivity)this){
            final /* synthetic */ List3DActivity a;
            {
                this.a = list3DActivity;
            }

            public void onClick(View view) {
                com.startapp.android.publish.adsCommon.c.b((Context)this.a, this.a.b(), this.a.a());
                this.a.finish();
            }
        });
        textView.setContentDescription((CharSequence)"x");
        textView.setId(1475346435);
        relativeLayout2.addView((View)textView);
        View view = new View((Context)this);
        view.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, h.a((Context)this, 2)));
        view.setBackgroundColor(com.startapp.android.publish.adsCommon.b.a().m().intValue());
        linearLayout.addView(view);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.weight = 1.0f;
        this.d.setLayoutParams((ViewGroup.LayoutParams)layoutParams5);
        linearLayout.addView((View)this.d);
        LinearLayout linearLayout2 = new LinearLayout((Context)this);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.gravity = 80;
        linearLayout2.setLayoutParams((ViewGroup.LayoutParams)layoutParams6);
        linearLayout2.setBackgroundColor(com.startapp.android.publish.adsCommon.b.a().v().intValue());
        linearLayout2.setGravity(17);
        linearLayout.addView((View)linearLayout2);
        TextView textView4 = new TextView((Context)this);
        textView4.setTextColor(com.startapp.android.publish.adsCommon.b.a().w().intValue());
        textView4.setPadding(0, h.a((Context)this, 2), 0, h.a((Context)this, 3));
        textView4.setText((CharSequence)"Powered By ");
        textView4.setTextSize(16.0f);
        linearLayout2.addView((View)textView4);
        ImageView imageView = new ImageView((Context)this);
        imageView.setImageBitmap(Bitmap.createScaledBitmap((Bitmap)com.startapp.android.publish.adsCommon.Utils.a.a((Context)this, "logo.png"), (int)h.a((Context)this, 56), (int)h.a((Context)this, 12), (boolean)true));
        linearLayout2.addView((View)imageView);
        com.startapp.android.publish.adsCommon.adinformation.c c2 = (com.startapp.android.publish.adsCommon.adinformation.c)this.getIntent().getSerializableExtra("adInfoOverride");
        this.h = new com.startapp.android.publish.adsCommon.adinformation.b((Context)this, b.b.b, AdPreferences.Placement.INAPP_OFFER_WALL, c2);
        this.h.a(relativeLayout);
        this.setContentView((View)relativeLayout, (ViewGroup.LayoutParams)layoutParams);
        new Handler().postDelayed(new Runnable((List3DActivity)this){
            final /* synthetic */ List3DActivity a;
            {
                this.a = list3DActivity;
            }

            public void run() {
                Intent intent = new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS");
                this.a.sendBroadcast(intent);
            }
        }, 500L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onDestroy() {
        if (this.e != null) {
            ProgressDialog progressDialog;
            ProgressDialog progressDialog2 = progressDialog = this.e;
            synchronized (progressDialog2) {
                if (this.e != null) {
                    this.e.dismiss();
                    this.e = null;
                }
            }
        }
        if (this.f != null) {
            this.f.stopLoading();
        }
        i.a(this, false);
        super.onDestroy();
    }

    protected void onPause() {
        super.onPause();
        f.a().a(this.a).b();
        if (this.h != null && this.h.b()) {
            this.h.d();
        }
        this.overridePendingTransition(0, 0);
        if (this.k != null && this.k.equals((Object)"back")) {
            this.finish();
            return;
        }
    }

    protected void onResume() {
        super.onResume();
        if (this.d()) {
            com.startapp.common.a.h.a("List3DActivity", 3, "Cache TTL passed, finishing");
            this.finish();
            return;
        }
        m.a().a(true);
        this.m = System.currentTimeMillis();
        f.a().a(this.a).c();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.i != null) {
            bundle.putSerializable("lastLoadTime", (Serializable)this.i);
        }
        if (this.j != null) {
            bundle.putSerializable("adCacheTtl", (Serializable)this.j);
        }
    }
}

