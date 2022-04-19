package com.startapp.android.publish.adsCommon.adinformation;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.android.publish.adsCommon.adinformation.AdInformationConfig;
import com.startapp.android.publish.adsCommon.adinformation.AdInformationPositions;
import com.startapp.android.publish.adsCommon.adinformation.b;
import com.startapp.android.publish.adsCommon.adinformation.c;
import com.startapp.android.publish.adsCommon.adinformation.e;
import com.startapp.android.publish.common.model.AdPreferences;

public class d
extends RelativeLayout {
    private ImageView a;
    private RelativeLayout b;
    private View.OnClickListener c = null;
    private AdInformationConfig d;
    private e e;
    private AdPreferences.Placement f;
    private AdInformationPositions.Position g;

    public d(Context context, b.b b2, AdPreferences.Placement placement, c c2, final View.OnClickListener onClickListener) {
        super(context);
        this.f = placement;
        this.c = new View.OnClickListener(){

            public void onClick(View view) {
                onClickListener.onClick(view);
            }
        };
        this.a(b2, c2);
    }

    protected void a(b.b b2, c c2) {
        this.d = b.a(this.getContext());
        if (this.d == null) {
            this.d = AdInformationConfig.a();
        }
        this.e = this.d.a(b2.a());
        this.g = c2 != null && c2.d() ? c2.c() : this.d.a(this.f);
        this.a = new ImageView(this.getContext());
        this.a.setContentDescription((CharSequence)"info");
        this.a.setId(1475346433);
        this.a.setImageBitmap(this.e.a(this.getContext()));
        this.b = new RelativeLayout(this.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(h.a(this.getContext(), (int)((float)this.e.b() * this.d.e())), h.a(this.getContext(), (int)((float)this.e.c() * this.d.e())));
        this.b.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(h.a(this.getContext(), this.e.b()), h.a(this.getContext(), this.e.c()));
        layoutParams2.setMargins(0, 0, 0, 0);
        this.a.setPadding(0, 0, 0, 0);
        this.g.addRules(layoutParams2);
        this.b.addView((View)this.a, (ViewGroup.LayoutParams)layoutParams2);
        this.b.setOnClickListener(this.c);
        this.addView((View)this.b, (ViewGroup.LayoutParams)layoutParams);
    }

}

