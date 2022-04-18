
package com.newandromo.dev338923.app614241;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
import com.newandromo.dev338923.app614241.AdaptiveGridLayoutManager;
import com.newandromo.dev338923.app614241.AndromoActivity;
import com.newandromo.dev338923.app614241.AndromoRecyclerActivity;
import com.newandromo.dev338923.app614241.ColumnGridLayoutManager;
import com.newandromo.dev338923.app614241.am;
import com.newandromo.dev338923.app614241.ax;
import com.newandromo.dev338923.app614241.bj;
import com.newandromo.dev338923.app614241.br;
import com.newandromo.dev338923.app614241.bs;
import com.newandromo.dev338923.app614241.ch;

public abstract class AndromoRecyclerActivity
extends AndromoActivity {
    protected RecyclerView g;
    private RecyclerView.Adapter<bj> h;
    private RecyclerView.LayoutManager i;

    private static void addGridDecoration(RecyclerView recyclerView, int n2, float f2) {
        if (n2 == 1) {
            recyclerView.addItemDecoration((RecyclerView.ItemDecoration)new br(recyclerView.getContext(), f2));
            return;
        }
        if (n2 == 2) {
            recyclerView.addItemDecoration((RecyclerView.ItemDecoration)new ax(recyclerView.getContext()));
        }
    }

    private static void addLinearDecoration(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, int n2) {
        if (n2 == 2) {
            recyclerView.addItemDecoration((RecyclerView.ItemDecoration)new DividerItemDecoration(recyclerView.getContext(), linearLayoutManager.getOrientation()));
        }
    }

    protected abstract RecyclerView.Adapter<bj> createAdapter();

    protected abstract float getDecorationSize();

    protected abstract int getDecorationType();

    protected abstract int getLayoutColumns();

    protected abstract boolean getLayoutMatchNaturalSpanSize();

    protected abstract float getLayoutMaxSpanSize();

    protected abstract int getLayoutMaxSpansLandscape();

    protected abstract int getLayoutMaxSpansPortrait();

    protected abstract float getLayoutMinSpanSize();

    protected abstract int getLayoutMinSpans();

    protected abstract int getLayoutStyle();

    protected int getRecyclerViewId() {
        return 2131296453;
    }

    public void onActivityReenter(int n2, Intent intent) {
        super.onActivityReenter(n2, intent);
        if (this.a) {
            this.supportPostponeEnterTransition();
            this.g.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener((AndromoRecyclerActivity)this){
                final AndromoRecyclerActivity a;
                {
                    this.a = andromoRecyclerActivity;
                }

                public final boolean onPreDraw() {
                    this.a.g.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
                    this.a.supportStartPostponedEnterTransition();
                    return true;
                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        if (this.g != null) {
            this.g.stopScroll();
        }
        super.onBackPressed();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = (RecyclerView)this.findViewById(this.getRecyclerViewId());
        this.g.setHasFixedSize(true);
        if (this.getLayoutStyle() == 1) {
            this.i = new ColumnGridLayoutManager((Context)this, this.getLayoutColumns());
            this.g.setLayoutManager(this.i);
            AndromoRecyclerActivity.addGridDecoration(this.g, this.getDecorationType(), this.getDecorationSize());
        } else if (this.getLayoutStyle() == 2) {
            AdaptiveGridLayoutManager adaptiveGridLayoutManager = new AdaptiveGridLayoutManager((Context)this, this.getLayoutMinSpans(), this.getLayoutMaxSpansPortrait(), this.getLayoutMaxSpansLandscape(), this.getLayoutMinSpanSize(), this.getLayoutMaxSpanSize(), this.getLayoutMatchNaturalSpanSize());
            this.i = adaptiveGridLayoutManager;
            this.g.setLayoutManager(this.i);
            AndromoRecyclerActivity.addGridDecoration(this.g, this.getDecorationType(), this.getDecorationSize());
        } else if (this.getLayoutStyle() == 0) {
            this.i = new LinearLayoutManager((Context)this);
            this.g.setLayoutManager(this.i);
            AndromoRecyclerActivity.addLinearDecoration(this.g, (LinearLayoutManager)this.i, this.getDecorationType());
        }
        this.h = this.createAdapter();
        this.g.setAdapter(this.h);
        if (!AndromoRecyclerActivity.isAutomaticBackgroundColorEnabled((Context)this) || this.usingToolbarColorsFromTheme()) {
            this.onToolbarColorsFromTheme();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (this.h instanceof ch) {
            ((ch)this.h).a();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    protected void onToolbarColorsReady(int n2, int n3) {
        if (this.h != null && this.h instanceof bs) {
            ((bs)this.h).a(n2);
        }
    }

    protected void swapCursor(Cursor cursor) {
        if (this.h instanceof am) {
            ((am)this.h).a(cursor);
        }
    }
}

