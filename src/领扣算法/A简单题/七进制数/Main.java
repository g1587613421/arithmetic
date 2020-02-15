/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.七进制数;

public class Main {
    StringBuffer middle=new StringBuffer();
    public String convertToBase7(int num) {
        String flag="";
        if (num==0)
            return "0";
        if (num<0)
        {
            num=-num;
           flag="-";
        }

        while (num!=0){
            middle.append(num%7);
            num/=7;
        }
        return flag+middle.reverse().toString();
    }
}
