package com.gupao.composite.transparent;

/**
 * @ProjectName: DesignPattern
 * @ClassName: CourceTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/5/14 11:09 上午
 * @Version v1.0
 */
public class CourseTest {

    public static void main(String[] args) {
        Course courseJava = new Course("Java",5);
        Course courseCpp = new Course("C++",6);
        Course courseJs = new Course("JS",8);


        Course courseJvm = new Course("JVM内存分析", 1);
        Course courseThread = new Course("多线程编程", 2);
        Course courseHc = new Course("高并发编程", 3);
        CoursePackage coursePackage = new CoursePackage("Java初级", 2);
        coursePackage.addComponet(courseJvm);
        coursePackage.addComponet(courseThread);
        coursePackage.addComponet(courseHc);

        CoursePackage courseAll = new CoursePackage("课程目录", 1);
        courseAll.addComponet(courseJava);
        courseAll.addComponet(courseCpp);
        courseAll.addComponet(courseJs);
        courseAll.addComponet(coursePackage);

        courseAll.print();

    }

}
