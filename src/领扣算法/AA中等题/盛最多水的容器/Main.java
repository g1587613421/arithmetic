package 领扣算法.AA中等题.盛最多水的容器;

public class Main {
    int max=0;
    int left=0;
    public int maxArea(int[] height) {
        for (int i = 0; i < height.length; i++) {
            left=height[i];
            for (int j = i+1; j < height.length; j++) {
                max=Math.max(max, Math.min(left, height[j])*(j-i));
            }
        }
        return max;
    }
}
