package com.gupao.proxy.dynamicproxy.gpproxy;

import com.gupao.proxy.dynamicproxy.gpproxy.client.IPerson;
import com.gupao.proxy.dynamicproxy.gpproxy.proxy.GPInvocationHandler;

import java.lang.reflect.*;

public class $Proxy0 implements com.gupao.proxy.dynamicproxy.gpproxy.client.IPerson {
    private GPInvocationHandler h;

    public $Proxy0(GPInvocationHandler h) {
        this.h = h;
    }

    public void findLove(int int0) {
        try {
            Method m = com.gupao.proxy.dynamicproxy.gpproxy.client.IPerson.class.getMethod("findLove", new Class[]{int.class});
            Object result = this.h.invoke(this, m, new Object[]{int0});
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public java.lang.Integer getAge(java.lang.Integer integer0) {
        try {
            Method m = com.gupao.proxy.dynamicproxy.gpproxy.client.IPerson.class.getMethod("getAge", new Class[]{java.lang.Integer.class});
            Object result = this.h.invoke(this, m, new Object[]{integer0});
            return (java.lang.Integer) result;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    public java.lang.Integer getHeight() {
        try {
            Method m = com.gupao.proxy.dynamicproxy.gpproxy.client.IPerson.class.getMethod("getHeight", new Class[]{});
            Object result = this.h.invoke(this, m, new Object[]{});
            return (java.lang.Integer) result;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    public java.lang.String getPersonName(java.lang.String string0) {
        try {
            Method m = com.gupao.proxy.dynamicproxy.gpproxy.client.IPerson.class.getMethod("getPersonName", new Class[]{java.lang.String.class});
            Object result = this.h.invoke(this, m, new Object[]{string0});
            return (java.lang.String) result;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}