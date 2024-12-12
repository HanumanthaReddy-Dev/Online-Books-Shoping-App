package com.jlcindia.bookstore.service;

import com.jlcindia.bookstore.dao.DAOFactory; 
import com.jlcindia.bookstore.dao.UserDAO; 
import com.jlcindia.bookstore.to.UserTO; 

public class UserServiceImpl implements UserService{

	@Override
	public int registerUser(UserTO userTO) {
		System.out.println("UserService - registerUser()"); 
		 UserDAO userDAO= DAOFactory.getUserDAO(); 
		 return userDAO.registerUser(userTO); 
	}

	@Override
	public UserTO verifyUser(String username, String password) {
		 UserDAO userDAO= DAOFactory.getUserDAO(); 
		return userDAO.verifyUser(username, password);
	}

	@Override
	public String getPassword(String email) {
		UserDAO userDAO= DAOFactory.getUserDAO(); 
		 return userDAO.getPassword(email);
	}

	@Override
	public int changePassword(String email, String newPassword) {
		UserDAO userDAO= DAOFactory.getUserDAO(); 
		 return userDAO.changePassword(email , newPassword);
	}
	
	@Override 
	 public UserTO getUserByUserId(int userId) { 
	 System.out.println("UserServiceImpl-getUserByUserId()"); 
	 UserDAO userDAO=DAOFactory.getUserDAO(); 
	 UserTO userTO=userDAO.getUserByUserId(userId); 
	 return userTO; 
	}

	@Override
	public int updateProfile(UserTO userTO) {
		UserDAO userDAO= DAOFactory.getUserDAO(); 
		 return userDAO.updateProfile(userTO); 
	} 
	
 } 


