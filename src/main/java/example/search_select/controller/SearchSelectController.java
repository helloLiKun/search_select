package example.search_select.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/9/24 0024.
 */
@Controller
public class SearchSelectController {
    @RequestMapping("/searchSelect")
    public String toSearchSelect(){
        return "/search_select/search-select-test";
    }

}
