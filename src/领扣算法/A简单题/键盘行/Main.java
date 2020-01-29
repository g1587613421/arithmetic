package 领扣算法.A简单题.键盘行;

import java.util.LinkedList;

public class Main {
    LinkedList<String> res=new LinkedList<>();
    String first="qwertyuiopQWERTYUIOP";
    String sec="asdfghjklASDFGHJKL";
    String thi="zxcvbnmZXCVBNM";
    public String[] findWords(String[] words) {

        for (String word : words) {
          if (plus(word, first)||plus(word, sec)||plus(word, thi))
              res.add(word);
        }


        return res.toArray(new String[res.size()]);
    }


    boolean plus(String s,String words){

        for (char c : s.toCharArray()) {
            if (words.indexOf(c)==-1)
                return false;
        }

        return true;
    }
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().findWords(new String[]{"Hello","Alaska","Dad","Peace"});
    }
}
