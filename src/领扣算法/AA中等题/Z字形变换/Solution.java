package 领扣算法.AA中等题.Z字形变换;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1)
            return s;
        StringBuffer res=new StringBuffer();
        int r=1;//行
        int x=2*numRows-2;//1-1的..
        for (;r<=numRows;r++) {
            int c=1;//lie
            while (true) {
                if (r != 1 && r != numRows) {
                    if ( x * (c - 1) + r <= s.length()){
                        res.append(s.charAt(1 + x * (c - 1) + r - 2));
                    }
                     if (r+x*(c-1)+x*(numRows-r)/(numRows-1)<=s.length())
                        res.append(s.charAt(r+x*(c-1)+x*(numRows-r)/(numRows-1)-1));
                    else
                        break;
                } else if ( x * (c - 1) + r <= s.length())
                    res.append(s.charAt(1 + x * (c - 1) + r - 2));
                else
                    break;
                c++;
            }
        }
        return res.toString();
    }
public static void main(String arg[]){//main--来自高金磊
        Solution solution=new Solution();
        System.out.println(solution.convert("1234567890ABCDEFG",5));
}
}
