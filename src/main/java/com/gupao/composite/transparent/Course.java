package com.gupao.composite.transparent;

/**
 * @ProjectName: DesignPattern
 * @ClassName: CourceCompent
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/14 10:51 上午
 * @Version v1.0
 */
public class Course extends CourseComponent {

    public String name;

    public double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CourseComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CourseComponent catalogComponent) {
        return this.price;
    }

    @Override
    protected void print() {
        System.out.println(this.name + ",价格是：" + this.price);
    }
}
