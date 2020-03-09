/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.将矩阵按对角线排序;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public int[][] diagonalSort(int[][] mat) {
        ArrayList<Integer> middle = new ArrayList<>();

        int x, y;
        for (int i = 0; i < mat.length; i++) {
            x = i;
            y = 0;
            while (x < mat.length && y < mat[0].length) {
                middle.add(mat[x++][y++]);
            }
            Collections.sort(middle);
            x = i;
            y = 0;
            while (x < mat.length && y < mat[0].length) {
                mat[x++][y++] = middle.get(y - 1);
            }
            middle.clear();
        }

        for (int i = 1; i < mat[0].length; i++) {
            x = 0;
            y = i;
            while (x < mat.length && y < mat[0].length) {
                middle.add(mat[x++][y++]);
            }
            Collections.sort(middle);
            x = 0;
            y = i;
            while (x < mat.length && y < mat[0].length) {
                mat[x++][y++] = middle.get(y - 1);
            }
            middle.clear();


        }
        return mat;
    }
}
