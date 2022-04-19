/*
 *  
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  java.lang.Boolean
 *  java.lang.ThreadLocal
 */
package com.newandromo.dev338923.app614241;

import android.content.ContentProvider;

public abstract class SQLiteContentProvider
extends ContentProvider {
    private final ThreadLocal<Boolean> a = new ThreadLocal();
}

