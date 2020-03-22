/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛181;

public class second {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for (int num : nums) {
            sum+=findCou(num);
        }
        return sum;
    }
    int findCou(int target){
        int mm=1;
        int count=0;
        int sum=0;
        while (mm<target/mm){
            if (target%mm==0){
                count++;
                sum+=mm+target/mm;
                if (count>2)
                    return 0;
            }
            mm++;
        }
        if (count==2&&(mm*mm!=target))
            return sum;
        return 0;
    }
}
