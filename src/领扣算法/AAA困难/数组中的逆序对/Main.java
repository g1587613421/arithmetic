/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AAA困难.数组中的逆序对;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public int reversePairs(int[] nums) {
        Integer[] data=new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            data[i]=nums[i];
        }
        final int[] count = {0};
        Arrays.sort(data,new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                int middle=o1-o2;
                count[0] +=middle<0?1:0;
                return middle;
            }
        });
        return count[0];
    }

    //err
//    public int reversePairs(int[] nums) {
//        int[][] data=new int[nums.length][2];
//        for (int i = 0; i < nums.length; i++) {
//            data[i]=new int[]{nums[i],i};
//        }
//        Arrays.sort(data,(a,b)->(a[0]-b[0]));
//        int count=0;
//        for (int i = 0; i < data.length; i++) {
//            int co=data[i][1]-i;
//            count+=co<0?0:(co==0?1:co);
//        }
//        return count;
//    }


    //time_out
//    public int reversePairs(int[] nums) {
//        ArrayList<Integer> data=new ArrayList<>();
//        for (Integer num : nums) {
//            data.add(num);
//        }
//        Arrays.sort(nums);
//        int count=0;
//        for (int i = 0; i < nums.length-1; i++) {
//            int index=data.indexOf(nums[i]);
//            count+=index;
//            data.remove(index);
//        }
//        return count;
//    }
}
