package com.newandromo.dev338923.app614241;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.databinding.ViewDataBinding;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.d.b;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.f.b.i;
import com.bumptech.glide.g;
import com.bumptech.glide.h;
import com.bumptech.glide.load.c.l;
import com.bumptech.glide.load.c.o;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.resource.bitmap.p;
import com.newandromo.dev338923.app614241.AndromoActivity;
import com.newandromo.dev338923.app614241.AndromoApplication;
import com.newandromo.dev338923.app614241.MaxTextureSizeView;
import com.newandromo.dev338923.app614241.ae;
import com.newandromo.dev338923.app614241.ai;
import com.newandromo.dev338923.app614241.aj;
import com.newandromo.dev338923.app614241.ak;
import com.newandromo.dev338923.app614241.au;
import com.newandromo.dev338923.app614241.ba;
import com.newandromo.dev338923.app614241.bf;
import com.newandromo.dev338923.app614241.bg;
import com.newandromo.dev338923.app614241.bn;
import com.newandromo.dev338923.app614241.bv;
import com.newandromo.dev338923.app614241.bw;
import com.newandromo.dev338923.app614241.bx;
import com.newandromo.dev338923.app614241.by;
import com.newandromo.dev338923.app614241.ca;
import com.newandromo.dev338923.app614241.cc;
import com.newandromo.dev338923.app614241.cd;
import com.newandromo.dev338923.app614241.ci;
import com.newandromo.dev338923.app614241.cu;
import com.newandromo.dev338923.app614241.cv;
import com.newandromo.dev338923.app614241.cx;
import com.newandromo.dev338923.app614241.f;
import com.newandromo.dev338923.app614241.t;
import com.newandromo.dev338923.app614241.v;
import java.io.InputStream;

public abstract class AndromoActivity
extends AppCompatActivity
implements NavigationView.a,
bf,
ca {
    private static long A = 1586699827550L;
    private static long B = 604800000L;
    private static AlertDialog y;
    private static boolean z;
    protected boolean a = false;
    protected Toolbar b;
    protected CollapsingToolbarLayout c;
    protected android.support.v7.d.b d;
    protected boolean e;
    protected boolean f;
    private boolean g;
    private int h = -1;
    private boolean i;
    private int j = -536870913;
    private int k = -536870913;
    private int l = -536870913;
    private int m = 0;
    private int n = 0;
    private boolean o = true;
    private boolean p = true;
    private boolean q = true;
    private DrawerLayout r;
    private android.support.v7.app.a s;
    private ai t;
    private boolean u = false;
    private c<String, InputStream, android.support.v7.d.b, android.support.v7.d.b> v;
    private cc w;
    private boolean x;

    static android.support.v7.app.a access$000(AndromoActivity andromoActivity) {
        return andromoActivity.s;
    }

    private void applyToolbarColors() {
        if (this.b != null) {
            if (this.c != null) {
                this.c.setCollapsedTitleTextColor(this.l);
                this.c.setExpandedTitleColor(this.l);
                if (cv.a((Context)this, 2130968695) != 0) {
                    this.c.setContentScrimColor(this.j);
                }
            }
            if (cv.a((Context)this, 2130969097) != 0 || this.isDetailActivity() || this.e) {
                this.b.setBackgroundColor(this.j);
            }
            this.b.setTitleTextColor(this.l);
            if (Build.VERSION.SDK_INT >= 21) {
                Window window = this.getWindow();
                if (this.r != null && this.r.getFitsSystemWindows()) {
                    int n2 = aj.b(this.j);
                    this.r.setStatusBarBackgroundColor(n2);
                    window.setStatusBarColor(0);
                } else {
                    window.addFlags(Integer.MIN_VALUE);
                    window.clearFlags(67108864);
                    window.setStatusBarColor(aj.b(this.j));
                }
            }
            cx.a(this.b, this.k);
            Toolbar toolbar = this.b;
            int n3 = this.k;
            Drawable drawable = toolbar.getNavigationIcon();
            if (drawable != null) {
                Drawable drawable2 = android.support.v4.a.a.a.e((Drawable)drawable);
                android.support.v4.a.a.a.a((Drawable)drawable2.mutate(), (int)n3);
                toolbar.setNavigationIcon(drawable2);
            }
            Toolbar toolbar2 = this.b;
            int n4 = this.k;
            Drawable drawable3 = toolbar2.getOverflowIcon();
            if (drawable3 != null) {
                Drawable drawable4 = android.support.v4.a.a.a.e((Drawable)drawable3);
                android.support.v4.a.a.a.a((Drawable)drawable4.mutate(), (int)n4);
                toolbar2.setOverflowIcon(drawable4);
            }
            if (this.s != null) {
                this.s.b.a(this.k);
            }
        }
    }

    private com.bumptech.glide.a<String> getActivityImageRequestBuilder(Context context) {
        int n2 = AndromoActivity.super.getWidthForFeatureImage();
        int n3 = AndromoActivity.super.getHeightForFeatureImage(context, n2);
        com.bumptech.glide.a a2 = com.bumptech.glide.e.b((Context)context).a(String.class).a(com.bumptech.glide.load.b.b.a);
        if (this.a) {
            return a2.e();
        }
        return a2.d().a().c().a(n2, n3);
    }

    private com.bumptech.glide.a<String> getBackgroundImageRequestBuilder(Context context) {
        com.bumptech.glide.a a2 = com.bumptech.glide.e.b((Context)context).a(String.class).a(com.bumptech.glide.load.b.b.a).b();
        if (this.a) {
            return a2.e();
        }
        return a2.a();
    }

    private static float getDarkness(android.support.v7.d.b b2, int n2) {
        if (n2 == 2) {
            return 1.0f;
        }
        if (n2 == 3) {
            return 0.0f;
        }
        return cd.b(b2);
    }

    private int getHeightForFeatureImage(Context context, int n2) {
        float f2 = cv.b(context);
        return (int)((float)n2 / f2);
    }

    private void getPaletteForActivityImage(String string, com.bumptech.glide.load.c c2) {
        if (this.w != null) {
            com.bumptech.glide.e.a((i)this.w);
        }
        this.w = (cc)AndromoActivity.super.getPaletteRequestBuilder().b(c2).b((Object)string).a((i)new cc((ca)this));
    }

    private void getPaletteForBackgroundImage(String string, com.bumptech.glide.load.c c2) {
        AndromoActivity.super.getPaletteForActivityImage(string, c2);
    }

    private c<String, InputStream, android.support.v7.d.b, android.support.v7.d.b> getPaletteRequestBuilder() {
        if (this.v == null) {
            this.v = com.bumptech.glide.e.a((FragmentActivity)this).a((l)new com.bumptech.glide.load.c.b.f((Context)this), InputStream.class).a(String.class).a(android.support.v7.d.b.class).b(com.bumptech.glide.load.b.b.a).a((com.bumptech.glide.load.f)new bw(new by())).a((com.bumptech.glide.load.b)new o()).a((e)new com.bumptech.glide.load.resource.b.c((e)new bv(new bx(), (e<InputStream, Bitmap>)new p(com.bumptech.glide.load.resource.bitmap.f.b, com.bumptech.glide.e.a((Context)this).b, com.bumptech.glide.load.a.d)))).b(256, 256).h().g();
            return this.v;
        }
        return this.v.f();
    }

    private com.bumptech.glide.load.c getSignatureForImageLoadFromResource() {
        return com.bumptech.glide.g.a.a((Context)this);
    }

    private com.bumptech.glide.load.c getSignatureForImageLoadFromUrl() {
        return com.bumptech.glide.g.b.a();
    }

    private static String getSwatchRules(int n2) {
        if (n2 == 0) {
            return "neutral, vibrant, dark vibrant, dark, muted, dark muted, light, light muted, light vibrant, if(0.7-1.0:dark dominant), if(0.0-0.2:light dominant), dominant";
        }
        if (n2 == 4) {
            return "if(0.7-1.0:dark dominant),if(0.0-0.1:light dominant),dominant";
        }
        return "if(0.7-1.0,dark:dark, dark vibrant, neutral, dark dominant, dark muted),if(0.0-0.1,light:neutral, light, light muted, light vibrant, light dominant),neutral, vibrant, dark vibrant, dark, muted, dominant";
    }

    private int getWidthForFeatureImage() {
        int n2;
        if (this.e) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            n2 = displayMetrics.heightPixels;
        } else {
            n2 = Resources.getSystem().getDisplayMetrics().widthPixels;
        }
        if (n2 > 1440) {
            n2 = 1440;
        }
        return n2;
    }

    private void handleImageFallback(ImageView imageView, a a2) {
        if (imageView == null) {
            return;
        }
        if (a2 != null) {
            boolean bl2;
            if (a2.e != 0) {
                Object object = new Object(cv.f(imageView.getContext(), a2.e), AndromoActivity.super.getSignatureForImageLoadFromResource(), 0){
                    public final String a;
                    public final com.bumptech.glide.load.c b;
                    public int c;
                    public int d;
                    public int e;
                    public int f;
                    {
                        this.a = string;
                        if (c2 == null) {
                            c2 = com.bumptech.glide.g.b.a();
                        }
                        this.b = c2;
                        this.e = n2;
                    }

                    public final String toString() {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.getClass().getName());
                        stringBuilder.append("[ url: '");
                        stringBuilder.append(this.a);
                        stringBuilder.append("', signature: '");
                        stringBuilder.append((Object)this.b);
                        stringBuilder.append("]");
                        return stringBuilder.toString();
                    }
                };
                object.c = a2.c;
                object.f = a2.f;
                object.d = a2.d;
                AndromoActivity.super.loadActivityImage(imageView, object);
                return;
            }
            if (a2.c != 0) {
                imageView.setImageDrawable((Drawable)new ColorDrawable(a2.c));
                return;
            }
            if (a2.f != 0 && (bl2 = a2.a != null && !a2.a.isEmpty())) {
                Object object = new /* invalid duplicate definition of identical inner class */;
                object.d = a2.d;
                AndromoActivity.super.loadActivityImage(imageView, object);
                return;
            }
            imageView.setImageDrawable(null);
            return;
        }
        imageView.setImageDrawable(null);
    }

    private void inflateToolbar() {
        if (this.isToolbarEnabled()) {
            ViewStub viewStub = (ViewStub)this.findViewById(2131296301);
            if (viewStub != null) {
                viewStub.setInflatedId(-1);
                viewStub.inflate();
            }
            this.b = (Toolbar)this.findViewById(2131296526);
            this.c = (CollapsingToolbarLayout)this.findViewById(2131296330);
            return;
        }
        this.b = null;
    }

    public static boolean isAutomaticBackgroundColorEnabled(Context context) {
        return cv.c(context, 2130969098) != 0;
    }

    private boolean isDrawerFirstTime() {
        boolean bl2 = this.o;
        boolean bl3 = false;
        if (bl2) {
            boolean bl4 = this.p;
            bl3 = false;
            if (bl4) {
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this);
                bl3 = false;
                if (sharedPreferences != null) {
                    boolean bl5 = sharedPreferences.getBoolean("drawer_first_time", true);
                    if (bl5) {
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putBoolean("drawer_first_time", false);
                        editor.apply();
                    }
                    bl3 = bl5;
                }
            }
        }
        return bl3;
    }

    private boolean isFeatureImageEnabled() {
        String string = cv.g((Context)this, 2130968617);
        return string != null && !"".equals((Object)string) || cv.e((Context)this, 2130968614) != 0;
    }

    private boolean isLauncher() {
        Intent intent = this.getIntent();
        return intent != null && (intent.hasCategory("android.intent.category.LAUNCHER") || "android.intent.action.MAIN".equals((Object)intent.getAction()));
    }

    private void loadActivityImage(final ImageView imageView, final a a2) {
        if (a2 == null) {
            return;
        }
        String string = a2.a;
        com.bumptech.glide.load.c c2 = a2.b;
        if (string == null) {
            return;
        }
        Context context = imageView.getContext();
        if (AndromoActivity.isAutomaticBackgroundColorEnabled(context)) {
            AndromoActivity.super.getPaletteForActivityImage(a2.a, a2.b);
        } else {
            this.onToolbarColorsFromTheme();
        }
        AndromoActivity.super.getActivityImageRequestBuilder(context).a(c2).a((Object)string).a((i)new com.bumptech.glide.f.b.b(imageView){

            public final void a(com.bumptech.glide.load.resource.a.b b2, com.bumptech.glide.f.a.c<? super com.bumptech.glide.load.resource.a.b> c2) {
                super.a(b2, c2);
                AndromoActivity.this.onActivityImageReady(b2);
            }

            public final void a(Exception exception, Drawable drawable) {
                super.a(exception, drawable);
                AndromoActivity.this.onActivityImageLoadFailed(imageView, a2);
            }
        });
    }

    private void loadActivityImageFromResource(ImageView imageView, int n2) {
        AndromoActivity.super.loadActivityImage(imageView, new /* invalid duplicate definition of identical inner class */);
    }

    private void loadActivityImageFromUrl(ImageView imageView, String string, int n2) {
        AndromoActivity.super.loadActivityImage(imageView, new /* invalid duplicate definition of identical inner class */);
    }
    private void loadBackgroundImage(final ImageView imageView, final a a2) {
        ai ai2;
        if (a2 == null) {
            return;
        }
        String string = a2.a;
        com.bumptech.glide.load.c c2 = a2.b;
        if (string == null) {
            return;
        }
        Context context = imageView.getContext();
        if (!AndromoActivity.super.isFeatureImageEnabled()) {
            if (AndromoActivity.isAutomaticBackgroundColorEnabled(context)) {
                AndromoActivity.super.getPaletteForBackgroundImage(a2.a, a2.b);
            } else {
                this.onToolbarColorsFromTheme();
            }
        }
        com.bumptech.glide.a a3 = this.f ? ((com.bumptech.glide.b)com.bumptech.glide.e.b((Context)context.getApplicationContext()).a(String.class).a((Object)string)).a(com.bumptech.glide.load.b.b.a).a(c2).a(g.d).b() : null;
        final com.bumptech.glide.a a4 = a3;
        Point point = cv.d(context);
        final int n2 = point.x / 2;
        final int n3 = point.y / 2;
        this.t = ai2 = new ai(imageView, this.getBackgroundEffect()){

            @Override
            public final void a(com.bumptech.glide.load.resource.a.b b2, com.bumptech.glide.f.a.c<? super com.bumptech.glide.load.resource.a.b> c2) {
                super.a(b2, c2);
                AndromoActivity.this.onBackgroundImageReady(b2);
                if (a4 != null && b2.getIntrinsicWidth() == n2) {
                    a4.c(n3, n2);
                }
            }

            @Override
            public final void a(Exception exception, Drawable drawable) {
                super.a(exception, drawable);
                AndromoActivity.this.t.a((ColorMatrix)null);
                AndromoActivity.this.t = null;
                AndromoActivity.this.onBackgroundImageLoadFailed(imageView, a2);
            }

            @Override
            public final void b(Drawable drawable) {
                super.b(drawable);
                AndromoActivity.this.t.a((ColorMatrix)null);
                AndromoActivity.this.t = null;
            }
        };
        AndromoActivity.super.getBackgroundImageRequestBuilder(context).a(c2).a(n2, n3).a((Object)string).a(g.b).a((i)this.t);
    }

    private void loadBackgroundImageFromResource(ImageView imageView, int n2) {
        AndromoActivity.super.loadBackgroundImage(imageView, new /* invalid duplicate definition of identical inner class */);
    }

    private void loadBackgroundImageFromUrl(ImageView imageView, String string, int n2) {
        AndromoActivity.super.loadBackgroundImage(imageView, new /* invalid duplicate definition of identical inner class */);
    }

    private void onActivityImageLoadFailed(ImageView imageView, a a2) {
        AndromoActivity.super.handleImageFallback(imageView, a2);
        cx.a(this.b, this.k);
    }

    private void onActivityImageReady(com.bumptech.glide.load.resource.a.b b2) {
        if (this.a) {
            this.supportStartPostponedEnterTransition();
        }
    }

    private void onBackgroundImageLoadFailed(ImageView imageView, a a2) {
        AndromoActivity.super.handleImageFallback(imageView, a2);
    }

    private void onBackgroundImageReady(com.bumptech.glide.load.resource.a.b b2) {
    }

    private static String resourceIdToUrlString(Context context, int n2) {
        Resources resources = context.getResources();
        try {
            StringBuilder stringBuilder = new StringBuilder("android.resource://");
            stringBuilder.append(resources.getResourcePackageName(n2));
            stringBuilder.append('/');
            stringBuilder.append(resources.getResourceTypeName(n2));
            stringBuilder.append('/');
            stringBuilder.append(resources.getResourceEntryName(n2));
            String string = stringBuilder.toString();
            return string;
        }
        catch (Resources.NotFoundException notFoundException) {
            Log.isLoggable((String)"AndromoActivity", (int)5);
            return null;
        }
    }

    private void setDrawerItemChecked(int n2) {
        NavigationView navigationView = (NavigationView)this.findViewById(2131296429);
        if (navigationView != null) {
            navigationView.setCheckedItem(n2);
        }
    }

    private void setupActivityImage() {
        ImageView imageView = (ImageView)this.findViewById(2131296368);
        if (this.a) {
            this.supportPostponeEnterTransition();
        }
        String string = cv.g((Context)this, 2130968617);
        int n2 = cv.e((Context)this, 2130968614);
        if (imageView != null) {
            if (string != null && !"".equals((Object)string)) {
                this.loadActivityImageFromUrl(imageView, string, n2);
                return;
            }
            if (n2 != 0) {
                this.loadActivityImageFromResource(imageView, n2);
                return;
            }
            this.onToolbarColorsFromTheme();
            if (this.a) {
                this.startPostponedEnterTransitionOnDecorView();
                return;
            }
        } else {
            Object object;
            if (string != null && !"".equals((Object)string)) {
                object = new /* invalid duplicate definition of identical inner class */;
            } else {
                object = null;
                if (n2 != 0) {
                    object = new /* invalid duplicate definition of identical inner class */;
                }
            }
            if (object != null) {
                if (object.a != null) {
                    if (AndromoActivity.isAutomaticBackgroundColorEnabled((Context)this)) {
                        this.getPaletteForActivityImage(object.a, object.b);
                    } else {
                        this.onToolbarColorsFromTheme();
                    }
                } else {
                    this.onToolbarColorsFromTheme();
                }
            } else {
                this.onToolbarColorsFromTheme();
            }
            if (this.a) {
                this.startPostponedEnterTransitionOnDecorView();
            }
        }
    }

    private void setupBackgroundImage() {
        ImageView imageView;
        String string = cv.g((Context)this, 2130968613);
        int n2 = cv.e((Context)this, 2130968610);
        boolean bl2 = string != null && !string.isEmpty() || n2 != 0;
        if (bl2 && (imageView = (ImageView)this.findViewById(2131296309)) != null) {
            if (string != null && !"".equals((Object)string)) {
                this.loadBackgroundImageFromUrl(imageView, string, n2);
                return;
            }
            if (n2 != 0) {
                this.loadBackgroundImageFromResource(imageView, n2);
            }
        }
    }

    private void setupNavigationDrawer() {
        this.r = (DrawerLayout)this.findViewById(2131296358);
        if (this.r != null) {
            MenuItem menuItem;
            int n2;
            View view;
            View view2;
            MenuItem menuItem2;
            NavigationView navigationView = (NavigationView)this.findViewById(2131296429);
            navigationView.setNavigationItemSelectedListener((NavigationView.a)this);
            String[] arrstring = this.getResources().getStringArray(2130903045);
            String[] arrstring2 = this.getResources().getStringArray(2130903040);
            TypedArray typedArray = this.getResources().obtainTypedArray(2130903042);
            int n3 = 0;
            boolean bl2 = false;
            do {
                int n4 = arrstring.length;
                n2 = 1;
                if (n3 >= n4) break;
                if (typedArray.getResourceId(n3, 0) != 0) {
                    bl2 = true;
                }
                ++n3;
            } while (true);
            Menu menu = navigationView.getMenu();
            if (this.q) {
                Drawable drawable;
                MenuItem menuItem3 = menu.add(2131296425, n2, 0, (CharSequence)this.getString(2131558641));
                menuItem3.setCheckable((boolean)n2);
                if (this.getClass().getSimpleName().equals((Object)"Dashboard_000")) {
                    int n5;
                    this.h = n5 = menuItem3.getItemId();
                    this.setDrawerItemChecked(n5);
                }
                if ((drawable = this.getResources().getDrawable(2131230849)) != null) {
                    menuItem3.setIcon(drawable);
                }
            }
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                Drawable drawable;
                int n6;
                int n7 = i2 + 2;
                MenuItem menuItem4 = menu.add(2131296425, n7, 0, (CharSequence)arrstring[i2]);
                menuItem4.setCheckable((boolean)n2);
                if (this.getClass().getSimpleName().equals((Object)arrstring2[i2])) {
                    this.h = n7;
                    this.setDrawerItemChecked(n7);
                }
                if ((n6 = typedArray.getResourceId(i2, 0)) == 0 || (drawable = this.getResources().getDrawable(n6)) == null) continue;
                menuItem4.setIcon(drawable);
            }
            MenuItem menuItem5 = menu.findItem(2131296394);
            if (menuItem5 != null) {
                menuItem5.setVisible(false);
            }
            if ((menuItem = menu.findItem(2131296427)) != null) {
                menuItem.setVisible(false);
            }
            String string = this.getString(2131558640).trim();
            String string2 = this.getString(2131558639).trim();
            if (string.isEmpty() && string2.isEmpty() && (view = navigationView.c.b.getChildAt(0)) != null && (view2 = view.findViewById(2131296308)) != null) {
                view2.setVisibility(8);
            }
            if ((menuItem2 = menu.findItem(2131296426)) != null) {
                Drawable drawable;
                Object[] arrobject = new Object[n2];
                arrobject[0] = this.getString(2131558527);
                menuItem2.setTitle((CharSequence)this.getString(2131558461, arrobject));
                if (bl2 && (drawable = this.getResources().getDrawable(2131230848)) != null) {
                    menuItem2.setIcon(drawable);
                }
            }
            if (this.o) {
                this.r.a(0, 8388611);
                if (this.isDrawerFirstTime() && this.p) {
                    this.r.a();
                    this.g = false;
                }
            } else {
                this.r.a(n2, 8388611);
            }
            this.s = new android.support.v7.app.a((Activity)this, this.r, this.b){

                public final void onDrawerClosed(View view) {
                    super.onDrawerClosed(view);
                    AndromoActivity.this.invalidateOptionsMenu();
                }

                public final void onDrawerOpened(View view) {
                    super.onDrawerOpened(view);
                    AndromoActivity.this.invalidateOptionsMenu();
                }

                public final void onDrawerStateChanged(int n2) {
                    super.onDrawerStateChanged(n2);
                }
            };
            this.r.setDrawerListener((DrawerLayout.c)this.s);
            this.s.h = new View.OnClickListener(this){
                final /* synthetic */ AndromoActivity a;
                {
                    this.a = andromoActivity;
                }

                public final void onClick(View view) {
                    if (!AndromoActivity.access$000((AndromoActivity)this.a).d && !v.a(this.a)) {
                        this.a.onBackPressed();
                    }
                }
            };
            android.support.v7.app.a a2 = this.s;
            if (!this.isHamburgerEnabled() || !this.o) {
                n2 = 0;
            }
            if (n2 != a2.d) {
                if (n2 != 0) {
                    android.support.v7.d.a.b b2 = a2.b;
                    int n8 = a2.a.c() ? a2.g : a2.f;
                    a2.a((Drawable)b2, n8);
                } else {
                    a2.a(a2.c, 0);
                }
                a2.d = n2;
            }
            this.s.b.a(cv.a(this.b));
        }
    }

    private void startPostponedEnterTransitionOnDecorView() {
        View view = this.getWindow().getDecorView();
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(this, view){
            final View a;
            final AndromoActivity b;
            {
                this.b = andromoActivity;
                this.a = view;
            }

            public final boolean onPreDraw() {
                this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
                this.b.supportStartPostponedEnterTransition();
                return true;
            }
        });
    }

    private void updateBackgroundEffect(int n2) {
        if (ae.a(cv.c((Context)this, 2130968611)) && this.n == 0 && this.m != n2) {
            Drawable drawable;
            if (this.t != null) {
                this.t.a(this.getBackgroundEffect());
                return;
            }
            ImageView imageView = (ImageView)this.findViewById(2131296309);
            if (imageView != null && (drawable = imageView.getDrawable()) != null) {
                ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(this.getBackgroundEffect());
                drawable.mutate();
                drawable.setColorFilter((ColorFilter)colorMatrixColorFilter);
                imageView.setImageDrawable(drawable);
                imageView.invalidateDrawable(drawable);
                imageView.invalidate();
            }
        }
    }

    protected abstract String getActivityTitleForAnalytics();

    protected abstract String getActivityTypeForAnalytics();

    protected ColorMatrix getBackgroundEffect() {
        int n2;
        int n3 = cv.c((Context)this, 2130968611);
        if (ae.a(n3)) {
            this.n = cv.a((Context)this, 2130968612);
            n2 = this.n == 0 ? (AndromoActivity.isAutomaticBackgroundColorEnabled((Context)this) && !this.usingToolbarColorsFromTheme() ? this.getToolbarBackgroundColor() : cv.a((Context)this, 2130968706)) : this.n;
        } else {
            n2 = 0;
        }
        this.m = n2;
        boolean bl2 = (n3 & 1) != 0;
        boolean bl3 = (n3 & 2) != 0;
        boolean bl4 = (n3 & 4) != 0;
        boolean bl5 = (n3 & 8) != 0;
        ColorMatrix colorMatrix = new ColorMatrix();
        if (bl4) {
            colorMatrix.setSaturation(0.0f);
        }
        if (bl2) {
            ColorMatrix colorMatrix2 = new ColorMatrix();
            colorMatrix2.setScale(0.6f, 0.6f, 0.6f, 1.0f);
            colorMatrix.postConcat(colorMatrix2);
        } else if (bl3) {
            colorMatrix.postConcat(new ColorMatrix(new float[]{0.4f, 0.0f, 0.0f, 0.0f, 153.0f, 0.0f, 0.4f, 0.0f, 0.0f, 153.0f, 0.0f, 0.0f, 0.4f, 0.0f, 153.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
        if (bl5 && n2 != 0) {
            float f2 = Color.red((int)n2);
            float f3 = Color.green((int)n2);
            float f4 = Color.blue((int)n2);
            Color.alpha((int)n2);
            float f5 = f2 / 255.0f;
            float f6 = f3 / 255.0f;
            float f7 = f4 / 255.0f;
            float f8 = 1.0f - (f5 * 0.2126f + f6 * 0.7152f + f7 * 0.0722f);
            float f9 = 1.0f - 0.5f * f8;
            float[] arrf = new float[]{f8, 0.0f, 0.0f, 0.0f, f2 * f9, 0.0f, f8, 0.0f, 0.0f, f3 * f9, 0.0f, 0.0f, f8, 0.0f, f4 * f9, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
            colorMatrix.postConcat(new ColorMatrix(arrf));
        }
        return colorMatrix;
    }

    protected int getDetailOverridesResId() {
        return cv.d((Context)this, 2130968746);
    }

    protected boolean getHandleCustomWindowColor() {
        return false;
    }

    public bg getItemBindingUtils() {
        return null;
    }

    public View getItemDateViewFromBinding(ViewDataBinding viewDataBinding) {
        if (this.getItemBindingUtils() != null) {
            
        }
        return null;
    }

    public View getItemDescriptionViewFromBinding(ViewDataBinding viewDataBinding) {
        if (this.getItemBindingUtils() != null) {
            
        }
        return null;
    }

    @Override
    public View getItemImageViewFromBinding(ViewDataBinding viewDataBinding) {
        bg bg2 = this.getItemBindingUtils();
        if (bg2 != null) {
            return bg2.a(viewDataBinding);
        }
        return null;
    }

    public View getItemRootViewFromBinding(ViewDataBinding viewDataBinding) {
        bg bg2 = this.getItemBindingUtils();
        if (bg2 != null) {
            return bg2.b(viewDataBinding);
        }
        return null;
    }

    public View getItemScrimViewFromBinding(ViewDataBinding viewDataBinding) {
        this.getItemBindingUtils();
        return null;
    }

    public View getItemSubtitleViewFromBinding(ViewDataBinding viewDataBinding) {
        if (this.getItemBindingUtils() != null) {
            
        }
        return null;
    }

    public View getItemTitleViewFromBinding(ViewDataBinding viewDataBinding) {
        if (this.getItemBindingUtils() != null) {
            
        }
        return null;
    }

    public abstract String[] getParentClassNamesArray();

    int getThemeColor(int n2) {
        return cv.a((Context)this, n2);
    }

    protected int getTitleMode() {
        return 2;
    }

    int getToolbarBackgroundColor() {
        return this.j;
    }

    int getToolbarItemsColor() {
        return this.k;
    }

    int getToolbarTextColor() {
        return this.l;
    }

    int getToolbarThemeColor(int n2) {
        return cv.a(this.b, n2);
    }

    public View getViewFromBinding(ViewDataBinding viewDataBinding, int n2) {
        bg bg2 = this.getItemBindingUtils();
        View view = null;
        if (bg2 != null) {
            view = null;
            switch (n2) {
                default: {
                    return null;
                }
                case 2131296400: {
                    return bg2.b(viewDataBinding);
                }
                case 2131296399: {
                    view = bg2.a(viewDataBinding);
                }
                case 2131296397: 
                case 2131296398: 
                case 2131296402: 
                case 2131296403: 
            }
        }
        return view;
    }

    protected abstract boolean isDetailActivity();

    protected boolean isHamburgerEnabled() {
        return !this.isParentReachable();
    }

    protected abstract boolean isParentReachable();

    protected abstract boolean isToolbarEnabled();

    public void onBackPressed() {
        if (this.r != null && this.r.c()) {
            this.r.b();
            return;
        }
        f.g((Activity)this);
        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.s != null) {
            android.support.v7.app.a a2 = this.s;
            if (!a2.e) {
                a2.c = a2.c();
            }
            a2.a();
        }
    }

    public void onCreate(Bundle bundle) {
        int n2;
        int n3;
        int n4;
        int n5;
        Bundle bundle2 = this.getIntent().getExtras();
        if (bundle2 != null && (n3 = bundle2.getInt("ThemeResourceId", 0)) != 0) {
            this.setTheme(n3);
        }
        if ((n5 = cv.d((Context)this, 2130969102)) != 0) {
            this.getTheme().applyStyle(n5, true);
        }
        this.e = this.getResources().getBoolean(2131034116);
        boolean bl2 = Settings.System.getInt((ContentResolver)this.getContentResolver(), (String)"accelerometer_rotation", (int)0) == 1;
        this.f = bl2;
        if ((this.isDetailActivity() || this.e) && (n4 = this.getDetailOverridesResId()) != 0) {
            this.getTheme().applyStyle(n4, true);
        }
        super.onCreate(bundle);
        this.setContentView();
        if (AndromoActivity.super.isLauncher()) {
            SharedPreferences sharedPreferences;
            if (!au.a((Context)this) || !au.b((Context)this)) {
                f.c(true);
            }
            if ((sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this)).contains("eu_country")) {
                boolean bl3 = sharedPreferences.getBoolean("eu_country", false);
                AndromoApplication.a(bl3);
                f.b(bl3);
                f.a(bl3 ^ true);
                if (!au.a((Context)this)) {
                    au.a((AndromoActivity)this);
                } else {
                    au.b((AndromoActivity)this);
                }
            } else {
                f.c(true);
                new ak((Context)this, new ak.a((AndromoActivity)this){
                    final /* synthetic */ AndromoActivity a;
                    {
                        this.a = andromoActivity;
                    }

                    public final void a(String string) {
                        boolean bl2;
                        block4 : {
                            block5 : {
                                bl2 = false;
                                if (string == null) break block4;
                                int n2 = string.length();
                                bl2 = false;
                                if (n2 != 2) break block4;
                                String string2 = string.toUpperCase(java.util.Locale.US);
                                if ("BE".equals((Object)string2) || "BG".equals((Object)string2) || "CZ".equals((Object)string2) || "DK".equals((Object)string2) || "DE".equals((Object)string2) || "EE".equals((Object)string2) || "IE".equals((Object)string2) || "GR".equals((Object)string2) || "ES".equals((Object)string2) || "FR".equals((Object)string2) || "HR".equals((Object)string2) || "IT".equals((Object)string2) || "CY".equals((Object)string2) || "LV".equals((Object)string2) || "LT".equals((Object)string2) || "LU".equals((Object)string2) || "HU".equals((Object)string2) || "MT".equals((Object)string2) || "NL".equals((Object)string2) || "AT".equals((Object)string2) || "PL".equals((Object)string2) || "PT".equals((Object)string2) || "RO".equals((Object)string2) || "SI".equals((Object)string2) || "SK".equals((Object)string2) || "FI".equals((Object)string2) || "SE".equals((Object)string2) || "UK".equals((Object)string2) || "GB".equals((Object)string2)) break block5;
                                boolean bl3 = "EU".equals((Object)string2);
                                bl2 = false;
                                if (!bl3) break block4;
                            }
                            bl2 = true;
                        }
                        PreferenceManager.getDefaultSharedPreferences((Context)this.a).edit().putBoolean("eu_country", bl2).apply();
                        AndromoApplication.a(bl2);
                        f.b(bl2);
                        f.a(bl2 ^ true);
                        if (!au.a((Context)this.a)) {
                            au.a(this.a);
                            return;
                        }
                        au.b(this.a);
                    }
                }).execute((Object[])new Void[0]);
            }
        }
        ci.a((Context)this);
        int n6 = cu.a();
        if (n6 > 0) {
            ba.b = n6;
            ba.a = n6;
        } else if (Build.VERSION.SDK_INT >= 14) {
            ViewGroup viewGroup;
            boolean bl4 = ba.a > 0 && ba.b > 0;
            if (!bl4 && (viewGroup = (ViewGroup)this.findViewById(16908290)) != null) {
                viewGroup.addView((View)new MaxTextureSizeView((Context)this));
            }
        } else {
            ba.a = 2048;
            ba.b = 2048;
        }
        this.setupToolbar();
        AndromoActivity.super.setupBackgroundImage();
        this.k = cv.a(this.b);
        this.l = cv.a(this.b);
        if (this.getHandleCustomWindowColor()) {
            int n7;
            if (cv.c((Context)this, 2130968660) == 2 && (n7 = cv.a((Context)this, 2130968741)) != 0) {
                this.getWindow().getDecorView().setBackgroundColor(n7);
            }
        } else if (Build.VERSION.SDK_INT <= 19 && cv.c((Context)this, 2130968660) == 2 && (n2 = cv.a((Context)this, 16842801)) != 0) {
            this.getWindow().getDecorView().setBackgroundColor(n2);
        }
        if (bundle != null) {
            this.g = bundle.getBoolean("CLOSE_NAV_DRAWER");
        }
        AndromoActivity.super.setupNavigationDrawer();
        if (this.r == null && Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(cv.a((Context)this, 2130968707));
        }
        if (t.a()) {
            if (t.c()) {
                t.e();
                t.a(this.getActivityTypeForAnalytics());
                this.u = false;
            } else {
                this.u = true;
            }
        }
        f.a((Activity)this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v.a(this.getMenuInflater(), menu, false);
        cx.a(this.b, this.k);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onCreateOptionsMenu(MenuInflater menuInflater, Menu menu, boolean bl2) {
        v.a(menuInflater, menu, bl2);
        cx.a(this.b, this.k);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDelayedAdLoad() {
        f.c(false);
        f.a((Activity)this);
        f.b((Activity)this);
    }

    public void onDestroy() {
        try {
            f.f((Activity)this);
            ci.b((Context)this);
            super.onDestroy();
            if (this.w != null) {
                this.w.a = null;
            }
            if (this.t != null) {
                this.t.a((ColorMatrix)null);
                this.t = null;
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public boolean onNavigationItemSelected(MenuItem menuItem) {
        block6 : {
            block5 : {
                AndromoActivity.super.setDrawerItemChecked(menuItem.getItemId());
                int n2 = menuItem.getItemId();
                if (n2 == 1) break block5;
                if (n2 == 2131296394) break block6;
                switch (n2) {
                    default: {
                        int n3 = -2 + menuItem.getItemId();
                        String[] arrstring = this.getResources().getStringArray(2130903040);
                        if (n3 >= 0 && n3 < arrstring.length) {
                            String string = arrstring[n3];
                            menuItem.getTitle().toString();
                            v.b((Activity)this, string);
                            this.g = true;
                            return true;
                        }
                        break block6;
                    }
                    case 2131296427: {
                        this.g = true;
                        return true;
                    }
                    case 2131296426: {
                        v.b((AppCompatActivity)this);
                        this.g = true;
                        return true;
                    }
                }
            }
            menuItem.getTitle().toString();
            v.b((Activity)this, "Dashboard_000");
            this.g = true;
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int n2 = this.r.a(8388611);
        if (this.s != null && n2 == 0) {
            boolean bl2;
            android.support.v7.app.a a2 = this.s;
            if (menuItem != null && menuItem.getItemId() == 16908332 && a2.d) {
                a2.b();
                bl2 = true;
            } else {
                bl2 = false;
            }
            if (bl2) {
                return true;
            }
        }
        menuItem.getItemId();
        if (!com.newandromo.dev338923.app614241.b.a((AppCompatActivity)this, menuItem)) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    @Override
    public void onPaletteReady(android.support.v7.d.b b2) {
        if (b2 != null) {
            this.d = b2;
            if (this.w != null) {
                com.bumptech.glide.e.a((i)this.w);
                this.w.a = null;
                this.w = null;
            }
            cd.a(b2);
            int n2 = cv.c((Context)this, 2130969098);
            if (n2 != 0) {
                b.c c2;
                int n3 = cv.c((Context)this, 2130969099);
                float f2 = AndromoActivity.getDarkness(b2, n3);
                String string = AndromoActivity.getSwatchRules(n3);
                switch (n2) {
                    default: {
                        throw new RuntimeException("unexpected toolbarBackgroundColorMode: ".concat(String.valueOf((int)n2)));
                    }
                    case 3: {
                        c2 = cd.a(cd.a(b2, string, f2), true);
                        break;
                    }
                    case 2: {
                        c2 = cd.a(cd.a(b2, string, f2), false);
                        break;
                    }
                    case 1: {
                        c2 = cd.a(b2, string, f2);
                    }
                }
                this.setToolbarColorsFromSwatch(c2);
                return;
            }
            this.onToolbarColorsFromTheme();
        }
    }

    @Override
    public void onPaletteReady(android.support.v7.d.b b2, View view, int n2) {
        this.onPaletteReady(b2);
    }

    public void onPause() {
        if (this.u && t.a()) {
            if (t.c()) {
                t.e();
                t.a(this.getActivityTypeForAnalytics());
            }
            this.u = false;
        }
        f.d((Activity)this);
        super.onPause();
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (this.s != null) {
            this.s.a();
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    public void onResume() {
        super.onResume();
        if (z && A + B < System.currentTimeMillis() && y == null) {
            y = new AlertDialog.Builder((Context)this).setCancelable(false).setMessage((CharSequence)"Trial build expired\n\nThis app has been created using Andromo App Maker in trial mode. This build has been expired. The developer of this app needs to upgrade their subscription or produce a new build.").setPositiveButton((CharSequence)"Ok", new DialogInterface.OnClickListener(this){
                final /* synthetic */ AndromoActivity a;
                {
                    this.a = andromoActivity;
                }

                public final void onClick(DialogInterface dialogInterface, int n2) {
                    android.os.Process.killProcess((int)android.os.Process.myPid());
                }
            }).show();
        }
        this.setDrawerItemChecked(this.h);
        if (this.g && this.r != null && this.r.c()) {
            this.r.b();
            this.g = false;
        }
        this.getActivityTitleForAnalytics();
        this.getActivityTypeForAnalytics();
        f.e((Activity)this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("CLOSE_NAV_DRAWER", this.g);
        }
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        f.b((Activity)this);
        this.getActivityTypeForAnalytics();
    }

    public void onStop() {
        try {
            super.onStop();
            f.c((Activity)this);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    protected final void onToolbarColorsFromTheme() {
        int n2 = cv.a(this.b, 16842806);
        int n3 = cv.a((Context)this, 2130968706);
        this.x = true;
        this.onToolbarColorsReady(n3, n2);
    }

    protected void onToolbarColorsReady(int n2, int n3) {
    }

    protected void onToolbarSwatchReady(int n2, int n3) {
        if (ae.a(cv.c((Context)this, 2130968611))) {
            Drawable drawable;
            if (this.t != null) {
                this.t.a(this.getBackgroundEffect());
                return;
            }
            ImageView imageView = (ImageView)this.findViewById(2131296309);
            if (imageView != null && (drawable = imageView.getDrawable()) != null) {
                ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(this.getBackgroundEffect());
                drawable.mutate();
                drawable.setColorFilter((ColorFilter)colorMatrixColorFilter);
                imageView.setImageDrawable(drawable);
            }
        }
    }

    void setColorizeToolbarEnabled(boolean bl2) {
        this.i = bl2;
    }

    protected abstract void setContentView();

    void setToolbarBackgroundColor(int n2) {
        this.j = n2;
    }

    void setToolbarColorsFromSwatch(b.c c2) {
        if (c2 != null) {
            int n2;
            this.x = false;
            aj.c(this.j);
            this.j = c2.a;
            aj.c(this.j);
            this.l = n2 = c2.b();
            this.k = n2;
            AndromoActivity.super.applyToolbarColors();
            AndromoActivity.super.updateBackgroundEffect(this.j);
            this.onToolbarSwatchReady(this.j, this.l);
            this.onToolbarColorsReady(this.j, this.l);
        }
    }

    void setToolbarItemsColor(int n2) {
        this.k = n2;
    }

    void setToolbarTextColor(int n2) {
        this.l = n2;
    }

    void setToolbarTitle(int n2) {
        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            switch (this.getTitleMode()) {
                default: {
                    actionBar.b(true);
                    actionBar.a(n2);
                    return;
                }
                case 1: {
                    actionBar.b(true);
                    actionBar.a(2131558527);
                    return;
                }
                case 0: 
            }
            actionBar.b(false);
            return;
        }
    }

    void setToolbarTitle(CharSequence charSequence) {
        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            switch (this.getTitleMode()) {
                default: {
                    actionBar.b(true);
                    actionBar.a(charSequence);
                    return;
                }
                case 1: {
                    actionBar.b(true);
                    actionBar.a(2131558527);
                    return;
                }
                case 0: 
            }
            actionBar.b(false);
            return;
        }
    }

    void setupToolbar() {
        ActionBar actionBar;
        this.inflateToolbar();
        if (this.b != null) {
            this.setSupportActionBar(this.b);
            this.setupActivityImage();
        }
        if ((actionBar = this.getSupportActionBar()) != null) {
            actionBar.a();
            actionBar.c(true);
            actionBar.b();
            actionBar.a(true);
            actionBar.a(false);
            actionBar.a(this.isParentReachable());
        }
    }

    void tintMenuItem(int n2, int n3) {
        Menu menu = this.b.getMenu();
        if (menu != null) {
            bn.a(menu.findItem(n2), n3);
        }
    }

    protected boolean usingToolbarColorsFromTheme() {
        return this.x;
    }

}

