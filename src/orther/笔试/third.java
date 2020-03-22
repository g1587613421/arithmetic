/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.笔试;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class third {
    
    public static void main(String[] arg){//main--来自高金磊
        Scanner scanner=new Scanner(System.in);
        String[] data=scanner.nextLine().split(",");
        int[][] value = new int[data.length][2];
        for (int i = 0; i < data.length; i++) {
            value[i]=new int[]{plus(data[i]),i};
        }
        Arrays.sort(value,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]%10!=o2[0]%10)
                {
                    return -o1[0]%10+o2[0]%10;
                }
                else
                    return -o2[0]/10+o1[0]/10;
            }
        });
        StringBuffer res=new StringBuffer();
        for (int[] ints : value) {
            if (ints[0]==0)
                break;
            res.append(data[ints[1]]).append(",");
        }
        System.out.println(res.length()==0?"null":res.deleteCharAt(res.length()-1).toString());

    }

    static int plus(String s){
        s=s.substring(3);
        char[] mm=s.toCharArray();
        int va=0;
        int va2=0;
        int middle=1;
        for (int i = 1; i < mm.length; i++) {
            if (mm[i]-mm[i-1]==1){
                middle++;
            }else{
                va=Math.max(va, middle);
                middle=1;
            }
        }
        va=Math.max(va, middle);
        middle=1;
        for (int i = 1; i < mm.length; i++) {
            if (mm[i]-mm[i-1]==-1){
                middle++;
            }else{
                va=Math.max(va, middle);
                middle=1;
            }
        }
        va=Math.max(va, middle);
        middle=1;
        for (int i = 1; i < mm.length; i++) {
            if (mm[i]-mm[i-1]==0){
                middle++;
            }else{
                va2=Math.max(va2, middle);
                middle=1;
            }
        }
        va2=Math.max(va2, middle);
        va=(va>=3?va:0);
        va2=(va2>=3?va2:0);

        return va2>va?va2:(10*va+va);

    }
}
