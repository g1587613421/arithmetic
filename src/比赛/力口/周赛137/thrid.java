package 比赛.力口.周赛137;

import java.util.Arrays;
import java.util.LinkedList;

public class thrid {
    LinkedList<Integer> one,two;
    public int maxSumDivThree(int[] nums) {
        Arrays.sort(nums);
        return Math.max(plu4(nums),Math.max(plu3(nums),Math.max(plu1(nums), plu2(nums))));
    }
    public int plu1(int[] nums){
        int max=0;
        one=new LinkedList<>();
        two=new LinkedList<>();

        for (int num : nums) {
            switch (num%3){
                case 0:
                    max+=num;
                    break;
                case 1:
                    one.add(num);
                    break;
                case 2:
                    two.add(num);

            }

        }
        int num=0;
        while (one.size()>=3){
            max+=one.pollLast()+one.pollLast()+one.pollLast();
        }
        while (two.size()>=3)
        {
            max+=two.pollLast()+two.pollLast()+two.pollLast();
        }
        int middle=Math.min(one.size(), two.size());
        for (int i = 0; i < middle; i++) {
            max+=one.pollLast()+two.pollLast();
        }

        return max;
    }
    public int plu2(int nums[]){
        int max=0;
        one=new LinkedList<>();
        two=new LinkedList<>();

        for (int num : nums) {
            switch (num%3){
                case 0:
                    max+=num;
                    break;
                case 1:
                    one.add(num);
                    break;
                case 2:
                    two.add(num);

            }

        }
        int middle=Math.min(one.size(), two.size());
        for (int i = 0; i < middle; i++) {
            max+=one.pollLast()+two.pollLast();
        }

        int num=0;
        while (one.size()>=3){
            max+=one.pollLast()+one.pollLast()+one.pollLast();
        }
        while (two.size()>=3)
        {
            max+=two.pollLast()+two.pollLast()+two.pollLast();
        }

        return max;
    }
    public int plu3(int nums[]){
        int max=0;
        one=new LinkedList<>();
        two=new LinkedList<>();

        for (int num : nums) {
            switch (num%3){
                case 0:
                    max+=num;
                    break;
                case 1:
                    one.add(num);
                    break;
                case 2:
                    two.add(num);

            }

        }


        int num=0;
        while (one.size()>=3){
            max+=one.pollLast()+one.pollLast()+one.pollLast();
        }
        int middle=Math.min(one.size(), two.size());
        for (int i = 0; i < middle; i++) {
            max+=one.pollLast()+two.pollLast();
        }
        while (two.size()>=3)
        {
            max+=two.pollLast()+two.pollLast()+two.pollLast();
        }

        return max;
    }
    public int plu4(int nums[]){
        int max=0;
        one=new LinkedList<>();
        two=new LinkedList<>();

        for (int num : nums) {
            switch (num%3){
                case 0:
                    max+=num;
                    break;
                case 1:
                    one.add(num);
                    break;
                case 2:
                    two.add(num);

            }

        }




        while (two.size()>=3)
        {
            max+=two.pollLast()+two.pollLast()+two.pollLast();
        }
        int middle=Math.min(one.size(), two.size());
        for (int i = 0; i < middle; i++) {
            max+=one.pollLast()+two.pollLast();
        }
        while (one.size()>=3){
            max+=one.pollLast()+one.pollLast()+one.pollLast();
        }


        return max;
    }
}
