/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.出栈序列;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]){//main--来自高金磊

        LinkedList<Integer> data=new LinkedList<>();
         Scanner scanner=new Scanner(System.in);
         int sum=scanner.nextInt();
         //最多有一次排序方式发生改变--最大值左边递增右边递减--参考力扣

        //模拟
        int nums[]=new int[sum];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=Integer.valueOf(Integer.valueOf(scanner.next()));
        }
        int n=1;
        for (int i = 0; i < nums.length; i++) {
            while (data.isEmpty()||data.peekLast()!=nums[i])
            {
                data.addLast(n);
                if (n>sum){
                    System.out.println(false);
                    return;
                }
                n++;
            }
            data.pollLast();
        }
        System.out.println(data.isEmpty());

    }

}
