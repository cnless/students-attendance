package com.dw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaRole {
    private String RoleId;
    private String RoleDesc;
    private int DataScope;
}
