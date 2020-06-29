/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.算法设计期末考试复习.活动安排;

public class Main {
    public static int Issue(int s[],int e[]){
        //sort by end time
        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j < s.length; j++) {
                if (e[i]>e[j]){
                    int middle=e[i];
                    e[i]=e[j];
                    e[j]=middle;
                    middle=s[i];
                    s[i]=s[j];
                    s[j]=middle;
                }
            }
        }

        //use Algorithm to select
        int last_time=0;//record the early end time
        int count=0;
        for (int i = 0; i < s.length; i++) {
            if (s[i]>=last_time)
            {
                count++;
                last_time=e[i];
            }
        }
        return count;
    }
    
    public static void main(String arg[]){//main--来自高金磊
        System.out.println(Issue(new int[]{2,1,3,1}, new int[]{3,4,5,2}));

    }
}
