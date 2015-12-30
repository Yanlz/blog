package org.yanlz.blog.UserController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yanlz.blog.db.tables.interfaces.IUserInfo;
import org.yanlz.blog.user.UserRequest;
import org.yanlz.blog.user.service.IUserService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanliangzhao on 15/12/29.
 */

/**
 * 用户Controller
 */
@RestController
@RequestMapping("/blog")
public class UserController {

    /**
     * 添加用户
     * @return
     */
    @Resource
    IUserService iUserService;
    @RequestMapping(value = "/user/add" , method = RequestMethod.GET)
    @ResponseBody
    public IUserInfo addUser(UserRequest userRequest){
        Map<String,String> map = new HashMap<String, String>();
        map.put("1","hello");
        map.put("2","world");
        IUserInfo userInfo = iUserService.insertUser(userRequest);
        return userInfo;
    }
}
