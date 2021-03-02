/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.求最长公共子序列;

public class Main {

    private String find_Max_String(String s1,String s2){
        //二维DP
        if (s1.length()==0||s2.length()==0){
            return "";
        }
        //数据初始化
        String[][] data=new String[s1.length()][s2.length()];
        char[] chars1=s1.toCharArray();
        char[] chars2=s2.toCharArray();
        String res="";
        //初始化DP列
        for (int i = 0; i < data.length; i++) {
            if(chars1[i]==chars2[0]){
                data[i][0]=""+chars1[i];
                res=data[i][0];
            }
        }
        //初始化Dp行
        for (int i = 0; i < data[0].length; i++) {
            if(chars2[i]==chars1[0]){
                data[0][i]=""+chars1[0];
                res=data[0][i];
            }
        }

        for (int i = 1; i < data.length; i++) {
            for (int j = 1; j < data[0].length; j++) {
                if (chars1[i]==chars2[j]) {
                    data[i][j] = data[i - 1][j - 1] + chars1[i];
                    if (data[i][j].length()>res.length())
                        res=data[i][j];
                }
                else {
                    data[i][j]="";
                }
            }
        }
        return res;
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new Main().find_Max_String("sarandroid","arandrom"));
        System.out.println(new Main().find_Max_String("a","arandrom"));
    }

}
