package org.example.builder.chain;

/**
 * @ProjectName: DesignPattern
 * @ClassName: Test
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/23 5:00 下午
 * @Version v1.0
 */
public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseBuilder()
                .addHomework("家庭作业")
                .addName("Java")
                .addNote("课后笔记")
                .addPpt("课堂PPT")
                .addVideo("课堂视频");
        System.out.println(courseBuilder.builder());
    }
}
