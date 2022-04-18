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
package com.startapp.android.publish.ads.video;

import com.startapp.android.publish.ads.video.tracking.VideoTrackingDetails;
import com.startapp.common.b.f;
import java.io.Serializable;

public class VideoAdDetails
implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean clickable;
    private boolean closeable;
    private boolean isVideoMuted;
    private String localVideoPath;
    @f(b="Lcom/startapp/android/publish/ads/video/VideoAdDetails$PostRollType;")
    private PostRollType postRoll;
    private boolean skippable;
    private int skippableAfter;
    @f(a=true)
    private VideoTrackingDetails videoTrackingDetails;
    private String videoUrl;

    public String getLocalVideoPath() {
        return this.localVideoPath;
    }

    public PostRollType getPostRollType() {
        return this.postRoll;
    }

    public int getSkippableAfter() {
        return this.skippableAfter;
    }

    public VideoTrackingDetails getVideoTrackingDetails() {
        return this.videoTrackingDetails;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public boolean isClickable() {
        return this.clickable;
    }

    public boolean isCloseable() {
        return this.closeable;
    }

    public boolean isSkippable() {
        return this.skippable;
    }

    public boolean isVideoMuted() {
        return this.isVideoMuted;
    }

    public void setLocalVideoPath(String string) {
        this.localVideoPath = string;
    }

    public void setVideoMuted(boolean bl) {
        this.isVideoMuted = bl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("VideoAdDetails [videoUrl=");
        stringBuilder.append(this.videoUrl);
        stringBuilder.append(", localVideoPath=");
        stringBuilder.append(this.localVideoPath);
        stringBuilder.append(", postRoll=");
        stringBuilder.append((Object)this.postRoll);
        stringBuilder.append(", closeable=");
        stringBuilder.append(this.closeable);
        stringBuilder.append(", skippable=");
        stringBuilder.append(this.skippable);
        stringBuilder.append(", skippableAfter=");
        stringBuilder.append(this.skippableAfter);
        stringBuilder.append(", videoTrackingDetails= ");
        stringBuilder.append((Object)this.videoTrackingDetails);
        stringBuilder.append(", isVideoMuted= ");
        stringBuilder.append(this.isVideoMuted);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static final class PostRollType
    extends Enum<PostRollType> {
        private static final /* synthetic */ PostRollType[] $VALUES;
        public static final /* enum */ PostRollType IMAGE = new PostRollType();
        public static final /* enum */ PostRollType LAST_FRAME = new PostRollType();
        public static final /* enum */ PostRollType NONE = new PostRollType();

        static {
            PostRollType[] arrpostRollType = new PostRollType[]{IMAGE, LAST_FRAME, NONE};
            $VALUES = arrpostRollType;
        }

        public static PostRollType valueOf(String string) {
            return (PostRollType)Enum.valueOf(PostRollType.class, (String)string);
        }

        public static PostRollType[] values() {
            return (PostRollType[])$VALUES.clone();
        }
    }

}

