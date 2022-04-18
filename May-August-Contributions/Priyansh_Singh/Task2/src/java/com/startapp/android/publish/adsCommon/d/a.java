/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.startapp.android.publish.adsCommon.d;

import com.startapp.android.publish.adsCommon.d.b;

public class a
extends b {
    private static final long serialVersionUID = 1L;
    private final String DURATION_PARAM_NAME = "&displayDuration=";
    private String duration;

    public a(String string, String string2) {
        super(string2);
        this.duration = string;
    }

    @Override
    public String getQueryString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.getQueryString());
        stringBuilder.append("&displayDuration=");
        stringBuilder.append(this.encode(this.duration));
        return stringBuilder.toString();
    }
}

