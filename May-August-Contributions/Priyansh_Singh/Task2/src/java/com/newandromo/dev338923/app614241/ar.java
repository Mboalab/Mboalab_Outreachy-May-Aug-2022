
package com.newandromo.dev338923.app614241;

import java.io.IOException;
import java.net.URLConnection;

final class ar {
    static String a(URLConnection uRLConnection, String string) throws IOException {
        String string2;
        block5 : {
            block3 : {
                String string3;
                block4 : {
                    if (uRLConnection == null) break block3;
                    string3 = uRLConnection.getContentEncoding();
                    if (string3 != null) break block4;
                    String string4 = uRLConnection.getContentType();
                    if (string4 != null) {
                        String[] arrstring = string4.split(";");
                        int n2 = arrstring.length;
                        for (int i2 = 0; i2 < n2; ++i2) {
                            String string5 = arrstring[i2].trim();
                            if (!string5.toLowerCase().startsWith("charset=")) continue;
                            string2 = string5.substring(8);
                            break;
                        }
                    } else {
                        string2 = string3;
                    }
                    if (string2 != null && !"".equals((Object)string2)) break block5;
                    break block3;
                }
                return string3;
            }
            string2 = string;
        }
        return string2;
    }
}

