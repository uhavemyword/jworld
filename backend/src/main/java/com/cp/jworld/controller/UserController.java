package com.cp.jworld.controller;

import java.util.List;

import com.cp.jworld.model.User;

import com.cp.jworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAll() {
        return this.userService.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Integer id) {
        return this.userService.getById(id);
    }

    @GetMapping("/insert")
    public User insert(@RequestParam("name") String name, @RequestParam(name = "email", required = false) String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userService.insert(user);
        return user;
    }

    @GetMapping("/update/{id}")
    public User update(@PathVariable("id") Integer id) {
        User user = userService.getById(id);

        // switch name and email
        String name = user.getName();
        user.setName(user.getEmail());
        user.setEmail(name);
        userService.update(user);
        return user;
    }

    @GetMapping("/delete/{id}")
    public List<User> delete(@PathVariable("id") Integer id) {
        userService.deleteById(id);
        return getAll();
    }
}
