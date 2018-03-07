package com.jeiker.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * @author : xiao
 * @date : 2018/3/7 上午9:03
 * @description :
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hi")
    public Map<String, String> sayHi() {
        return Collections.singletonMap("message", "hello world!");
    }

}
