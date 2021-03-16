/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.和为n连续正数序列;

import java.util.Scanner;

public class Main
{
    public static void main(String arg[]){//main--来自高金磊
        //滑动窗口(前缀和+双指针)时间复杂度是n
        int target=new Scanner(System.in).nextInt();
        long data[]=new long[target];
        for (int i = 1; i < data.length; i++) {
            data[i]=data[i-1]+i;
        }
        int end=1;
        int start=0;
        while (end<data.length)
        {
            long middle = data[end] - data[start];
            if (middle<target){
                end++;
                continue;
            }
            if (middle==target)
            {
                for (int i = start+1; i <= end; i++) {
                    System.out.print(i+" ");
                }
                System.out.println();
                end++;
                continue;
            }
            start++;
        }
    }
}
