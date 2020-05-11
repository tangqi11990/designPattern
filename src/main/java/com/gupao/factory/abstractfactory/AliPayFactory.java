package com.gupao.factory.abstractfactory;

import com.gupao.factory.AliPay;
import com.gupao.factory.IPay;

/**
 * @ProjectName: DesignPattern
 * @ClassName: AliPayFactory
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/21 4:54 下午
 * @Version v1.0
 */
public class AliPayFactory extends PayAbstractFactory {

    @Override
    IPay pay() {
        super.init();
        return new AliPay();
    }

    @Override
    ISettle settle() {
        super.init();
        return new AliPaySettle();
    }
}
