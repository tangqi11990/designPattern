package com.gupao.builder.chain;

/**
 * @ProjectName: DesignPattern
 * @ClassName: CourseBuilder
 * @Description: TODO(一句话描述该类的功能)
 * @Author: tangqi
 * @Date: 2020/4/23 4:53 下午
 * @Version v1.0
 */
public class CourseBuilder {

    private Course course = new Course();

    public CourseBuilder addName(String name) {course.setName(name); return this;}
    public CourseBuilder addHomework(String homework) {course.setHomework(homework); return this;}
    public CourseBuilder addNote(String note) {course.setNote(note); return this;}
    public CourseBuilder addPpt(String ppt) {course.setPpt(ppt); return this;}
    public CourseBuilder addVideo(String video) {course.setVideo(video); return this;}

    public Course builder() {
        return course;
    }

}
