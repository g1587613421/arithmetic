package 领扣算法.报数;

public class Main {
    //?????
    public String countAndSay(int n) {
String s = "1";
        for (int i = 1; i < n; i++) {
            s=s.replaceAll("111", "3y");
            s=s.replaceAll("222", "3m");
           s=s.replaceAll("11", "45");
            s=s.replaceAll("2", "0x");
            s=s.replaceAll("1", "11");
            s=s.replaceAll("x", "2");
            s=s.replaceAll("4", "2");
            s=s.replaceAll("0","1");
            s=s.replaceAll("5", "1");
            s=s.replaceAll("y", "1");
            s=s.replaceAll("m", "2");

        }
        return s;
    }

    public static void main(String arg[]){//main--来自高金磊
     new Main().countAndSay(3);

    }

}
