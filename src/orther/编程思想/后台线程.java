package orther.编程思想;

import javax.swing.*;

public class 后台线程
{
    public static void main(String arg[]) throws InterruptedException {//main--来自高金磊
     test t=new 后台线程().new test();
    //t.setDaemon(true);//去掉本行进程就一直运行除非后台进程或主线程出现异常而终止
     t.start();
   // t.run();
        Thread.sleep(100);
    }
    class test extends Thread {
        @Override
        public void run() {
            while (true)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(null, "进程正在运行");
                System.out.println("后台线程正在运行");
            }
        }
    }
}
