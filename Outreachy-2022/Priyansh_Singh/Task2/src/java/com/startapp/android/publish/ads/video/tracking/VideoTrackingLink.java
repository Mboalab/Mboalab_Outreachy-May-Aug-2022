/*
 *  
 * 
 * Could not load the following classes:
 *  com.startapp.common.b.f
 *  java.io.Serializable
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.startapp.android.publish.ads.video.tracking;

import com.startapp.common.b.f;
import java.io.Serializable;

public abstract class VideoTrackingLink
implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean appendReplayParameter;
    private String replayParameter;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/VideoTrackingLink$TrackingSource;")
    private TrackingSource trackingSource;
    private String trackingUrl;

    public String getReplayParameter() {
        return this.replayParameter;
    }

    public TrackingSource getTrackingSource() {
        return this.trackingSource;
    }

    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public boolean shouldAppendReplay() {
        return this.appendReplayParameter;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("trackingSource=");
        stringBuilder.append((Object)this.trackingSource);
        stringBuilder.append(", trackingUrl=");
        stringBuilder.append(this.trackingUrl);
        stringBuilder.append(", replayParameter=");
        stringBuilder.append(this.replayParameter);
        stringBuilder.append(", appendReplayParameter=");
        stringBuilder.append(this.appendReplayParameter);
        return stringBuilder.toString();
    }

    public static final class TrackingSource
    extends Enum<TrackingSource> {
        private static final /* synthetic */ TrackingSource[] $VALUES;
        public static final /* enum */ TrackingSource EXTERNAL;
        public static final /* enum */ TrackingSource STARTAPP;

        static {
            STARTAPP = new TrackingSource();
            EXTERNAL = new TrackingSource();
            TrackingSource[] arrtrackingSource = new TrackingSource[]{STARTAPP, EXTERNAL};
            $VALUES = arrtrackingSource;
        }

        public static TrackingSource valueOf(String string) {
            return (TrackingSource)Enum.valueOf(TrackingSource.class, (String)string);
        }

        public static TrackingSource[] values() {
            return (TrackingSource[])$VALUES.clone();
        }
    }

}

