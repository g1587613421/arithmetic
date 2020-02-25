/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.除法求值;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    HashMap<String, HashMap<String,Double>> data=new HashMap<>();

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        for (int i = 0; i < values.length; i++) {
            HashMap<String,Double> middle=data.getOrDefault(equations.get(i).get(0), new HashMap<>());
            middle.put(equations.get(i).get(1),values[i]);
            data.put(equations.get(i).get(0), middle);

            HashMap<String,Double> middle1=data.getOrDefault(equations.get(i).get(1), new HashMap<>());
            middle1.put(equations.get(i).get(0),1/values[i]);
            data.put(equations.get(i).get(1), middle1);
        }
        double[] result=new double[queries.size()];
        LinkedList<String> flag;
        for (int i = 0; i < result.length; i++) {
            flag=new LinkedList<>();
            flag.add(queries.get(i).get(0));
            result[i]=plus(queries.get(i).get(0), queries.get(i).get(1),flag);
            if (result[i]<0)
                result[i]=-1d;

        }
        return result;

    }
    //将一个字符转换成目标字符
    Double plus(String nows,String target,LinkedList<String> flag){

        System.out.println(nows+"\t"+target);
        HashMap<String,Double> middle=data.getOrDefault(nows,null);
        if (middle==null)
            return -1d;

        if (middle.containsKey(target))
            return middle.get(target);
        for (String s : middle.keySet()) {
            if (flag.contains(s))
            {
               continue;
            }
            LinkedList<String> mm=new LinkedList<>(flag);
            mm.add(s);
            double res= middle.get(s)*plus(s, target,mm);
            if (res>0)
                return res;
        }
        if (nows.equals(target))
            return 1d;
        return -1d;
    }
}
