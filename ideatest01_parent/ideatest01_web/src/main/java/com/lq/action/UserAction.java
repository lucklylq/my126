package com.lq.action;

import com.lq.entity.User;
import com.lq.service.UserService;
import com.lq.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
@Controller
public class UserAction {
    @RequestMapping("testIdea")
    @ResponseBody
    public List<User> findAll() throws  Exception{
        UserService userService=new UserServiceImpl();
        return userService.findall();
    }
}
