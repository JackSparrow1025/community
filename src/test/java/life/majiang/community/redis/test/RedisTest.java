package life.majiang.community.redis.test;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
/*import org.springframework.stereotype.Controller;*/

/*@Controller*/
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {
    @Autowired
    public RedisTemplate<String,String> redisTemplate;

    @Test
    public void testRedis(){

        System.out.println("aaa");

        redisTemplate.opsForValue().set("itcast001","itcast001");
    }


}
