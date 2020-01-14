package orther.线程测试;

public class Th extends Thread{
    static int tid=0;//每个线程的id号
    static int initn=0;//产生的线程数量
    static int desn=0;//已经销毁的数量
    int id=0;

    public Th() {
    }

    public Th(String name) {
        super(name);

    }

    @Override
    public void run() {
        super.run();
        System.out.print(tid+++"线程已经启动");id=tid;
        while (true)
        {
            try {
               sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(tid+"线程正在运行");
        }

    }

    @Override
    public void interrupt() {
        super.interrupt();
    }

    @Override
    public void destroy() {
        desn++;
        System.err.println(id+"已经关闭");
    }
}
