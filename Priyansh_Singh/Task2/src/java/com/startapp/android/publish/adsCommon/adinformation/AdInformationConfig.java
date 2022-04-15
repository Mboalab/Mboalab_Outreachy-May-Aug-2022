package com.startapp.android.publish.adsCommon.adinformation;

import android.content.Context;
import com.startapp.android.publish.adsCommon.adinformation.AdInformationPositions;
import com.startapp.android.publish.adsCommon.adinformation.e;
import com.startapp.android.publish.adsCommon.k;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.b.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AdInformationConfig
implements Serializable {
    private static final long serialVersionUID = 1L;
    @f(b="Ljava/util/ArrayList;", c="Lcom/startapp/android/publish/adsCommon/adinformation/e;")
    private List<e> ImageResources = new ArrayList();
    @f(b="Ljava/util/HashMap;", c="Lcom/startapp/android/publish/adsCommon/adinformation/AdInformationPositions$Position;", d="Lcom/startapp/android/publish/common/model/AdPreferences$Placement;")
    protected HashMap<AdPreferences.Placement, AdInformationPositions.Position> Positions = new HashMap();
    private transient EnumMap<ImageResourceType, e> a = new EnumMap(ImageResourceType.class);
    private String dialogUrlSecured = "https://d1byvlfiet2h9q.cloudfront.net/InApp/resources/adInformationDialog3.html";
    private boolean enabled = true;
    private String eulaUrlSecured = "https://www.com.startapp.com/policy/sdk-policy/";
    private float fatFingersFactor = 200.0f;

    private AdInformationConfig() {
    }

    public static AdInformationConfig a() {
        AdInformationConfig adInformationConfig = new AdInformationConfig();
        AdInformationConfig.a(adInformationConfig);
        return adInformationConfig;
    }

    public static void a(AdInformationConfig adInformationConfig) {
        adInformationConfig.i();
        adInformationConfig.h();
    }

    public AdInformationPositions.Position a(AdPreferences.Placement placement) {
        AdInformationPositions.Position position = (AdInformationPositions.Position)((Object)this.Positions.get((Object)placement));
        if (position == null) {
            position = AdInformationPositions.Position.BOTTOM_LEFT;
            this.Positions.put((Object)placement, (Object)position);
        }
        return position;
    }

    public e a(ImageResourceType imageResourceType) {
        return (e)this.j().get((Object)imageResourceType);
    }

    public void a(Context context, boolean bl) {
        k.b(context, "userDisabledAdInformation", bl ^ true);
    }

    protected void a(ImageResourceType imageResourceType, e e2) {
        this.j().put((Enum)imageResourceType, (Object)e2);
    }

    public boolean a(Context context) {
        return k.a(context, "userDisabledAdInformation", Boolean.FALSE) == false && this.d();
    }

    public String b() {
        if (this.eulaUrlSecured != null && !this.eulaUrlSecured.equals((Object)"")) {
            return this.eulaUrlSecured;
        }
        return "https://www.com.startapp.com/policy/sdk-policy/";
    }

    public String c() {
        if (this.a.containsKey((Object)ImageResourceType.INFO_L) && !((e)this.a.get((Object)ImageResourceType.INFO_L)).d().equals((Object)"")) {
            return ((e)this.a.get((Object)ImageResourceType.INFO_L)).d();
        }
        return "https://info.startappservice.com/InApp/resources/info_l.png";
    }

    public boolean d() {
        return this.enabled;
    }

    public float e() {
        return this.fatFingersFactor / 100.0f;
    }

    public String f() {
        if (this.dialogUrlSecured != null) {
            return this.dialogUrlSecured;
        }
        return "https://d1byvlfiet2h9q.cloudfront.net/InApp/resources/adInformationDialog3.html";
    }

    public void g() {
        for (e e2 : this.ImageResources) {
            this.a(ImageResourceType.getByName(e2.a()), e2);
            e2.e();
        }
    }

    protected void h() {
        for (ImageResourceType imageResourceType : ImageResourceType.values()) {
            if (this.j().get((Object)imageResourceType) != null) {
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder("AdInformation error in ImageResource [");
            stringBuilder.append((Object)imageResourceType);
            stringBuilder.append("] cannot be found in MetaData");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    protected void i() {
        for (ImageResourceType imageResourceType : ImageResourceType.values()) {
            e e2 = (e)this.j().get((Object)imageResourceType);
            Boolean bl = Boolean.TRUE;
            if (e2 == null) {
                e2 = e.c(imageResourceType.name());
                Iterator iterator = this.ImageResources.iterator();
                while (iterator.hasNext()) {
                    if (!ImageResourceType.getByName(((e)iterator.next()).a()).equals((Object)imageResourceType)) continue;
                    bl = Boolean.FALSE;
                    break;
                }
                this.j().put((Enum)imageResourceType, (Object)e2);
                if (bl.booleanValue()) {
                    this.ImageResources.add((Object)e2);
                }
            }
            e2.a(imageResourceType.getDefaultWidth());
            e2.b(imageResourceType.getDefaultHeight());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(imageResourceType.name().toLowerCase());
            stringBuilder.append(".png");
            e2.a(stringBuilder.toString());
        }
    }

    public EnumMap<ImageResourceType, e> j() {
        return this.a;
    }

    public void k() {
        this.a = new EnumMap(ImageResourceType.class);
    }

    public static final class ImageResourceType
    extends Enum<ImageResourceType> {
        private static final /* synthetic */ ImageResourceType[] $VALUES;
        public static final /* enum */ ImageResourceType INFO_EX_L;
        public static final /* enum */ ImageResourceType INFO_EX_S;
        public static final /* enum */ ImageResourceType INFO_L;
        public static final /* enum */ ImageResourceType INFO_S;
        private int height;
        private int width;

        static {
            INFO_S = new ImageResourceType(17, 14);
            INFO_EX_S = new ImageResourceType(88, 14);
            INFO_L = new ImageResourceType(25, 21);
            INFO_EX_L = new ImageResourceType(130, 21);
            ImageResourceType[] arrimageResourceType = new ImageResourceType[]{INFO_S, INFO_EX_S, INFO_L, INFO_EX_L};
            $VALUES = arrimageResourceType;
        }

        private ImageResourceType(int n3, int n4) {
            this.width = n3;
            this.height = n4;
        }

        public static ImageResourceType getByName(String string) {
            ImageResourceType imageResourceType = INFO_S;
            ImageResourceType[] arrimageResourceType = ImageResourceType.values();
            for (int i2 = 0; i2 < arrimageResourceType.length; ++i2) {
                if (arrimageResourceType[i2].name().toLowerCase().compareTo(string.toLowerCase()) != 0) continue;
                imageResourceType = arrimageResourceType[i2];
            }
            return imageResourceType;
        }

        public static ImageResourceType valueOf(String string) {
            return (ImageResourceType)Enum.valueOf(ImageResourceType.class, (String)string);
        }

        public static ImageResourceType[] values() {
            return (ImageResourceType[])$VALUES.clone();
        }

        public final int getDefaultHeight() {
            return this.height;
        }

        public final int getDefaultWidth() {
            return this.width;
        }
    }

}

