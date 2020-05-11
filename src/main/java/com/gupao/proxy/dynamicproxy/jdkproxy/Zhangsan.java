package com.gupao.proxy.dynamicproxy.jdkproxy;


/**
 * @ProjectName: DesignPattern
 * @ClassName: Zhangsan
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/24 10:24 上午
 * @Version v1.0
 */
public class Zhangsan implements IPerson {
    @Override
    public String getPersonName() {
        return "张三";
    }

    @Override
    public void findLove() {
        System.out.println("我是张三，我的要求是肤白貌美大长腿");
    }
}