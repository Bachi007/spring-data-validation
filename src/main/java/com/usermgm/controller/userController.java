package com.usermgm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usermgm.dto.userDTO;
import com.usermgm.model.user;
import com.usermgm.service.userService;

@RestController
@RequestMapping("/user")
public class userController {

	@Autowired
	private userService service;
	
	@PostMapping("/add")
	public ResponseEntity<user> addUser(@RequestBody @Valid userDTO u1){
	
		return new ResponseEntity<>(service.addUser(u1),HttpStatus.OK);
		
	}
	
	@GetMapping("/retrive")
	public ResponseEntity<List<user>> getUser(){
		
		
		return new ResponseEntity<>(service.getUser(),HttpStatus.ACCEPTED);
		
		
	}
	
}
