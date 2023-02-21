package com.powernode.spring6.service;

import com.powernode.spring6.dao.UserDao;

public class UserService {
    private UserDao aaa;
    // 使用set方式注入，必须提供set方法。
    // 反射机制要调用这个方法给属性赋值的。
    public void setMySQLUserDao(UserDao xyz) {
        this.aaa = xyz;
    }
    // 使用set方式注入，必须提供set方法。
    // 反射机制要调用这个方法给属性赋值的。
    public void setUserDao(UserDao userDao) {
        this.aaa = userDao;
    }

    public void saveUser(){
    aaa.insert();
    }
}
