/*
 *  
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.io.Writer
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.startapp.a.a.c;

import java.io.Serializable;
import java.io.Writer;

public class e
extends Writer
implements Serializable {
    private final StringBuilder b;

    public e() {
        this.b = new StringBuilder();
    }

    public e(int n2) {
        this.b = new StringBuilder(n2);
    }

    public Writer append(char c2) {
        this.b.append(c2);
        return this;
    }

    public Writer append(CharSequence charSequence) {
        this.b.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int n2, int n3) {
        this.b.append(charSequence, n2, n3);
        return this;
    }

    public void close() {
    }

    public void flush() {
    }

    public String toString() {
        return this.b.toString();
    }

    public void write(String string) {
        if (string != null) {
            this.b.append(string);
        }
    }

    public void write(char[] arrc, int n2, int n3) {
        if (arrc != null) {
            this.b.append(arrc, n2, n3);
        }
    }
}

