package 领扣算法.AA简单题.格雷编码;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    ArrayList<String> middle=new ArrayList<>();
    ArrayList<String> res=new ArrayList<>();
    ArrayList<Integer> result=new ArrayList<>();
    public List<Integer> grayCode(int n) {
        if (n<=0){
            result.add(0);
            return result;
        }
        else {
            middle.add("0");
            middle.add("1");
        }
        res=new ArrayList<>(middle);
        for (int i = 0; i < n-1; i++) {
        plus();
        }
        for (String s : middle) {
            result.add(Integer.parseInt(s,2));

        }
        return result;
    }
    void plus(){
        res=new ArrayList<>();

        for (String s : middle) {
            res.add("0"+s);
        }
        Collections.reverse(middle);
        for (String s : middle) {
            res.add("1"+s);
        }
        middle=res;
        res=null;
    }
    public static void main(String arg[]){//main--来自高金磊

     new Main().grayCode(2);
    }
}
