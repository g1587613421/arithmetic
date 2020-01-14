package orther.设计模式.观察者模式.线程解决;

import java.sql.Timestamp;

//监听器--相当于转发器(间谍)
public class inn extends Thread {
    ConcreteObserver concreteObserver=new ConcreteObserver();//持有监听者对象以便知道发给谁
    @Override
    public void run() {
        while (true){
            //不停扫描状态
            if (Subject.state){
                System.out.println(String.format("状态为true进行通知%s",new Timestamp(System.currentTimeMillis()) ));
                concreteObserver.update();
            }

            else
                System.err.println(String.format("状态不为true不进行通知%s", new Timestamp(System.currentTimeMillis())));
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String arg[]){//main--来自高金磊
        /**
         * 运行结果显示由于线程监听者的存在,监听者获取状态变化不是及时的
         */
     inn i=new inn();
     i.setDaemon(true);
     i.start();
     new Subject().changeS();
    }
}
