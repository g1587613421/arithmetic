/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.第一个错误的版本;

public abstract class Main {
    public int firstBadVersion(int n) {
        int pre=1,last=n;
        while (pre<last){
            int middle=pre+(last-pre)/2;
            if (!isBadVersion(middle)){
                if (!isBadVersion(middle+1))
                pre=middle+1;
                else return middle+1;
            }
            else {
                if (!isBadVersion(middle-1)){
                    return middle;
                }
                else last=middle-1;
            }
        }
        return pre;
    }
    abstract boolean isBadVersion(int version);
}
