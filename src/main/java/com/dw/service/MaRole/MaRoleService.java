package com.dw.service.MaRole;

import com.dw.pojo.MaRole;

import java.util.List;

public interface MaRoleService {
    //查询全部角色
    List<MaRole> getMaRoleList();
    //查询角色根据ID
    MaRole getMaRoleById(String roleId);
    //新增角色
    boolean addMaRole(MaRole maRole);
    //删除角色
    boolean deleteMaRoleById(String roleId);
    //修改角色
    boolean updateMaRoleById(MaRole maRole);
}
