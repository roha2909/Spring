package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zensar.Services.UserService;
import com.zensar.entities.User;

@Controller //request processing component
public class UserController {
	@Autowired
private UserService userService; 
	@PostMapping("login") //getmapping("login") nd in login.jsp method=("get")
	public String checkLogin(User user,ModelMap map)   //requestProcessing method
	{
		if (userService.validateUser(user))
		{
			map.addAttribute("usernm", user.getUsername());
			return "welcome"; //logical view name
		}
		else {
			map.addAttribute("logonerror", "Invalid username or password");
			return "login";
		}
	}
	
}
