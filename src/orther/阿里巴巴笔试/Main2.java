/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.阿里巴巴笔试;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] arg){//main--来自高金磊
         Scanner scanner=new Scanner(System.in);
         int n=scanner.nextInt();
         int m=scanner.nextInt();
         int k=scanner.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=scanner.nextInt();
        }
        int middle;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums[j]+=k;
            }
            Arrays.sort(nums);
            middle=nums[nums.length-1];
            for (int j = nums.length-1; j >0 ; j--) {
                if (middle==nums[j])
                    nums[j]/=2;
                else break;

            }

        }
        System.out.println(Arrays.stream(nums).sum());
    }
}
