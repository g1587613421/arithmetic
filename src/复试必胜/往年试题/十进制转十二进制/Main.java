/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.十进制转十二进制;

import java.util.LinkedList;

public class Main {
    char[] chars=new char[]{'0','1','2','3','4','5','6','7','8','9','a','b'};
    private String TenToTwelve(int num){
        StringBuilder stringBuilder=new StringBuilder();
        boolean flag=num<0;
        LinkedList<Character> res=new LinkedList<>();
        if (flag)
            num=-num;

       do {
            res.addFirst(chars[num%12]);
            num/=12;
        } while (num>0);
        stringBuilder.append(flag?'-':"");
        for (Character re : res) {
            stringBuilder.append(re);
        }
        return stringBuilder.toString();
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new Main().TenToTwelve(156));
        System.out.println(new Main().TenToTwelve(115487254));
        System.out.println(new Main().TenToTwelve(-115487254));
        System.out.println(new Main().TenToTwelve(0));
        System.out.println(new Main().TenToTwelve(131));
    }
}
