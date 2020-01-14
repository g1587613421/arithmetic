package 比赛.力口.周赛171;

import java.util.HashMap;

public class third {
    public int makeConnected(int n, int[][] connections) {
        if (n-1>connections.length)
            return -1;
        HashMap <Integer,Integer> data=new HashMap<>();
        for (int[] connection : connections) {
            for (int i : connection) {
                data.put(i, 0);
            }
        }
        return n-data.size();
    }
    public static void main(String arg[]) {//main--来自高金磊

        new third().makeConnected(4, new int[][]{{0, 1}, {0, 2}, {1, 2}});
    }
//        HashMap<Integer,Integer> data=new HashMap<>();
//        //统计
//        for (int i = 0; i < connections.length; i++) {
////            if (data.containsKey(i))
////                data.put(i, data.get(i)+1);
////            else
////                data.put(i, 0);
//            for (int con : connections[i]) {
//                if (data.containsKey(con))
//                    data.put(con, data.get(con)+1);
//                else
//                    data.put(con, 1);
//            }
//
////            HashMap<Integer,Integer> res=new HashMap<>();
////            for (Integer integer : data.values()) {
////                if (res.containsKey(integer))
////                    res.put(integer, 1+res.get(integer));
////                else
////                    res.put(integer , 0);
////            }



}
