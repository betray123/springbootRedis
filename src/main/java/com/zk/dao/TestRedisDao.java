package com.zk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * Created by zk on 18/7/5.
 */
@Repository
public class TestRedisDao {

    @Autowired
    private RedisTemplate redisTemplate;

    public void setKey(String key, String value){
        ValueOperations<String,Object> operations = redisTemplate.opsForValue();
        operations.set(key,value);
    }

    public String getValue(String key){
        ValueOperations<String,Object> operations = redisTemplate.opsForValue();
        return (String) operations.get(key);
    }
}
