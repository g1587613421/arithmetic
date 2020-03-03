/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.时钟指针的夹角;

public class Main {

    public double angleClock(int hour, int minutes) {
        double h=360d/12d*hour+0.5d*minutes;
        double m=360d/60*minutes;
        return Math.abs(h-m)>180?360-Math.abs(h-m):Math.abs(h-m);
    }
}
