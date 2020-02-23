/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛177;

import java.util.Arrays;

public class fifth {
    public String largestMultipleOfThree(int[] digits) {
        boolean f=false;
        int count=0;
        StringBuffer res=new StringBuffer();
        Arrays.sort(digits);
        for (int digit : digits) {
            count+=digit;
            res.append(digit);
        }
        int flag=count%3;
        if (flag==0)
            return plus(res.reverse().toString());
        for (int i = 0; i < digits.length; i++) {
            if (digits[i]%3==flag)
            {
                f=true;
                flag=i;
                break;
            }
        }
        if (f)
        return plus(res.deleteCharAt(flag).reverse().toString());
        else return "";
    }

    String plus(String s){
        while (s.startsWith("0")&&s.length()>1)
           s= s.substring(1);
        return s;
    }
}
