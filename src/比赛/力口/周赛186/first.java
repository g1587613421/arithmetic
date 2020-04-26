/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛186;

import java.util.Arrays;

public class first {
    public int maxScore(String s) {
        int data1[]=new int[s.length()+1];
        int data2[]=new int[s.length()+1];
        data1[0]=0;
        data2[data1.length-1]=0;
        char[] chars=s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            data1[i+1]=data1[i]+(chars[i]=='0'?1:0);
            data2[data2.length-2-i]=data2[data2.length-1-i]+(chars[chars.length-1-i]=='1'?1:0);
        }
        for (int i = 0; i < data1.length-1; i++) {
            data1[i]+=data2[i];
        }
        if (chars[0]=='1')
            data1[0]-=1;
        if (chars[chars.length-1]=='0')
            data1[chars.length]-=1;
        return Arrays.stream(data1).max().getAsInt();
    }
}
