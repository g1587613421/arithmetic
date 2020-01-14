package 领扣算法.AA简单题.回文字符串;

public class Main {

    StringBuffer middle=new StringBuffer();
    public boolean isPalindrome(String s) {
        if (s.equals(""))
            return true;

        for (char c : s.toCharArray()) {
            if ((c<='z'&&c>='a')||(c<='Z'&&c>='A')||(c>='0'&&c<='9'))
                if (c>='a')
                    middle.append((char)(c-32));
                else
                    middle.append(c);

        }
        s=middle.toString();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i)-s.charAt(s.length()-i-1))!=0)
                return false;
        }
        return true;
    }

    public static void main(String arg[]){//main--来自高金磊
new Main().isPalindrome("`l;`` 1o1 ??;l`");
     System.out.println((int) 'A'-'a');
     System.out.println((int) '0');
     System.out.println((int) '0');
    }
}
