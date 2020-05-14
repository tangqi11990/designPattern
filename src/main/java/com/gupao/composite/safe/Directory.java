package com.gupao.composite.safe;

/**
 * @ProjectName: DesignPattern
 * @ClassName: Director
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/14 11:35 上午
 * @Version v1.0
 */
public abstract class Directory {

    protected String name;

    public Directory(String name) {
        this.name = name;
    }

    protected abstract void show();
}
