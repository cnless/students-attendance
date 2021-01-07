package com.dw.mapper;

import com.dw.pojo.Attendance;
import com.dw.pojo.Stuattendance;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface StuattendanceMapper {
    //查询全部 List
    List<Stuattendance> getStuattendanceList();
    //查询根据ID
    Stuattendance getStuattendanceById(int attendanceId);
    //查询根据UserID
    List<Stuattendance> getStuattendanceByUserId(String userId);
    //按班级查看出勤情况
    List<Stuattendance> getStuattendanceByClassid(String classId);
    //插入
    int addStuattendancele(Stuattendance stuattendance);
    //删除根据ID
    int deleteStuattendanceById(int attendanceId);
    //修改根据ID
    int updateStuattendanceById(Stuattendance stuattendance);
    //查看所有班级出勤率
    Attendance getClassAttendance();
}
