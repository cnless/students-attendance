package com.dw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AskLeave {
    private String LeaveId;
    private String UserId;
    private String UserName;
    private Date StartDate;
    private Date EndDate;
    private String Resson;
    private String LeaveStatus;

}
