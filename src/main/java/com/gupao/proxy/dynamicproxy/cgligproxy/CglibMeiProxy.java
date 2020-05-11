package com.gupao.proxy.dynamicproxy.cgligproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ProjectName: DesignPattern
 * @ClassName: JdkMeiPo
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/24 10:25 上午
 * @Version v1.0
 */
public class CglibMeiProxy implements MethodInterceptor {


    public Object getInstance(Class clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
       before(o);
       Object result =  methodProxy.invokeSuper(o, objects);
       after(o);
       return result;
    }



    private void before(Object o) {
        System.out.println("你好, 我是媒婆，你的需求我已经收到，开始物色");
    }

    private void after(Object o) {
        System.out.println("你好, 我已经找到合适的人");
    }

}
