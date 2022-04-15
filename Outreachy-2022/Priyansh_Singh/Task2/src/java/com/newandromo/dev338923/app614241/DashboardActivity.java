/*
 *  
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.support.v7.app.ActionBar
 *  android.support.v7.app.AppCompatActivity
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.newandromo.dev338923.app614241;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.newandromo.dev338923.app614241.AndromoRecyclerActivity;
import com.newandromo.dev338923.app614241.b;
import com.newandromo.dev338923.app614241.ba;
import com.newandromo.dev338923.app614241.bb;
import com.newandromo.dev338923.app614241.f;

public abstract class DashboardActivity
extends AndromoRecyclerActivity {
    int h = -1;
    private ImageView i;

    protected int getBackgroundImageDrawableId() {
        return 0;
    }

    protected abstract boolean getBackgroundImageEnabled();

    protected abstract boolean getShowAdsOnDashboard();

    @Override
    protected boolean isDetailActivity() {
        return false;
    }

    @Override
    protected boolean isHamburgerEnabled() {
        if (this.isRootDashboard()) {
            return true;
        }
        return super.isHamburgerEnabled();
    }

    protected boolean isHiddenActivity() {
        return false;
    }

    protected abstract boolean isRootDashboard();

    protected boolean isShareActionEnabled() {
        return true;
    }

    @Override
    protected boolean isToolbarEnabled() {
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.isRootDashboard()) {
            ActionBar actionBar = this.getSupportActionBar();
            if (actionBar != null) {
                actionBar.c(false);
            }
        } else {
            int n2 = this.h;
            int n3 = -1;
            if (n2 == n3 && !this.isHiddenActivity()) {
                String[] arrstring = this.getParentClassNamesArray();
                String string = this.getClass().getName();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.getPackageName());
                stringBuilder.append(".");
                String string2 = stringBuilder.toString();
                int n4 = arrstring.length;
                for (int i2 = 0; i2 < n4; ++i2) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string2);
                    stringBuilder2.append(arrstring[i2]);
                    if (!string.equals((Object)stringBuilder2.toString())) continue;
                    n3 = i2;
                    break;
                }
                this.h = n3;
            }
        }
        if (this.getBackgroundImageEnabled() && this.getBackgroundImageDrawableId() != 0) {
            this.i = (ImageView)this.findViewById(2131296309);
            if (this.i != null) {
                Resources resources = this.getResources();
                int n5 = this.getBackgroundImageDrawableId();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource((Resources)resources, (int)n5, (BitmapFactory.Options)options);
                options.inSampleSize = ba.a(options, 1024, 1024);
                options.inJustDecodeBounds = false;
                Bitmap bitmap = BitmapFactory.decodeResource((Resources)resources, (int)n5, (BitmapFactory.Options)options);
                if (bitmap != null) {
                    this.i.setImageBitmap(bitmap);
                }
            }
        }
        if (this.getShowAdsOnDashboard()) {
            f.a((Activity)this, (ViewGroup)((LinearLayout)this.findViewById(2131296332)));
        }
        f.b();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItem;
        MenuInflater menuInflater = this.getMenuInflater();
        if (menuInflater != null) {
            menuInflater.inflate(2131492865, menu);
        }
        if (this.isShareActionEnabled() && (menuItem = menu.add(0, 2131296483, 0, 2131558704)) != null) {
            menuItem.setShowAsAction(2);
            if (menuItem != null) {
                menuItem.setShowAsAction(2);
                menuItem.setIcon(2131230864);
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onDelayedAdLoad() {
        super.onDelayedAdLoad();
        if (this.getShowAdsOnDashboard()) {
            f.a((Activity)this, (ViewGroup)((LinearLayout)this.findViewById(2131296332)));
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (this.i != null) {
            this.i.setImageDrawable(null);
            this.i.setBackgroundDrawable(null);
            this.i = null;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131296483) {
            if (!b.a((AppCompatActivity)this, menuItem)) {
                return super.onOptionsItemSelected(menuItem);
            }
            return true;
        }
        this.startActivity(bb.a((Context)this));
        return true;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    void setToolbarTitle(int n2) {
        if (this.isRootDashboard()) {
            super.setToolbarTitle(2131558527);
            return;
        }
        super.setToolbarTitle(n2);
    }

    @Override
    void setToolbarTitle(CharSequence charSequence) {
        if (this.isRootDashboard()) {
            super.setToolbarTitle(2131558527);
            return;
        }
        super.setToolbarTitle(charSequence);
    }
}

