/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.有效的括号字符串;

public class Main {
    boolean aBoolean = false;
    char[] chars;
    public boolean checkValidString(String s) {
        chars=s.toCharArray();
        plus(0, 0);
        return aBoolean;
    }

    void plus(int index,int left){
        if (aBoolean||left<0)
            return;
        if (index>chars.length-1){
            if (left==0)
                aBoolean=true;
            return;
        }
        switch (chars[index]){
            case '(':
                left++;
                break;
            case ')':
                left--;
                break;
            case '*':
                plus(index+1, left+1);
                plus(index+1, left-1);
        }
        plus(index+1, left);
    }
}
