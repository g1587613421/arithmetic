package 领扣算法.AA中等题.数组嵌套;

public class Main {
    boolean[] flag;
    int max=0;
    public int arrayNesting(int[] nums) {
        flag=new boolean[nums.length];
//        maxs=new int[nums.length];
        int len;
        for (int i = 0; i < nums.length; i++) {
            if (flag[i])
                continue;
            len=1;
            int target=nums[i];
            while (target!=i){
                flag[target]=true;
                target=nums[target];
                len++;
                if (target>=nums.length){
                    len=0;
                    break;
                }
            }
            max=Math.max(len, max);
        }

        return max;
    }
}
