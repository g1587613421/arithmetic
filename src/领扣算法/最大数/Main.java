package 领扣算法.最大数;

public class Main {
    StringBuffer res=new StringBuffer();
    int middle;
    public String largestNumber(int[] nums) {
        int midres;

        for (int i = 0; i < nums.length; i++) {
            middle=0;
            midres = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j]==-1)
                    continue;
                if (isMax(nums[j],midres))
                {
                    midres=nums[j];
                    middle=j;
                }

            }
            res.append(midres);
            nums[middle]=-1;
        }
        if (res.charAt(0)=='0')
            return "0";
        return res.toString();
    }
    boolean isMax(int pre,int end){
        char[] pres=(""+pre+end).toCharArray();
        char[] ends=(""+end+pre).toCharArray();
        if (pres[0]!=ends[0])
            return pres[0]>ends[0];
        for (int i = 0; i < pres.length; i++) {
            if (pres[i]==ends[i])
                continue;
            return pres[i]>ends[i];
        }
//        for (int i = 0; i < Math.max(pres.length, ends.length); i++) {
//            if (pres[i%pres.length]==ends[i%ends.length])
//                continue;
//            return pres[i%pres.length]>ends[i%ends.length];
//        }
        return true;
    }
}
