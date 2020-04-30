package com.ohem2.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ohem2.ums.entity.Register;
import com.ohem2.ums.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value = "/register")
	public ModelAndView saveRegisterData(Register register) {
		registerService.saveRegisterData(register);
		return new ModelAndView("home.jsp");
	}
}
