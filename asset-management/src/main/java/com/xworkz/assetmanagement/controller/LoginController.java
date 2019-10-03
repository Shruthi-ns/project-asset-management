package com.xworkz.assetmanagement.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.xworkz.assetmanagement.dto.LoginDTO;
import com.xworkz.assetmanagement.entity.LoginEntity;
import com.xworkz.assetmanagement.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;

	public LoginController() {
		logger.info("created..." + this.getClass().getSimpleName());
	}

	@PostMapping("/login")
	public ModelAndView onLogin(LoginDTO loginDTO) {

		LoginEntity loginInfofromDB = loginService.login(loginDTO);

		if (loginInfofromDB != null) {
			logger.info("Everything looks fine...");
			if (loginInfofromDB.getRole().equalsIgnoreCase("Admin")) {
				return new ModelAndView("admin");
			} else if (loginInfofromDB.getRole().equalsIgnoreCase("User")) {
				return new ModelAndView("user");
			} else {
				logger.info("Invalid credencials...");
			}
		}

		return null;

	}
}
