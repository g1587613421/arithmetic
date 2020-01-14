package orther.设计模式.代理模式.动态代理;

public class Test {
    public static void main(String arg[]){//main--来自高金磊
        mall xiaoMi = new mall();
        System.out.println(xiaoMi.salePhones(2000.0));
        System.out.println("---------------------------------------");
        mallproxy proxyXiaoMi = new mallproxy();
        SalePhones salePhonesByProxy = (SalePhones) proxyXiaoMi.doForProxy(xiaoMi);
        System.out.println(salePhonesByProxy.salePhones(2000.0));
    }
}
