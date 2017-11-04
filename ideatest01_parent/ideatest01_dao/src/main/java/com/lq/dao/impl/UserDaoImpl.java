package com.lq.dao.impl;

import com.lq.dao.UserDao;
import com.lq.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
public class UserDaoImpl implements UserDao{
    @Override
    public List<User> findall() {
        List<User> list=new ArrayList<>();
        for(int i=1;i<10;i++){
            User user=new User();
            user.setUage(i);
            user.setUname("test1"+i);
            list.add(user);
        }
        return list;
    }
}
