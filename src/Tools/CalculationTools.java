package Tools;

import java.util.Arrays;

/**
 * 数据运算工具类
 */
public class CalculationTools {
    /**
     * 计算任意长度位数乘法
     * @param num1 被乘数
     * @param num2 乘数
     * @return 结果字符串
     */
    public static String bigMultiply(String num1, String num2) {
        char[] ret = new char[num1.length() + num2.length()];
        Arrays.fill(ret, '0');

        for(int i = num1.length() - 1; i >= 0; i --) {
            int num1Val = num1.charAt(i) - '0';
            for(int j = num2.length() - 1; j >= 0; j --) {
                int num2Val = num2.charAt(j) - '0';
                int sum = (ret[i + j + 1] - '0') + num1Val * num2Val;
                ret[i + j + 1] = (char)(sum % 10 + '0');
                ret[i + j] += sum / 10;
            }
        }

        for(int i = 0; i < ret.length; i ++) {
            if(ret[i] != '0' || i == ret.length - 1) {
                return new String(ret, i, ret.length - i);
            }
        }

        return "0";
    }

    /**
     * 组合数计算Cab
     * @param a
     * @param b 在下面
     * @return 结果
     * eg:C2,4==6
     */
    public static int dg(int a, int b) {
        if (b == 0)
            return 1;
        else if (a == 1)
            return 1;
        else if (a == b)
            return 1;
        else
            return dg(a-1,b-1)+dg(a-1,b);
    }

    /**
     * 对字符串数组进行升序排序(按照字典顺序)
     * @param input
     * @return
     */
    public  String[] arraySortString(String[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                //修改此处即可完成降序
                if (input[j].compareTo(input[j + 1]) > 0) {
                    String temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;

    }
}
