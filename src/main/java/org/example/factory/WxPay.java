package org.example.factory;

/**
 * @ProjectName: DesignPattern
 * @ClassName: WxPay
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/21 10:09 上午
 * @Version v1.0
 */
public class WxPay implements IPay{

    @Override
    public void pay() {
        System.out.println("微信 pay");
    }

}
