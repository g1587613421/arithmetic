/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛183;

public class second {
    public int numSteps(String s) {
        char[] data=s.toCharArray();
        int flag=0;
        int count=0;
        for (int i = data.length-1; i >0; i--) {
           if (flag==0){
               if (data[i]-'0'==0){
                   count++;
               }else {
                   flag=1;
                   count+=2;
               }
           }
           else {
               if (data[i]-'0'==1){
                   count++;
               }else {
                   count+=2;
               }
           }
        }
        if (flag==1)
            count++;
        return count;
    }
}
