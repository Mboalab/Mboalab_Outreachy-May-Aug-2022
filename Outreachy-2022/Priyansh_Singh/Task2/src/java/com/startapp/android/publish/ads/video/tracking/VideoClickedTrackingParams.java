/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.startapp.android.publish.ads.video.tracking;

import com.startapp.android.publish.ads.video.tracking.VideoTrackingParams;

public class VideoClickedTrackingParams
extends VideoTrackingParams {
    private static final long serialVersionUID = 1L;
    private ClickOrigin clickOrigin;

    public VideoClickedTrackingParams(String string, int n2, int n3, ClickOrigin clickOrigin, String string2) {
        super(string, n2, n3, string2);
        this.clickOrigin = clickOrigin;
    }

    private String getClickOriginQuery() {
        StringBuilder stringBuilder = new StringBuilder("&co=");
        stringBuilder.append(this.clickOrigin.toString());
        return stringBuilder.toString();
    }

    @Override
    public String getQueryString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getCompletedQuery());
        stringBuilder.append(this.getClickOriginQuery());
        stringBuilder.append(this.getVideoPlayingModeQuery());
        return this.getQueryString(stringBuilder.toString());
    }

}

