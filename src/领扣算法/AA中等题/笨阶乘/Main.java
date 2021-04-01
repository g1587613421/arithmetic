/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.笨阶乘;

import java.util.LinkedList;

public class Main {
    public int clumsy(int N) {
        if (N==0)
            return 0;
        LinkedList<Integer> data=new LinkedList<>();
        data.addLast(N);
        int count=0;
        while (N-->1)
        switch (count++%4)
        {
            case 0:
                data.addLast(data.pollLast()*N);
                break;
            case 1:
                data.addLast(data.pollLast()/N);
                break;
            case 2:
                data.addLast(N);
                break;
            case 3:
                data.addLast(-N);
                break;
        }
        while (data.size()>1){
            data.addLast(data.pollLast()+data.pollLast());
        }
        return data.pollLast();
    }

}
