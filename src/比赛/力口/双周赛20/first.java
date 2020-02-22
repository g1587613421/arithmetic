/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.双周赛20;

public class first {
    int cou[];
    public int[] sortByBits(int[] arr) {
      cou=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            cou[i]=plus(arr[i]);
        }
        int middle;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (cou[i]>cou[j])
                {
                    middle=cou[i];
                    cou[i]=cou[j];
                    cou[j]=middle;

                    middle=arr[i];
                    arr[i]=arr[j];
                    arr[j]=middle;


                }
                if (cou[i]==cou[j]){
                    if (arr[i]>arr[j]){
                        middle=arr[i];
                        arr[i]=arr[j];
                        arr[j]=middle;
                    }
                }
            }

        }
        return arr;
    }
    int middle;
    int plus(int nu){
        middle=0;
        while (nu!=0){
            middle+=nu&1;
            nu>>=1;
        }
        return middle;
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new first().sortByBits(new int[]{0,1,2,3,4,5,6,7,8});
    }
}
