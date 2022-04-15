/*
 *  
 * 
 * Could not load the following classes:
 *  com.startapp.android.publish.ads.video.tracking.VideoTrackingParams
 *  com.startapp.common.a.a
 *  com.startapp.common.a.h
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Random
 *  java.util.concurrent.TimeUnit
 */
package com.startapp.android.publish.ads.video.a;

import com.startapp.android.publish.ads.video.tracking.VideoTrackingLink;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingParams;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.common.a.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class b {
    private VideoTrackingLink[] a;
    private VideoTrackingParams b;
    private String c;
    private int d;
    private String e = "";
    private a f;

    public b(VideoTrackingLink[] arrvideoTrackingLink, VideoTrackingParams videoTrackingParams, String string, int n2) {
        this.a = arrvideoTrackingLink;
        this.b = videoTrackingParams;
        this.c = string;
        this.d = n2;
    }

    private String a(VideoTrackingLink videoTrackingLink) {
        StringBuilder stringBuilder = new StringBuilder();
        VideoTrackingParams videoTrackingParams = b.super.b(videoTrackingLink);
        String string = videoTrackingLink.getTrackingUrl();
        stringBuilder.append(b.super.b(string));
        stringBuilder.append(videoTrackingParams.getQueryString());
        if (videoTrackingParams.getInternalTrackingParamsIndicator()) {
            stringBuilder.append(com.startapp.common.a.a.a((String)c.e(string)));
        }
        return stringBuilder.toString();
    }

    private VideoTrackingParams b(VideoTrackingLink videoTrackingLink) {
        VideoTrackingLink.TrackingSource trackingSource = videoTrackingLink.getTrackingSource();
        VideoTrackingParams videoTrackingParams = this.b;
        boolean bl = trackingSource != null && trackingSource == VideoTrackingLink.TrackingSource.STARTAPP;
        return videoTrackingParams.setInternalTrackingParamsIndicator(bl).setShouldAppendOffset(videoTrackingLink.shouldAppendReplay()).setReplayParameter(videoTrackingLink.getReplayParameter());
    }

    private String b(String string) {
        String string2 = string.replace((CharSequence)"[ASSETURI]", (CharSequence)this.c).replace((CharSequence)"[CONTENTPLAYHEAD]", (CharSequence)b.super.d()).replace((CharSequence)"[CACHEBUSTING]", (CharSequence)b.super.c());
        if (this.f != null) {
            string2 = string2.replace((CharSequence)"[ERRORCODE]", (CharSequence)this.f.toString());
        }
        return string2;
    }

    private boolean b() {
        return this.a != null && this.b != null;
    }

    private String c() {
        return new Integer(10000000 + new Random().nextInt(90000000)).toString();
    }

    private String d() {
        long l2 = TimeUnit.SECONDS.convert((long)this.d, TimeUnit.MILLISECONDS);
        long l3 = l2 % 60L;
        long l4 = l2 / 3600L;
        long l5 = l2 % 3600L / 60L;
        long l6 = this.d % 1000;
        Object[] arrobject = new Object[]{l4, l5, l3, l6};
        return String.format((String)"%02d:%02d:%02d.%03d", (Object[])arrobject);
    }

    public com.startapp.android.publish.ads.video.a.a a() {
        if (!this.b()) {
            h.a((String)"VideoEventBuilder", (int)3, (String)"Some fields have illegal values");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoTrackingLink videoTrackingLink : this.a) {
            if (videoTrackingLink.getTrackingUrl() == null) {
                h.a((String)"VideoEventBuilder", (int)5, (String)"Ignoring tracking link - tracking url is null: tracking link = ".concat(String.valueOf((Object)videoTrackingLink)));
                continue;
            }
            if (this.b.getOffset() > 0 && !videoTrackingLink.shouldAppendReplay()) {
                h.a((String)"VideoEventBuilder", (int)3, (String)"Ignoring tracking link - external replay event: tracking link = ".concat(String.valueOf((Object)videoTrackingLink)));
                continue;
            }
            arrayList.add((Object)this.a(videoTrackingLink));
        }
        return new com.startapp.android.publish.ads.video.a.a((List<String>)arrayList, this.e);
    }

    public b a(a a2) {
        this.f = a2;
        return this;
    }

    public b a(String string) {
        this.e = string;
        return this;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(400);
        public static final /* enum */ a b = new a(401);
        private static final /* synthetic */ a[] c;
        Integer code;

        static {
            a[] arra = new a[]{a, b};
            c = arra;
        }

        private a(Integer n3) {
            this.code = n3;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])c.clone();
        }

        public final String toString() {
            return this.code.toString();
        }
    }

}

