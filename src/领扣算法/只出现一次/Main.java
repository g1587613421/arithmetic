package 领扣算法.只出现一次;

import java.util.Arrays;

public class Main {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        boolean b=false;
        int middle=Integer.MAX_VALUE;
        for (int num : nums) {
            if (middle==Integer.MAX_VALUE){
                middle=num;
                b=true;
                continue;
            }
            if (middle!=num){
                if (b)
                return middle;
                else{
                    b=true;
                    middle=num;
                }

            }else b=false;

        }
        return middle;
    }
    public static void main(String arg[]){//main--来自高金磊
       System.out.println(new Main().singleNumber(new  int[]{2,2,1,3,1}));

    }

}
