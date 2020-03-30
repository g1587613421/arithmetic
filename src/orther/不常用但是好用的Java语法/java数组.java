/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.不常用但是好用的Java语法;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class java数组 {
    
    public static void main(String[] arg){//main--来自高金磊
        int[] nums = new int[10];
        Arrays.fill(nums,1);
        IntSummaryStatistics intSummaryStatistics=Arrays.stream(nums).summaryStatistics();
        System.out.println(intSummaryStatistics);
        // IntSummaryStatistics
//    private long count;
//    private long sum;
//    private int min = Integer.MAX_VALUE;
//    private int max = Integer.MIN_VALUE;
        System.out.print(intSummaryStatistics.getAverage());
        nums[5]=10;
        System.out.println(Arrays.stream(nums).max().getAsInt());
        System.out.println(Arrays.stream(nums).sum());
        System.out.println(Arrays.stream(nums).reduce((a,b)->(a+b)));
        System.out.println(Stream.of(1, 2, 3, 4).reduce(0, (max, item) -> Math.max(max, item)));
        System.out.println(Stream.of(1, 2, 3, 4).reduce(0, Integer::max));
        showNums(nums);
        System.out.println();
        System.out.println(Arrays.stream(nums).reduce((a,b)->(a*b)).getAsInt());


        int[][] middle=new int[5][2];
       Arrays.fill( middle[0],5);
        //力扣常见的关于二位数据结构的排序
        Arrays.sort(middle,(a,b)->(a[0]==b[0]?a[1]-b[1]:a[0]-b[0]));
        //等于这样写
        Arrays.sort(middle,new Comparator<int[]>(){

            @Override
            public int compare(int[] a, int[] b) {
                return a[0]==b[0]?a[1]-b[1]:a[0]-b[0];
            }
        });


    }
    private static void showNums(int[] nums){
        for (int num : nums) {
            System.out.print(num+"  ");
        }
    }
    
}
