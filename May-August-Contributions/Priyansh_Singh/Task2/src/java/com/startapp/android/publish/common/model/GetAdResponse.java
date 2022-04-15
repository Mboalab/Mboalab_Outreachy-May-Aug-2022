package com.startapp.android.publish.common.model;

import com.startapp.android.publish.adsCommon.BaseResponse;
import com.startapp.android.publish.adsCommon.adinformation.c;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.common.b.f;
import java.util.ArrayList;
import java.util.List;

public class GetAdResponse
extends BaseResponse {
    private static final long serialVersionUID = 1L;
    @f(a=true)
    private c adInfoOverrides = c.a();
    @f(b="Ljava/util/ArrayList;", c="Lcom/startapp/android/publish/common/model/AdDetails;")
    private List<AdDetails> adsDetails = new ArrayList();
    private boolean inAppBrowser;
    @f(b="Lcom/startapp/android/publish/common/model/GetAdResponse$inAppBrowserPreLoad;")
    private inAppBrowserPreLoad inAppBrowserPreLoad;
    private String productId;
    private String publisherId;

    public c getAdInfoOverride() {
        return this.adInfoOverrides;
    }

    public List<AdDetails> getAdsDetails() {
        return this.adsDetails;
    }

    public inAppBrowserPreLoad getInAppBrowserPreLoad() {
        return this.inAppBrowserPreLoad;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPublisherId() {
        return this.publisherId;
    }

    public boolean isInAppBrowser() {
        return this.inAppBrowser;
    }

    public void setAdsDetails(List<AdDetails> list) {
        this.adsDetails = list;
    }

    public void setInAppBrowser(boolean bl2) {
        this.inAppBrowser = bl2;
    }

    public void setInAppBrowserPreLoad(inAppBrowserPreLoad inAppBrowserPreLoad2) {
        this.inAppBrowserPreLoad = inAppBrowserPreLoad2;
    }

    public void setProductId(String string) {
        this.productId = string;
    }

    public void setPublisherId(String string) {
        this.publisherId = string;
    }

    public static final class ResponseType
    extends Enum<ResponseType> {
        private static final /* synthetic */ ResponseType[] $VALUES;
        public static final /* enum */ ResponseType HTML = new ResponseType();
        public static final /* enum */ ResponseType JSON = new ResponseType();

        static {
            ResponseType[] arrresponseType = new ResponseType[]{HTML, JSON};
            $VALUES = arrresponseType;
        }

        public static ResponseType valueOf(String string) {
            return (ResponseType)Enum.valueOf(ResponseType.class, (String)string);
        }

        public static ResponseType[] values() {
            return (ResponseType[])$VALUES.clone();
        }
    }

    static final class inAppBrowserPreLoad
    extends Enum<inAppBrowserPreLoad> {
        private static final /* synthetic */ inAppBrowserPreLoad[] $VALUES;
        public static final /* enum */ inAppBrowserPreLoad CONTENT;
        public static final /* enum */ inAppBrowserPreLoad DISABLED;
        public static final /* enum */ inAppBrowserPreLoad FULL;

        static {
            DISABLED = new inAppBrowserPreLoad();
            CONTENT = new inAppBrowserPreLoad();
            FULL = new inAppBrowserPreLoad();
            inAppBrowserPreLoad[] arrinAppBrowserPreLoad = new inAppBrowserPreLoad[]{DISABLED, CONTENT, FULL};
            $VALUES = arrinAppBrowserPreLoad;
        }

        public static inAppBrowserPreLoad valueOf(String string) {
            return (inAppBrowserPreLoad)Enum.valueOf(inAppBrowserPreLoad.class, (String)string);
        }

        public static inAppBrowserPreLoad[] values() {
            return (inAppBrowserPreLoad[])$VALUES.clone();
        }
    }

}

