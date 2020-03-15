/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.强整数;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {


    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        ArrayList<Integer> middle=new ArrayList<>();
        int mm=1;
        while (mm<=bound){
            middle.add(mm);
            mm*=x;
            if (mm==1)
                break;
        }
        HashSet<Integer> res=new HashSet<>();
        mm=1;
        while (mm<=bound){
            for (Integer integer : middle) {
                if (integer+mm>bound)
                    break;
                res.add(integer+mm);
            }
            if (y==1)
                break;
            mm*=y;
        }

        return new ArrayList<>(res);
    }

    //看错题了,这个是倍数不是指数
//    boolean[] data;
//    public List<Integer> powerfulIntegers(int x, int y, int bound) {
//        data=new boolean[bound+1];
//        data[0]=true;
//        for (int i = 0; i < data.length; i++) {
//            if (data[i]){
//                if (i+x<data.length&&!data[i+x])
//                data[i+x]=true;
//                if (i+y<data.length&&!data[i+y])
//                    data[i+y]=true;
//            }
//        }
//        ArrayList<Integer> result=new ArrayList<>();
//        for (int i = 1; i < data.length; i++) {
//            if (data[i])
//                result.add(i);
//        }
//        return result;
//    }
}
