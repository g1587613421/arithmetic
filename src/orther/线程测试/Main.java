package orther.线程测试;

public class Main {
    public static void main(String arg[]) throws InterruptedException {//main--来自高金磊
        Th th=new Th("test");
        th.start();
    }
}
