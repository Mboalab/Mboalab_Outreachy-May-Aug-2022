/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.databinding.ViewDataBinding
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Bundle
 *  android.support.constraint.ConstraintLayout
 *  android.support.v4.f.j
 *  android.support.v4.view.r
 *  android.support.v7.app.AppCompatActivity
 *  android.support.v7.widget.RecyclerView
 *  android.support.v7.widget.RecyclerView$Adapter
 *  android.support.v7.widget.Toolbar
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.newandromo.dev338923.app614241;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.databinding.ViewDataBinding;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.f.j;
import android.support.v4.view.r;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.newandromo.dev338923.app614241.AndromoActivity;
import com.newandromo.dev338923.app614241.DashboardActivity;
import com.newandromo.dev338923.app614241.a.b;
import com.newandromo.dev338923.app614241.ap;
import com.newandromo.dev338923.app614241.ay;
import com.newandromo.dev338923.app614241.bg;
import com.newandromo.dev338923.app614241.bh;
import com.newandromo.dev338923.app614241.bj;
import com.newandromo.dev338923.app614241.bm;
import com.newandromo.dev338923.app614241.cd;
import com.newandromo.dev338923.app614241.cv;
import com.newandromo.dev338923.app614241.v;
import java.util.ArrayList;

public class Dashboard_000
extends DashboardActivity
implements bh,
bm {
    private static final boolean k = true;
    private static AndromoActivity.b l = new Object(){
        private boolean a;
        private boolean b;

        public final boolean a(AppCompatActivity appCompatActivity, String string) {
            block2 : {
                boolean bl2;
                block4 : {
                    block3 : {
                        if (this.b) break block2;
                        if (!"none".equals((Object)string)) break block3;
                        boolean bl3 = v.a((Activity)appCompatActivity) != null;
                        bl2 = false;
                        if (!bl3) break block4;
                    }
                    bl2 = true;
                }
                this.a = bl2;
                this.b = true;
            }
            return this.a;
        }
    };
    private static ay m;
    private boolean i = true;
    private boolean j = true;

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, Dashboard_000.class);
        intent.addFlags(67108864);
        return intent;
    }

    private void unbindDrawables(View view) {
        if (view != null) {
            if (view.getBackground() != null) {
                view.getBackground().setCallback(null);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup;
                for (int i2 = 0; i2 < (viewGroup = (ViewGroup)view).getChildCount(); ++i2) {
                    Dashboard_000.super.unbindDrawables(viewGroup.getChildAt(i2));
                }
                viewGroup.removeAllViews();
            }
        }
    }

    protected ap createAdapter() {
        return new ap((Context)this, this, "16:9");
    }

    @Override
    protected String getActivityTitleForAnalytics() {
        return this.getString(2131558420);
    }

    @Override
    protected String getActivityTypeForAnalytics() {
        return "Dashboard";
    }

    @Override
    protected int getBackgroundImageDrawableId() {
        return 0;
    }

    @Override
    protected boolean getBackgroundImageEnabled() {
        return false;
    }

    public b getBinding(ViewDataBinding viewDataBinding) throws ClassCastException {
        return (b)((Object)b.class.cast((Object)viewDataBinding));
    }

    @Override
    public String[] getClassNamesArray(Context context) {
        return context.getResources().getStringArray(2130903040);
    }

    @Override
    protected float getDecorationSize() {
        return 4.0f;
    }

    @Override
    protected int getDecorationType() {
        return 1;
    }

    @Override
    protected boolean getHandleCustomWindowColor() {
        return false;
    }

    public Class<b> getItemBindingClass() {
        return b.class;
    }

    @Override
    public bg getItemBindingUtils() {
        if (m == null) {
            m = new ay();
        }
        return m;
    }

    @Override
    protected int getLayoutColumns() {
        return 2;
    }

    @Override
    protected boolean getLayoutMatchNaturalSpanSize() {
        return true;
    }

    @Override
    protected float getLayoutMaxSpanSize() {
        return 0.0f;
    }

    @Override
    protected int getLayoutMaxSpansLandscape() {
        return 5;
    }

    @Override
    protected int getLayoutMaxSpansPortrait() {
        return 4;
    }

    @Override
    protected float getLayoutMinSpanSize() {
        return 180.0f;
    }

    @Override
    protected int getLayoutMinSpans() {
        return 4;
    }

    @Override
    protected int getLayoutStyle() {
        return 1;
    }

    @Override
    public String[] getParentClassNamesArray() {
        return this.getResources().getStringArray(2130903040);
    }

    @Override
    protected boolean getShowAdsOnDashboard() {
        return true;
    }

    @Override
    protected boolean isDetailActivity() {
        return false;
    }

    @Override
    protected boolean isHiddenActivity() {
        return false;
    }

    @Override
    protected boolean isParentReachable() {
        return !this.isRootDashboard() && l.a(this, "material");
    }

    @Override
    protected boolean isRootDashboard() {
        return k;
    }

    @Override
    protected boolean isShareActionEnabled() {
        return true;
    }

    @Override
    protected boolean isToolbarEnabled() {
        return true;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setToolbarTitle(2131558420);
    }

    public void onItemClick(View view, int n2, long l2, ViewDataBinding viewDataBinding) {
        this.getResources().getStringArray(2130903045);
        String[] arrstring = this.getResources().getStringArray(2130903040);
        if (n2 < arrstring.length) {
            String string = arrstring[n2];
            if (this.a) {
                ImageView imageView;
                int n3 = cv.e((Context)cv.b((Context)this, string), 2130968637);
                boolean bl2 = true;
                switch (n3) {
                    default: {
                        bl2 = false;
                    }
                    case 2131427358: 
                    case 2131427419: 
                }
                b b2 = (b)viewDataBinding;
                ConstraintLayout constraintLayout = b2.g;
                if (constraintLayout != null) {
                    r.a((View)constraintLayout, (String)"item_root_".concat(String.valueOf((long)l2)));
                }
                if ((imageView = b2.f) != null) {
                    r.a((View)imageView, (String)"item_image_".concat(String.valueOf((long)l2)));
                }
                View view2 = this.findViewById(16908335);
                View view3 = this.findViewById(16908336);
                ArrayList arrayList = new ArrayList(8);
                if (imageView != null) {
                    if (!(imageView.getDrawable() instanceof ColorDrawable) && !bl2) {
                        arrayList.add((Object)j.a((Object)imageView, (Object)"activity_image"));
                    } else {
                        arrayList.add((Object)j.a((Object)imageView, (Object)"app_bar_layout"));
                    }
                }
                arrayList.add((Object)j.a((Object)view2, (Object)"android:status:background"));
                arrayList.add((Object)j.a((Object)view3, (Object)"android:navigation:background"));
                arrayList.add((Object)j.a((Object)this.b, (Object)"toolbar"));
                String string2 = arrstring[n2];
                arrayList.toArray((Object[])new j[arrayList.size()]);
                v.a((Activity)this, string2);
            } else {
                v.a((Activity)this, arrstring[n2]);
            }
            cd.k = false;
            cd.j = 0;
        }
    }

    @Override
    public void onItemClick(View view, bj bj2) {
        this.onItemClick(view, bj2.getAdapterPosition(), bj2.getItemId(), bj2.a);
    }

    @Override
    protected void setContentView() {
        this.setContentView(2131427380);
    }
}

