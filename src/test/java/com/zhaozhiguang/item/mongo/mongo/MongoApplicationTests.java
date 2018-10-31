package com.zhaozhiguang.item.mongo.mongo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapreduce.MapReduceCounts;
import org.springframework.data.mongodb.core.mapreduce.MapReduceResults;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void contextLoads() {
        //mongoTemplate.dropCollection(User.class);
        //mongoTemplate.createCollection(User.class);
        User user = new User();
        user.setName("李四");
        user.setDesc("李四卖瓜");
        user.setSex("男");
        user.setBirthday(new Date());
        mongoTemplate.save(user);
        System.err.println(user.getId());
        Map<String, String> map = new HashMap<>();
        map.put("name", "高大上割发代首 ");
        map.put("nickName", "测试");
        mongoTemplate.save(map, "user");
    }

}
