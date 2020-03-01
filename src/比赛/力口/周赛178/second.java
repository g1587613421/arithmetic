/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛178;

import java.util.Arrays;
import java.util.Comparator;

public class second {
    public String rankTeams(String[] votes) {
        int[][] data=new int[26][27];
        for (String vote : votes) {
            char[] middle=vote.toCharArray();
            for (int i = 0; i < middle.length; i++) {
                data[middle[i]-'A'][i]++;
            }
        }
        for (int i = 0; i < data.length; i++) {
            data[i][data[i].length-1]=i;
        }
        Arrays.sort(data,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                for (int i = 0; i < o1.length-1; i++) {
                    if (o1[i]==o2[i])
                        continue;
                    if (o1[i]>o2[i])
                        return -1;
                    else return 1;
                }
                return o1[o1.length-1]-o2[o1.length-1];
            }
        });
        StringBuffer stringBuffer= new StringBuffer();
        for (int[] datum : data) {
            if (votes[0].contains(""+(char)('A'+datum[datum.length-1])))
            stringBuffer.append((char)('A'+datum[datum.length-1]));
        }

        return stringBuffer.toString();
    }
    public static void main(String arg[]){//main--来自高金磊
    
        new second().rankTeams(new String[]{"AB","BA"});
    }
}
