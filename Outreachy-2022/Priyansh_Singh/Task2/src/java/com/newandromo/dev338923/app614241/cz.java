/*
 *  
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.net.UrlQuerySanitizer
 *  android.net.UrlQuerySanitizer$IllegalCharacterValueSanitizer
 *  android.net.UrlQuerySanitizer$ValueSanitizer
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.StringTokenizer
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.newandromo.dev338923.app614241;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.util.Log;
import com.newandromo.dev338923.app614241.cy;
import com.newandromo.dev338923.app614241.db;
import com.newandromo.dev338923.app614241.dc;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class cz {
    private static final int A = 0;
    private static final int B = 0;
    private static String[] C;
    private static final UrlQuerySanitizer.ValueSanitizer D;
    private static final UrlQuerySanitizer.ValueSanitizer E;
    private static final UrlQuerySanitizer.ValueSanitizer F;
    public static final String a = "cz";
    static int b = 5383;
    private static final int c;
    private static final int d;
    private static final Pattern e;
    private static final Pattern f;
    private static final Pattern g;
    private static final Pattern h;
    private static final Pattern i;
    private static final Pattern j;
    private static final Pattern k;
    private static final Pattern l;
    private static final Pattern m;
    private static final Pattern n;
    private static final Pattern o;
    private static final Pattern p;
    private static final Pattern q;
    private static final Pattern r;
    private static final Pattern s;
    private static final Pattern t;
    private static final Pattern u;
    private static final Pattern v;
    private static final Pattern w;
    private static final Pattern x;
    private static final Pattern y;
    private static String[] z;

    static {
        c = Math.min((int)11, (int)9);
        d = 6;
        e = Pattern.compile((String)"%2[bB]");
        f = Pattern.compile((String)"%26");
        g = Pattern.compile((String)"%2[fF]");
        h = Pattern.compile((String)"%3[fF]");
        i = Pattern.compile((String)"%24");
        j = Pattern.compile((String)"%2[cC]");
        k = Pattern.compile((String)"%3[bB]");
        l = Pattern.compile((String)"%3[dD]");
        m = Pattern.compile((String)"%3[aA]");
        n = Pattern.compile((String)"%40");
        o = Pattern.compile((String)"%22");
        p = Pattern.compile((String)"%27");
        q = Pattern.compile((String)"(?i)(?:j(?:[^\\S\\ ]|\\x0)*a(?:[^\\S\\ ]|\\x0)*v(?:[^\\S\\ ]|\\x0)*a(?:[^\\S\\ ]|\\x0)*|v(?:[^\\S\\ ]|\\x0)*b(?:[^\\S\\ ]|\\x0)*)s(?:[^\\S\\ ]|\\x0)*c(?:[^\\S\\ ]|\\x0)*r(?:[^\\S\\ ]|\\x0)*i(?:[^\\S\\ ]|\\x0)*p(?:[^\\S\\ ]|\\x0)*t(?:[^\\S\\ ]|\\x0)*:");
        r = Pattern.compile((String)"(?:[jJ](?:[^\\S\\ ]|\\x0)*[aA](?:[^\\S\\ ]|\\x0)*[vV](?:[^\\S\\ ]|\\x0)*[aA](?:[^\\S\\ ]|\\x0)*|[vV](?:[^\\S\\ ]|\\x0)*[bB](?:[^\\S\\ ]|\\x0)*)[sS](?:[^\\S\\ ]|\\x0)*[cC](?:[^\\S\\ ]|\\x0)*[rR](?:[^\\S\\ ]|\\x0)*[iI](?:[^\\S\\ ]|\\x0)*[pP](?:[^\\S\\ ]|\\x0)*[tT](?:[^\\S\\ ]|\\x0)*(:|cOlOnCoLoNcOlOn)");
        s = Pattern.compile((String)"(?i)(?:j(?:[^\\S\\ ]|\\x0)*a(?:[^\\S\\ ]|\\x0)*v(?:[^\\S\\ ]|\\x0)*a(?:[^\\S\\ ]|\\x0)*|v(?:[^\\S\\ ]|\\x0)*b(?:[^\\S\\ ]|\\x0)*)s(?:[^\\S\\ ]|\\x0)*c(?:[^\\S\\ ]|\\x0)*r(?:[^\\S\\ ]|\\x0)*i(?:[^\\S\\ ]|\\x0)*p(?:[^\\S\\ ]|\\x0)*t(?:[^\\S\\ ]|\\x0)*:|<\\s*\\/*s(?:[^\\S\\ ]|\\x0)*c(?:[^\\S\\ ]|\\x0)*r(?:[^\\S\\ ]|\\x0)*i(?:[^\\S\\ ]|\\x0)*p(?:[^\\S\\ ]|\\x0)*t");
        t = Pattern.compile((String)"(?:[jJ](?:[^\\S\\ ]|\\x0)*[aA](?:[^\\S\\ ]|\\x0)*[vV](?:[^\\S\\ ]|\\x0)*[aA](?:[^\\S\\ ]|\\x0)*|[vV](?:[^\\S\\ ]|\\x0)*[bB](?:[^\\S\\ ]|\\x0)*)[sS](?:[^\\S\\ ]|\\x0)*[cC](?:[^\\S\\ ]|\\x0)*[rR](?:[^\\S\\ ]|\\x0)*[iI](?:[^\\S\\ ]|\\x0)*[pP](?:[^\\S\\ ]|\\x0)*[tT](?:[^\\S\\ ]|\\x0)*(:|cOlOnCoLoNcOlOn)|<\\s*(\\/|sLaShSlAsHsLaSh)*[sS](?:[^\\S\\ ]|\\x0)*[cC](?:[^\\S\\ ]|\\x0)*[rR](?:[^\\S\\ ]|\\x0)*[iI](?:[^\\S\\ ]|\\x0)*[pP](?:[^\\S\\ ]|\\x0)*[tT]");
        u = Pattern.compile((String)"(?i)<\\s*\\/*s(?:[^\\S\\ ]|\\x0)*c(?:[^\\S\\ ]|\\x0)*r(?:[^\\S\\ ]|\\x0)*i(?:[^\\S\\ ]|\\x0)*p(?:[^\\S\\ ]|\\x0)*t");
        v = Pattern.compile((String)"<\\s*(\\/|sLaShSlAsHsLaSh)*[sS](?:[^\\S\\ ]|\\x0)*[cC](?:[^\\S\\ ]|\\x0)*[rR](?:[^\\S\\ ]|\\x0)*[iI](?:[^\\S\\ ]|\\x0)*[pP](?:[^\\S\\ ]|\\x0)*[tT]");
        w = Pattern.compile((String)"(?i)on\\S*?[=(]");
        x = Pattern.compile((String)"[oO][nN]\\S*?([=(]|eQuAlSEqUaLseQuAlS)");
        y = Pattern.compile((String)"[<>]");
        int n2 = 103;
        String[] arrstring = new String[n2];
        arrstring[0] = "onAbort";
        arrstring[1] = "onActivate";
        arrstring[2] = "onAfterPrint";
        arrstring[3] = "onAfterUpdate";
        arrstring[4] = "onBeforeActivate";
        arrstring[5] = "onBeforeCopy";
        arrstring[6] = "onBeforeCut";
        arrstring[7] = "onBeforeDeactivate";
        arrstring[8] = "onBeforeEditFocus";
        arrstring[9] = "onBeforePaste";
        arrstring[10] = "onBeforePrint";
        arrstring[11] = "onBeforeUnload";
        arrstring[12] = "onBeforeUpdate";
        arrstring[13] = "onBegin";
        arrstring[14] = "onBlur";
        arrstring[15] = "onBounce";
        arrstring[16] = "onCellChange";
        arrstring[17] = "onChange";
        arrstring[18] = "onClick";
        arrstring[19] = "onContextMenu";
        arrstring[20] = "onControlSelect";
        arrstring[21] = "onCopy";
        arrstring[22] = "onCut";
        arrstring[23] = "onDataAvailable";
        arrstring[24] = "onDataSetChanged";
        arrstring[25] = "onDataSetComplete";
        arrstring[26] = "onDblClick";
        arrstring[27] = "onDeactivate";
        arrstring[28] = "onDrag";
        arrstring[29] = "onDragEnd";
        arrstring[30] = "onDragLeave";
        arrstring[31] = "onDragEnter";
        arrstring[32] = "onDragOver";
        arrstring[33] = "onDragDrop";
        arrstring[34] = "onDragStart";
        arrstring[35] = "onDrop";
        arrstring[36] = "onEnd";
        arrstring[37] = "onError";
        arrstring[38] = "onErrorUpdate";
        arrstring[39] = "onFilterChange";
        arrstring[40] = "onFinish";
        arrstring[41] = "onFocus";
        arrstring[42] = "onFocusIn";
        arrstring[43] = "onFocusOut";
        arrstring[44] = "onHashChange";
        arrstring[45] = "onHelp";
        arrstring[46] = "onInput";
        arrstring[47] = "onKeyDown";
        arrstring[48] = "onKeyPress";
        arrstring[49] = "onKeyUp";
        arrstring[50] = "onLayoutComplete";
        arrstring[51] = "onLoad";
        arrstring[52] = "onLoseCapture";
        arrstring[53] = "onMediaComplete";
        arrstring[54] = "onMediaError";
        arrstring[55] = "onMessage";
        arrstring[56] = "onMouseDown";
        arrstring[57] = "onMouseEnter";
        arrstring[58] = "onMouseLeave";
        arrstring[59] = "onMouseMove";
        arrstring[60] = "onMouseOut";
        arrstring[61] = "onMouseOver";
        arrstring[62] = "onMouseUp";
        arrstring[63] = "onMouseWheel";
        arrstring[64] = "onMove";
        arrstring[65] = "onMoveEnd";
        arrstring[66] = "onMoveStart";
        arrstring[67] = "onOffline";
        arrstring[68] = "onOnline";
        arrstring[69] = "onOutOfSync";
        arrstring[70] = "onPaste";
        arrstring[71] = "onPause";
        arrstring[72] = "onPopState";
        arrstring[73] = "onProgress";
        arrstring[74] = "onPropertyChange";
        arrstring[75] = "onReadyStateChange()";
        arrstring[76] = "onRedo";
        arrstring[77] = "onRepeat";
        arrstring[78] = "onReset";
        arrstring[79] = "onResize";
        arrstring[80] = "onResizeEnd";
        arrstring[81] = "onResizeStart";
        arrstring[82] = "onResume";
        arrstring[83] = "onReverse";
        arrstring[84] = "onRowsEnter";
        arrstring[85] = "onRowExit";
        arrstring[86] = "onRowDelete";
        arrstring[87] = "onRowInserted";
        arrstring[88] = "onScroll";
        arrstring[89] = "onSeek";
        arrstring[90] = "onSelect";
        arrstring[91] = "onSelectionChange";
        arrstring[92] = "onSelectStart";
        arrstring[93] = "onStart";
        arrstring[94] = "onStop";
        arrstring[95] = "onStorage";
        arrstring[96] = "onSyncRestored";
        arrstring[97] = "onSubmit";
        arrstring[98] = "onTimeError";
        arrstring[99] = "onTrackChange";
        arrstring[100] = "onUndo";
        arrstring[101] = "onUnload";
        arrstring[102] = "onURLFlip";
        z = arrstring;
        int n3 = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = arrstring[i2];
            if (string.length() < n3) {
                n3 = string.length();
            }
            n2 = 103;
        }
        A = n3;
        String[] arrstring2 = z;
        int n4 = arrstring2.length;
        int n5 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            String string = arrstring2[i3];
            if (string.length() <= n5) continue;
            n5 = string.length();
        }
        B = n5;
        C = new String[]{"", "%01", "%02", "%03", "%04", "%05", "%06", "%07", "%08", "%09", "%0a", "%0b", "%0c", "%0d", "%0e", "%0f", "%10", "%11", "%12", "%13", "%14", "%15", "%16", "%17", "%18", "%19", "%1a", "%1b", "%1c", "%1d", "%1e", "%1f", "%20"};
        D = new UrlQuerySanitizer.IllegalCharacterValueSanitizer(dc.a(413));
        E = new UrlQuerySanitizer.IllegalCharacterValueSanitizer(dc.a(1437));
        F = new UrlQuerySanitizer.IllegalCharacterValueSanitizer(dc.a(1533));
    }

    private cz() {
    }

    public static Uri a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return cz.a(uri, b);
    }

    public static Uri a(Uri uri, int n2) {
        UrlQuerySanitizer.ValueSanitizer valueSanitizer = dc.b();
        UrlQuerySanitizer.ValueSanitizer valueSanitizer2 = dc.b();
        UrlQuerySanitizer.ValueSanitizer valueSanitizer3 = dc.b();
        dc.b();
        return cz.a(uri, valueSanitizer, valueSanitizer2, valueSanitizer3, dc.b(), n2);
    }

    private static Uri a(Uri uri, UrlQuerySanitizer.ValueSanitizer valueSanitizer, UrlQuerySanitizer.ValueSanitizer valueSanitizer2, UrlQuerySanitizer.ValueSanitizer valueSanitizer3, UrlQuerySanitizer.ValueSanitizer valueSanitizer4, int n2) {
        Uri uri2;
        if (uri != null) {
            int n3;
            boolean bl = (n2 & 64) != 0 || (n2 & 256) != 0 && cz.j(uri.toString()) || (n2 & 1024) != 0 && cz.i(uri.toString());
            if (!bl && ((n3 = n2 & 512) | 128) != 0) {
                String string = cz.d(uri.toString());
                bl = (n2 & 128) != 0 && cz.j(string) || n3 != 0 && cz.i(string);
            }
            boolean bl2 = cz.a(n2, 32);
            boolean bl3 = cz.a(n2, 4);
            boolean bl4 = cz.a(n2, 4096);
            uri2 = bl ? cz.a(uri, dc.b(), bl3, bl2, bl4) : cz.a(uri, bl3, bl2, bl4);
            if ("".equals((Object)uri2.toString())) {
                return uri2;
            }
            String string = cz.a(uri2, valueSanitizer, bl, n2);
            if (uri2.isHierarchical()) {
                cy cy2 = new cy();
                cy2.a(uri2.getScheme());
                Uri uri3 = uri2;
                boolean bl5 = bl;
                cy2.b(cz.c(uri3, valueSanitizer2, bl3, bl2, bl5, bl4));
                cy2.c(cz.a(uri2, valueSanitizer3, bl3, bl2, bl5, bl4));
                cy2.e(cz.b(uri2, valueSanitizer4, bl3, bl2, bl5, bl4));
                if (string != null) {
                    cy2.d(string);
                }
                uri2 = cz.a(cy2);
            } else if (uri2.isOpaque()) {
                String string2 = uri2.getEncodedSchemeSpecificPart();
                int n4 = string2.indexOf(63);
                if (n4 >= 0) {
                    string2 = string2.substring(0, n4);
                }
                Uri.Builder builder = new Uri.Builder();
                builder.scheme(uri2.getScheme());
                String string3 = a.l;
                builder.encodedOpaquePart(cz.a(string2, valueSanitizer4, bl3, bl2, bl, bl4, string3));
                cy cy3 = new cy();
                if (string != null) {
                    cy3.d(string);
                }
                cy3.e(cz.b(uri2, valueSanitizer4, bl3, bl2, bl, bl4));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(builder.toString());
                stringBuilder.append(cy3.toString());
                uri2 = Uri.parse((String)stringBuilder.toString());
            }
            if (cz.a(n2, 2048) && !bl) {
                return Uri.parse((String)cz.h(uri2.toString()));
            }
        } else {
            uri2 = null;
        }
        return uri2;
    }

    private static Uri a(Uri uri, UrlQuerySanitizer.ValueSanitizer valueSanitizer, boolean bl, boolean bl2, boolean bl3) {
        String string;
        if (uri != null && (string = uri.getScheme()) != null) {
            if (bl && !bl2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(":");
                if (cz.m(stringBuilder.toString()) >= 0) {
                    Log.w((String)a, (String)"Script detected; sanitizing URI to empty string.");
                    return Uri.parse((String)"");
                }
                int n2 = cz.n(string);
                if (n2 >= 0) {
                    String string2 = a;
                    StringBuilder stringBuilder2 = new StringBuilder("Script detected in scheme; removing: ");
                    stringBuilder2.append(string.substring(n2));
                    Log.w((String)string2, (String)stringBuilder2.toString());
                    string = string.substring(0, n2);
                }
            }
            if (bl3) {
                string = cz.a(string);
            }
            String string3 = Uri.decode((String)string);
            if (bl2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(":");
                if (cz.m(stringBuilder.toString()) >= 0) {
                    Log.w((String)a, (String)"Script detected; sanitizing URI to empty string.");
                    return Uri.parse((String)"");
                }
                int n3 = bl3 ? cz.o(string3) : cz.n(string3);
                if (n3 >= 0) {
                    String string4 = a;
                    StringBuilder stringBuilder3 = new StringBuilder("Script detected in scheme; removing: ");
                    stringBuilder3.append(string3.substring(n3));
                    Log.w((String)string4, (String)stringBuilder3.toString());
                    string3 = string3.substring(0, n3);
                }
            }
            String string5 = Uri.encode((String)valueSanitizer.sanitize(string3), (String)a.a);
            if (bl3) {
                string5 = cz.g(string5);
            }
            cy cy2 = cy.a(uri);
            cy2.a(string5);
            uri = cz.a(cy2);
        }
        return uri;
    }

    private static Uri a(Uri uri, boolean bl, boolean bl2, boolean bl3) {
        String string;
        if (uri != null && (bl2 || bl) && (string = uri.getScheme()) != null) {
            if (bl3 && bl2) {
                string = cz.a(string);
            }
            String string2 = bl2 ? Uri.decode((String)string) : string;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(":");
            if (cz.m(stringBuilder.toString()) >= 0) {
                Log.w((String)a, (String)"Script detected; sanitizing URI to empty string.");
                return Uri.parse((String)"");
            }
            int n2 = bl3 && bl2 ? cz.o(string2) : cz.n(string2);
            if (n2 >= 0) {
                String string3 = a;
                StringBuilder stringBuilder2 = new StringBuilder("Script detected in scheme; removing: ");
                stringBuilder2.append(string2.substring(n2));
                Log.w((String)string3, (String)stringBuilder2.toString());
                String string4 = string2.substring(0, n2);
                if (bl2) {
                    string4 = Uri.encode((String)string4.substring(0, n2), (String)a.a);
                }
                if (bl3 && bl2) {
                    string4 = cz.g(string4);
                }
                cy cy2 = cy.a(uri);
                cy2.a(string4);
                uri = cz.a(cy2);
            }
        }
        return uri;
    }

    private static Uri a(cy cy2) {
        if (cy2 != null) {
            return Uri.parse((String)cy2.toString());
        }
        return null;
    }

    private static String a(Uri uri, UrlQuerySanitizer.ValueSanitizer valueSanitizer, boolean bl, int n2) {
        String string = cz.b(uri);
        if (string != null) {
            if (bl && valueSanitizer != null) {
                db db2 = new db(n2);
                db2.setAllowUnregisteredParamaters(true);
                db2.setUnregisteredParameterValueSanitizer(valueSanitizer);
                db2.parseQuery(string);
                return db.a(db2, string.length(), n2);
            }
            if (cz.a(n2, 27)) {
                return cz.b(string, n2);
            }
        } else {
            string = null;
        }
        return string;
    }

    private static String a(Uri uri, UrlQuerySanitizer.ValueSanitizer valueSanitizer, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        return cz.f(cz.a(cz.e(uri.getEncodedPath()), valueSanitizer, bl, bl2, bl3, bl4, a.g));
    }

    private static String a(UrlQuerySanitizer.ValueSanitizer valueSanitizer, String string, boolean bl, boolean bl2, boolean bl3, String string2) {
        if (valueSanitizer != null && string != null) {
            int n2;
            if (bl && !bl2) {
                string = cz.b(string);
            }
            if (bl3) {
                int n3;
                String string3 = Uri.decode((String)cz.a(string));
                if (bl2 && (n3 = cz.l(string3)) >= 0) {
                    string3 = string3.substring(0, n3);
                }
                return cz.g(Uri.encode((String)valueSanitizer.sanitize(string3), (String)string2));
            }
            String string4 = Uri.decode((String)string);
            if (bl2 && (n2 = cz.k(string4)) >= 0) {
                string4 = string4.substring(0, n2);
            }
            return Uri.encode((String)valueSanitizer.sanitize(string4), (String)string2);
        }
        return null;
    }

    static String a(String string) {
        if (string != null) {
            String string2 = e.matcher((CharSequence)string).replaceAll("pLuSPlUspLuSPlUs");
            String string3 = f.matcher((CharSequence)string2).replaceAll("aMpAmPaMpAmPaMp");
            String string4 = g.matcher((CharSequence)string3).replaceAll("sLaShSlAsHsLaSh");
            String string5 = h.matcher((CharSequence)string4).replaceAll("qUeStIoNQuEsTiOn");
            String string6 = i.matcher((CharSequence)string5).replaceAll("dOlLaRDoLlArdOlLaR");
            String string7 = j.matcher((CharSequence)string6).replaceAll("cOmMaCoMmAcOmMa");
            String string8 = k.matcher((CharSequence)string7).replaceAll("sEmIcOlOnSeMiCoLon");
            String string9 = l.matcher((CharSequence)string8).replaceAll("eQuAlSEqUaLseQuAlS");
            String string10 = m.matcher((CharSequence)string9).replaceAll("cOlOnCoLoNcOlOn");
            String string11 = n.matcher((CharSequence)string10).replaceAll("aTAtaTAtaTAt");
            String string12 = o.matcher((CharSequence)string11).replaceAll("dOuBlEqUoTeDoUbLeQuOtE");
            string = p.matcher((CharSequence)string12).replaceAll("sInGlEqUoTeSiNgLeQuOtE");
        }
        return string;
    }

    static String a(String string, int n2) {
        if (cz.a(n2, 4096)) {
            string = cz.g(string);
        }
        return string;
    }

    private static String a(String string, UrlQuerySanitizer.ValueSanitizer valueSanitizer, boolean bl, boolean bl2, boolean bl3, boolean bl4, String string2) {
        if (bl3 && valueSanitizer != null) {
            return cz.a(valueSanitizer, string, bl, bl2, bl4, string2);
        }
        if (bl || bl2) {
            string = cz.a(string, bl, bl2, bl4, string2);
        }
        return string;
    }

    private static String a(String string, boolean bl, boolean bl2, boolean bl3, String string2) {
        if (string != null) {
            if (bl && !bl2) {
                return cz.b(string);
            }
            if (bl2) {
                if (bl3) {
                    String string3 = Uri.decode((String)cz.a(string));
                    int n2 = cz.l(string3);
                    if (n2 >= 0) {
                        return cz.g(Uri.encode((String)string3.substring(0, n2), (String)string2));
                    }
                } else {
                    String string4 = Uri.decode((String)string);
                    int n3 = cz.k(string4);
                    if (n3 >= 0) {
                        string = Uri.encode((String)string4.substring(0, n3), (String)string2);
                    }
                }
            }
        }
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void a(StringBuilder stringBuilder, String string, int n2) {
        int n3 = 1;
        if (cz.a(n2, n3) && !cz.a(n2, 8)) {
            int n4 = string.length();
            if ((string = cz.b(string)).length() == 0 && n4 != 0) {
                return;
            }
        }
        int n5 = 0;
        if (n5 != 0) return;
        if (cz.a(n2, 8)) {
            String string2 = cz.d(cz.c(string, n2));
            int n6 = cz.l(string2);
            if (n6 != 0 || string2.length() == 0) {
                n3 = 0;
            }
            if (n3 == 0 && n6 >= 0) {
                string = cz.a(Uri.encode((String)string2.substring(0, n6), null), n2);
            }
        } else {
            n3 = n5;
        }
        if (n3 != 0) return;
        if (stringBuilder.length() > 0) {
            stringBuilder.append("&");
        }
        stringBuilder.append(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void a(StringBuilder stringBuilder, String string, String string2, int n2) {
        int n3;
        String string3;
        int n4 = 1;
        if (cz.a(n2, n4) && !cz.a(n2, 8)) {
            int n5 = string.length();
            if ((string = cz.b(string)).length() == 0 && n5 != 0) {
                return;
            }
        }
        int n6 = 0;
        if (n6 != 0) return;
        if (string2 != null && cz.a(n2, 2) && !cz.a(n2, 16)) {
            string2 = cz.b(string2);
        }
        if (cz.a(n2, 8)) {
            String string4 = cz.d(cz.c(string, n2));
            int n7 = cz.l(string4);
            if (n7 != 0 || string4.length() == 0) {
                n4 = 0;
            }
            if (n4 == 0 && n7 >= 0) {
                string = cz.a(Uri.encode((String)string4.substring(0, n7), null), n2);
            }
        } else {
            n4 = n6;
        }
        if (n4 != 0) return;
        if (string2 != null && cz.a(n2, 16) && (n3 = cz.l(string3 = cz.d(cz.c(string2, n2)))) >= 0) {
            string2 = cz.a(Uri.encode((String)string3.substring(0, n3), (String)","), n2);
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append("&");
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string);
        stringBuilder2.append("=");
        stringBuilder2.append(string2);
        stringBuilder.append(stringBuilder2.toString());
    }

    private static boolean a(char c2) {
        return cz.b(c2) >= 0;
    }

    private static boolean a(int n2, int n3) {
        return (n2 & n3) != 0;
    }

    private static boolean a(String string, String string2, String string3, int n2) {
        if (string != null) {
            StringBuilder stringBuilder = new StringBuilder(string.length());
            if (string2 != null) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string2);
                stringBuilder2.append("@");
                stringBuilder.append(stringBuilder2.toString());
            }
            if (string3 != null) {
                stringBuilder.append(string3);
            }
            if (n2 != -1) {
                stringBuilder.append(":".concat(String.valueOf((int)n2)));
            }
            return string.equals((Object)stringBuilder.toString());
        }
        return false;
    }

    private static int b(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - 48;
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return 10 + (c2 - 65);
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return 10 + (c2 - 97);
        }
        return -1;
    }

    private static String b(Uri uri) {
        String string;
        if (uri != null) {
            int n2;
            String string2;
            string = uri.getEncodedQuery();
            if (string == null && uri.isOpaque() && (n2 = (string2 = uri.getEncodedSchemeSpecificPart()).indexOf(63)) >= 0) {
                return string2.substring(n2 + 1);
            }
        } else {
            string = null;
        }
        return string;
    }

    private static String b(Uri uri, UrlQuerySanitizer.ValueSanitizer valueSanitizer, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        return cz.f(cz.a(cz.e(uri.getEncodedFragment()), valueSanitizer, bl, bl2, bl3, bl4, a.k));
    }

    public static String b(String string) {
        Matcher matcher;
        if (string == null) {
            return null;
        }
        if (string.length() > 6 && (matcher = s.matcher((CharSequence)string)).find()) {
            return string.substring(0, matcher.start());
        }
        if (string.length() > A) {
            Matcher matcher2 = w.matcher((CharSequence)string);
            while (matcher2.find()) {
                String[] arrstring = z;
                int n2 = arrstring.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (!arrstring[i2].equalsIgnoreCase(string.substring(matcher2.start(), -1 + matcher2.end()))) continue;
                    return string.substring(0, matcher2.start());
                }
            }
        }
        return string;
    }

    private static String b(String string, int n2) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        StringTokenizer stringTokenizer = new StringTokenizer(string, "&");
        while (stringTokenizer.hasMoreElements()) {
            String string2 = stringTokenizer.nextToken();
            if (string2.length() <= 0) continue;
            int n3 = string2.indexOf(61);
            if (n3 < 0) {
                cz.a(stringBuilder, string2, n2);
                continue;
            }
            cz.a(stringBuilder, string2.substring(0, n3), string2.substring(n3 + 1), n2);
        }
        return stringBuilder.toString();
    }

    private static String c(Uri uri, UrlQuerySanitizer.ValueSanitizer valueSanitizer, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        String string;
        if (valueSanitizer != null && uri != null && (string = uri.getEncodedAuthority()) != null) {
            String string2;
            int n2;
            String string3 = uri.getEncodedUserInfo();
            if (cz.a(string, string3, string2 = uri.getHost(), n2 = uri.getPort())) {
                String string4;
                String string5;
                StringBuilder stringBuilder = new StringBuilder(string.length());
                if (string3 != null && (string5 = cz.a(string3, valueSanitizer, bl, bl2, bl3, bl4, a.c)) != null && !string5.isEmpty()) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string5);
                    stringBuilder2.append("@");
                    stringBuilder.append(stringBuilder2.toString());
                }
                if (string2 != null && (string4 = cz.a(string2, valueSanitizer, bl, bl2, bl3, bl4, a.e)) != null && !string4.isEmpty()) {
                    stringBuilder.append(string4);
                }
                if (n2 != -1) {
                    stringBuilder.append(":".concat(String.valueOf((int)n2)));
                }
                return stringBuilder.toString();
            }
        } else {
            string = null;
        }
        return string;
    }

    public static String c(String string) {
        Matcher matcher;
        if (string == null) {
            return null;
        }
        if (string.length() > 6 && (matcher = t.matcher((CharSequence)string)).find()) {
            return string.substring(0, matcher.start());
        }
        if (string.length() > A) {
            Matcher matcher2 = x.matcher((CharSequence)string);
            while (matcher2.find()) {
                String string2 = string.substring(matcher2.start(), matcher2.end()).endsWith("eQuAlSEqUaLseQuAlS") ? string.substring(matcher2.start(), -18 + matcher2.end()) : string.substring(matcher2.start(), -1 + matcher2.end());
                String[] arrstring = z;
                int n2 = arrstring.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (!arrstring[i2].equalsIgnoreCase(string2)) continue;
                    return string.substring(0, matcher2.start());
                }
            }
        }
        return string;
    }

    private static String c(String string, int n2) {
        if (cz.a(n2, 4096)) {
            string = cz.a(string);
        }
        return string;
    }

    public static String d(String string) {
        if (string == null) {
            return null;
        }
        int n2 = string.indexOf(37);
        if (n2 < 0) {
            n2 = string.indexOf(43);
            if (n2 < 0) {
                return string;
            }
        } else {
            int n3 = string.substring(0, n2).indexOf(43);
            if (n3 >= 0 && n3 < n2) {
                n2 = n3;
            }
        }
        int n4 = string.length();
        StringBuilder stringBuilder = new StringBuilder(n4);
        stringBuilder.append(string.substring(0, n2));
        while (n2 < n4) {
            int n5;
            char c2 = string.charAt(n2);
            if (c2 == '+') {
                c2 = ' ';
            } else if (c2 == '%' && (n5 = n2 + 2) < n4) {
                char c3 = string.charAt(n2 + 1);
                char c4 = string.charAt(n5);
                if (cz.a(c3) && cz.a(c4)) {
                    c2 = (char)(16 * cz.b(c3) + cz.b(c4));
                    n2 = n5;
                }
            }
            stringBuilder.append(c2);
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static String e(String string) {
        if (string != null) {
            string = e.matcher((CharSequence)string).replaceAll("pLuSPlUspLuSPlUs");
        }
        return string;
    }

    private static String f(String string) {
        if (string != null) {
            string = string.replace((CharSequence)"pLuSPlUspLuSPlUs", (CharSequence)"%2B");
        }
        return string;
    }

    private static String g(String string) {
        if (string != null) {
            string = string.replace((CharSequence)"pLuSPlUspLuSPlUs", (CharSequence)"%2B").replace((CharSequence)"aMpAmPaMpAmPaMp", (CharSequence)"%26").replace((CharSequence)"sLaShSlAsHsLaSh", (CharSequence)"%2F").replace((CharSequence)"qUeStIoNQuEsTiOn", (CharSequence)"%3F").replace((CharSequence)"dOlLaRDoLlArdOlLaR", (CharSequence)"%24").replace((CharSequence)"cOmMaCoMmAcOmMa", (CharSequence)"%2C").replace((CharSequence)"sEmIcOlOnSeMiCoLon", (CharSequence)"%3B").replace((CharSequence)"eQuAlSEqUaLseQuAlS", (CharSequence)"%3D").replace((CharSequence)"cOlOnCoLoNcOlOn", (CharSequence)"%3A").replace((CharSequence)"aTAtaTAtaTAt", (CharSequence)"%40").replace((CharSequence)"dOuBlEqUoTeDoUbLeQuOtE", (CharSequence)"%22").replace((CharSequence)"sInGlEqUoTeSiNgLeQuOtE", (CharSequence)"%27");
        }
        return string;
    }

    private static String h(String string) {
        if (string != null) {
            string = string.replace((CharSequence)" ", (CharSequence)"%20");
        }
        return string;
    }

    private static boolean i(String string) {
        return string != null && string.length() > 0 && y.matcher((CharSequence)string).find();
    }

    private static boolean j(String string) {
        if (string != null) {
            if (string.length() > 6 && s.matcher((CharSequence)string).find()) {
                return true;
            }
            if (string.length() > A) {
                Matcher matcher = w.matcher((CharSequence)string);
                while (matcher.find()) {
                    String[] arrstring = z;
                    int n2 = arrstring.length;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        if (!arrstring[i2].equalsIgnoreCase(string.substring(matcher.start(), matcher.end() - 1))) continue;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static int k(String string) {
        if (string != null) {
            Matcher matcher;
            if (string.length() > 6 && (matcher = s.matcher((CharSequence)string)).find()) {
                return matcher.start();
            }
            if (string.length() > A) {
                Matcher matcher2 = w.matcher((CharSequence)string);
                while (matcher2.find()) {
                    String[] arrstring = z;
                    int n2 = arrstring.length;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        if (!arrstring[i2].equalsIgnoreCase(string.substring(matcher2.start(), -1 + matcher2.end()))) continue;
                        return matcher2.start();
                    }
                }
            }
        }
        return -1;
    }

    private static int l(String string) {
        if (string != null) {
            Matcher matcher;
            if (string.length() > 6 && (matcher = t.matcher((CharSequence)string)).find()) {
                return matcher.start();
            }
            if (string.length() > A) {
                Matcher matcher2 = x.matcher((CharSequence)string);
                while (matcher2.find()) {
                    String string2 = string.substring(matcher2.start(), matcher2.end()).endsWith("eQuAlSEqUaLseQuAlS") ? string.substring(matcher2.start(), -18 + matcher2.end()) : string.substring(matcher2.start(), -1 + matcher2.end());
                    String[] arrstring = z;
                    int n2 = arrstring.length;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        if (!arrstring[i2].equalsIgnoreCase(string2)) continue;
                        return matcher2.start();
                    }
                }
            }
        }
        return -1;
    }

    private static int m(String string) {
        Matcher matcher;
        if (string != null && string.length() > 8 && (matcher = q.matcher((CharSequence)string)).find()) {
            return matcher.start();
        }
        return -1;
    }

    private static int n(String string) {
        if (string != null) {
            Matcher matcher;
            if (string.length() > 6 && (matcher = s.matcher((CharSequence)string)).find()) {
                return matcher.start();
            }
            if (string.length() > A) {
                Matcher matcher2 = w.matcher((CharSequence)string);
                while (matcher2.find()) {
                    String[] arrstring = z;
                    int n2 = arrstring.length;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        if (!arrstring[i2].equalsIgnoreCase(string.substring(matcher2.start(), -1 + matcher2.end()))) continue;
                        return matcher2.start();
                    }
                }
            }
        }
        return -1;
    }

    private static int o(String string) {
        if (string != null) {
            Matcher matcher;
            if (string.length() > 6 && (matcher = t.matcher((CharSequence)string)).find()) {
                return matcher.start();
            }
            if (string.length() > A) {
                Matcher matcher2 = x.matcher((CharSequence)string);
                while (matcher2.find()) {
                    String string2 = string.substring(matcher2.start(), matcher2.end()).endsWith("eQuAlSEqUaLseQuAlS") ? string.substring(matcher2.start(), -18 + matcher2.end()) : string.substring(matcher2.start(), -1 + matcher2.end());
                    String[] arrstring = z;
                    int n2 = arrstring.length;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        if (!arrstring[i2].equalsIgnoreCase(string2)) continue;
                        return matcher2.start();
                    }
                }
            }
        }
        return -1;
    }

    public static final class a {
        public static String a;
        public static String b;
        public static String c;
        public static String d;
        public static String e;
        public static String f;
        public static String g;
        public static String h;
        public static String i;
        public static String j;
        public static String k;
        public static String l;
        private static String m = "$&+,;=";
        private static String n;

        static {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(m);
            stringBuilder.append(":@");
            n = stringBuilder.toString();
            a = "+";
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(m);
            stringBuilder2.append(":@");
            b = stringBuilder2.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(m);
            stringBuilder3.append(":");
            c = stringBuilder3.toString();
            d = m;
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(m);
            stringBuilder4.append("[]:");
            e = stringBuilder4.toString();
            f = null;
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(n);
            stringBuilder5.append("/");
            g = stringBuilder5.toString();
            h = n;
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append(n);
            stringBuilder6.append("/?");
            i = stringBuilder6.toString();
            j = "$+,;:@/?";
            StringBuilder stringBuilder7 = new StringBuilder();
            stringBuilder7.append(n);
            stringBuilder7.append("/?");
            k = stringBuilder7.toString();
            l = n;
        }
    }

}

