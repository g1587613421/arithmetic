/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.查找;

import java.util.Random;

public class Setting
{
   static int[] test_nums_ran;//随机无序数
   static int[] test_nums_order;//随机有序数

    public static int[] gettest_nums_ran(int size){
        test_nums_ran=new int[size];
        Random random=new Random(System.currentTimeMillis()%100);//伪随机算法
        for (int anInt : random.ints(size).toArray()) {
            if (size<=0)
                break;
            test_nums_ran[--size]=anInt;
        }
        return test_nums_ran;
    }

    public static int[] getTest_nums_order(int size) {
        test_nums_order=new int[size];
        for (int i = 0; i <size ; i++) {
            test_nums_order[i]= (int) (i*2+2*Math.random());
        }
        return test_nums_order;
    }

    public static void print_array(int[] nums){
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (i%10==9){
                System.out.println();
            }
            System.out.print(nums[i]+"  ");

        }
    }


    public static void main(String arg[]){//main--来自高金磊
        print_array(gettest_nums_ran(20));
        print_array(getTest_nums_order(20));

    }
}
