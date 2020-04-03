/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.排序;

public class Qp {
    public static void quickSort(int[] arr,int low,int high){
        if (low>=high)
            return;
        int base=arr[low];
        int sta=low,end=high;
        while (low<high){
            while (low<high&&arr[high]>=base)
                high--;
            arr[low]=arr[high];
            arr[high]=base;
            while (low<high&&arr[low]<=base)
                low++;
            arr[high]=arr[low];
            arr[low]=base;
        }
        quickSort(arr, sta, low-1);
        quickSort(arr, low+1, end);

    }

    public static void main(String[] arg){//main--来自高金磊
        int[] aa=new int[]{1,0};
        Qp.quickSort(aa,0,aa.length-1);
        System.out.println(aa);
    }
}
