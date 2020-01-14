package orther.设计模式.工厂模式和单例模式.简单抽象工厂;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
        //获得抽象的工厂---一个工厂生产好几种人
        HumanFactory humanFactory=new HumanFactory();
        Human human=humanFactory.createHuman(blackHuman.class);
        human.getColor();


    }
}
