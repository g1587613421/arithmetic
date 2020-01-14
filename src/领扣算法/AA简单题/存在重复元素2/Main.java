package 领扣算法.AA简单题.存在重复元素2;

public class Main {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <=i+k ; j++) {
                if (j>=nums.length)
                    continue;
                if (nums[i]==nums[j])
                    return true;
            }
        }

        return false;
    }

    public static void main(String arg[]){//main--来自高金磊
     new Main().containsNearbyDuplicate(new int[]{1,2,3,4,9,9}, 3);

    }
}
