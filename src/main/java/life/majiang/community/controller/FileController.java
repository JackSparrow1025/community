package life.majiang.community.controller;

import life.majiang.community.model.FileDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FileController {

    @RequestMapping("/file/upload")
    @ResponseBody   //此注解return返回不会被解析成跳转到页面，所以spring boot中Ajax什么的都要加此注解，返回JSON等数据
    public FileDTO upload(){
        FileDTO fileDTO=new FileDTO();
        fileDTO.setSuccess(1);
        fileDTO.setUrl("/images/ek.jpg");
        return fileDTO;
    }



}
