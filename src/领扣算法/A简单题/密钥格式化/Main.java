/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.密钥格式化;

public class Main {

    public String licenseKeyFormatting(String S, int K) {
        S=S.replaceAll("-", "");
        if (S.length()==0) return "";
        char[] data=S.toCharArray();
        for (int i = 0; i < data.length; i++) {
            data[i]= (data[i]<='z'&&data[i]>='a')? (char) (data[i] - 32) :data[i];

        }
        int start=data.length%K;
        start=start==0?K:start;
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0; i < start; i++) {
            stringBuffer.append(data[i]);
        }
        // stringBuffer.append('-');
        for (int i = start; i < data.length; i++) {

            if ((i-start)%K==0){
                stringBuffer.append('-');
            }
            stringBuffer.append(data[i]);
        }
        return stringBuffer.toString();
    }
    public static void main(String arg[]){//main--来自高金磊

    }
}
