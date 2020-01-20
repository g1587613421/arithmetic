package 领扣算法.AA中等题.最长重复子数组;

public class Main {
    int max=0;
    String dataA;
    String s;
    boolean[] flag;
    public int findLength(int[] A, int[] B) {

        StringBuffer da=new StringBuffer();
        for (int i : A) {
            da.append((char)i);
        }
        dataA=da.toString();
        for (int i = 0; i < B.length; i++) {
            s=""+(char)B[i];
            if (dataA.contains(s)){
                plus(i+1, s, B);
            }

        }
        return max;
    }
    private void plus(int sta,String res,int[] B){
        max=Math.max(res.length(),max);
        if (sta>=B.length||B.length-sta+res.length()<max)
            return;
        res+=(char)B[sta];
        if (dataA.contains(res))
        {
            plus(sta+1, res, B);
        }
    }
}
