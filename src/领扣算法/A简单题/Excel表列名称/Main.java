/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.Excel表列名称;

public class Main {
    public String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n != 0) {
            n --;//这里稍作处理，因为它是从1开始
            stringBuilder.append((char)(n % 26 + 'A'));
            n /= 26;
        }
        return stringBuilder.reverse().toString();
    }
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().convertToTitle(111);
    }
}


