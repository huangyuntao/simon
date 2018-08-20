package com.hyt.simon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@RequestMapping("/")
    public String  list() {
        return "index";
    }
	
	@RequestMapping("/ok")
	@ResponseBody
	public String  ok() {
		return "ok";
	}
	
	@RequestMapping("/webSocket/test")
    public String  test() {
        return "webSocket/test";
    }
}
