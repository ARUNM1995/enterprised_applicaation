package com.ohem2.ums.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohem2.ums.dao.LoginDao;
import com.ohem2.ums.entity.LoginDTO;
import com.ohem2.ums.entity.Register;
@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;
	
	public Register login(LoginDTO loginDTO) {
		return loginDao.login(loginDTO);
	}
}
