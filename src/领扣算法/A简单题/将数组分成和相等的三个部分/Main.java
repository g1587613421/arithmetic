/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.将数组分成和相等的三个部分;

public class Main {

    public boolean canThreePartsEqualSum(int[] A) {
        int target=0;
        int[] middle = new int[A.length + 1];
        middle[0]=0;
        for (int i = 0; i < A.length; i++) {
            middle[i+1]=middle[i]+A[i];
        }
        if (middle[middle.length-1]%3!=0)
            return false;
        target=middle[middle.length-1]/3;
        int start=0,end=1,count=0;
        while (end<middle.length){
            if (middle[end]-middle[start]==target)
            {
                if (++count==2&&end!=middle.length-1)
                    return true;
                start=end;
            }
         end++;

        }
        return false;
    }
}
