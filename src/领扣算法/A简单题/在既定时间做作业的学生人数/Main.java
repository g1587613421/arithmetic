/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.在既定时间做作业的学生人数;

public class Main {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res=0;
        for (int i = 0; i < startTime.length; i++) {
            res+=startTime[i]<=queryTime&&endTime[i]>=queryTime?1:0;
        }
        return res;
    }
}
