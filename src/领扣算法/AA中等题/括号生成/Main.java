/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.括号生成;

import java.util.LinkedList;
import java.util.List;

public class Main {
    LinkedList<String> res;
    public List<String> generateParenthesis(int n) {

        res = new LinkedList<>();
        int l=n,r=n;
        plusL("", l, r);
        return res;
    }

    void plusL(String middle,int l,int r){
        middle+="(";
        l--;
        if (l>0)
            plusL(middle, l, r);
        plusR(new String(middle),l, r);
    }
    void plusR(String middle,int l,int r){
        middle+=")";
        r--;
        if (r==0&&l==0) {
            res.add(middle);
            return;
        }
        if (r>l)
            return;
        if (l>0){
            plusL(new String(middle), l, r);
        }
        plusR(middle, l, r);


    }
}
