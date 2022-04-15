
package com.startapp.a.a.a;

import java.nio.ByteBuffer;

public class b {
    public static long a(ByteBuffer byteBuffer, int n2, int n3, long l2) {
        long l3;
        long l4 = l2 & 0xFFFFFFFFL ^ -4132994306676758123L * (long)n3;
        int n4 = n3 >> 3;
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = n2 + (i2 << 3);
            long l5 = -4132994306676758123L * ((255L & (long)byteBuffer.get(n5 + 0)) + ((255L & (long)byteBuffer.get(n5 + 1)) << 8) + ((255L & (long)byteBuffer.get(n5 + 2)) << 16) + ((255L & (long)byteBuffer.get(n5 + 3)) << 24) + ((255L & (long)byteBuffer.get(n5 + 4)) << 32) + ((255L & (long)byteBuffer.get(n5 + 5)) << 40) + ((255L & (long)byteBuffer.get(n5 + 6)) << 48) + ((255L & (long)byteBuffer.get(n5 + 7)) << 56));
            l4 = -4132994306676758123L * (l4 ^ -4132994306676758123L * (l5 ^ l5 >>> 47));
        }
        int n6 = n3 & 7;
        switch (n6) {
            default: {
                l3 = -4132994306676758123L;
                break;
            }
            case 7: {
                l4 ^= (long)byteBuffer.get(6 + (n2 + n3 - n6)) << 48;
            }
            case 6: {
                l4 ^= (long)byteBuffer.get(5 + (n2 + n3 - n6)) << 40;
            }
            case 5: {
                l4 ^= (long)byteBuffer.get(4 + (n2 + n3 - n6)) << 32;
            }
            case 4: {
                l4 ^= (long)byteBuffer.get(3 + (n2 + n3 - n6)) << 24;
            }
            case 3: {
                l4 ^= (long)byteBuffer.get(2 + (n2 + n3 - n6)) << 16;
            }
            case 2: {
                l4 ^= (long)byteBuffer.get(1 + (n2 + n3 - n6)) << 8;
            }
            case 1: {
                long l6 = l4 ^ (long)byteBuffer.get(n2 + n3 - n6);
                l3 = -4132994306676758123L;
                l4 = l6 * l3;
            }
        }
        long l7 = l3 * (l4 ^ l4 >>> 47);
        return l7 ^ l7 >>> 47;
    }
}

