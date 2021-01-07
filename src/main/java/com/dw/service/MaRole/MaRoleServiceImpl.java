package com.dw.service.MaRole;

import com.dw.mapper.MaRoleMapper;
import com.dw.pojo.MaRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaRoleServiceImpl implements MaRoleService{
    @Autowired
    MaRoleMapper maRoleMapper;
    @Override
    public List<MaRole> getMaRoleList() {
        return maRoleMapper.getMaRoleList();
    }

    @Override
    public MaRole getMaRoleById(String roleId) {
        return maRoleMapper.getMaRoleById(roleId);
    }

    @Override
    public boolean addMaRole(MaRole maRole) {
        boolean flag=false;
        if(maRoleMapper.addMaRole(maRole)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean deleteMaRoleById(String roleId) {
        boolean flag=false;
        if(maRoleMapper.deleteMaRoleById(roleId)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean updateMaRoleById(MaRole maRole) {
        boolean flag=false;
        if(maRoleMapper.updateMaRoleById(maRole)>0){
            flag=true;
        }
        return flag;
    }
}
