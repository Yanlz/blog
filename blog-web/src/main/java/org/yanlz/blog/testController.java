package org.yanlz.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yanliangzhao on 15/12/29.
 */
@Controller
@RequestMapping("/test1")
public class testController {

    @RequestMapping("/veloctity")
    public String velocityTest(Model model){
        model.addAttribute("test","hell velocity");
        return "wellcome";
    }
}
