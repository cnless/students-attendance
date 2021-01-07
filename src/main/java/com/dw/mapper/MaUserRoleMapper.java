package com.dw.mapper;

import com.dw.pojo.MaRole;
import com.dw.pojo.MaUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MaUserRoleMapper {
    //查询全部 List
    List<MaUserRole> getMaUserRole();
    //查询根据ID
    MaUserRole getMaUserRoleById(String userId);
    //插入
    int addMaUserRole(MaUserRole maUserRole);
    //删除根据ID
    int deleteMaUserRoleById(String userId);
    //修改根据ID
    int updateMaUserRoleById(MaUserRole maUserRole);
}
