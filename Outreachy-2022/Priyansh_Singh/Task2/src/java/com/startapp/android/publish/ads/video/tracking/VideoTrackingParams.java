/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.startapp.android.publish.ads.video.tracking;

import com.startapp.android.publish.adsCommon.d.b;

public class VideoTrackingParams
extends b {
    private static final String REPLAY_PARAMETER_PLACEHOLDER = "%startapp_replay_count%";
    private static final long serialVersionUID = 1L;
    private int completed;
    protected boolean internalParamsIndicator;
    private String replayParameter;
    private boolean shouldAppendOffset;
    private String videoPlayingMode;

    public VideoTrackingParams(String string, int n2, int n3, String string2) {
        super(string);
        this.setOffset(n3);
        this.completed = n2;
        this.videoPlayingMode = string2;
    }

    public int getCompleted() {
        return this.completed;
    }

    protected String getCompletedQuery() {
        StringBuilder stringBuilder = new StringBuilder("&cp=");
        stringBuilder.append(this.completed);
        return stringBuilder.toString();
    }

    public boolean getInternalTrackingParamsIndicator() {
        return this.internalParamsIndicator;
    }

    @Override
    public String getOffsetQuery() {
        if (this.shouldAppendOffset) {
            if (this.replayParameter != null) {
                return this.replayParameter.replace((CharSequence)REPLAY_PARAMETER_PLACEHOLDER, (CharSequence)new Integer(this.getOffset()).toString());
            }
            return super.getOffsetQuery();
        }
        return "";
    }

    @Override
    public String getQueryString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getCompletedQuery());
        stringBuilder.append(this.getVideoPlayingModeQuery());
        return this.getQueryString(stringBuilder.toString());
    }

    protected String getQueryString(String string) {
        if (this.internalParamsIndicator) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.getQueryString());
            stringBuilder.append(string);
            return stringBuilder.toString();
        }
        return this.getOffsetQuery();
    }

    protected String getVideoPlayingModeQuery() {
        StringBuilder stringBuilder = new StringBuilder("&vpm=");
        stringBuilder.append(this.videoPlayingMode);
        return stringBuilder.toString();
    }

    public VideoTrackingParams setInternalTrackingParamsIndicator(boolean bl2) {
        this.internalParamsIndicator = bl2;
        return this;
    }

    public VideoTrackingParams setReplayParameter(String string) {
        this.replayParameter = string;
        return this;
    }

    public VideoTrackingParams setShouldAppendOffset(boolean bl2) {
        this.shouldAppendOffset = bl2;
        return this;
    }
}

