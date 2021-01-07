package com.dw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class classAttendance {
    private String UserId;
    private String UserName;
    private String ClassName;
    private Date DateDay;
    private String AttenStatus;
}
