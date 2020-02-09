/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.A1比特与2比特字符;

public class Main {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length<2)
            return true;
        if (bits[bits.length-1]==0&&bits[bits.length-2]==0)
            return true;
        int i;
        for (i = 0; i < bits.length-1; i++) {
            if(bits[i]==1)
                i++;
        }
        return i!=bits.length;
    }
}
