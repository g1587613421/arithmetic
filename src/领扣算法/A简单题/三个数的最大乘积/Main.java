/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.三个数的最大乘积;


public class Main {
        public int maximumProduct(int[] nums) {
            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
            for (int n: nums) {
                if (n <= min1) {
                    min2 = min1;
                    min1 = n;
                } else if (n <= min2) {     // n lies between min1 and min2
                    min2 = n;
                }
                if (n >= max1) {            // n is greater than max1, max2 and max3
                    max3 = max2;
                    max2 = max1;
                    max1 = n;
                } else if (n >= max2) {     // n lies betweeen max1 and max2
                    max3 = max2;
                    max2 = n;
                } else if (n >= max3) {     // n lies betwen max2 and max3
                    max3 = n;
                }
            }
            return Math.max(min1 * min2 * max1, max1 * max2 * max3);
        }

    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().maximumProduct(new int[]{-4,-3,-8,-1,60});
    }
//        for (int num : nums) {
//            if (num>0){
//                positiveNumber.addLast(num);
//                continue;
//            }
//            if (num<0)
//                negativeNumber.push(num);
//        }
//        LinkedList<Integer> data=new LinkedList<>();
//        while (positiveNumber.size()>0||data.size()>3)
//        {
//            data.push(positiveNumber.pollLast());
//        }
//       if (negativeNumber.size()>0)
//           data.push(negativeNumber.pollFirst());
//        if (negativeNumber.size()>0)
//            data.push(negativeNumber.pollFirst());
//
//        return Math.max(data.getLast()*, )
}
