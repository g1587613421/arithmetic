/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.检查整数及其两倍数是否存在;

import java.util.ArrayList;

public class Main {
    ArrayList data=new ArrayList();
    public boolean checkIfExist(int[] arr) {
        for (int i : arr) {
            data.add(i);
        }

        for (int i : arr) {
            if (data.contains(i*2)) {
                if (i==0){
                    data.remove(data.indexOf(i));
                    if (!data.contains(0))
                        continue;
                }
                return true;
            }
        }
        return false;
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().checkIfExist(new int[]{-2,0,10,-19,4,6,-8});
    }
}
