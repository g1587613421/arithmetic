/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.IP地址无效化;

public class Main {

    public String defangIPaddr(String address) {

        return address.replace(".", "[.]");
    }
}
