package orther.设计模式.代理模式.动态代理;

public class mall implements SalePhones{

    @Override
    public String salePhones(Double money) {
        System.out.println("价格为："+money);
        return "小米s8";
    }
}