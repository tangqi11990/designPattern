package org.example.factory.abstractfactory;

import org.example.factory.IPay;

/**
 * @ProjectName: DesignPattern
 * @ClassName: PayAbstraceFactory
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/21 4:49 下午
 * @Version v1.0
 */
public abstract class PayAbstractFactory {

    public void init() {
        System.out.println("支付信息初始化");
    }

    abstract IPay pay();

    abstract ISettle settle();


}
