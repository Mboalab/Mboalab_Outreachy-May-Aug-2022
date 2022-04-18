package com.startapp.android.publish.adsCommon.adListeners;

import com.startapp.android.publish.adsCommon.Ad;

public interface AdDisplayListener {
    public void adClicked(Ad var1);

    public void adDisplayed(Ad var1);

    public void adHidden(Ad var1);

    public void adNotDisplayed(Ad var1);

    public static final class NotDisplayedReason
    extends Enum<NotDisplayedReason> {
        private static final /* synthetic */ NotDisplayedReason[] $VALUES;
        public static final /* enum */ NotDisplayedReason AD_CLOSED_TOO_QUICKLY;
        public static final /* enum */ NotDisplayedReason AD_EXPIRED;
        public static final /* enum */ NotDisplayedReason AD_NOT_READY;
        public static final /* enum */ NotDisplayedReason AD_NOT_READY_VIDEO_FALLBACK;
        public static final /* enum */ NotDisplayedReason AD_RULES;
        public static final /* enum */ NotDisplayedReason APP_IN_BACKGROUND;
        public static final /* enum */ NotDisplayedReason INTERNAL_ERROR;
        public static final /* enum */ NotDisplayedReason NETWORK_PROBLEM;
        public static final /* enum */ NotDisplayedReason SERVING_ADS_DISABLED;
        public static final /* enum */ NotDisplayedReason VIDEO_BACK;
        public static final /* enum */ NotDisplayedReason VIDEO_ERROR;

        static {
            NETWORK_PROBLEM = new NotDisplayedReason();
            AD_RULES = new NotDisplayedReason();
            AD_NOT_READY = new NotDisplayedReason();
            AD_EXPIRED = new NotDisplayedReason();
            VIDEO_BACK = new NotDisplayedReason();
            VIDEO_ERROR = new NotDisplayedReason();
            INTERNAL_ERROR = new NotDisplayedReason();
            AD_NOT_READY_VIDEO_FALLBACK = new NotDisplayedReason();
            APP_IN_BACKGROUND = new NotDisplayedReason();
            AD_CLOSED_TOO_QUICKLY = new NotDisplayedReason();
            SERVING_ADS_DISABLED = new NotDisplayedReason();
            NotDisplayedReason[] arrnotDisplayedReason = new NotDisplayedReason[]{NETWORK_PROBLEM, AD_RULES, AD_NOT_READY, AD_EXPIRED, VIDEO_BACK, VIDEO_ERROR, INTERNAL_ERROR, AD_NOT_READY_VIDEO_FALLBACK, APP_IN_BACKGROUND, AD_CLOSED_TOO_QUICKLY, SERVING_ADS_DISABLED};
            $VALUES = arrnotDisplayedReason;
        }

        public static NotDisplayedReason valueOf(String string) {
            return (NotDisplayedReason)Enum.valueOf(NotDisplayedReason.class, (String)string);
        }

        public static NotDisplayedReason[] values() {
            return (NotDisplayedReason[])$VALUES.clone();
        }
    }

}

