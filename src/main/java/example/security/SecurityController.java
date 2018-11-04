package example.security;

import example.util.AesEncryptUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/11/4 0004.
 */
@Controller
public class SecurityController {
    @RequestMapping("/aes/form")
    public String aesForm(){
        return "security/form";
    }

    @RequestMapping("/aes/submit")
    @ResponseBody
    public String aesTest(@RequestParam("val")String val) throws Exception {
        return  AesEncryptUtils.decrypt(val);
    }
}
