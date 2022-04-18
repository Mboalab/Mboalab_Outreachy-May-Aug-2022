/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.startapp.android.publish.common.metaData.LocationConfig
 *  com.startapp.android.publish.common.metaData.MetaData
 *  com.startapp.common.a.a
 *  com.startapp.common.a.g
 *  java.io.Serializable
 *  java.io.UnsupportedEncodingException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URLEncoder
 *  java.util.List
 */
package com.startapp.android.publish.adsCommon.d;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Utils.g;
import com.startapp.android.publish.adsCommon.m;
import com.startapp.android.publish.common.metaData.LocationConfig;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.common.a.a;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public class b
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String adTag;
    private String clientSessionId;
    private String location;
    private String nonImpressionReason;
    private int offset;
    private String profileId;

    public b() {
        this(null);
    }

    public b(String string) {
        this.adTag = string;
        this.clientSessionId = g.d().a();
        this.profileId = MetaData.getInstance().getProfileId();
        this.offset = 0;
    }

    private String getAdTagQuery() {
        if (this.adTag != null && !this.adTag.equals((Object)"")) {
            int n2;
            int n3 = this.adTag.length();
            if (n3 < (n2 = 200)) {
                n2 = this.adTag.length();
            }
            StringBuilder stringBuilder = new StringBuilder("&adTag=");
            stringBuilder.append(this.encode(this.adTag.substring(0, n2)));
            return stringBuilder.toString();
        }
        return "";
    }

    private String getClientSessionIdQuery() {
        if (this.clientSessionId != null) {
            StringBuilder stringBuilder = new StringBuilder("&clientSessionId=");
            stringBuilder.append(this.encode(this.clientSessionId));
            return stringBuilder.toString();
        }
        return "";
    }

    private String getLocationQuery() {
        if (this.location != null && !this.location.equals((Object)"")) {
            StringBuilder stringBuilder = new StringBuilder("&locations=");
            stringBuilder.append(this.encode(a.c((String)this.location)));
            return stringBuilder.toString();
        }
        return "";
    }

    private String getNonImpressionReasonQuery() {
        if (this.nonImpressionReason != null && !this.nonImpressionReason.equals((Object)"")) {
            StringBuilder stringBuilder = new StringBuilder("&isShown=false&reason=");
            stringBuilder.append(this.encode(this.nonImpressionReason));
            return stringBuilder.toString();
        }
        return "";
    }

    private String getProfileIdQuery() {
        if (this.profileId != null) {
            StringBuilder stringBuilder = new StringBuilder("&profileId=");
            stringBuilder.append(this.encode(this.profileId));
            return stringBuilder.toString();
        }
        return "";
    }

    protected String encode(String string) {
        try {
            String string2 = URLEncoder.encode((String)string, (String)"UTF-8");
            return string2;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return "";
        }
    }

    public String getAdTag() {
        return this.adTag;
    }

    public String getClientSessionId() {
        return this.clientSessionId;
    }

    public String getNonImpressionReason() {
        return this.nonImpressionReason;
    }

    public int getOffset() {
        return this.offset;
    }

    protected String getOffsetQuery() {
        if (this.offset > 0) {
            StringBuilder stringBuilder = new StringBuilder("&offset=");
            stringBuilder.append(this.offset);
            return stringBuilder.toString();
        }
        return "";
    }

    public String getProfileId() {
        return this.profileId;
    }

    public String getQueryString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getAdTagQuery());
        stringBuilder.append(this.getClientSessionIdQuery());
        stringBuilder.append(this.getProfileIdQuery());
        stringBuilder.append(this.getOffsetQuery());
        stringBuilder.append(this.getNonImpressionReasonQuery());
        stringBuilder.append(this.getLocationQuery());
        return stringBuilder.toString();
    }

    public void setLocation(Context context) {
        try {
            m.a().h(context);
            this.location = com.startapp.common.a.g.a((List)com.startapp.common.a.g.a((Context)context, (boolean)MetaData.getInstance().getLocationConfig().isFiEnabled(), (boolean)MetaData.getInstance().getLocationConfig().isCoEnabled()));
            return;
        }
        catch (Exception exception) {
            this.location = null;
            return;
        }
    }

    public b setNonImpressionReason(String string) {
        this.nonImpressionReason = string;
        return this;
    }

    public b setOffset(int n2) {
        this.offset = n2;
        return this;
    }
}

