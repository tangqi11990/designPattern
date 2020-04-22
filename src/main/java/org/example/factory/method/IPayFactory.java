package org.example.factory.method;

import org.example.factory.IPay;

/**
 * @ProjectName: DesignPattern
 * @ClassName: IPayFactory
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/21 11:47 上午
 * @Version v1.0
 */
public interface IPayFactory {
    IPay create();
}
