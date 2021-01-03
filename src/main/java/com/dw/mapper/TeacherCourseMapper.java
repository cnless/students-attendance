package com.dw.mapper;

import com.dw.pojo.TeacherCourse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherCourseMapper {
    //查询全部 List
    List<TeacherCourse> getTeacherCourseList();
    //查询根据ID
    TeacherCourse getTeacherCourseById(String userId);
    //插入
    int addTeacherCourse(TeacherCourse teacherCourse);
    //删除根据ID
    int deleteTeacherCourseById(String userId);
    //修改根据ID
    int updateTeacherCourseById(TeacherCourse teacherCourse);
}
