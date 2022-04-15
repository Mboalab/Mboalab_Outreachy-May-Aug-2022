
package com.startapp.android.publish.html;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.b;
import com.startapp.android.publish.adsCommon.b.c;
import com.startapp.android.publish.adsCommon.e;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.l;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.h;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.GetAdRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class a
extends com.startapp.android.publish.adsCommon.d {
    protected GetAdRequest g;
    private Set<String> h = new HashSet();
    private List<com.startapp.android.publish.adsCommon.b.a> i = new ArrayList();
    private int j = 0;
    private boolean k;

    public a(Context context, Ad ad2, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, boolean bl2) {
        super(context, ad2, adPreferences, adEventListener, placement);
        this.k = bl2;
    }

    @Override
    public void a(Boolean bl2) {
        super.a(bl2);
        StringBuilder stringBuilder = new StringBuilder("Html onPostExecute, result=[");
        stringBuilder.append((Object)bl2);
        stringBuilder.append("]");
        com.startapp.common.a.h.a("BaseHtmlService", 4, stringBuilder.toString());
    }

    public void a(boolean bl2) {
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.b.hashCode());
        intent.putExtra("adResult", bl2);
        com.startapp.common.b.a(this.a).a(intent);
        if (bl2 && this.b != null) {
            if (this.k) {
                i.a(this.a, ((e)this.b).e(), new i.a(){

                    @Override
                    public void a() {
                        a.this.d.onReceiveAd(a.this.b);
                    }

                    @Override
                    public void a(String string) {
                        a.this.b.setErrorMessage(string);
                        a.this.d.onFailedToReceiveAd(a.this.b);
                    }
                });
                return;
            }
            if (bl2) {
                this.d.onReceiveAd(this.b);
                return;
            }
            this.d.onFailedToReceiveAd(this.b);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Html onPostExecute failed error=[");
        stringBuilder.append(this.f);
        stringBuilder.append("]");
        com.startapp.common.a.h.a("BaseHtmlService", 6, stringBuilder.toString());
    }

    protected boolean a(GetAdRequest getAdRequest) {
        return getAdRequest != null;
    }
    @Override
    public boolean a(Object object) {
        com.startapp.common.a.h.a("BaseHtmlService", 4, "Handle Html Response");
        try {
            this.i = new ArrayList();
            String string = (String)object;
            if (TextUtils.isEmpty((CharSequence)string)) {
                if (this.f != null) return false;
                if (this.g != null && this.g.isAdTypeVideo()) {
                    this.f = "Video isn't available";
                    return false;
                }
                this.f = "Empty Ad";
                return false;
            }
            List<com.startapp.android.publish.adsCommon.b.a> list = c.a(string, this.j);
            boolean bl2 = b.a().D() ? c.a(this.a, list, this.j, this.h, this.i) : false;
            if (bl2) return this.f();
            ((e)this.b).a(list);
            return this.a(string);
        }
        catch (Exception exception) {
            return false;
        }
    }

    protected boolean a(String string) {
        ((e)this.b).b(string);
        return true;
    }

    @Override
    public void b(Boolean bl2) {
        super.b(bl2);
    }

    @Override
    public Object e() {
        this.g = this.a();
        if (this.a(this.g)) {
            if (this.h.size() == 0) {
                this.h.add((Object)this.a.getPackageName());
            }
            this.g.setPackageExclude(this.h);
            if (this.j > 0) {
                this.g.setEngInclude(false);
                if (MetaData.getInstance().getSimpleTokenConfig().b(this.a)) {
                    l.b(this.a);
                }
            }
            try {
                String string = com.startapp.android.publish.adsCommon.h.a.a(this.a, AdsConstants.a(AdsConstants.ApiType.HTML), this.g, null);
                return string;
            }
            catch (com.startapp.common.e e2) {
                if (!MetaData.getInstance().getInvalidNetworkCodesInfoEvents().contains((Object)e2.a())) {
                    f.a(this.a, d.b, "BaseHtmlService.sendCommand - network failure", e2.getMessage(), "");
                }
                com.startapp.common.a.h.a("BaseHtmlService", 6, "Unable to handle GetHtmlAdService command!!!!", (Throwable)((Object)e2));
                this.f = e2.getMessage();
                return null;
            }
        }
        return null;
    }

    protected boolean f() {
        com.startapp.common.a.h.a("BaseHtmlService", 3, "At least one package is present. sending another request to AdPlatform");
        this.j = 1 + this.j;
        new com.startapp.android.publish.adsCommon.b.b(this.a, this.i).a();
        return this.d();
    }

}

