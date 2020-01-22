package 领扣算法.A简单题.二进制手表;

import java.util.ArrayList;
import java.util.List;

public class Main {
    ArrayList<String> res=new ArrayList<>();
    ArrayList<String> result=new ArrayList<>();
    public List<String> readBinaryWatch(int num) {
        if (num==0)
        {
            res.add("0:00");
            return res;
        }
        String middle="0000000000";
        for (int i = 0; i < middle.length(); i++) {
            char[] chars=middle.toCharArray();
            chars[i]='1';
            Plus(new String(chars), num-1);

        }
        String re="";
        for (String s : res) {
            result.add(String.valueOf(Integer.parseInt(s.substring(0, 4),2))+":"+(String.valueOf(Integer.parseInt(s.substring(4, 10),2)<10?"0"+Integer.parseInt(s.substring(4, 10),2):Integer.parseInt(s.substring(4, 10),2))));
        }
        return result;
    }

    void Plus(String middle,int num){
        if (num==0){
            res.add(middle);
            return;
        }
        for (int i = 0; i < middle.length(); i++) {
            char[] chars=middle.toCharArray();
            if (chars[i]=='1')
                return;
            chars[i]='1';
            Plus(new String(chars), num-1);
        }
    }
}
