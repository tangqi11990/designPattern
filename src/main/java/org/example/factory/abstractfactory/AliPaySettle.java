package org.example.factory.abstractfactory;

/**
 * @ProjectName: DesignPattern
 * @ClassName: AliPaySettle
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/21 4:52 下午
 * @Version v1.0
 */
public class AliPaySettle implements ISettle {
    @Override
    public void settle() {
        System.out.println("支付宝 settle");
    }
}
