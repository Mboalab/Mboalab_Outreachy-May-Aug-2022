package com.startapp.android.publish.ads.list3d;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.android.publish.ads.list3d.ListItem;
import com.startapp.android.publish.ads.list3d.d;
import com.startapp.android.publish.ads.list3d.e;
import com.startapp.android.publish.ads.list3d.f;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.MetaDataStyle;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class b
extends ArrayAdapter<ListItem> {
    private String a;
    private String b;

    public b(Context context, List<ListItem> list, String string, String string2, String string3) {
        super(context, 0, list);
        this.a = string2;
        this.b = string3;
    }

    private long a(ListItem listItem) {
        if (listItem.r() != null) {
            return TimeUnit.SECONDS.toMillis(listItem.r().longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.getInstance().getIABDisplayImpressionDelayInSeconds());
    }

    public View getView(int n2, View view, ViewGroup viewGroup) {
        d d2;
        View view2;
        if (view == null) {
            d2 = new d(this.getContext());
            view2 = d2.a();
        } else {
            d d3 = (d)view.getTag();
            view2 = view;
            d2 = d3;
        }
        ListItem listItem = (ListItem)this.getItem(n2);
        d2.a(com.startapp.android.publish.adsCommon.b.a().a(listItem.n()));
        d2.c().setText((CharSequence)listItem.g());
        d2.d().setText((CharSequence)listItem.h());
        Bitmap bitmap = f.a().a(this.b).a(n2, listItem.a(), listItem.i());
        if (bitmap == null) {
            d2.b().setImageResource(17301651);
            d2.b().setTag((Object)"tag_error");
        } else {
            d2.b().setImageBitmap(bitmap);
            d2.b().setTag((Object)"tag_ok");
        }
        d2.e().setRating(listItem.k());
        d2.a(listItem.q());
        f.a().a(this.b).a(this.getContext(), listItem.a(), listItem.c(), new com.startapp.android.publish.adsCommon.d.b(this.a), b.super.a(listItem));
        return view2;
    }
}

