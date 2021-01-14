/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.可被5整除的二进制前缀;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public List<Boolean> prefixesDivBy5(int[] A) {
        LinkedList<Boolean> data=new LinkedList<>();
        int middle=0;
        for (int i = 0; i < A.length; i++) {
            middle<<=1;
            middle+=A[i];
            data.addLast(middle%5==0);
            middle=middle%10;
        }
        return data;
    }
}
