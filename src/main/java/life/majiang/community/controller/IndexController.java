package life.majiang.community.controller;

import life.majiang.community.mapper.IndexMapper;
import life.majiang.community.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @Autowired IndexMapper indexMapper;


    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/toMarkDown.do")
    public String toMarkDown(Model model){
       // String content= indexMapper.findQues();
        int id=1002;
        String content= indexMapper.findQuesById(id);

        model.addAttribute("content",content);
        return "markDown";
    }

    @PostMapping("/insert.do")
    public String insertQues(Model model, @RequestParam String content){
        Question ques= new Question();
        ques.setContent(content);
        indexMapper.add(ques);

        model.addAttribute("msg","添加成功");
        return "markDown";
    }



}
