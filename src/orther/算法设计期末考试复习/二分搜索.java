/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.算法设计期末考试复习;

public class 二分搜索 {

    static int Bsearch(int target,int[] data){//递归实现

        return Bsearch(target, data, 0, data.length-1);
    }
  private static int Bsearch(int target,int[] data,int start,int end){//递归实现
        if (start>end)
            return -1;
        int middle=start+(end-start)/2;
        if (data[middle]==target)
            return middle;
        if (data[middle]<target){
            return Bsearch(target, data, middle+1, end);
        }
        return Bsearch(target, data, start, middle-1);
    }
    static int BsearchCycle(int target,int[] data) {//非递归实现
        int start=0,end=data.length-1;
        while (start<=end){
            int middle=start+(end-start)/2;
            if (data[middle]>target){
                end=middle-1;
                continue;
            }
            else if (data[middle]<target){
                start=middle+1;
                continue;
            }
            return middle;

        }
        return -1;
    }
public static void main(String arg[]){//main--来自高金磊
       int[] ints=new int[]{1,3,9,100,103,104,105};
    for (int i = 0; i < ints.length; i++) {
        System.out.println("递归二分查询"+ints[i]+"索引是"+Bsearch(ints[i], ints));
        System.err.println("非递归查询"+ints[i]+"索引是"+BsearchCycle(ints[i], ints));
    }
    System.out.println("递归二分查询"+0+"索引是"+Bsearch(0, ints));
    System.err.println("非递归查询"+0+"索引是"+BsearchCycle(0, ints));
}

}
