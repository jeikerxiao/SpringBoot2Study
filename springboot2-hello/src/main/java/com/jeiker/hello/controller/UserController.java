package com.jeiker.hello.controller;

import com.jeiker.hello.model.IdVo;
import com.jeiker.hello.model.User;
import com.jeiker.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author : xiao
 * @date : 2018/3/7 上午9:03
 * @description :
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hi")
    public Map<String, String> sayHi() {
        return Collections.singletonMap("message", "hello world!");
    }

    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

    @DeleteMapping("/get")
    public User get(@RequestBody IdVo idVo) {
        return userService.get(idVo.getId());
    }

    @PostMapping("/add")
    public Map<String, String> add(@RequestBody User user) {
        userService.add(user);
        return Collections.singletonMap("message", "success");
    }

    @DeleteMapping("/delete")
    public Map<String, String> delete(@RequestBody IdVo idVo) {
        userService.delete(idVo.getId());
        return Collections.singletonMap("message", "success");
    }

    @PutMapping("/update")
    public Map<String, String> update(@RequestBody User user) {
        userService.update(user);
        return Collections.singletonMap("message", "success");
    }
}
