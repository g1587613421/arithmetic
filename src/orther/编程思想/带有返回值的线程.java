package orther.编程思想;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class 带有返回值的线程  {
    public static void main(String arg[]){//main--来自高金磊
        带有返回值的线程 test=new 带有返回值的线程();
        try {
            test.AA();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void AA() throws Exception {
        ExecutorService exec= Executors.newCachedThreadPool();
        exec.submit(new A(0));
        //exec.shutdown();;
        exec=Executors.newFixedThreadPool(1000000);
        return;
    }

    class A implements Callable<String>{
        int id=0;
        A(int n){
            id=n;
        }
        @Override
        public String call() throws Exception {

System.err.println(String.format("这是线程%d的返回值", id));
            return String.format("这是线程%d的返回值", id);
        }
    }
}
