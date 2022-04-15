/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Set
 */
package com.startapp.android.publish.adsCommon.Utils;

import java.util.Set;

public class NameValueObject {
    private String name;
    private String value;
    private Set<String> valueSet;

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public Set<String> getValueSet() {
        return this.valueSet;
    }

    public void setName(String string) {
        this.name = string;
    }

    public void setValue(String string) {
        this.value = string;
    }

    public void setValueSet(Set<String> set) {
        this.valueSet = set;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("NameValueObject [name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", value=");
        stringBuilder.append(this.value);
        stringBuilder.append(", valueSet=");
        stringBuilder.append(this.valueSet);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

