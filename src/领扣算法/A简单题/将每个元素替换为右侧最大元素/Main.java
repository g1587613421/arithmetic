/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.将每个元素替换为右侧最大元素;

public class Main {

    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=plus(arr, i);
        }
        return arr;
    }
    private int plus(int[] arr,int start){
        int max=-1;
        for (int i = start+1; i < arr.length; i++) {
            max=Math.max(max, arr[i]);
        }
        return max;
    }
}
