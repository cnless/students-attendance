package com.dw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherCourse {
    private String UserId;
    private String Courseid;
    private String Classid;
}
