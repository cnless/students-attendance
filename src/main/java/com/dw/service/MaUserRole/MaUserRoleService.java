package com.dw.service.MaUserRole;

import com.dw.pojo.MaUserRole;

import java.util.List;

public interface MaUserRoleService {
    //查询全部用户-角色对应关系
    List<MaUserRole> getMaUserRole();
    //查询用户-角色对应关系根据用户ID
    MaUserRole getMaUserRoleById(String userId);
    //新增用户-角色对应关系
    boolean addMaUserRole(MaUserRole maUserRole);
    //删除用户-角色对应关系
    boolean deleteMaUserRoleById(String userId);
    //修改用户-角色对应关系
    boolean updateMaUserRoleById(MaUserRole maUserRole);}
