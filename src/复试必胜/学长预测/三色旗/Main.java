/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.学长预测.三色旗;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]){//main--来自高金磊

         Scanner scanner=new Scanner(System.in);
         char[] chars = scanner.next().toCharArray();
         char[] chars1=new char[chars.length];//方法二使用
         char[] chars2=new char[chars.length];//方法二使用
         //双改进的快排---方法错误
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case 'b':
                    chars[i]=0;
                    chars1[i]=0;//方法二使用
                    chars2[i]=0;//方法二使用
                    break;
                case 'w':
                    chars[i]=1;
                    chars1[i]=1;//方法二使用
                    chars2[i]=1;//方法二使用
                    break;
                case 'r':
                    chars[i]=2;
                    chars1[i]=2;//方法二使用
                    chars2[i]=2;//方法二使用
            }
        }
        int sta=0;
        int end=0;
        char middle;
        int count=0;
        while (end<chars.length&&sta<chars.length)
        {
            while (sta<chars.length&&chars[sta]==0){
                sta++;
            }
            while (end<chars.length&&chars[end]!=0){
                end++;
            }
            if (sta<chars.length&&end<chars.length){
                middle=chars[sta];
                chars[sta]=chars[end];
                chars[end]=middle;
                count++;
            }
        }
        end=sta;
        while (end<chars.length&&sta<chars.length)
        {
            while (sta<chars.length&&chars[sta]==1){
                sta++;
            }
            while (end<chars.length&&chars[end]!=1){
                end++;
            }
            if (sta<chars.length&&end<chars.length){
                middle=chars[sta];
                chars[sta]=chars[end];
                chars[end]=middle;
                count++;
            }
        }
        System.out.println("方法一:"+count);

        Arrays.sort(chars2);
        int count1=0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i]!=chars2[i])
            {
                count1++;
            }
        }
        System.out.println("方法二:"+count1/2);
    }
}
