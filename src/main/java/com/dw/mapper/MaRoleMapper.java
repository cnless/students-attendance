package com.dw.mapper;

import com.dw.pojo.MaRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MaRoleMapper {
    //查询全部 List
    List<MaRole> getMaRoleList();
    //查询根据ID
    MaRole getMaRoleById(String roleId);
    //插入
    int addMaRole(MaRole maRole);
    //删除根据ID
    int deleteMaRoleById(String roleId);
    //修改根据ID
    int updateMaRoleById(MaRole maRole);
}
