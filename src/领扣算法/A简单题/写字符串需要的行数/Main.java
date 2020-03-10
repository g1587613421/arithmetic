/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.写字符串需要的行数;

public class Main {

    public int[] numberOfLines(int[] widths, String S) {
        int res=0,middle=0;
        for (char c : S.toCharArray()) {
            middle+=widths[c%'a'];
            if (middle>100){
                res++;
                middle=widths[c%'a'];
            }

        }
        return new int[]{res,middle};
    }
}
