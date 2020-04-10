/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.旋转数字;

public class Main {
    boolean[] flag;
    public int rotatedDigits(int N) {
        flag = new boolean[N + 1];
        plus(0);
        plus2(0);
        int count=0;
        for (boolean b : flag) {
            if (b)
                count++;
        }
        return count;
    }

    private void plus2(int i) {
        if (i>=flag.length||!flag[i]){
            return;
        }
        flag[i]=false;
        i*=10;
        plus2(i);
        plus2(i+1);
        plus2(i+8);
    }

    private void plus(int i) {
       if (i>=flag.length||flag[i]){
           return;
       }
       flag[i]=true;
       i*=10;
       plus(i);
       plus(i+1);
       plus(i+2);
       plus(i+5);
       plus(i+6);
       plus(i+8);
       plus(i+9);
    }
public static void main(String arg[]){//main--来自高金磊

    new Main().rotatedDigits(100);
}

}
