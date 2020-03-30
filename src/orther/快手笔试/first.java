/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.快手笔试;

public class first {
    /**
     * 获取队中从前到后每个人与前方身高高于自己的人的最短距离
     * @param height int整型一维数组 队中从前到后每个人与前方身高高于自己的人的最短距离
     * @return int整型一维数组
     */
    public int[] DistanceToHigher (int[] height) {
        int[] middle = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            middle[i]=0;
            for (int j = i-1; j>=0 ; j--) {
                if (height[i]<height[j]) {
                    middle[i] = i-j;
                    break;
                }
            }
        }
        return middle;
    }
    
    public static void main(String[] arg){//main--来自高金磊
    
        new first().DistanceToHigher(new int[]{175, 173, 174, 163, 182, 177});
    }
}
