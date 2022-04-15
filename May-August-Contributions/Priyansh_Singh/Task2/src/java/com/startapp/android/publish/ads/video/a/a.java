/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package com.startapp.android.publish.ads.video.a;

import java.util.List;

public class a {
    private List<String> a;
    private String b;

    public a(List<String> list, String string) {
        this.a = list;
        this.b = string;
    }

    public List<String> a() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[VideoEvent: tag=");
        stringBuilder.append(this.b);
        stringBuilder.append(", fullUrls=");
        stringBuilder.append(this.a.toString());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

