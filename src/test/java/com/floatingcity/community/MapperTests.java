package com.floatingcity.community;

import com.floatingcity.community.dao.DiscussPostMapper;
import com.floatingcity.community.dao.UserMapper;
import com.floatingcity.community.entity.DiscussPost;
import com.floatingcity.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {

    @Autowired  // zhu ru
    private UserMapper userMapper;

    @Test
    public void testSelectUser(){
        User user = userMapper.selectById(101);
        System.out.println(user.getId());
        System.out.println(user);
    }

    @Test
    public void testInsertUser() {
        User user = new User();
        user.setUsername("test2");
        user.setPassword("123");
        user.setSalt("abc");
        user.setEmail("haha@qq.com");
        user.setHeaderUrl("http://www.nowcoder.com/101.png");
        user.setCreateTime(new Date());

        int rows = userMapper.insertUser(user);
        System.out.println(rows);
        System.out.println(user.getId());  // print 0 ?? but 150, 151 why??
    }

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testDiscussPostMapper() {
        List<DiscussPost> myList = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for(DiscussPost post : myList) {
            System.out.println(post);
        }

        int rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }


}


















