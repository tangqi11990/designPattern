package com.gupao.composite.transparent;

/**
 * @ProjectName: DesignPattern
 * @ClassName: CourceCompent
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/14 10:51 上午
 * @Version v1.0
 */
public abstract class CourseComponent {

    public String getName(CourseComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CourseComponent catalogComponent){

        throw new UnsupportedOperationException("不支持获取价格操作");
    }


    protected void addComponet(CourseComponent courseComponent) {
        throw new UnsupportedOperationException("不支持添加");
    }

    protected void deleteComponet(CourseComponent courseComponent) {
        throw new UnsupportedOperationException("不支持删除");
    }

    protected void print() {
        throw new UnsupportedOperationException("不支持打印");
    }
}
