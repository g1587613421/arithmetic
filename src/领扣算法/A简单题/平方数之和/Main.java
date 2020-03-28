/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.平方数之和;

import Tools.SimpleTimeTest;

public class Main {

    public boolean judgeSquareSum(int c) {
        long left=0,right=(long) Math.pow(c, 0.5);
        left=(long) Math.pow(c-right*right, 0.5);
        do {
            long middle=left*left+right*right;
            if (middle==c)
                return true;
            if (middle<c)
                right++;
            else {
                left++;
                right--;
            }
        }while ((left<=right));

        return false;
    }

    public static void main(String[] arg){//main--来自高金磊
        SimpleTimeTest.TestMethod();
        new Main().judgeSquareSum(2147483646);
        SimpleTimeTest.endMethod("");
    }
}
