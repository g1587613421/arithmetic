package 领扣算法.最后一个单词的长度;

public class Main {

    //直接求解
    public int lengthOfLastWordP(String s) {
        String middle[]=s.split(" ");
        if (middle.length>=1)
            return middle[middle.length-1].length();
        else
            return 0;

    }

    public int lengthOfLastWord(String s) {
       int res=0;
        for (int i = s.length(); i >0;) {
            if (s.charAt(--i)!=' '){
                res++;
            }else
                if (res!=0){
                    return res;
                }
        }
return res;
    }

}
