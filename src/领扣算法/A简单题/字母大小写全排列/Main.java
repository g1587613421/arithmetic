/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.字母大小写全排列;

import java.util.ArrayList;
import java.util.List;

public class Main {
    ArrayList<String> data=new ArrayList<>();
    char[]  chars;
    public List<String> letterCasePermutation(String S) {
        S=S.toLowerCase();
        chars=S.toCharArray();
        StringBuffer middle=new StringBuffer();
        Plus(middle, 0);
        return data;
    }
    void Plus(StringBuffer midd,int n){
        for (int i = n; i <chars.length; i++) {
            if (chars[i]<='z'&&chars[i]>='a'){
                StringBuffer stringBuffer=new StringBuffer(midd);
                midd.append(chars[i]);
                stringBuffer.append((char)(chars[i]-32));
                Plus(stringBuffer,i+1);
                Plus(midd, i+1);
                return;
            }else midd.append(chars[i]);
        }
        data.add(midd.toString());
    }
    
    public static void main(String[] arg){//main--来自高金磊
    
        System.out.println('A'-'a');
    }

}
