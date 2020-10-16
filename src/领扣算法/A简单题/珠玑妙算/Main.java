/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.珠玑妙算;

public class Main {

    public int[] masterMind(String solution, String guess) {
        char[] chars1=solution.toCharArray();
        char[] chars2=guess.toCharArray();
        int success=0;
        for (int i = 0; i <chars1.length; i++) {
            success+=chars1[i]==chars2[i]?1:0;
        }
        int so[]=new int[4];
        for (char c : chars1) {
            switch (c){
                case 'Y':
                    so[0]++;
                    break;
                case 'R':
                    so[1]++;
                    break;
                case 'G':
                    so[2]++;
                    break;
                case 'B':
                    so[3]++;
            }
        }
        int so1[]=new int[4];
        for (char c : chars2) {
            switch (c){
                case 'Y':
                    so1[0]++;
                    break;
                case 'R':
                    so1[1]++;
                case 'G':
                    so1[2]++;
                    break;
                case 'B':
                    so1[3]++;
            }

        }
        int sum=0;
        for (int i = 0; i < so.length; i++) {
            sum+=Math.min(so[i],so1[i]);
        }
        return new int[]{success,sum-success};
    }
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().masterMind("RGRB"
               , "BBBY");
    }
}
