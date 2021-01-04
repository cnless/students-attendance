package com.dw.mapper;

import com.dw.pojo.Stuattendance;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StuattendanceMapper {
    //查询全部 List
    List<Stuattendance> getStuattendanceList();
    //查询根据ID
    Stuattendance getStuattendanceById(int attendanceId);
    //插入
    int addStuattendancele(Stuattendance stuattendance);
    //删除根据ID
    int deleteStuattendanceById(int attendanceId);
    //修改根据ID
    int updateStuattendanceById(Stuattendance stuattendance);
}
