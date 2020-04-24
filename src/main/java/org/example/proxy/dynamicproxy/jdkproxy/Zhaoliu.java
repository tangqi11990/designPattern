package org.example.proxy.dynamicproxy.jdkproxy;

/**
 * @ProjectName: DesignPattern
 * @ClassName: Zhangsan
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/24 10:24 上午
 * @Version v1.0
 */
public class Zhaoliu implements IPerson{
    @Override
    public String getPersonName() {
        return "赵六";
    }

    @Override
    public void findLove() {
        System.out.println("我是赵六，我的要求是有车有房学历高");
    }
}
