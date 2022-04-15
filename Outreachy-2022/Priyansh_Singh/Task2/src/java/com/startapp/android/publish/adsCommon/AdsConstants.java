/*
 *  
 * 
 * Could not load the following classes:
 *  com.startapp.android.publish.common.metaData.MetaData
 *  java.lang.Boolean
 *  java.lang.Enum
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.startapp.android.publish.adsCommon;

import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.common.metaData.MetaData;

public class AdsConstants {
    public static final int AD_INFORMATION_EXTENDED_ID = 1475346434;
    public static final int AD_INFORMATION_ID = 1475346433;
    public static final Boolean FORCE_NATIVE_VIDEO_PLAYER;
    public static final int LIST_3D_CLOSE_BUTTON_ID = 1475346435;
    public static final String OVERRIDE_HOST;
    public static final Boolean OVERRIDE_NETWORK;
    public static final int SPLASH_NATIVE_MAIN_LAYOUT_ID = 1475346437;
    public static final int STARTAPP_AD_MAIN_LAYOUT_ID = 1475346432;
    public static final Boolean VIDEO_DEBUG;
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final Boolean g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String[] k;
    public static final String[] l;

    static {
        a = new String(new byte[]{103, 101, 116});
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.append(new String(new byte[]{97, 100, 115}));
        b = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(a);
        stringBuilder2.append(new String(new byte[]{104, 116, 109, 108, 97, 100}));
        c = stringBuilder2.toString();
        d = new String(new byte[]{116, 114, 97, 99, 107, 100, 111, 119, 110, 108, 111, 97, 100});
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(a);
        stringBuilder3.append(new String(new byte[]{97, 100, 115, 109, 101, 116, 97, 100, 97, 116, 97}));
        e = stringBuilder3.toString();
        f = new String(new byte[]{104, 116, 116, 112, 115, 58, 47, 47, 105, 109, 112, 46, 115, 116, 97, 114, 116, 97, 112, 112, 115, 101, 114, 118, 105, 99, 101, 46, 99, 111, 109, 47, 116, 114, 97, 99, 107, 105, 110, 103, 47, 97, 100, 73, 109, 112, 114, 101, 115, 115, 105, 111, 110});
        OVERRIDE_HOST = null;
        OVERRIDE_NETWORK = Boolean.FALSE;
        g = Boolean.FALSE;
        VIDEO_DEBUG = Boolean.FALSE;
        FORCE_NATIVE_VIDEO_PLAYER = Boolean.FALSE;
        h = i.b();
        i = i.c();
        j = i.d();
        k = new String[]{"back_", "back_dark", "browser_icon_dark", "forward_", "forward_dark", "x_dark"};
        l = new String[]{"empty_star", "filled_star", "half_star"};
    }

    public static Boolean a() {
        return VIDEO_DEBUG;
    }

    public static String a(ApiType apiType) {
        String string;
        String string2;
        switch (1.a[apiType.ordinal()]) {
            default: {
                string = null;
                string2 = null;
                break;
            }
            case 4: {
                string = d;
                string2 = MetaData.getInstance().getAdPlatformHost();
                break;
            }
            case 3: {
                string = e;
                string2 = MetaData.getInstance().getMetaDataHost();
                break;
            }
            case 2: {
                string = b;
                string2 = MetaData.getInstance().getAdPlatformHost();
                break;
            }
            case 1: {
                string = c;
                string2 = MetaData.getInstance().getAdPlatformHost();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static final class ApiType
    extends Enum<ApiType> {
        private static final /* synthetic */ ApiType[] $VALUES;
        public static final /* enum */ ApiType DOWNLOAD;
        public static final /* enum */ ApiType HTML;
        public static final /* enum */ ApiType JSON;
        public static final /* enum */ ApiType METADATA;

        static {
            HTML = new ApiType();
            JSON = new ApiType();
            METADATA = new ApiType();
            DOWNLOAD = new ApiType();
            ApiType[] arrapiType = new ApiType[]{HTML, JSON, METADATA, DOWNLOAD};
            $VALUES = arrapiType;
        }

        public static ApiType valueOf(String string) {
            return (ApiType)Enum.valueOf(ApiType.class, (String)string);
        }

        public static ApiType[] values() {
            return (ApiType[])$VALUES.clone();
        }
    }

}

