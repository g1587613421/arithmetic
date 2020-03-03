/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.分式化简;

public class Main {
    public int[] fraction(int[] cont) {
        int res[]=new int[]{1,cont[cont.length-1]};
        int middle;

        for (int i = cont.length-2; i >=0 ; i--) {
            res[0]+=res[1]*cont[i];
            middle=res[1];
            res[1]=res[0];
            res[0]=middle;

        }
        middle=res[1];
        res[1]=res[0];
        res[0]=middle;
        return res;

    }
}
