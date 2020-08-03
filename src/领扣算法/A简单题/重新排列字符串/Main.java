/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.重新排列字符串;

public class Main {

    public String restoreString(String s, int[] indices) {
        char[] chars=s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            boolean flag=false;
            for (int j = 1; j < chars.length-i; j++) {
                if (indices[j]<indices[j-1])
                {
                    flag=true;
                    int middle=indices[j];
                    indices[j]=indices[j-1];
                    indices[j-1]=middle;

                    char c=chars[j];
                    chars[j]=chars[j-1];
                    chars[j-1]=c;
                }

            }
            if (!flag)
                break;

        }
        return new String(chars);
    }

    public static void main(String arg[]){//main--来自高金磊

        new Main().restoreString("codeleet"
        ,new int[]{4,5,6,7,0,2,1,3});
    }
}
