/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.图像渲染;

public class Main {
    boolean flags[][];
    int  init,newColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        flags=new boolean[image.length][image[0].length];
        init=image[sr][sc];
        this.newColor=newColor;
        plus(image, sr, sc);
        return image;
    }
    private void plus(int[][] image,int sr,int sc){
        if (sr<flags.length&&sr>=0&&sc>=0&&sc<flags[0].length&&!flags[sr][sc]&&image[sr][sc]==init){
            flags[sr][sc]=true;
            image[sr][sc]=newColor;
            plus(image, sr+1, sc);
            plus(image, sr, sc+1);
            plus(image, sr-1, sc);
            plus(image, sr, sc-1);
        }
    }
}
