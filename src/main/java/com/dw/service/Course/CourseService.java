package com.dw.service.Course;

import com.dw.pojo.Course;

import java.util.List;

public interface CourseService {
    //查询全部课程
    List<Course> getCourseList();
    //查询课程根据ID
    Course getCourseById(String courseId);
    //新增课程
    boolean addCourse(Course course);
    //删除课程
    boolean deleteCourseById(String courseId);
    //修改课程
    boolean updateCourseById(Course course);
}
