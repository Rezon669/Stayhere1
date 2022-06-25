package com.stayhere.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class Logincontroller {


	@Autowired
	Loginrepository loginrepository;
	
	@RequestMapping("/")
	//@ResponseBody
	public String loginpage() {
	
			return "login";
	}
	
	@RequestMapping("/loginvalidation")
	public String login(){
	
			return "homepage";
		}

	
	@RequestMapping("/home")
	public String homepage()
	{
		return "homepage";
		}
	
	
	
}
