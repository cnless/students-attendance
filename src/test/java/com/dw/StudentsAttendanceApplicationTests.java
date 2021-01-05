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
    @Test
    void contextLoads() throws SQLException {

        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

}
