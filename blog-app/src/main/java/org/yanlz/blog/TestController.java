package org.yanlz.blog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanliangzhao on 15/12/28.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/")
    public String test(){
        return "this is a blog!";
    }
}
