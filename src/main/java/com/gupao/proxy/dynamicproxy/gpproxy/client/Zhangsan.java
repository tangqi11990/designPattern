package com.gupao.proxy.dynamicproxy.gpproxy.client;


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
    public String getPersonName(String name) {
        return name;
    }

    @Override
    public void findLove(int age) {
        System.out.println("我是张三，我今年" + age + ",我的要求是肤白貌美大长腿");
    }

    @Override
    public Integer getAge(Integer age) {
        System.out.println(age);
        return age;
    }

    @Override
    public Integer getHeight() {
        return Integer.valueOf(196);
    }
}