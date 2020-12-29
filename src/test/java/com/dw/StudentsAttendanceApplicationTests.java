package com.dw;

import com.dw.mapper.MaUserMapper;
import com.dw.pojo.MaUser;
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
    MaUserMapper maUserMapper;
    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());
        /*List<MaUser> maUserList=maUserMapper.queryMaUserList();
        for (MaUser maUser : maUserList) {
            System.out.println(maUser);
        }*/
        System.out.println(maUserMapper.queryMaUserById("5720181405"));
    }

}
