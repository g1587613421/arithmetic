package 领扣算法.AA简单题.杨辉三角2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>(rowIndex+1);
        long nk = 1;
        for(int i = 0; i <= rowIndex; i++){
            res.add((int)nk);
            nk = nk * (rowIndex - i) / (i + 1);
        }
        return res;
    }
}
