package com.hyt.simon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
    public String  list() {
		System.out.println("index");
        return "index";
    }
}
