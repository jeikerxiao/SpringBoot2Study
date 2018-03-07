package com.jeiker.hello.service.impl;

import com.jeiker.hello.model.User;
import com.jeiker.hello.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : xiao
 * @date : 2018/3/7 上午9:03
 * @description :
 */
@Service
public class UserServiceImpl implements UserService{

    @Override
    public List<User> list() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "xiao", 16));
        return userList;
    }

    @Override
    public User get(Integer id) {
        return new User(1, "xiao", 18);
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(User user) {

    }
}
