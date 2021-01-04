package com.dw.service.TeacherCourse;

import com.dw.pojo.TeacherCourse;

import java.util.List;

public interface TeacherCourseService {
    //查询全部老师课程安排信息
    List<TeacherCourse> getTeacherCourseList();
    //查询老师课程安排信息根据老师ID
    TeacherCourse getTeacherCourseById(String userId);
    //为老师新增课程安排
    boolean addTeacherCourse(TeacherCourse teacherCourse);
    //删除老师课程安排
    boolean deleteTeacherCourseById(String userId);
    //修改老师课程安排
    boolean updateTeacherCourseById(TeacherCourse teacherCourse);
}
