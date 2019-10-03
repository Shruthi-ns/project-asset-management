package com.xworkz.assetmanagement.service;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.assetmanagement.dao.LoginDAO;
import com.xworkz.assetmanagement.dto.LoginDTO;
import com.xworkz.assetmanagement.entity.LoginEntity;

import org.springframework.util.StringUtils;

@Service
public class LoginServiceImpl implements LoginService {

	private static final Logger logger = Logger.getLogger(LoginServiceImpl.class);

	@Autowired
	private LoginDAO loginDAO;

	public LoginEntity login(LoginDTO loginDTO) {
		LoginEntity detailsFromDB = null;

		logger.info("login() method invoked from.." + this.getClass().getSimpleName());

		boolean validation=false;
		
		try {
			if(!StringUtils.isEmpty(loginDTO.getEmail())) {
				validation=true;
			}else {
				logger.info("email is required...");
			}
			if(!StringUtils.isEmpty(loginDTO.getPassword())) {
				validation=true;
			}else {
				logger.info(" Password is required...");
			}
			logger.info("entityFrom DB is..");
			detailsFromDB = loginDAO.getUserDetails(loginDTO);
			return detailsFromDB;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;

	}

}
