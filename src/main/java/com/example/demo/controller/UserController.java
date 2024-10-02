package com.example.demo.controller;

import com.example.demo.service.User;
import com.example.demo.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    UserService userService;

    @GetMapping("")
    @ResponseBody
    public List<User> list() {
        List<User> users = userService.findAll();
        return users;
    }

    @GetMapping("/1/detail")
    @ResponseBody
    public User detail() {
        User user = userService.findById(1);
        return user;
    }
}
