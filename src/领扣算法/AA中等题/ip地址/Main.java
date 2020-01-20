package 领扣算法.AA中等题.ip地址;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<String> result=new ArrayList<>();
    char[] chars;
    public List<String> restoreIpAddresses(String s) {
        //预处理数据

        chars = s.toCharArray();
        //转发任务
        exe("", chars, 0,0);
        return result;
    }
    public void exe(String res,char[] ele,int start,int count){
        //最终提交情况
        if (count==4){
            if (start==ele.length) {

                result.add(res.substring(0, res.length() - 1));
//                System.gc();//加上内存0.99,时间0.34不加内存0.51,时间0.99
            }
            else //不符合舍弃
                return;
        }

        //下一位是1位
        if (start+1<=ele.length){
            exe(res+ele[start]+".",ele,start+1 , count+1);
        }else {
            return;
        }
        if (ele[start]=='0')
            return;
        if (start+2<=ele.length){
            exe(res+ele[start]+ele[start+1]+".",ele,start+2, count+1);
        }else {
            return;
        }
        if (start+3<=ele.length){
            if ((Integer.valueOf(""+ele[start]+ele[start+1]+ele[start+2]))<=255)
            {
                exe(res+ele[start]+ele[start+1]+ele[start+2]+".",ele,start+3, count+1);
            }
            else return;
        }else {
            return;
        }
    }
    public static void main(String arg[]){//main--来自高金磊

     new Main().restoreIpAddresses("25525511135");
    }
}
