/*
 *  
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.startapp.android.publish.adsCommon;

import java.io.Serializable;

public class SDKAdPreferences
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String age = null;
    private Gender gender = null;

    public String getAge() {
        return this.age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public SDKAdPreferences setAge(int n2) {
        this.age = Integer.toString((int)n2);
        return this;
    }

    public SDKAdPreferences setAge(String string) {
        this.age = string;
        return this;
    }

    public SDKAdPreferences setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SDKAdPreferences [gender=");
        stringBuilder.append((Object)this.gender);
        stringBuilder.append(", age=");
        stringBuilder.append(this.age);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static final class Gender
    extends Enum<Gender> {
        private static final /* synthetic */ Gender[] $VALUES;
        public static final /* enum */ Gender FEMALE;
        public static final /* enum */ Gender MALE;
        private String gender;

        static {
            MALE = new Gender("m");
            FEMALE = new Gender("f");
            Gender[] arrgender = new Gender[]{MALE, FEMALE};
            $VALUES = arrgender;
        }

        private Gender(String string2) {
            this.gender = string2;
        }

        public static Gender parseString(String string) {
            for (Gender gender : Gender.values()) {
                if (!gender.getGender().equals((Object)string)) continue;
                return gender;
            }
            return null;
        }

        public static Gender valueOf(String string) {
            return (Gender)Enum.valueOf(Gender.class, (String)string);
        }

        public static Gender[] values() {
            return (Gender[])$VALUES.clone();
        }

        public final String getGender() {
            return this.gender;
        }

        public final String toString() {
            return this.getGender();
        }
    }

}

