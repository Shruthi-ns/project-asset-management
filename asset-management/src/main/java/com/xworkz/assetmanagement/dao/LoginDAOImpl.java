package com.xworkz.assetmanagement.dao;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.assetmanagement.dto.LoginDTO;
import com.xworkz.assetmanagement.entity.LoginEntity;
import com.xworkz.assetmanagement.exception.LoginDAOException;

@Repository
public class LoginDAOImpl implements LoginDAO {

	private static final Logger logger = Logger.getLogger(LoginDAOImpl.class);

	@Autowired
	private SessionFactory factory;

	public LoginEntity getUserDetails(LoginDTO loginDTO) {

		logger.info("Invoked SaveInfo method of DAO");
		Session ses = null;

		try {
			logger.info("session started...");
			ses = factory.openSession();
			Transaction tx = ses.beginTransaction();
			Query query = ses.getNamedQuery("isValidUser");
			query.setParameter("email", loginDTO.getEmail());
			query.setParameter("password", loginDTO.getPassword());
			LoginEntity entity = (LoginEntity) query.uniqueResult();
			logger.info("Result is....." + entity);
			return entity;
		} catch (HibernateException e) {
			//throw new LoginDAOException("");

		} finally {
			ses.close();
			
		}
		return null;
	}

}
