package 比赛.力口.周赛171;

public class first {
    int two;
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            two=n-i;
            if (!(""+i).contains("0")&&!(""+two).contains("0"))
                return new int[]{i,two};
        }

        return null;
    }
}
