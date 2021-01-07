package com.dw.service.MaClass;

import com.dw.mapper.MaClassMapper;
import com.dw.pojo.MaClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaClassServiceImpl implements MaClassService{
    @Autowired
    MaClassMapper maClassMapper;
    @Override
    public List<MaClass> getMaClassList() {
        return maClassMapper.getMaClassList();
    }

    @Override
    public MaClass getMaClassById(String classId) {
        return maClassMapper.getMaClassById(classId);
    }

    @Override
    public boolean addMaClass(MaClass maClass) {
        boolean flag=false;
        if(maClassMapper.addMaClass(maClass)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean deleteMaClassById(String classId) {
        boolean flag=false;
        if(maClassMapper.deleteMaClassById(classId)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean updateMaClassById(MaClass maClass) {
        boolean flag=false;
        if(maClassMapper.updateMaClassById(maClass)>0){
            flag=true;
        }
        return flag;
    }
}
