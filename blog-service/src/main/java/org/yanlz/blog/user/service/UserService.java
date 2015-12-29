package org.yanlz.blog.user.service;

import static org.yanlz.blog.db.tables.UserInfo.TB_USER_INFO;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yanlz.blog.db.tables.interfaces.IUserInfo;
import org.yanlz.blog.db.tables.pojos.UserInfo;
import org.yanlz.blog.db.tables.records.UserInfoRecord;
import org.yanlz.blog.user.UserRequest;

/**
 * Created by yanliangzhao on 15/12/29.
 */
@Service
public class UserService implements IUserService{

    private final DSLContext dsl;

    @Autowired
    public UserService(Configuration configuration){
        dsl = DSL.using(configuration);
    }
    @Override
    public IUserInfo insertUser(UserRequest userRequest) {
        IUserInfo userInfo = new UserInfo();
        userInfo.setNickName(userRequest.getNick_name());
        userInfo.setProtraitUrl(userRequest.getProtraitUrl());
        userInfo.setTelephone(userRequest.getTelephone());

        UserInfoRecord userInfoRecord = dsl.newRecord(TB_USER_INFO, userInfo);
        userInfoRecord.store();
        userInfo.setUserId(userInfoRecord.getUserId());
        return userInfo;
    }
}
