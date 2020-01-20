package 领扣算法.AA中等题.电话号码字母组合;

import java.util.ArrayList;
import java.util.List;
/*
给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。

给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。



示例:

输入："23"
输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
说明:
尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Main {
    public List<String> letterCombinations(String digits) {
        if (digits.length()==0)
            return new ArrayList<>();
        String[] Phone = new String[] {"abc" ,"def" ,"ghi" ,"jkl" ,"mno" ,"pqrs","tuv" ,"wxyz"};
        List<String> res=new ArrayList<>();
        List<String> middle1, middle=new ArrayList<>();
        res.add("");
        for (char c : digits.toCharArray()) {
            for (String s : res) {
                for (char c1 : Phone[c-2-'0'].toCharArray()) {
                    middle.add(s+c1);
                }
            }
            res.clear();
            middle1=res;
           res=middle;
            middle=middle1;

        }
        return res;
    }
    private  List<String> add(List<String> strings,char[] chars){
        List<String> res=new ArrayList<>();
        for (String s : strings) {
            for (char c : chars) {
                res.add(s+c);
            }
        }

        return res;
    }
public static void main(String arg[]){//main--来自高金磊
 new Main().letterCombinations("23");

}
}
