package com.gupao.proxy.dynamicproxy.gpproxy.client;

/**
 * @ProjectName: DesignPattern
 * @ClassName: IPerson
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/24 10:23 上午
 * @Version v1.0
 */
public interface IPerson {

    String getPersonName(String name);

    void findLove(int age);

    Integer getAge(Integer age);

    Integer getHeight();
}
