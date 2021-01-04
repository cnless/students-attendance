package com.dw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaUser {
    private String userId;
    private String userName;
    private String passwd;
    private String lastUpdateDt;
    private String lastUpdateUser;
    private String classid;
}
