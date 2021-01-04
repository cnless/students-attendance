package com.dw.service.MaClass;

import com.dw.pojo.MaClass;

import java.util.List;

public interface MaClassService {
    //查询全部班级
    List<MaClass> getMaClassList();
    //查询班级根据ID
    MaClass getMaClassById(String classId);
    //新增班级
    boolean addMaClass(MaClass maClass);
    //删除班级
    boolean deleteMaClassById(String classId);
    //修改班级
    boolean updateMaClassById(MaClass maClass);
}
