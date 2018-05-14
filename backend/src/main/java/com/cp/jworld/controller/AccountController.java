package com.cp.jworld.controller;

import com.cp.jworld.common.JwtTokenHelper;
import com.cp.jworld.model.LoginModel;
import com.cp.jworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody LoginModel loginModel) {
        if ("a".equals(loginModel.getUsername()) && "a".equals(loginModel.getPassword())) {
            return JwtTokenHelper.create(loginModel.getUsername(), new String[]{"rolea", "roleb"});
        }
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Username or password is incorrect!");
    }
}
