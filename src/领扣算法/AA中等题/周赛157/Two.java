package 领扣算法.AA中等题.周赛157;

import java.util.Arrays;

public class Two {
    public int longestSubsequence(int[] arr, int difference) {
        if (difference>=0)
            Arrays.sort(arr);
        if (arr.length==0)
            return 0;
        int res=1;
        int middle;
        //n次寻找任务
        for (int i = 0; i < arr.length; i++) {
            middle=longestSubsequence(arr, difference, i);
            res=Math.max(middle, res);
        }
        return res;
    }
    public int longestSubsequence(int[] arr, int difference,int start) {

        for (int i = start+1; i < arr.length; i++) {
            if (arr[i]-difference==arr[start])
                return longestSubsequence(arr, difference,i)+1;
            if (difference>0&&arr[i]-difference>arr[start]){
                return 1;
            }
        }

        return 1;
    }

    public static void main(String arg[]){//main--来自高金磊
     new Two().longestSubsequence(new int[]{1,2,3,4}, 1);

    }
}
