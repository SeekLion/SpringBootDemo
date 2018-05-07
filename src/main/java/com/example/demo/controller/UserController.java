package com.example.demo.controller;

import com.example.demo.entity.UserBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String index(){
        return "user/index";
    }
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    @ResponseBody
    public String show(@RequestParam(value = "name")String name){
        UserBean user =userService.findUserByName(name);
        if (null!=user){
            return user.getId()+"/"+user.getName()+"/"+user.getPassword();
        }else{

            return "null";
        }

    }
}
