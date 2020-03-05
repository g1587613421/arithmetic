/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.不浪费原料的汉堡制作方案;

import java.util.LinkedList;
import java.util.List;

public class Main {
    List<Integer> result=new LinkedList<>();
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if (tomatoSlices%2!=0)
            return result;
        tomatoSlices/=2;
        for (int i = 0; i < cheeseSlices; i++) {
            if (i*2+(cheeseSlices-i)==tomatoSlices)
            {
                result.add(i);
                result.add(cheeseSlices-i);
                return result;
            }
            else if (i*2+(cheeseSlices-i)<tomatoSlices)
                break;

        }
        if (tomatoSlices==cheeseSlices&&cheeseSlices==0){
        result.add(0);
        result.add(0);}
        return result;
    }
}
