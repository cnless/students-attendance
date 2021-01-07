package com.dw.service.Stuattendance;

import com.dw.pojo.Attendance;
import com.dw.pojo.Stuattendance;

import java.util.List;
import java.util.Map;

public interface StuattendanceService {
    //查询全部考勤
    List<Stuattendance> getStuattendanceList();
    //查看所有班级出勤率
    Attendance getClassAttendance();
    //查询考勤根据ID
    Stuattendance getStuattendanceById(int attendanceId);
    //查询根据UserID
    List<Stuattendance> getStuattendanceByUserId(String userId);
    //新增考勤
    boolean addStuattendancele(Stuattendance stuattendance);
    //删除考勤
    boolean deleteStuattendanceById(int attendanceId);
    //修改考勤
    boolean updateStuattendanceById(Stuattendance stuattendance);
}
