package com.gupao.factory.abstractfactory;

/**
 * @ProjectName: DesignPattern
 * @ClassName: WxPaySettle
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/21 4:53 下午
 * @Version v1.0
 */
public class WxPaySettle implements ISettle{
    @Override
    public void settle() {
        System.out.println("微信支付 settle");
    }
}
