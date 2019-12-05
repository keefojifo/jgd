package com.jgd.test.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.jgd.test.dao.UserDAOImpl;

@Controller
public class UserController {

	@Resource
	private UserDAOImpl udao;
	
	@GetMapping("/users")
	public String getUserList(Model m,@RequestParam Map<String,String> param) {
	 m.addAttribute("user",udao.getUserList(null));

		return("/user/list");
	}
	
}
	
	
