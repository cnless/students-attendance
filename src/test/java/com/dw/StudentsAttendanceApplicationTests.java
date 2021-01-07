package com.dw;

import com.dw.mapper.MaUserMapper;
import com.dw.pojo.MaUser;
import com.dw.service.MaUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
class StudentsAttendanceApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    MaUserService maUserService;
    @Autowired
    MaUserMapper maUserMapper;
    @Test
    void contextLoads() throws SQLException {
        MaUser maUser=maUserService.queryMaUserById("1");
        System.out.println(maUser.getRoleId());

    }

}
