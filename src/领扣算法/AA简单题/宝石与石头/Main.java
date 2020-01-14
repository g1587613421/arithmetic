package 领扣算法.AA简单题.宝石与石头;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Character> middle;
    public int numJewelsInStones(String J, String S) {
        middle=new ArrayList<>();
        for (char c : J.toCharArray()) {
            middle.add(c);
        }
        int sum=0;
        for (char c : S.toCharArray()) {
            if (middle.indexOf(c)!=-1){
                sum++;
            }
        }

        return sum;
    }
}
