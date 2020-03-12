/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.分割回文串;

import java.util.ArrayList;
import java.util.List;

public class Main {
    char[] data;
    ArrayList<List<String>> res=new ArrayList<>();
    public List<List<String>> partition(String s) {
        data=s.toCharArray();
        plus(new ArrayList<>(data[0]), 0, ""+data[0]);
        return res;
    }

    private void plus(ArrayList<String> da,int i,String middle){
        if (i==data.length-1){
            if (check(middle)) {
                da.add(middle);
                res.add(da);
            }
            return;
        }
       if (middle.length()==1||check(middle))
       {
           plus(new ArrayList<>(da), ++i, middle+data[i]);
           da.add(middle);
           middle=""+data[i];
           plus(da, i, middle);

       }else
           plus(da, ++i, middle+data[i]);

    }
    boolean check(String data){
        int s=0,e=data.length()-1;
        while (s<e){
            if (data.charAt(s++)!=data.charAt(e--))
                return false;
        }
        return true;

//        return data.equals(new StringBuffer(data).reverse().toString());
    }

}
