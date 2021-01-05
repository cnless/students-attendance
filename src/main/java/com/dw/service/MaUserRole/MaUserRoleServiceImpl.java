package com.dw.service.MaUserRole;

import com.dw.mapper.MaUserRoleMapper;
import com.dw.pojo.MaUserRole;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    public boolean deleteMaUserRoleById(String userIdKey, String roleIdKey) {
        boolean flag=false;
        if(maUserRoleMapper.deleteMaUserRoleById(userIdKey, roleIdKey)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean updateMaUserRoleById(String old_userId, String old_roleId, String new_userId, String new_roleId) {
        boolean flag=false;
        if(maUserRoleMapper.updateMaUserRoleById(old_userId, old_roleId, new_userId, new_roleId)>0){
            flag=true;
        }
        return flag;
    }
}
