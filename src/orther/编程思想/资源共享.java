package orther.编程思想;

public class 资源共享 {
    private int pb=0;
    public static void main(String arg[]){//main--来自高金磊
       new 资源共享().start();
    }
    public void start(){
        Ts ts=new Ts();
        Ts ts1=new Ts();
        Ts ts2=new Ts();
        ts.setPriority(9);//在进行资源竞争的时候优先级越高的越优先执行
        ts1.setPriority(8);
        ts2.setPriority(7);
        ts.start();
         ts1.start();
         ts2.start();
    }
//    去掉syn修饰符运行一小会就能发现数据出现大量脏读
    synchronized public void setpb(int pb) throws InterruptedException {
        Thread.sleep(2000);//模拟耗时操作
        this.pb=pb;
    }
    class Ts extends Thread{
        int id=(int) (Math.random()*1000);
        @Override
        public void run() {

            while (true) {

                try {
                    setpb((int) (Math.random()*1000));//修改后立即枷锁
                    System.out.println(String.format("线程%d修改pb为%d", id, pb));
                    Thread.sleep(1000);//需要执行时间远小于锁的时间
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.err.println(String.format("线程%d读取pb为%d", id, pb));
            }
        }


    }


}
