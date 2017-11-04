package com.lq.service.impl;

import com.lq.dao.UserDao;
import com.lq.dao.impl.UserDaoImpl;
import com.lq.entity.User;
import com.lq.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findall() {
        UserDao userDao=new UserDaoImpl();
        List<User> list=userDao.findall();
        return list;
    }
}
