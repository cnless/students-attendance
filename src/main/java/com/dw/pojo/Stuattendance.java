package com.dw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stuattendance {
    private int AttendanceId;
    private String UserId;
    private String Courseid;
    private String Classroomid;
    private Date DateDay;
    private String AttenStatus;

}
