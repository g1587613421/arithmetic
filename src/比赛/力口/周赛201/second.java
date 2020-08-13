/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛201;

public class second {
    public char findKthBit(int n, int k) {
        StringBuffer buffer=new StringBuffer();
        buffer.append('0');
        while (n>0&&buffer.length()<k){
            plus(buffer);
            n--;
        }
        return buffer.charAt(k-1);
    }
    private StringBuffer plus(StringBuffer buffer){
        StringBuffer middle=new StringBuffer();
        for (char c : buffer.toString().toCharArray()) {
            middle.append(c=='1'?'0':'1');
        }
        buffer.append('1').append(middle.reverse());
        return buffer;
    }
}
