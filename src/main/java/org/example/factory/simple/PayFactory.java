package org.example.factory.simple;

import org.example.factory.IPay;

/**
 * @ProjectName: DesignPattern
 * @ClassName: PayFactory
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/21 10:09 上午
 * @Version v1.0
 */
public class PayFactory {

    public IPay createPay(Class<? extends IPay> clazz) {
        /*if ("AliPay".equals(payName)) {
            return new AliPay();
        }else if ("WxPay".equals(payName)) {
            return new WxPay();
        }else {
            return null;
        }*/

        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;

    }


}
