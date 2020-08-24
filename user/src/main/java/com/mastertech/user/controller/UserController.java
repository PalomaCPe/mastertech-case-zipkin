package com.mastertech.user.controller;

import com.mastertech.user.DTO.UserMapper;
import com.mastertech.user.DTO.UserRequest;
import com.mastertech.user.DTO.UserResponse;
import com.mastertech.user.model.User;
import com.mastertech.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse save(@RequestBody UserRequest userRequest) {
        User user = userMapper.toUser(userRequest);
        user = userService.save(user);
        return userMapper.toClienteResponse(user);
    }
}