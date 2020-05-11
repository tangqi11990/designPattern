package com.gupao.factory.abstractfactory;

import com.gupao.factory.IPay;
import com.gupao.factory.WxPay;

/**
 * @ProjectName: DesignPattern
 * @ClassName: WxPayFactory
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/21 4:55 下午
 * @Version v1.0
 */
public class WxPayFactory extends PayAbstractFactory {
    @Override
    IPay pay() {

        super.init();
        return new WxPay();

    }

    @Override
    ISettle settle() {
        super.init();
        return new WxPaySettle();
    }
}
