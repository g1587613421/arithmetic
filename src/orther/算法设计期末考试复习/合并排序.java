/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.算法设计期末考试复习;

public class 合并排序 {//归并排序的分治用法


    //原地算法
private  void sort(int arr[]){
     sort(arr,0,arr.length-1);
}
private  void sort(int arr[],int left,int right){//分割
    if (left==right)//不能再小了
        return;
    int middle=left+(right-left)/2;
    sort(arr,left,middle);
    sort(arr,middle+1,right);
    merge(arr, left, middle, right);
}
//原地归并
private void merge(int[] arr,int left,int middle,int right){
    middle++;
    int[] temp=new int[right-left+1];
    for (int i = 0; i < temp.length; i++) {
        if (middle>right||arr[left]<arr[middle]){
            temp[i]=arr[left];
            left++;
        }
        else {
            temp[i]=arr[middle];
            arr[middle]=Integer.MAX_VALUE;//这样就能防止左边越界
            middle++;
        }
    }
    left=right-temp.length+1;
    for (int i = 0; i <temp.length; i++) {
        arr[left+i]=temp[i];
    }

}
public static void main(String arg[]){//main--来自高金磊

    int[] nums={5,4,8,6,2,1,47,7,3,2,5,8,9,4};
    new 合并排序().sort(nums);
    for (int num : nums) {
        System.out.print(num+"\t");
    }
}

}
