/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.字典序排数;

import Tools.SimpleTimeTest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    ArrayList<Integer> list=new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        list.add(1);
        int loc=1;
        for (int i = 2; i <=n ; i++) {
            if (i%10!=0){
                list.add(loc++,i);
            }
            else {
                loc=list.indexOf(i/10)+1;
                list.add(loc++,i);
            }

        }
        return list;
    }


    public static void main(String[] arg){//main--来自高金磊

        SimpleTimeTest.TestMethod();
        new Main().lexicalOrder(5000);
        SimpleTimeTest.endMethod("");
    }
}
