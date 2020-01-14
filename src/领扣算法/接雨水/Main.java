package 领扣算法.接雨水;

public class Main {
    int pres=0,lasts=0;
    public int trap(int[] height) {
        if (height.length<=2)
            return 0;
        for (int i = 1; i < height.length-1; i++) {
            pres+=height[i];
            height[i]=Math.max(plus(height, i),height[i]);
        }
        int max=0;
        for (int i : height) {
            max+=i;
        }
        return max-pres-height[0]-height[height.length-1];
    }
    int lm,rm;
    private int plus(int[] height,int index){
        lm=0;
        rm=0;
        for (int i = 0; i < index; i++) {
            lm=Math.max(lm, height[i]);
        }
        for (int i = index+1; i < height.length; i++) {
            rm=Math.max(rm, height[i]);
        }
        return Math.min(lm, rm);
    }
}
