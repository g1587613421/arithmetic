/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛183;

public class third {

    public String longestDiverseString(int a, int b, int c) {
        StringBuffer stringBuffer=new StringBuffer();
        while (a+b+c>0) {
            int max = Math.max(a, Math.max(b, c));
            int min = Math.min(Math.min(a, b), c);
            int middle = a + b + c - max - min;
            if (max == a) {
                if (!stringBuffer.toString().endsWith("a"))
                if (max > 1) {
                    stringBuffer.append("aa");
                    a -= 2;
                } else {
                    stringBuffer.append("a");
                    a--;
                }
                if (middle == b) {
                    if (b == 0)
                        break;
                    stringBuffer.append("b");
                    b--;
                    continue;
                }
                if (middle == c) {
                    if (c == 0)
                        break;
                    stringBuffer.append("c");
                    c--;
                    continue;
                }

            }
            if (max == b) {
                if (!stringBuffer.toString().endsWith("b"))
                if (max > 1) {
                    stringBuffer.append("bb");
                    b -= 2;
                } else {
                    stringBuffer.append("b");
                    b--;
                }
                if (middle == a) {
                    if (a == 0)
                        break;
                    stringBuffer.append("a");
                    a--;
                    continue;
                }
                if (middle == c) {
                    if (c == 0)
                        break;
                    stringBuffer.append("c");
                    c--;
                    continue;
                }
            }
            if (max == c) {
                if (!stringBuffer.toString().endsWith("c"))
                if (max > 1) {
                    stringBuffer.append("cc");
                    c -= 2;
                } else {
                    stringBuffer.append("c");
                    c--;
                }
                if (middle == b) {
                    if (b == 0)
                        break;
                    stringBuffer.append("b");
                    b--;
                    continue;
                }
                if (middle == a) {
                    if (a == 0)
                        break;
                    stringBuffer.append("a");
                    a--;
                }
            }
        }
        return stringBuffer.toString();
    }
}
