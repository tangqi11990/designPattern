package org.example.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: DesignPattern
 * @ClassName: JdkMeiPo
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/24 10:25 上午
 * @Version v1.0
 */
public class CglibMeiProxy implements InvocationHandler {

    private IPerson iPerson;

    public IPerson getInstance(IPerson target) {
        this.iPerson = target;
        Class clazz = target.getClass();
        return  (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before(this.iPerson);
        method.invoke(this.iPerson, args);
        after(this.iPerson);
        return null;
    }



    private void before(IPerson iPerson) {
        System.out.println("你好" + iPerson.getPersonName() + ", 我是媒婆，你的需求我已经收到，开始物色");
    }

    private void after(IPerson iPerson) {
        System.out.println("你好" + iPerson.getPersonName() + ", 我已经找到合适的人");
    }

}
