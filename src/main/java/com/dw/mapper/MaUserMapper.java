package com.dw.mapper;

import com.dw.pojo.MaUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface MaUserMapper {
    List<MaUser> queryMaUserList();
    MaUser queryMaUserById(String userId);
    int addMaUser(MaUser maUser);
    int deleteMaUser(String userId);
    int updateMaUser(MaUser maUser);

}
