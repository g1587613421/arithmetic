package orther.设计模式.工厂模式和单例模式.简单抽象工厂;

public abstract class AbstractHumanFactory {
    public abstract<T extends Human> T createHuman(Class<T> c);

}
