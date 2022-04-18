/*
 *  
 * 
 * Could not load the following classes:
 *  com.startapp.android.publish.ads.video.tracking.AbsoluteTrackingLink
 *  com.startapp.android.publish.ads.video.tracking.ActionTrackingLink
 *  com.startapp.android.publish.ads.video.tracking.FractionTrackingLink
 *  com.startapp.common.b.f
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package com.startapp.android.publish.ads.video.tracking;

import com.startapp.android.publish.ads.video.tracking.AbsoluteTrackingLink;
import com.startapp.android.publish.ads.video.tracking.ActionTrackingLink;
import com.startapp.android.publish.ads.video.tracking.FractionTrackingLink;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingLink;
import com.startapp.common.b.f;
import java.io.Serializable;
import java.util.Arrays;

public class VideoTrackingDetails
implements Serializable {
    private static final long serialVersionUID = 1L;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/AbsoluteTrackingLink;")
    private AbsoluteTrackingLink[] absoluteTrackingUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/ActionTrackingLink;")
    private ActionTrackingLink[] creativeViewUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/FractionTrackingLink;")
    private FractionTrackingLink[] fractionTrackingUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/ActionTrackingLink;")
    private ActionTrackingLink[] impressionUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/ActionTrackingLink;")
    private ActionTrackingLink[] inlineErrorTrackingUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/ActionTrackingLink;")
    private ActionTrackingLink[] soundMuteUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/ActionTrackingLink;")
    private ActionTrackingLink[] soundUnmuteUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/ActionTrackingLink;")
    private ActionTrackingLink[] videoClickTrackingUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/ActionTrackingLink;")
    private ActionTrackingLink[] videoClosedUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/ActionTrackingLink;")
    private ActionTrackingLink[] videoPausedUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/ActionTrackingLink;")
    private ActionTrackingLink[] videoPostRollClosedUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/ActionTrackingLink;")
    private ActionTrackingLink[] videoPostRollImpressionUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/ActionTrackingLink;")
    private ActionTrackingLink[] videoResumedUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/ActionTrackingLink;")
    private ActionTrackingLink[] videoRewardedUrls;
    @f(b="Lcom/startapp/android/publish/ads/video/tracking/ActionTrackingLink;")
    private ActionTrackingLink[] videoSkippedUrls;

    private String printTrackingLinks(VideoTrackingLink[] arrvideoTrackingLink) {
        if (arrvideoTrackingLink != null) {
            return Arrays.toString((Object[])arrvideoTrackingLink);
        }
        return "";
    }

    public AbsoluteTrackingLink[] getAbsoluteTrackingUrls() {
        return this.absoluteTrackingUrls;
    }

    public ActionTrackingLink[] getCreativeViewUrls() {
        return this.creativeViewUrls;
    }

    public FractionTrackingLink[] getFractionTrackingUrls() {
        return this.fractionTrackingUrls;
    }

    public ActionTrackingLink[] getImpressionUrls() {
        return this.impressionUrls;
    }

    public ActionTrackingLink[] getInlineErrorTrackingUrls() {
        return this.inlineErrorTrackingUrls;
    }

    public ActionTrackingLink[] getSoundMuteUrls() {
        return this.soundMuteUrls;
    }

    public ActionTrackingLink[] getSoundUnmuteUrls() {
        return this.soundUnmuteUrls;
    }

    public ActionTrackingLink[] getVideoClickTrackingUrls() {
        return this.videoClickTrackingUrls;
    }

    public ActionTrackingLink[] getVideoClosedUrls() {
        return this.videoClosedUrls;
    }

    public ActionTrackingLink[] getVideoPausedUrls() {
        return this.videoPausedUrls;
    }

    public ActionTrackingLink[] getVideoPostRollClosedUrls() {
        return this.videoPostRollClosedUrls;
    }

    public ActionTrackingLink[] getVideoPostRollImpressionUrls() {
        return this.videoPostRollImpressionUrls;
    }

    public ActionTrackingLink[] getVideoResumedUrls() {
        return this.videoResumedUrls;
    }

    public ActionTrackingLink[] getVideoRewardedUrls() {
        return this.videoRewardedUrls;
    }

    public ActionTrackingLink[] getVideoSkippedUrls() {
        return this.videoSkippedUrls;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("VideoTrackingDetails [fractionTrackingUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.fractionTrackingUrls));
        stringBuilder.append(", absoluteTrackingUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.absoluteTrackingUrls));
        stringBuilder.append(", impressionUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.impressionUrls));
        stringBuilder.append(", creativeViewUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.creativeViewUrls));
        stringBuilder.append(", soundMuteUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.soundMuteUrls));
        stringBuilder.append(", soundUnmuteUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.soundUnmuteUrls));
        stringBuilder.append(", videoPausedUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.videoPausedUrls));
        stringBuilder.append(", videoResumedUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.videoResumedUrls));
        stringBuilder.append(", videoSkippedUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.videoSkippedUrls));
        stringBuilder.append(", videoClosedUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.videoClosedUrls));
        stringBuilder.append(", videoPostRollImpressionUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.videoPostRollImpressionUrls));
        stringBuilder.append(", videoPostRollClosedUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.videoPostRollClosedUrls));
        stringBuilder.append(", videoRewardedUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.videoRewardedUrls));
        stringBuilder.append(", videoClickTrackingUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.videoClickTrackingUrls));
        stringBuilder.append(", inlineErrorTrackingUrls=");
        stringBuilder.append(this.printTrackingLinks((VideoTrackingLink[])this.inlineErrorTrackingUrls));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

