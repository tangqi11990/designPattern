package com.gupao.proxy.dynamicproxy.cgligproxy;

/**
 * @ProjectName: DesignPattern
 * @ClassName: Test
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/24 1:12 下午
 * @Version v1.0
 */
public class Test {

    public static void main(String[] args) {

        Zhangsan zhangsan = (Zhangsan)new CglibMeiProxy().getInstance(Zhangsan.class);
        zhangsan.findLove();
    }
}
