/*
 * Copyright (c) 2020.版权所有高金磊
 */

package Tools;

public class ShowDataState<T> {
    public void showArray(T[] o){
        for (T t : o) {
            System.out.print(""+0+"\t");
        }
    }

    public void showArrays(T[][] o){
        for (T[] ts : o) {
            for (T t : ts) {
                System.out.print(""+t+"\t");
            }
            System.out.println();
        }
    }
    public static void showInt_Arrays(int[][] o){
        for (int[] ts : o) {
            for (int t : ts) {
                System.out.print(""+t+"\t");
            }
            System.out.println();
        }
    }
}
