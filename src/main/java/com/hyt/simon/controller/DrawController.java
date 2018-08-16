package com.hyt.simon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("draw")
public class DrawController {
	
	@RequestMapping("/")
    public String  draw() {
        return "draw";
    }
}
