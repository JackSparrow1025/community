package life.majiang.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @Autowired
    private RedisTemplate<String,String>  redisTemplate;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name,Model model){
        model.addAttribute("name",name);

        redisTemplate.opsForValue().set("itcast001","itcast001");

        return "hello";
    }

}
