package com.boot.yl.controller;

//hello
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootController {
	@ResponseBody
	@RequestMapping("/request")
	public String request() {
		return "hello spring boot!";
	}
}
