package org.example.factory.simple;

import org.example.factory.IPay;
import org.example.factory.WxPay;

/**
 * @ProjectName: DesignPattern
 * @ClassName: SimpleFactoryTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/21 11:35 上午
 * @Version v1.0
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        IPay pay  = new PayFactory().createPay(WxPay.class);
        pay.pay();
    }
}
