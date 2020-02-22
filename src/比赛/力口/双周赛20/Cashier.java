/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.双周赛20;

import java.util.HashMap;

public class Cashier {
    HashMap<Integer,Integer> data=new HashMap<>();
    int count=0;
    int n;
    double discount;
    public Cashier(int n, int discount, int[] products, int[] prices) {
        for (int i = 0; i < products.length; i++) {
            data.put(products[i],prices[i]);
        }
        this.n=n;
        this.discount=discount/100d;
    }
    int mon;
    public double getBill(int[] product, int[] amount) {
        mon=0;
        count++;
        for (int i = 0; i < product.length; i++) {
            mon+=data.get(product[i])*amount[i];
        }
        if (count==n+1)
        {
            count=0;
            return mon*discount;

        }
        return (double)mon;
    }
    public static String subZeroAndDot(String s){
        if(s.indexOf(".") > 0){
            s = s.replaceAll("0+?$", "");//去掉多余的0
            s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
        }
        return s;
    }
    
    
    
    public static void main(String arg[]){//main--来自高金磊

    }
}
