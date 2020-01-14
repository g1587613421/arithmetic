package 领扣算法.周赛;

public class two {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int res[]=new int[queries.length];
        int qs[]=new int[queries.length];
        int ws[]=new int[words.length];
        for (int i = 0; i < qs.length; i++) {
           qs[i]=middle(queries[i]);
        }
        for (int i = 0; i < ws.length; i++) {
            ws[i]=middle(words[i]);
        }
        for (int i = 0; i < res.length; i++) {
            for (int w : ws) {
                if (w>qs[i])
                    res[i]++;
            }

        }
        return res;
    }
    private int middle(String s){
        char min='z';
        int sum=0;
        for (char c : s.toCharArray())
        {
            if (c<min){
                min=c;
                sum=1;
            }else
            if (min==c){
                sum++;
            }
        }
        return sum;
    }
}
