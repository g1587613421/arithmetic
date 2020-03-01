/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.组成的最大数字;

public class Main {

    public int maximum69Number (int num) {
        String data=""+num;
        return data.contains("6")?num+(int)( Math.pow(10d,(double) (data.length()-data.indexOf("6")-1))*3):num;
    }
    
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().maximum69Number(9669);
    }
}
