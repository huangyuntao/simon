package com.hyt.simon.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/index")
    public String  list() {
        return "admin/index";
    }
	@RequestMapping("/welcome")
	public String  welcome() {
		return "admin/welcome";
	}
}
