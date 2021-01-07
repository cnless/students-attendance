package com.dw.service.TeacherCourse;

import com.dw.mapper.TeacherCourseMapper;
import com.dw.pojo.TeacherCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherCourseServiceImpl implements TeacherCourseService{
    @Autowired
    TeacherCourseMapper teacherCourseMapper;
    @Override
    public List<TeacherCourse> getTeacherCourseList() {
        return teacherCourseMapper.getTeacherCourseList();
    }

    @Override
    public TeacherCourse getTeacherCourseById(String userId) {
        return teacherCourseMapper.getTeacherCourseById(userId);
    }

    @Override
    public boolean addTeacherCourse(TeacherCourse teacherCourse) {
        boolean flag=false;
        if(teacherCourseMapper.addTeacherCourse(teacherCourse)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean deleteTeacherCourseById(String userId) {
        boolean flag=false;
        if(teacherCourseMapper.deleteTeacherCourseById(userId)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean updateTeacherCourseById(TeacherCourse teacherCourse) {
        boolean flag=false;
        if(teacherCourseMapper.updateTeacherCourseById(teacherCourse)>0){
            flag=true;
        }
        return flag;
    }
}
