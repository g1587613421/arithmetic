package orther.编程思想;

public class 线程协作 {


    public static void main(String arg[]){//main--来自高金磊
    线程协作 ts=new 线程协作();
    ts.start();


    }
    public void start(){
        Th t1=new Th();
        Th t2=new Th();
        t1.start();
        t2.start();
        while (true){
            try {
                t1.wait();
                Thread.sleep(3000);
                t2.notify();
                Thread.sleep(3000);
                t2.wait();
                Thread.sleep(3000);
                t1.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class Th extends Thread{
        int id=(int)(Math.random()*100);
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(2500);//每个线程状态还保留,如果外层是3000,这个地方是2500,则到6轮时有可能多打一次
                                            //证明线程不是重新启动而是从某种状态恢复过来的.
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(String.format("线程%d恢复到运行状态", id));
            }
        }
    }
}
