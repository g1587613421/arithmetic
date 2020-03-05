/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.缀点成线;

public class Main {

    public boolean checkStraightLine(int[][] coordinates) {
        double data[]=new double[coordinates.length-1];
        for (int i = 0; i < data.length; i++) {
            data[i]=(double) (coordinates[i+1][0]-coordinates[i][0])/(coordinates[i+1][1]-coordinates[i][1]);
        }
        for (int i = 0; i < data.length-1; i++) {
            if (Double.isInfinite(data[i])&&Double.isInfinite(data[i+1]))
                continue;
            if (data[i]!=data[i+1])
                return false;
        }
        return true;
    }
}
