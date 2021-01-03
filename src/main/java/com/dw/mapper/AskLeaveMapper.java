package com.dw.mapper;

import com.dw.pojo.AskLeave;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AskLeaveMapper {
    //查询全部 List
    List<AskLeave> getAskLeaveList();
    //查询根据ID
    AskLeave getAskLeaveById(String leaveId);
    //插入
    int addAskLeave(AskLeave askLeave);
    //删除根据ID
    int deleteAskLeaveById(String leaveId);
    //修改根据ID
    int updateAskLeaveById(AskLeave askLeave);


}
