package com.ohem2.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ohem2.ums.entity.LoginDTO;
import com.ohem2.ums.entity.Register;
import com.ohem2.ums.service.LoginService;
@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/login")
	public ModelAndView login(LoginDTO loginDTO) {
		Register register = loginService.login(loginDTO);
		if(register!=null) {
			return new ModelAndView("home.jsp","registerData",register);
		}else {
			return new ModelAndView("login.jsp","msg","Invalid credentials");
		}
	}
}
