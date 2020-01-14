package 领扣算法.图像转换;

public class Main {
    public void rotate(int[][] matrix) {
        int middle;
        for (int r = 0; r <= (matrix.length-1)/2; r++) {
            for (int m=r;m<(matrix.length-r-1-1);m++){
                middle = matrix[r][m];
                matrix[r][m]= matrix[matrix.length-m-1][r];
               matrix[matrix.length-1-m][r]=matrix[matrix.length-1-r][matrix.length-1-m];
               matrix[matrix.length-1-r][matrix.length-1-m]=matrix[m][matrix.length-1-r];
                matrix[m][matrix.length-1-r]=middle;
            }
        }

    }
    public static void main(String arg[]){//main--来自高金磊
     new Main().rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

    }

}
