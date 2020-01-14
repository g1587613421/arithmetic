package 领扣算法.AA简单题.压缩字符串;

public class Main {
 StringBuffer data=new StringBuffer();
    public int compress(char[] chars) {
        if (chars.length<=1)
            return chars.length;
        int con=1;
        char c=chars[0];
        data.append(c);
        for (int i = 1; i <chars.length ; i++) {
            if (c==chars[i])
                con++;
            else {
                if (con>1)
                data.append(con);
                con=1;
                c=chars[i];
                data.append(c);
            }
        }
        if (con>1)
        data.append(con);
        String res=data.toString();
        for (int i = 0; i < res.length(); i++) {
            chars[i]=res.charAt(i);

        }

        return res.length();
    }
}
