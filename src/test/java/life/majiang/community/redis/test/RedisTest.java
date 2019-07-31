package life.majiang.community.redis.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class RedisTest {
    @Autowired
    public RedisTemplate<String,String> redisTemplate;

    @Test
    public void testRedis(){
        redisTemplate.opsForValue().set("itcast001","itcast001");
    }




}
