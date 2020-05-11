package com.gupao.factory.method;

import com.gupao.factory.IPay;
import com.gupao.factory.WxPay;

/**
 * @ProjectName: DesignPattern
 * @ClassName: WxPayFactory
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/21 11:48 上午
 * @Version v1.0
 */
public class WxPayFactory implements IPayFactory {
    @Override
    public IPay create() {
        return new WxPay();
    }
}
