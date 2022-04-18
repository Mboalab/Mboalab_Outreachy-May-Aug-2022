/*
 *  
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package com.startapp.android.publish.adsCommon;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseResponse
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String errorMessage = null;
    protected Map<String, String> parameters = new HashMap();
    private boolean validResponse = true;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Map<String, String> getParameters() {
        return this.parameters;
    }

    public boolean isValidResponse() {
        return this.validResponse;
    }

    public void setErrorMessage(String string) {
        this.errorMessage = string;
    }

    public void setParameters(Map<String, String> map) {
        this.parameters = map;
    }

    public void setValidResponse(boolean bl) {
        this.validResponse = bl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseResponse [parameters=");
        stringBuilder.append(this.parameters);
        stringBuilder.append(", validResponse=");
        stringBuilder.append(this.validResponse);
        stringBuilder.append(", errorMessage=");
        stringBuilder.append(this.errorMessage);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

