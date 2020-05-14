package com.gupao.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: DesignPattern
 * @ClassName: CourcePackage
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/14 11:01 上午
 * @Version v1.0
 */
public class CoursePackage extends CourseComponent{

    private List<CourseComponent> items = new ArrayList<>();

    private String name;
    private int level;


    public CoursePackage(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    protected void addComponet(CourseComponent courseComponent) {
        if (!items.contains(courseComponent)) {
            items.add(courseComponent);
        }
    }

    @Override
    protected void deleteComponet(CourseComponent courseComponent) {
        if (items.contains(courseComponent)) {
            items.remove(courseComponent);
        }
    }

    @Override
    protected void print() {
        System.out.println(this.name);
        for (CourseComponent item : items) {
            for (int i = 0; i < this.level; i++) {
                System.out.print("    ");
            }
            for (int i = 0; i < this.level; i++) {
                if (i == 0) {
                    System.out.print("+");
                }
                System.out.print("-");
            }
            item.print();
        }


    }
}
