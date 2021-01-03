package com.dw.mapper;

import com.dw.pojo.MaClass;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface MaClassMapper {
    //查询全部 List
    List<MaClass> getMaClassList();
    //查询根据ID
    MaClass getMaClassById(String classId);
    //插入
    int addMaClass(MaClass maClass);
    //删除根据ID
    int deleteMaClassById(String classId);
    //修改根据ID
    int updateMaClassById(MaClass maClass);
}
