package com.xworkz.assetmanagement.dao;

import com.xworkz.assetmanagement.dto.LoginDTO;
import com.xworkz.assetmanagement.entity.LoginEntity;
import com.xworkz.assetmanagement.exception.LoginDAOException;

public interface LoginDAO {

	public LoginEntity getUserDetails(LoginDTO loginDTO);
}
