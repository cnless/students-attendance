package com.dw.service;

import com.dw.mapper.MaUserMapper;
import com.dw.pojo.MaUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaUserServiceImpl implements MaUserService{
    @Autowired
    private MaUserMapper maUserMapper;
    public void setMaUserMapper(MaUserMapper maUserMapper){
        this.maUserMapper=maUserMapper;
    }
    @Override
    public List<MaUser> queryMaUserList() {
        return maUserMapper.queryMaUserList();
    }

    @Override
    public MaUser queryMaUserById(String userId) {
        return maUserMapper.queryMaUserById(userId);
    }
}
