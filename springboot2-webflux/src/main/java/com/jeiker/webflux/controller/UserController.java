package com.jeiker.webflux.controller;

import com.jeiker.webflux.model.User;
import com.jeiker.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Objects;

/**
 * @author : xiao
 * @date : 2018/3/7 下午2:31
 * @description :
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Resource not found")
    @ExceptionHandler(Exception.class)
    public void notFound() {
    }

    @GetMapping("")
    public Flux<User> list() {
        return this.userService.list();
    }

    @GetMapping("/{id}")
    public Mono<User> getById(@PathVariable("id") final String id) {
        return this.userService.getById(id);
    }

    @PostMapping("")
    public Flux<User> create(@RequestBody final Flux<User>  users) {
        return this.userService.createOrUpdate(users);
    }

    @PutMapping("/{id}")
    public Mono<User>  update(@PathVariable("id") final String id,
                              @RequestBody final User user) {
        Objects.requireNonNull(user);
        user.setId(id);
        return this.userService.createOrUpdate(user);
    }

    @DeleteMapping("/{id}")
    public Mono<User>  delete(@PathVariable("id") final String id) {
        return this.userService.delete(id);
    }
}