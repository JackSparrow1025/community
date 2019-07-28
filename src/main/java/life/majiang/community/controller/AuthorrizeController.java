package life.majiang.community.controller;

import life.majiang.community.mapper.UserMapper;
import life.majiang.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@Controller
public class AuthorrizeController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/insert")
    public String insert(Model model, HttpSession session){
      //  Date date=new Date();
        User user=new User();
        user.setAccount_Id("accountId");
        user.setName("wj");
        user.setToken(UUID.randomUUID().toString());
        user.setGmt_Create(System.currentTimeMillis());
        user.setGmt_Modified(1L);
     //   userMapper.insert(user);

        Integer id=5;
        User user1=userMapper.findById(id);

        session.setAttribute("user",user1);
        session.setMaxInactiveInterval(600);

        model.addAttribute("name",user1.getName());
        return "hello";
    }


}
