package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value = "/hello/{player}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String helloPlayer(@PathVariable("player") String player) {
		return "Hello, " + player;
	}

}
