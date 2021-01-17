/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.AA中等题.累加数;

import java.util.LinkedList;

public class Main {
    public boolean isAdditiveNumber(String num) {
        if (num.length()<=2)
            return false;
        char[] ini=num.toCharArray();
        LinkedList<Integer> data=new LinkedList<>();
        for (int i = 0; i < ini.length; i++) {
            data.add(ini[i]-'0');
        }
        long middle=0;

        do {
            middle*=10;
            middle+=data.pollFirst();
            if (middle<0)
                return false;
            if (isRes(new LinkedList<Integer>(data),middle))
                return true;
        }while (middle!=0&&!data.isEmpty());
        return false;
    }

    boolean isRes(LinkedList<Integer> data,long num){//二级
        if (data.isEmpty())
            return false;
        long middle=0;
        do
        {
            middle*=10;
            middle+=data.pollFirst();

            if (middle<0)
                return false;
            if (!data.isEmpty()&&isresult(new LinkedList<>(data),middle,middle+num))
                return true;
        }while (!data.isEmpty()&&middle!=0);
        return false;
    }
    boolean isresult(LinkedList<Integer> data,long first,long target){//最终验证
        if (data.isEmpty())
            return true;
        long middle=data.pollFirst();
        if (middle==0){
            return middle==target;
        }
        while (middle<target&&!data.isEmpty())
        {
            middle*=10;
            middle+=data.pollFirst();
        }
        if (middle!=target)
            return false;
        return isresult(data, target,first+=target);

    }
}
