package com.dw;

import com.dw.mapper.MaUserMapper;
import com.dw.pojo.MaUser;
import com.dw.service.MaUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class StudentsAttendanceApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    MaUserService maUserService;
    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());
        List<MaUser> list=maUserService.queryMaUserList();
        for (MaUser maUser : list) {
            System.out.println(maUser);
        }

    }

}
