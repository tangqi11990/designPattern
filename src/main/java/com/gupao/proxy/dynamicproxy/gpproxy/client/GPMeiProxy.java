package com.gupao.proxy.dynamicproxy.gpproxy.client;


import com.gupao.proxy.dynamicproxy.gpproxy.proxy.GPClassLoader;
import com.gupao.proxy.dynamicproxy.gpproxy.proxy.GPInvocationHandler;
import com.gupao.proxy.dynamicproxy.gpproxy.proxy.GPProxy;

import java.lang.reflect.Method;

/**
 * @ProjectName: DesignPattern
 * @ClassName: JdkMeiPo
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/24 10:25 上午
 * @Version v1.0
 */
public class GPMeiProxy implements GPInvocationHandler {

    private IPerson iPerson;

    public IPerson getInstance(IPerson target) {
        this.iPerson = target;
        Class clazz = target.getClass();
        return  (IPerson) GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(this.iPerson);
        Object object = method.invoke(this.iPerson, args);
        after(this.iPerson);
        return object;
    }



    private void before(IPerson iPerson) {
        System.out.println("你好" + iPerson.getPersonName("zhangsan") + ", 我是媒婆，你的需求我已经收到，开始物色");
        //System.out.println("你好 , 我是媒婆，你的需求我已经收到，开始物色");
    }

    private void after(IPerson iPerson) {
        System.out.println("你好" + iPerson.getPersonName("zhangsan") + ", 我已经找到合适的人");
        //System.out.println("你好 , 我已经找到合适的人");
    }

}
