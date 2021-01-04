package com.dw.service.Stuattendance;

import com.dw.pojo.Stuattendance;

import java.util.List;

public interface StuattendanceService {
    //查询全部考勤
    List<Stuattendance> getStuattendanceList();
    //查询考勤根据ID
    Stuattendance getStuattendanceById(int attendanceId);
    //新增考勤
    boolean addStuattendancele(Stuattendance stuattendance);
    //删除考勤
    boolean deleteStuattendanceById(int attendanceId);
    //修改考勤
    boolean updateStuattendanceById(Stuattendance stuattendance);
}
