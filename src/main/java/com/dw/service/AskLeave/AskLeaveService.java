package com.dw.service.AskLeave;

import com.dw.pojo.AskLeave;

import java.util.List;

public interface AskLeaveService {
    //查询全部假条
    List<AskLeave> getAskLeaveList();
    //查询符合ID的假条
    AskLeave getAskLeaveById(int leaveId);
    //添加假条
    boolean addAskLeave(AskLeave askLeave);
    //删除假条
    boolean deleteAskLeaveById(int leaveId);
    //修改假条
    boolean updateAskLeaveById(AskLeave askLeave);
}
