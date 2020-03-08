/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛179;

public class second {
    public int numTimesAllBlue(int[] light) {
        boolean[] data=new boolean[light.length];
        int count=0;
        for (int i : light) {
            data[i-1]=true;
            count+=plus(data)?1:0;
        }
        return count;

    }
    boolean plus(boolean[] data){
        boolean b=false;
        for (int i = data.length-1; i >=0 ; i--) {
            if (b||data[i]){
                b=true;
                if (!data[i])
                    return false;
            }
        }

        return true;
    }
}
