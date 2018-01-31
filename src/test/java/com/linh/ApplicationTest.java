package com.linh;

import com.linh.mapper.UserMapper;
import com.linh.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void test1(){
        System.out.println("测试开始");
        //简单验证结果集是否正确
        User user = new User();
        user.setPhone("13205817385");
        userMapper.insert(user);
        System.out.println(userMapper.findAll());
    }

    @Test
    public void findAll(){
        List<User> user = userMapper.findAll();
        System.out.println(user);
    }

    @Test
    @Rollback
    public void delete(){
        User user = new User();
        user.setPhone("13205817385");

        List<User> users = userMapper.findSelective(user);
        for(User u:users){
            userMapper.deleteById(u.getUserId());
        }

    }
}
