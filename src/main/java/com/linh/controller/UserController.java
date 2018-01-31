package com.linh.controller;

import com.linh.model.User;
import com.linh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/hello")
    public String home(HttpServletRequest request){
        List<User> users = new ArrayList<User>();
        users = service.findAll();
        System.out.println(users);
        request.setAttribute("users",users);
        return ("/index");
    }
}
