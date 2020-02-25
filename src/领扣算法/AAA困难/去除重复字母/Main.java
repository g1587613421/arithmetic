/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AAA困难.去除重复字母;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    char data[];
    int[][] cs;
    public String removeDuplicateLetters(String s) {
       cs=new int['z'-'a'+1][2];
        data=s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            cs[i][1]=i+'a';
        }
        for (int i = 0; i < data.length; i++) {
            cs[data[i]-'a'][0]=plus(data[i],i);
        }
        StringBuffer middle=new StringBuffer();

        Arrays.sort(cs,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int[] c : cs) {
            if (c[0]==0)
                continue;
            middle.append((char)c[1]);
        }
        return middle.toString();
    }
    int plus(char c,int index){
        if (cs[c-'a'][0]==0)
            return index+1;
        for (int i = 0; i < c-'a'; i++) {
            if (cs[i][0]!=0&&cs[c-'a'][0]<cs[i][0])
                return index+1;
        }
        return cs[c-'a'][0];
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().removeDuplicateLetters("bcabc");
    }
}
