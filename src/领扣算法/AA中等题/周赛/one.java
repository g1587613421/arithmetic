package 领扣算法.AA中等题.周赛;

import java.util.ArrayList;
import java.util.List;

public class one {

    public List<String> invalidTransactions(String[] transactions) {
        String name="";
        int time=Integer.MAX_VALUE;
        String[] data;
        String  ms="";
        List<String> res=new ArrayList<>();
        for (String s : transactions) {
            data=s.split(",");
            if (data[0].equals(name)&&time-Integer.valueOf(data[1])<=60)
            {
                if (!ms.equals(""))
                    res.add(ms);
                res.add(s);
                name="";
                continue;
            }
            if (Integer.valueOf(data[2])>1000){
                res.add(s);
                ms="";
                name=data[0];
                time=Integer.valueOf(data[1]);
                continue;
            }

            name=data[0];
            time=Integer.valueOf(data[1]);
            ms=s;
        }
        return res;
    }
}
