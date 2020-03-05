/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.交换字符串中的元素;

import java.util.List;

public class Main {

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        char[] data=s.toCharArray();
        char middle;
        boolean flag=true;
        while (flag){
            flag=false;
            for (List<Integer> pair : pairs) {
                if (data[pair.get(0)]>data[pair.get(1)])
                {
                    flag=true;
                    middle=data[pair.get(0)];
                    data[pair.get(0)]=data[pair.get(1)];
                    data[pair.get(1)]=middle;
                    break;
                }
            }
        }
        return new String(data);
    }
}
