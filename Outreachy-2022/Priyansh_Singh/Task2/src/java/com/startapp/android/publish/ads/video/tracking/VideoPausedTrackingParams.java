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

public class VideoPausedTrackingParams
extends VideoTrackingParams {
    private static final long serialVersionUID = 1L;
    private int pauseNum;
    private PauseOrigin pauseOrigin;

    public VideoPausedTrackingParams(String string, int n2, int n3, int n4, PauseOrigin pauseOrigin, String string2) {
        super(string, n2, n3, string2);
        this.pauseNum = n4;
        this.pauseOrigin = pauseOrigin;
    }

    private String getPauseNumQuery() {
        StringBuilder stringBuilder = new StringBuilder("&pn=");
        stringBuilder.append(this.getPauseNum());
        return stringBuilder.toString();
    }

    private String getPauseOriginQuery() {
        StringBuilder stringBuilder = new StringBuilder("&po=");
        stringBuilder.append(this.getPauseOrigin().toString());
        return stringBuilder.toString();
    }

    public int getPauseNum() {
        return this.pauseNum;
    }

    public PauseOrigin getPauseOrigin() {
        return this.pauseOrigin;
    }

    @Override
    public String getQueryString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getCompletedQuery());
        stringBuilder.append(this.getPauseOriginQuery());
        stringBuilder.append(this.getPauseNumQuery());
        stringBuilder.append(this.getVideoPlayingModeQuery());
        return this.getQueryString(stringBuilder.toString());
    }

}

