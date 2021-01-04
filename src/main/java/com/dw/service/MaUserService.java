package com.dw.service;

import com.dw.pojo.MaUser;


import java.util.List;
public interface MaUserService {
    List<MaUser> queryMaUserList();
    MaUser queryMaUserById(String userId);
    int addMaUser(MaUser maUser);
    int deleteMaUser(String userId);
    int updateMaUser(MaUser maUser);
}
