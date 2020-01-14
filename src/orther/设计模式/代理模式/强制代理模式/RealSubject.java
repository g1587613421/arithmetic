package orther.设计模式.代理模式.强制代理模式;

import java.sql.Timestamp;

public class RealSubject implements Subject {
    private Proxy proxy;
    @Override
    public void upgard() {
        if (isproxy())
        System.out.println(String.format("%s我是具体干活的类,我在干活", new Timestamp(System.currentTimeMillis())));
        else
            System.err.println(String.format("%s拒绝访问,请通过合法代理进行访问", new Timestamp(System.currentTimeMillis())));
    }

    public Proxy getProxy() {
        proxy=new Proxy(this);
        return this.proxy;
    }

    //允许直接访问,如果不允许也可以通过修改临时权限来访问
    public RealSubject(){
    }
    private boolean isproxy(){
        return proxy!=null;
    }
}
