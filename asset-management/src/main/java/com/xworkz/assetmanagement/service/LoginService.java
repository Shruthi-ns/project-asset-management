package com.xworkz.assetmanagement.service;

import com.xworkz.assetmanagement.dto.LoginDTO;
import com.xworkz.assetmanagement.entity.LoginEntity;

public interface LoginService {

	public LoginEntity login(LoginDTO loginDTO);
}
