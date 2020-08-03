/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.灯泡开关IV;

public class Main {

    public int minFlips(String target) {
        char[] chars=target.toCharArray();
        char state='0';
        int count=0;
        for (char aChar : chars) {
            if (aChar!=state){
                count++;
                state=state=='0'?'1':'0';
            }
        }
        return count;
    }
}
