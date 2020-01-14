package 领扣算法.最长公共前缀;

public class Main {

    public String longestCommonPrefix(String[] strs) {
        StringBuffer res=new StringBuffer("");
        boolean coun=true;   int n;  char middle;
        try {
        while (coun){
            n = res.length();
            middle = strs[0].charAt(n);
            for (String str : strs) {
                if (middle!=str.charAt(n)){
                    coun=false;
                    break;
                }
            }
            if (coun){
                res.append(middle);
            }
        }
        }catch (Exception e){
            return res.toString();
        }

        return res.toString();
    }
}
