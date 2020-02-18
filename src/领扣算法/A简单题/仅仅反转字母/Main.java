/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.仅仅反转字母;

public class Main {
    public String reverseOnlyLetters(String S) {
        char[] data= S.toCharArray();
        int la=data.length-1,pre=0;
        char middle;
        while (la!=pre){
            if (!((data[la]<='z'&&data[la]>='a')||(data[la]<='Z'&&data[la]>='A')))
            {
                la--;
                continue;
            }
            if (!((data[pre]<='z'&&data[pre]>='a')||(data[pre]<='Z'&&data[pre]>='A'))){
                pre++;
                continue;
            }
            middle=data[la];
            data[la--]=data[pre];
            data[pre++]=middle;

        }

        return new String(data);
    }
}
