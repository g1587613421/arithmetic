/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.春季编程竞赛2020团队赛;

public class second {
    int min=Integer.MAX_VALUE;
    public int minTime(int[] time, int m) {
        if (m>=time.length)
            return 0;
       //去掉最大的
        for (int i = 0; i < m; i++) {
            int index=0;
            for (int j = 0; j < time.length; j++) {
                if (time[index]<time[j]){
                    index=j;
                }
            }
            time[index]=-1;
        }

        plus(time, 0, m-1, 0);
        return min;
    }
private void plus(int[] time,int index,int m,int max){
        if (max==3)
        {
            max=3;
        }
        if (max>min)
            return;
        if (index>=time.length){
            min=max;
        }
        if (m<=0){
            return;
        }
        int pase=0;
        int ti=0;
    for (int i = index; i < time.length; i++) {
        if (time[i]==-1){
            if (pase++==1){
                index=i;
                break;
            }
        }else {
            ti+=time[i];
            max=Math.max(max, ti);
            plus(time, i+1, m-1, max);
        }
    }
    //出现两次-1;
    if (index<time.length-1)
    plus(time, index, m-1,Math.max(max, ti));
    else min=Math.min(min, Math.max(max, ti));
}
    
    
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new second().minTime(new int[]{1,2,3,3}, 2));
    }

}
