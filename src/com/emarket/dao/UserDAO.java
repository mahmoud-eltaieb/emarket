package com.emarket.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Local;

import com.emarket.domain.User;

@Local
public interface UserDAO extends Serializable{

	/**
	 * 
	 */
	
	User addUser(User Member);

	List<User> getAllUsers();

	User getUserByID(Long l);

	User getUserByUserName(String userName);

	void updateUserByID(User user);
	
	

}
