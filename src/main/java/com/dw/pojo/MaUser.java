package com.dw.pojo;

import com.dw.service.MaUserRole.MaUserRoleService;
import com.dw.service.MaUserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@NoArgsConstructor
@Component
public class MaUser {
    @Autowired
    private MaUserRoleService maUserRoleService;
    public static MaUser smaUser;
    private String userId;
    private String userName;
    private String passwd;
    private String lastUpdateDt;
    private String lastUpdateUser;
    private String classid;
    @PostConstruct
    public void init() {
        smaUser = this;
        smaUser.maUserRoleService=this.maUserRoleService;
    }

    public String getRoleId(){
        String userId=this.getUserId();
        MaUserRole maUserRole=smaUser.maUserRoleService.getMaUserRoleById(userId);
        if(maUserRole==null){
            return "2";
        }
        String id=maUserRole.getRoleId();
        if(id==null){
            return "2";
        }else {
            return id;
        }
    }

    public MaUser(String userId, String userName, String passwd, String lastUpdateDt, String lastUpdateUser, String classid) {
        this.userId = userId;
        this.userName = userName;
        this.passwd = passwd;
        this.lastUpdateDt = lastUpdateDt;
        this.lastUpdateUser = lastUpdateUser;
        this.classid = classid;
    }
}
