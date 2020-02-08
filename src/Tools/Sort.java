/*
 * Copyright (c) 2020.版权所有高金磊
 */

package Tools;

public class Sort {


    /**
     * 整数数组快速排序--全局--原地
     * @param num int型数组
     */
    public static void QuickSort(int[] num) {
        if (num.length!=0)
            QuickSort(num, 0, num.length-1);
    }
    /**
     * 快速排序-局部--原地
     * @param num	排序的数组
     * @param left	数组的前针
     * @param right 数组后针
     */
    public static void QuickSort(int[] num, int left, int right) {
        //如果left等于right，即数组只有一个元素，直接返回
        if(left>=right) {
            return;
        }
        //设置最左边的元素为基准值
        int key=num[left];
        //数组中比key小的放在左边，比key大的放在右边，key值下标为i
        int i=left;
        int j=right;
        while(i<j){
            //j向左移，直到遇到比key小的值
            while(num[j]>=key && i<j){
                j--;
            }
            //i向右移，直到遇到比key大的值
            while(num[i]<=key && i<j){
                i++;
            }
            //i和j指向的元素交换
            if(i<j){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
        num[left]=num[i];
        num[i]=key;
        QuickSort(num,left,i-1);
        QuickSort(num,i+1,right);
    }

}
