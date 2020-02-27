/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 蓝桥题库.算法训练.景点游览;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String arg[]){//main--来自高金磊

         Scanner scanner=new Scanner(System.in);
         Integer nums[]=new Integer[scanner.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scanner.nextInt();
        }
        Arrays.sort(nums,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (Integer num : nums) {
            System.out.print(num+" ");
        }
    }
}
