package com.dw.service.Stuattendance;

import com.dw.mapper.StuattendanceMapper;
import com.dw.pojo.Stuattendance;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StuattendanceServiceImpl implements StuattendanceService{
    @Autowired
    StuattendanceMapper stuattendanceMapper;
    @Override
    public List<Stuattendance> getStuattendanceList() {
        return stuattendanceMapper.getStuattendanceList();
    }

    @Override
    public Stuattendance getStuattendanceById(int attendanceId) {
        return stuattendanceMapper.getStuattendanceById(attendanceId);
    }

    @Override
    public boolean addStuattendancele(Stuattendance stuattendance) {
        boolean flag=false;
        if(stuattendanceMapper.addStuattendancele(stuattendance)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean deleteStuattendanceById(int attendanceId) {
        boolean flag=false;
        if(stuattendanceMapper.deleteStuattendanceById(attendanceId)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean updateStuattendanceById(Stuattendance stuattendance) {
        boolean flag=false;
        if(stuattendanceMapper.updateStuattendanceById(stuattendance)>0){
            flag=true;
        }
        return flag;
    }
}
