package com.gupao.composite.safe;

/**
 * @ProjectName: DesignPattern
 * @ClassName: File
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/14 11:36 上午
 * @Version v1.0
 */
public class File extends Directory{

    public File(String name) {
        super(name);
    }

    @Override
    protected void show() {
        System.out.println(this.name);
    }
}
