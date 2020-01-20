package 领扣算法.AA中等题.合并区间;

public class pow {

//    public int[][] merge(int[][] intervals) {
//        int n=intervals.length;
//
//        for (int i = 0; i < intervals.length-1; i++) {
//            for (int j = 0; j < intervals.length-1; j++) {
//                if (intervals[j][0]>intervals[j+1][0])
//                {
//                    int[] midd=intervals[j];
//                    intervals[j]=intervals[j+1];
//                    intervals[j+1]=midd;
//                }
//            }
//        }
//
//        for (int i = 0; i < intervals.length-1; i++) {
//            if (intervals[i][1]>=intervals[i+1][0]){
//                intervals[i+1][0]=intervals[i][0];
//                intervals[i+1][1]=Math.max(intervals[i][1],intervals[i+1][1]);
//                intervals[i]=null;
//                n--;
//            }
//        }
//        int[][] res=new  int[n][];
//        for (int i = 0; i < intervals.length; i++) {
//            if (intervals[i]!=null){
//                res[res.length-n]=intervals[i];
//                n--;
//            }
//        }
//
//        return res;
//    }
    public static void main(String[] arg){//main--来自高金磊
     new pow().merge(new int[][]{{4,5},{1,4},{0,1}});
    }
    int[][] res,result;
    int count;
    public int[][] merge(int[][] intervals) {
        if (intervals.length==0)
            return intervals;
        count = 1;
        res = new int[intervals.length][2];
        res[0]=intervals[0];
//        将数据添加到结果容器
        for (int i = 1; i < intervals.length; i++) {
            for (int j = 0; j <count; j++) {
                //找到可以合并的区间,领扣算法.AA中等题.合并区间
                if (intervals[i][0]<=res[j][1]&&intervals[i][1]>=res[j][0]){
                    res[j]=new int[]{Math.min(res[j][0],intervals[i][0]),Math.max(res[j][1],intervals[i][1])};
                    intervals[i]=null;
                    break;
                }
            }
            //没有找到,添加值
            if (intervals[i]!=null)
            {
                res[count++]=intervals[i];
            }

        }

        result = new int[count][];
        //结果标准化--去掉容器的空之部分
        for (int i = 0; i < count; i++) {
            result[i]=res[i];
        }

        return result.length==intervals.length?result:merge(result);
    }
}
