package 领扣算法.AA中等题.矩阵置零;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Integer> row=new ArrayList<>();
    List<Integer> col=new ArrayList<>();
    public void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j]==0){
                    if (row.indexOf(i)==-1)
                        row.add(i);
                    if (col.indexOf(j)==-1)
                        col.add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (row.indexOf(i)!=-1||col.indexOf(j)!=-1)
                matrix[i][j]=0;
                }

        }

    }

}
