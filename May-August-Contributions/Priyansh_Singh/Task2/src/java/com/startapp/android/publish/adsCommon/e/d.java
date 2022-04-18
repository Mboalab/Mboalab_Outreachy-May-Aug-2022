/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.startapp.android.publish.adsCommon.e;

public final class d
extends Enum<d> {
    public static final /* enum */ d a = new d("failed_smart_redirect");
    public static final /* enum */ d b = new d("exception");
    public static final /* enum */ d c = new d("periodic");
    public static final /* enum */ d d = new d("general");
    public static final /* enum */ d e = new d("wrong_package_reached");
    public static final /* enum */ d f = new d("video_media_player_error");
    public static final /* enum */ d g = new d("failed_extracting_dparams");
    public static final /* enum */ d h = new d("failed_smart_redirect_hop_info");
    public static final /* enum */ d i = new d("success_smart_redirect_hop_info");
    public static final /* enum */ d j = new d("user_consent");
    private static final /* synthetic */ d[] k;
    private String value;

    static {
        d[] arrd = new d[]{a, b, c, d, e, f, g, h, i, j};
        k = arrd;
    }

    private d(String string2) {
        this.value = string2;
    }

    public static d valueOf(String string) {
        return (d)Enum.valueOf(d.class, (String)string);
    }

    public static d[] values() {
        return (d[])k.clone();
    }

    public final String a() {
        return this.value;
    }
}

