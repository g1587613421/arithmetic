package 领扣算法.A简单题.汉明距离;

public class Main {

    int count=0;
    public int hammingDistance(int x, int y) {
        while (x!=0||y!=0){
            count+=((x&1)^(y&1));
            x=x>>1;
            y=y>>1;
        }
        return count;
    }
}
