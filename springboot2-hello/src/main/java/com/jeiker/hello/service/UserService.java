package com.jeiker.hello.service;

import com.jeiker.hello.model.User;

import java.util.List;

/**
 * @author : xiao
 * @date : 2018/3/7 上午9:02
 * @description :
 */
public interface UserService {

    List<User> list();

    User get(Integer id);

    void add(User user);

    void delete(Integer id);

    void update(User user);
}
