package orther.设计模式.代理模式.强制代理模式;

public class test {
    public static void main(String arg[]){//main--来自高金磊
     //直接访问
     new RealSubject().upgard();
     //直接通过代理
        new Proxy(new RealSubject()).upgard();
        //通过实际类找到代理进行访问
        Subject rel=new RealSubject();
        Subject prox=((RealSubject) rel).getProxy();
        prox.upgard();


    }

}
