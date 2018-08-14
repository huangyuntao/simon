package com.hyt.simon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hyt.simon.bean.User;

@Controller
@RequestMapping("/th")
public class ThController {
	
	@RequestMapping("/list")
    public String  listUser(Model model) {
        List<User> userList = new ArrayList<User>();
        for (int i = 0; i <10; i++) {
            userList.add(new User(i,"张三"+i,20+i+"","中国广州"));
        }
        model.addAttribute("users", userList);
        return "/user/list";
    }
}
