/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.算法设计期末考试复习;

public class 合并排序递归 {
  static    void sort(int[] data,int start,int end){
        if (start>=end){
            return;
        }
        int middle=start+(end-start)/2;
        sort(data, start, middle);
        sort(data, middle+1, end);
        merge(data, start, middle,end);

    }
  static   void merge(int[] data,int start,int middle,int end){
        int ss=start;
        int ss2=middle+1;
        int da[]=new int[end-start+1];
        for (int i = 0; i < da.length; i++) {
            if (ss>middle)
            {
                da[i]=data[ss2++];
                continue;
            }
            if (ss2>end){
                da[i]=data[ss++];
                continue;
            }
            if (data[ss]>data[ss2]){
                da[i]=data[ss2];
                ss2++;

            }
            else {
                da[i]=data[ss];
                ss++;
            }

        }
        for (int i = 0; i < da.length; i++) {
            data[start+i]=da[i];
        }
    }

    public static void main(String arg[]){//main--来自高金磊
      int[] data={1,4,2,1,21,231,34,5,675,5};
      sort(data, 0, data.length-1);

    }
}
