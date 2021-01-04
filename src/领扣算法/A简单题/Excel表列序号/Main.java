/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.Excel表列序号;

public class Main {

    public int titleToNumber(String s) {
        char[] data=s.toCharArray();
        for (int i = 0; i < data.length; i++) {
            data[i]-=('A'-1);
        }
        int value=0;
        long middle=1L;
        for (int i = data.length-1; i >=0; i--) {
            value+=data[i]*middle;
            middle*=26;
        }
        return value;
    }
}
