/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.数字转换为十六进制数;

import java.util.LinkedList;

public class Main {
    LinkedList<Integer> nu=new LinkedList<>();
    StringBuffer res=new StringBuffer();
    char[] nums={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    public String toHex(int num) {
        if (num==0)
            return "0";
        while (num!=0&&nu.size()<32){
            nu.addLast(num&1);
            num=num>>1;
        }
        while (!nu.isEmpty())
        {
            int a1=nu.peek()==null?0:nu.pop();
            int a2=nu.peek()==null?0:nu.pop();
            int a3=nu.peek()==null?0:nu.pop();
            int a4=nu.peek()==null?0:nu.pop();
            res.insert(0,nums[a1+a2*2+a3*4+a4*8]);
        }

        return res.toString();
    }
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new Main().toHex(-1));
    }
}
