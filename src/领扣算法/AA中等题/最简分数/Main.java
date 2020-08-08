/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.最简分数;

import java.util.LinkedList;
import java.util.List;

public class Main {
    LinkedList<String> res=new LinkedList<>();
    public List<String> simplifiedFractions(int n) {
        for (int i = 2; i <= n; i++){
            for (int j = 1; j < i; j++) {
                if (check(j, i)){
                    res.addLast(""+j+"/"+i);
                }
            }
        }
        return res;
    }

    //charge A与B是否有最小公倍数
    private boolean check(int A,int B){
        int max=Math.max(A, B);
        int min=A-max+B;
        if (min==1)
            return true;
        if (max%min==0)
            return false;
        return check(max-min, min);
    }
}
