/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package com.startapp.android.publish.ads.video.tracking;

import com.startapp.android.publish.ads.video.tracking.VideoTrackingParams;

public class VideoProgressTrackingParams
extends VideoTrackingParams {
    private static final long serialVersionUID = 1L;

    public VideoProgressTrackingParams(String string, int n2, int n3, String string2) {
        super(string, n2, n3, string2);
    }

    @Override
    protected String getCompletedQuery() {
        return "";
    }
}

