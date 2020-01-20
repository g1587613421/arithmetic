package 领扣算法.A简单题.外观数列;

public class Main {
    String res="1";
    public String countAndSay(int n) {

        for (int i = 1; i < n; i++) {
            plus();
        }
        return res;
    }
    StringBuffer middle;
    void plus(){
        middle=new StringBuffer();
        char da=' ';
        int count=0;
        for (int i = 0; i < res.length(); i++) {
            if (da==res.charAt(i)){
                count++;
            }
            else {
                if (da==' '){
                    da=res.charAt(i);
                    count++;
                }
                else {
                    middle.append(count).append(da);
                    count=1;
                    da=res.charAt(i);
                }
            }
        }
        middle.append(count).append(da);
        res=middle.toString();



    }
    public static void main(String arg[]){//main--来自高金磊

     System.out.println(new Main().countAndSay(3));
    }
}
