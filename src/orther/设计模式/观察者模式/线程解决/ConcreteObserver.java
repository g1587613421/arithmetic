package orther.设计模式.观察者模式.线程解决;

import java.sql.Timestamp;

//观察者
public class ConcreteObserver {
    public void update(){
        System.out.println(String.format("收到通知%s",new Timestamp(System.currentTimeMillis())));
    }
}
