package org.example.factory.method;

import org.example.factory.IPay;

/**
 * @ProjectName: DesignPattern
 * @ClassName: FactoryMethodTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/21 11:49 上午
 * @Version v1.0
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IPayFactory factory = new WxPayFactory();
        IPay pay = factory.create();
        pay.pay();
    }
}
