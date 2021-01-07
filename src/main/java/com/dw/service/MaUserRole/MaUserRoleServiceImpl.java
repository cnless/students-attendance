package com.dw.service.MaUserRole;

import com.dw.mapper.MaUserRoleMapper;
import com.dw.pojo.MaUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaUserRoleServiceImpl implements MaUserRoleService{
    @Autowired
    MaUserRoleMapper maUserRoleMapper;
    @Override
    public List<MaUserRole> getMaUserRole() {
        return maUserRoleMapper.getMaUserRole();
    }

    @Override
    public MaUserRole getMaUserRoleById(String userId) {
        return maUserRoleMapper.getMaUserRoleById(userId);
    }

    @Override
    public boolean addMaUserRole(MaUserRole maUserRole) {
        boolean flag=false;
        if(maUserRoleMapper.addMaUserRole(maUserRole)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean deleteMaUserRoleById(String userId) {
        boolean flag=false;
        if(maUserRoleMapper.deleteMaUserRoleById(userId)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean updateMaUserRoleById(MaUserRole maUserRole) {
        boolean flag=false;
        if(maUserRoleMapper.updateMaUserRoleById(maUserRole)>0){
            flag=true;
        }
        return flag;
    }
}
