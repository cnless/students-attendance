package com.dw;

import com.dw.mapper.MaUserMapper;
import com.dw.mapper.StuattendanceMapper;
import com.dw.pojo.MaUser;
import com.dw.pojo.Stuattendance;
import com.dw.service.MaUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@SpringBootTest
class StudentsAttendanceApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    MaUserService maUserService;
    @Autowired
    StuattendanceMapper stuattendanceMapper;
    @Autowired
    MaUserMapper maUserMapper;
    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());
        List<MaUser> list=maUserService.queryMaUserList();
        for (MaUser maUser : list) {
            System.out.println(maUser);
        }

    }
    @Test
    void wwwtest(){
        maUserMapper.addMaUser(new MaUser("5720181431","USER1","12345","2021-1-1","www","71"));
        maUserMapper.addMaUser(new MaUser("5720181432","USER2","12345","2021-1-1","www","71"));
        maUserMapper.addMaUser(new MaUser("5720181433","USER3","12345","2021-1-1","www","71"));
        maUserMapper.addMaUser(new MaUser("5720181434","USER4","12345","2021-1-1","www","71"));
        maUserMapper.addMaUser(new MaUser("5720181435","USER5","12345","2021-1-1","www","72"));
        maUserMapper.addMaUser(new MaUser("5720181436","USER6","12345","2021-1-1","www","72"));
        maUserMapper.addMaUser(new MaUser("5720181437","USER7","12345","2021-1-1","www","72"));
        maUserMapper.addMaUser(new MaUser("5720181438","USER8","12345","2021-1-1","www","72"));
        maUserMapper.addMaUser(new MaUser("5720181439","USER9","12345","2021-1-1","www","81"));
        maUserMapper.addMaUser(new MaUser("5720181440","USER10","12345","2021-1-1","www","81"));
        maUserMapper.addMaUser(new MaUser("5720181441","USER11","12345","2021-1-1","www","81"));
        maUserMapper.addMaUser(new MaUser("5720181442","USER12","12345","2021-1-1","www","81"));
        maUserMapper.addMaUser(new MaUser("5720181443","USER13","12345","2021-1-1","www","82"));
        maUserMapper.addMaUser(new MaUser("5720181444","USER14","12345","2021-1-1","www","82"));
        maUserMapper.addMaUser(new MaUser("5720181445","USER15","12345","2021-1-1","www","82"));
        maUserMapper.addMaUser(new MaUser("5720181446","USER16","12345","2021-1-1","www","82"));
        maUserMapper.addMaUser(new MaUser("5720181447","USER17","12345","2021-1-1","www","82"));
        maUserMapper.addMaUser(new MaUser("5720181448","USER18","12345","2021-1-1","www","82"));
        maUserMapper.addMaUser(new MaUser("5720181449","USER19","12345","2021-1-1","www","91"));
        maUserMapper.addMaUser(new MaUser("5720181450","USER20","12345","2021-1-1","www","91"));
        maUserMapper.addMaUser(new MaUser("5720181451","USER21","12345","2021-1-1","www","91"));
        maUserMapper.addMaUser(new MaUser("5720181452","USER22","12345","2021-1-1","www","91"));
        maUserMapper.addMaUser(new MaUser("5720181453","USER23","12345","2021-1-1","www","91"));
    }
    @Test
    void test1(){
        stuattendanceMapper.addStuattendancele(new Stuattendance(5,"5720181429","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(6,"5720181430","1","6613",new Date(),"迟到"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(7,"5720181431","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(8,"5720181432","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(9,"5720181433","1","6613",new Date(),"迟到"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(10,"5720181434","1","6613",new Date(),"迟到"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(11,"5720181435","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(12,"5720181436","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(13,"5720181437","1","6613",new Date(),"迟到"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(14,"5720181438","1","6613",new Date(),"迟到"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(15,"5720181439","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(16,"5720181440","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(17,"5720181441","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(18,"5720181442","1","6613",new Date(),"迟到"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(18,"5720181443","1","6613",new Date(),"迟到"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(18,"5720181444","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(18,"5720181445","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(18,"5720181446","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(18,"5720181447","1","6613",new Date(),"迟到"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(18,"5720181448","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(18,"5720181449","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(18,"5720181450","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(18,"5720181451","1","6613",new Date(),"出勤"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(18,"5720181452","1","6613",new Date(),"迟到"));
        stuattendanceMapper.addStuattendancele(new Stuattendance(18,"5720181453","1","6613",new Date(),"迟到"));
    }

}
