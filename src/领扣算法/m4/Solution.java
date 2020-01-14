package 领扣算法.m4;

import java.util.Collections;
//罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
//
//        字符          数值
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//        例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
//
//        通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
//
//        I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//        X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
//        C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
//        给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。

public class Solution {
    public String intToRoman(int num) {
        StringBuffer result=new StringBuffer("");
        int M,C,X,I;
        M=num/1000;
        C=num/100%10;
        X=num/10%10;
        I=num%10;
        result.append(String.join("", Collections.nCopies(M, "M")));
        if (C==4){
            result.append("CD");
            C=0;
        }else
        if (C==9){
            result.append("CM");
            C=0;
        }else
        if (C>=5){
          result.append("D");
            C-=5;
        }
        result.append(String.join("", Collections.nCopies(C, "C")));
        if (X==4){
            result.append("XL");
            X=0;
        }else
        if (X==9){
            result.append("XC");
            X=0;
        }else
        if (X>=5){
            result.append("L");
            X-=5;
        }
        result.append(String.join("", Collections.nCopies(X, "X")));
        if (I==4){
            result.append("IV");
            I=0;
        }else
        if (I==9){
            result.append("IX");
            I=0;
        }else
            if (I>=5){
                result.append("V");
                I-=5;
            }

        result.append(String.join("", Collections.nCopies(I, "I")));
        return result.toString();
    }


    public static void main(String arg[]){//main--来自高金磊
     Solution   solution=new Solution();
     System.out.print(solution.intToRoman(58));
    }
}