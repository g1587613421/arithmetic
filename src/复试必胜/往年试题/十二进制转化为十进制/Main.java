/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.十二进制转化为十进制;

public class Main {

    private long DuodecimalToDecimal(String num){
        if (num.length()==0)
            return 0;
        char[] data=num.toCharArray();
        int nums[]=new int[data.length];
        for (int i = 0; i <nums.length ; i++) {
            switch (data[i]){
                case 'a':
                    nums[i]=10;
                    break;
                case 'b':
                    nums[i]=11;
                    break;
                default: {
                        nums[i]=data[i]-'0';
                }
            }
            
        }
        boolean flag=data[0]=='-';
        int middle=1;
        int index=nums.length-1;
        long res=0;
        while (index>0){//第一个有可能是符号位暂时不计算
            res+=nums[index]*middle;
            middle*=12;
            index--;
        }
        if (flag)
            res=-res;
        else {
           res+=middle*nums[0];
        }
        return res;
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new Main().DuodecimalToDecimal("32814a9a"));
        System.out.println(new Main().DuodecimalToDecimal("0"));
        System.out.println(new Main().DuodecimalToDecimal("-32814a9a"));
        System.out.println(new Main().DuodecimalToDecimal("bb"));
        System.out.println(new Main().DuodecimalToDecimal("abababb"));
    }
}
