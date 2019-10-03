package com.xworkz.assetmanagement.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/")
public class WelcomeController {

	private static final Logger logger=Logger.getLogger(WelcomeController.class);
	
	
	public WelcomeController() {
		logger.info("Created.."+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value="goToLogin",method=RequestMethod.GET)
	public ModelAndView onWelcome() {
		logger.info("inside onWelcome");
		ModelAndView modelAndView=new ModelAndView("login");
		
		return modelAndView;
		
	}
}
