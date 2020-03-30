/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.圆圈中最后剩下的数字;

import java.util.ArrayList;

public class Main {

    public int lastRemaining(int n, int m) {
        if (n<2)
            return 0;
        ArrayList<Integer> data=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            data.add(i);
        }
        int middle=m%data.size()-1;
        while (data.size()>1){
            data.remove(middle);
            middle+=m-1;
            middle%=data.size();
        }

        return data.get(0);

    }
}
