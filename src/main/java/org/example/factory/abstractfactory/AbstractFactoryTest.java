package org.example.factory.abstractfactory;

/**
 * @ProjectName: DesignPattern
 * @ClassName: AbstractFactoryTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/21 4:57 下午
 * @Version v1.0
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
       PayAbstractFactory aliPay = new AliPayFactory();
       aliPay.pay().pay();
       aliPay.settle().settle();


    }
}
