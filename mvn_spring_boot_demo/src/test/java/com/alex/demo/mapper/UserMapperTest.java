package com.alex.demo.mapper;

import com.alex.demo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQuery() {
        List<User> users = userMapper.selectAll();
        System.out.println(users);

        User user = userMapper.selectByPrimaryKey(1L);
        log.info("user {} {}", user.getId(),user.getUserName());

    }

}