package orther.设计模式.代理模式.强制代理模式;

import java.sql.Timestamp;

public class Proxy implements Subject {
    private  RealSubject realSubject=null;
    public Proxy(RealSubject realSubject){
        this.realSubject=realSubject;
    }
    @Override
    public void upgard() {
        befor();
        realSubject.upgard();
        after();

    }
    private void befor(){
        System.out.println(String.format("%s我是代理,即将调用具体类实现业务逻辑", new Timestamp(System.currentTimeMillis())));
    }
    private void after(){
        System.out.println(String.format("%s我是代理,已经实现业务逻辑", new Timestamp(System.currentTimeMillis())));
    }
}
