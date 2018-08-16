package com.hyt.simon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("draw")
public class DrawController {
	
	@RequestMapping("/")
    public String  draw() {
        return "draw";
    }
	
	@RequestMapping("/save")
	@ResponseBody
    public String  draw(@RequestParam(name="imgStr",required=true) String imgStr) {
        return "draw";
    }
}
