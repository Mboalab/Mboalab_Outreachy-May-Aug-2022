package com.startapp.android.publish.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class AdDetails
implements Parcelable,
Serializable {
    public static final Parcelable.Creator<AdDetails> CREATOR = new Parcelable.Creator<AdDetails>(){

        public final AdDetails createFromParcel(Parcel parcel) {
            return new AdDetails(parcel);
        }

        public final AdDetails[] newArray(int n2) {
            return new AdDetails[n2];
        }
    };
    private static final long serialVersionUID = 1L;
    private String adId;
    private boolean app;
    private String appPresencePackage;
    private boolean belowMinCPM;
    private String category;
    private String clickUrl;
    private String closeUrl;
    private Long delayImpressionInSeconds;
    private String description;
    private String imageUrl;
    private String installs;
    private String intentDetails;
    private String intentPackageName;
    private int minAppVersion;
    private String packageName;
    private float rating;
    private String secondaryImageUrl;
    private Boolean sendRedirectHops;
    private boolean smartRedirect;
    private boolean startappBrowserEnabled;
    private String template;
    private String title;
    private String trackingClickUrl;
    private String trackingUrl;
    private Long ttl;

    public AdDetails() {
        this.rating = 5.0f;
        this.belowMinCPM = false;
    }

    public AdDetails(Parcel parcel) {
        int n2;
        this.rating = 5.0f;
        this.belowMinCPM = false;
        this.adId = parcel.readString();
        this.clickUrl = parcel.readString();
        this.trackingUrl = parcel.readString();
        this.trackingClickUrl = parcel.readString();
        this.closeUrl = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.imageUrl = parcel.readString();
        this.secondaryImageUrl = parcel.readString();
        this.rating = parcel.readFloat();
        int n3 = parcel.readInt();
        int n4 = parcel.readInt();
        this.smartRedirect = false;
        if (n3 == 1) {
            this.smartRedirect = true;
        }
        this.startappBrowserEnabled = true;
        if (n4 == 0) {
            this.startappBrowserEnabled = false;
        }
        this.template = parcel.readString();
        this.packageName = parcel.readString();
        this.appPresencePackage = parcel.readString();
        this.intentPackageName = parcel.readString();
        this.intentDetails = parcel.readString();
        this.minAppVersion = parcel.readInt();
        this.installs = parcel.readString();
        this.category = parcel.readString();
        int n5 = parcel.readInt();
        this.app = false;
        if (n5 == 1) {
            this.app = true;
        }
        int n6 = parcel.readInt();
        this.belowMinCPM = false;
        if (n6 == 1) {
            this.belowMinCPM = true;
        }
        this.ttl = parcel.readLong();
        if (this.ttl == -1L) {
            this.ttl = null;
        }
        this.delayImpressionInSeconds = parcel.readLong();
        if (this.delayImpressionInSeconds == -1L) {
            this.delayImpressionInSeconds = null;
        }
        if ((n2 = parcel.readInt()) == 0) {
            this.sendRedirectHops = null;
            return;
        }
        boolean bl2 = false;
        if (n2 == 1) {
            bl2 = true;
        }
        this.sendRedirectHops = bl2;
    }

    public int describeContents() {
        return 0;
    }

    public String getAdId() {
        return this.adId;
    }

    public String getAppPresencePackage() {
        return this.appPresencePackage;
    }

    public String getCategory() {
        return this.category;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public Long getDelayImpressionInSeconds() {
        return this.delayImpressionInSeconds;
    }

    public String getDescription() {
        return this.description;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getInstalls() {
        return this.installs;
    }

    public String getIntentDetails() {
        return this.intentDetails;
    }

    public String getIntentPackageName() {
        return this.intentPackageName;
    }

    public boolean getIsBelowMinCPM() {
        return this.belowMinCPM;
    }

    public int getMinAppVersion() {
        return this.minAppVersion;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public float getRating() {
        return this.rating;
    }

    public String getSecondaryImageUrl() {
        return this.secondaryImageUrl;
    }

    public String getTemplate() {
        return this.template;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackingClickUrl() {
        return this.trackingClickUrl;
    }

    public String getTrackingCloseUrl() {
        return this.closeUrl;
    }

    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public Long getTtl() {
        return this.ttl;
    }

    public boolean isApp() {
        return this.app;
    }

    public boolean isCPE() {
        return this.intentPackageName != null;
    }

    public boolean isSmartRedirect() {
        return this.smartRedirect;
    }

    public boolean isStartappBrowserEnabled() {
        return this.startappBrowserEnabled;
    }

    public void setMinAppVersion(int n2) {
        this.minAppVersion = n2;
    }

    public void setStartappBrowserEnabled(boolean bl2) {
        this.startappBrowserEnabled = bl2;
    }

    public Boolean shouldSendRedirectHops() {
        return this.sendRedirectHops;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdDetails [adId=");
        stringBuilder.append(this.adId);
        stringBuilder.append(", clickUrl=");
        stringBuilder.append(this.clickUrl);
        stringBuilder.append(", trackingUrl=");
        stringBuilder.append(this.trackingUrl);
        stringBuilder.append(", trackingClickUrl=");
        stringBuilder.append(this.trackingClickUrl);
        stringBuilder.append(", closeUrl=");
        stringBuilder.append(this.closeUrl);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        stringBuilder.append(", imageUrl=");
        stringBuilder.append(this.imageUrl);
        stringBuilder.append(", secondaryImageUrl=");
        stringBuilder.append(this.secondaryImageUrl);
        stringBuilder.append(", rating=");
        stringBuilder.append(this.rating);
        stringBuilder.append(", smartRedirect=");
        stringBuilder.append(this.smartRedirect);
        stringBuilder.append(", template=");
        stringBuilder.append(this.template);
        stringBuilder.append(", packageName=");
        stringBuilder.append(this.packageName);
        stringBuilder.append(", appPresencePackage=");
        stringBuilder.append(this.appPresencePackage);
        stringBuilder.append(", intentDetails=");
        stringBuilder.append(this.intentDetails);
        stringBuilder.append(", intentPackageName=");
        stringBuilder.append(this.intentPackageName);
        stringBuilder.append(", minAppVersion=");
        stringBuilder.append(this.minAppVersion);
        stringBuilder.append(", startappBrowserEnabled=");
        stringBuilder.append(this.startappBrowserEnabled);
        stringBuilder.append(", ttl=");
        stringBuilder.append((Object)this.ttl);
        stringBuilder.append(", app=");
        stringBuilder.append(this.app);
        stringBuilder.append(", belowMinCPM=");
        stringBuilder.append(this.belowMinCPM);
        stringBuilder.append(", installs=");
        stringBuilder.append(this.installs);
        stringBuilder.append(", category=");
        stringBuilder.append(this.category);
        stringBuilder.append(", delayImpressionInSeconds=");
        stringBuilder.append((Object)this.delayImpressionInSeconds);
        stringBuilder.append(", sendRedirectHops=");
        stringBuilder.append((Object)this.sendRedirectHops);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.adId);
        parcel.writeString(this.clickUrl);
        parcel.writeString(this.trackingUrl);
        parcel.writeString(this.trackingClickUrl);
        parcel.writeString(this.closeUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.secondaryImageUrl);
        parcel.writeFloat(this.rating);
        int n3 = this.smartRedirect;
        int n4 = this.startappBrowserEnabled;
        parcel.writeInt(n3);
        parcel.writeInt(n4);
        parcel.writeString(this.template);
        parcel.writeString(this.packageName);
        parcel.writeString(this.appPresencePackage);
        parcel.writeString(this.intentPackageName);
        parcel.writeString(this.intentDetails);
        parcel.writeInt(this.minAppVersion);
        parcel.writeString(this.installs);
        parcel.writeString(this.category);
        parcel.writeInt((int)this.app);
        parcel.writeInt((int)this.belowMinCPM);
        if (this.ttl != null) {
            parcel.writeLong(this.ttl.longValue());
        } else {
            parcel.writeLong(-1L);
        }
        if (this.delayImpressionInSeconds != null) {
            parcel.writeLong(this.delayImpressionInSeconds.longValue());
        } else {
            parcel.writeLong(-1L);
        }
        int n5 = this.sendRedirectHops == null ? 0 : (this.sendRedirectHops != false ? 1 : -1);
        parcel.writeInt(n5);
    }

}

