package com.gupao.proxy.dynamicproxy.gpproxy.client;

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
        GPMeiProxy gpMeiProxy = new GPMeiProxy();
        IPerson iPerson = gpMeiProxy.getInstance(new Zhangsan());
        iPerson.findLove(26);
        iPerson.getHeight();
        iPerson.getAge(14);


//        IPerson zhaoliu = jdkMeiPo.getInstance(new Zhaoliu());
//        zhaoliu.findLove();
    }
}
