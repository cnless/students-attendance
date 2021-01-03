package com.dw.mapper;

import com.dw.pojo.AskLeave;
import com.dw.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper {
    //查询全部 List
    List<Course> getCourseList();
    //查询根据ID
    Course getCourseById(String courseId);
    //插入
    int addCourse(Course course);
    //删除根据ID
    int deleteCourseById(String courseId);
    //修改根据ID
    int updateCourseById(Course course);
}
