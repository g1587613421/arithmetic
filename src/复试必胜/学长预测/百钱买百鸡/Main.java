/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.百钱买百鸡;

public class Main {
    
    public static void main(String arg[]){//main--来自高金磊
        int num1=0,num2=0,num3=0;
        int money=0;
        for (int i = 0; i <= 20; i++) {
            for (int i1 = 0; i1 <= 33; i1++) {
                if ((100-i-i1)%3!=0)
                    continue;
                money=i*5+i1*3+(100-i-i1)/3;
                if(money>100)
                    break;
                if (money==100){
                    System.out.println("可行方案:");
                    System.out.println(i+"  "+i1+"   "+(100-i-i1));
                }
            }

        }
    }
}
