package com.dw.service.Course;

import com.dw.mapper.CourseMapper;
import com.dw.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseService{
    @Autowired
    CourseMapper courseMapper;
    @Override
    public List<Course> getCourseList() {
        return courseMapper.getCourseList();
    }

    @Override
    public Course getCourseById(String courseId) {
        return courseMapper.getCourseById(courseId);
    }

    @Override
    public boolean addCourse(Course course) {
        boolean flag=false;
        if(courseMapper.addCourse(course)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean deleteCourseById(String courseId) {
        boolean flag=false;
        if(courseMapper.deleteCourseById(courseId)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean updateCourseById(Course course) {
        boolean flag=false;
        if(courseMapper.updateCourseById(course)>0){
            flag=true;
        }
        return flag;
    }
}
