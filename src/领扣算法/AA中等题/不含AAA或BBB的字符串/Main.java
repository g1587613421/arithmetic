/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.不含AAA或BBB的字符串;

public class Main {
    public String strWithout3a3b(int A, int B) {
        StringBuffer res=new StringBuffer();
        int cc=A>B?0:1;
        while (A>0||B>0){
            switch (cc++%2){
                case 0:
                {
                    if (A>B){
                        if (A>1)
                        {
                            res.append("aa");
                            A-=2;
                        }
                        else {
                            res.append("a");
                            A--;
                        }
                    }
                    else {
                        if (A>0){
                            res.append("a");
                            A--;
                        }
                    }
                    break;
                }
                case 1:{
                    if (B>A){
                        if (B>1)
                        {
                            res.append("bb");
                            B-=2;
                        }
                        else {
                            res.append("b");
                            B--;
                        }
                    }
                    else {
                        if (B>0){
                            res.append("b");
                            B--;
                        }
                    }
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] arg){//main--来自高金磊

        new Main().strWithout3a3b(2,5);
    }
}
