package com.hyt.simon.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hyt.simon.util.WebServerInfoUtil;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/index")
    public String  list() {
        return "admin/index";
    }
	@RequestMapping("/welcome")
	public String  welcome(Model model) {
		model.addAttribute("hostName", WebServerInfoUtil.getHostName());
		model.addAttribute("hostAddress", WebServerInfoUtil.getHostAddress());
//		model.addAttribute("port", WebServerInfoUtil.getPort());
		return "admin/welcome";
	}
}
