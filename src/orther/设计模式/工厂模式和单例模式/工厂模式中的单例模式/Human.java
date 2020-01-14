package orther.设计模式.工厂模式和单例模式.工厂模式中的单例模式;

public class Human {
    private double id= Math.random();
    private Human(){
        //屏蔽默认构造函数
    }
    public void getID(){
        System.out.println("当前Human的id是"+id);
    }

}
