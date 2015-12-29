package org.yanlz.blog.user.service;

import org.yanlz.blog.db.tables.UserInfo;
import org.yanlz.blog.db.tables.interfaces.IUserInfo;
import org.yanlz.blog.user.UserRequest;

/**
 * Created by yanliangzhao on 15/12/29.
 */
public interface IUserService {

    public IUserInfo insertUser(UserRequest userService);
}
