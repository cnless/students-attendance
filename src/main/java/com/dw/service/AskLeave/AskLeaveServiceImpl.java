package com.dw.service.AskLeave;

import com.dw.mapper.AskLeaveMapper;
import com.dw.pojo.AskLeave;
import com.dw.service.AskLeave.AskLeaveService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AskLeaveServiceImpl implements AskLeaveService {
    @Autowired
    AskLeaveMapper askLeaveMapper;
    @Override
    public List<AskLeave> getAskLeaveList() {
        return askLeaveMapper.getAskLeaveList();
    }

    @Override
    public AskLeave getAskLeaveById(int leaveId) {
        return askLeaveMapper.getAskLeaveById(leaveId);
    }

    @Override
    public boolean addAskLeave(AskLeave askLeave) {
        boolean flag=false;
        if(askLeaveMapper.addAskLeave(askLeave)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean deleteAskLeaveById(int leaveId) {
        boolean flag=false;
        if(askLeaveMapper.deleteAskLeaveById(leaveId)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean updateAskLeaveById(AskLeave askLeave) {
        boolean flag=false;
        if(askLeaveMapper.updateAskLeaveById(askLeave)>0){
            flag=true;
        }
        return flag;
    }
}
