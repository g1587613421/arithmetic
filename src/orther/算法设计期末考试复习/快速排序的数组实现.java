/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.算法设计期末考试复习;

public class 快速排序的数组实现 {
    private void quick_sort(int[] arr){
        quick_sort(arr, 0, arr.length-1);
    }
    private void quick_sort(int[] arr,int start,int end){
        if (start>=end)
            return;
        int s=start;
        int e=end;
//        int base=arr[s];
        while (s<e){
            while (arr[s]<arr[e]&&s<e){
                    e--;
            }
            int middle=arr[s];
            arr[s]=arr[e];
            arr[e]=middle;
            s++;
            while (arr[s]<arr[e]&&s<e){
                s++;
            }
             middle=arr[s];
            arr[s]=arr[e];
            arr[e]=middle;
            e--;
        }
        quick_sort(arr, start, s-1);
        quick_sort(arr, s+1, end);
    }
    
    public static void main(String arg[]){//main--来自高金磊
        int[] nums={5,4,8,6,2,1,47,7,3,2,5,8,9,4};
        new 快速排序的数组实现().quick_sort(nums);
        for (int num : nums) {
            System.out.print(num+"\t");
        }
    }

}
