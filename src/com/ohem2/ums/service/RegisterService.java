package com.ohem2.ums.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohem2.ums.dao.RegisterDao;
import com.ohem2.ums.entity.Register;

@Service
public class RegisterService {

	@Autowired
	private RegisterDao registerDao;
	
	public void saveRegisterData(Register register) {
		registerDao.saveRegisterData(register);
	}
}
