package 领扣算法.AA中等题.单词拆分;

import java.util.List;

public class main {
    int maxl;//确定最大寻找广度
    boolean[] flag;//标记回溯
    public boolean wordBreak(String s, List<String> wordDict) {
        flag=new boolean[s.length()];
        for (String s1 : wordDict) {
            maxl=maxl<s1.length()?s1.length():maxl;
        }
        try {
            String middle="";
            for (int i = 0; i < Math.min(s.length(), maxl); i++) {
                middle+=s.charAt(i);
                if (wordDict.contains(middle)){
                    plus(i, s, wordDict);
                }
            }
        }
        catch (Exception e){
            return true;
        }

        return false;
    }

    public  void plus(int start,String s,List<String> wordDict) throws Exception {
        if (s.length()-1==start)
            throw new Exception("已找到");
        if (flag[start+1])
            return;
        else
            flag[start+1]=true;
        String middle="";
        for (int i = start+1; i < Math.min(s.length(), maxl+start+1); i++) {
            middle+=s.charAt(i);
            if (wordDict.contains(middle)){
                plus(i,s,wordDict);
            }

        }

    }



}
