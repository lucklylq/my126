package com.lq.dao;

import com.lq.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
public interface UserDao {
    List<User> findall();
}
