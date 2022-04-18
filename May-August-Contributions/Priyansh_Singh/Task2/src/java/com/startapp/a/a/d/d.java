/*
 *  
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.startapp.a.a.d;

import com.startapp.a.a.d.c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d
implements c {
    private final Pattern a = Pattern.compile((String)"\\+");
    private final Pattern b = Pattern.compile((String)"/");
    private final Pattern c = Pattern.compile((String)"=");
    private final Pattern d = Pattern.compile((String)"_");
    private final Pattern e = Pattern.compile((String)"\\*");
    private final Pattern f = Pattern.compile((String)"#");

    @Override
    public String a(String string) {
        String string2 = this.a.matcher((CharSequence)string).replaceAll("_");
        String string3 = this.b.matcher((CharSequence)string2).replaceAll("*");
        return this.c.matcher((CharSequence)string3).replaceAll("#");
    }
}

