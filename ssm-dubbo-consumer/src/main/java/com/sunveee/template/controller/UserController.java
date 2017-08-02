package com.sunveee.template.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunveee.template.model.User;
import com.sunveee.template.service.UserService;
import com.sunveee.template.util.PageHandler;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list")
    public String toIndex(@RequestParam(value = "pageNo", defaultValue = "0") Integer pageNo, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, Model model) {
        List<User> userPage = userService.getUserPage(pageNo, pageSize);
        model.addAttribute("userPage", userPage);
        int infoCount = userService.getAllUserCount();
        PageHandler.handlePage(pageNo, pageSize, infoCount, model);
        return "user-list";
    }

}