package com.usermgm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermgm.dto.userDTO;
import com.usermgm.exception.globalException;
import com.usermgm.model.user;
import com.usermgm.repository.userRepository;

@Service
public class userService {

	@Autowired
	private userRepository userepo;	

	
	
	public user addUser(userDTO u1) {
	
		user u2=user.build(u1.getUserId(), u1.getUserName(), u1.getUserPhone(), u1.getUserEmail(),u1.getUserPassword());
		
		
		return userepo.save(u2);
		
	}
	
	public List<user> getUser(){
		return userepo.findAll();
	}
	
	
	public String deleteUser(int id)  {
	
		userepo.deleteById(id);
		return "Deleted!...";
	}
	
	public user updateUser(userDTO u1) {
		
user u2=user.build(u1.getUserId(), u1.getUserName(), u1.getUserPhone(), u1.getUserEmail(),u1.getUserPassword());
		
		
		return userepo.save(u2);
	}
	
	
	
	
	
}
