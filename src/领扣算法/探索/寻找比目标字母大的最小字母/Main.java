/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.寻找比目标字母大的最小字母;

public class Main {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1])
            return letters[0];
        int pre=0,last=letters.length-1;
        while (pre<last){
            int middle=pre+(last-pre)/2;
            if (letters[middle]>target){
                last=middle;
            }
            else {
                pre=middle+1;
            }
        }
        return letters[last];
    }
}
