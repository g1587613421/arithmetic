/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.有效的完全平方数;

public class Main {

    public boolean isPerfectSquare(int num) {
        if (num==1)
            return true;
        if (num<1)
            return false;
        int pre=1,last=num;
        int middle=0;
        while (pre<last){
            middle = pre+(last-pre)/2;
            int res=num/middle;
            if (res<middle){
                last=middle-1;
            }
            else if (res==middle)
                break;
            else {
                pre=middle+1;

            }
        }
        return middle*middle==num||pre*pre==num||last*last==num;
    }

    public static void main(String arg[]){//main--来自高金磊
        System.out.println(Math.sqrt(19564));

        new Main().isPerfectSquare(19564);
    }
}
