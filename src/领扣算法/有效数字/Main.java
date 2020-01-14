package 领扣算法.有效数字;

public class Main {
    public boolean isNumber(String s) {
       s=s.replaceAll(" ", "");
       if (s.length()==0)
           return false;
       if (s.contentEquals("--")||s.contentEquals("++")||s.contentEquals("-+")||s.contentEquals("+-")||s.indexOf('e')!=s.lastIndexOf('e')||s.lastIndexOf('.')!=s.indexOf('.')||s.indexOf('.')==0){
           return false;
       }
       char la=s.charAt(s.length()-1);
       if (la>'9'||la<'0')
           return false;
       la=s.charAt(0);
       if (la!='-'&&la!='+'&&(la<'0'||la>'9'))
           return false;
       return true;
    }
}
