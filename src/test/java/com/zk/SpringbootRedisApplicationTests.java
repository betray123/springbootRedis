package com.zk;

import com.zk.dao.TestRedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Autowired
    TestRedisDao testRedis;

	@Test
	public void contextLoads() {
		testRedis.setKey("zk","gjq");
        testRedis.setKey("age","18");
        System.out.println(testRedis.getValue("zk"));
        System.out.println(testRedis.getValue("age"));
    }

}
