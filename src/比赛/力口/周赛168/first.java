package 比赛.力口.周赛168;

public class first {
    int res=0;
    public int findNumbers(int[] nums) {
        for (int num : nums) {
            if ((""+num).length()%2==0)
                res++;
        }


        return res;
    }
}
