package 比赛.力口.周赛171;

public class second {
    public int minFlips(int a, int b, int c) {
        int count=0;
        while (a!=0||b!=0||c!=0){
            switch (c&1){
                case 0:
                    if ((a&1)==1){
                        count++;
                    }
                    if ((b&1)==1)
                        count++;
                    break;
                case 1:if (((a&1)|(b&1))!=1)
                    count++;

            }
            a=a>>1;
            b=b>>1;
            c=c>>1;
        }

        return count;
    }
    
public static void main(String arg[]){//main--来自高金磊

System.out.println(new second().minFlips(2, 6, 5));
}
}
