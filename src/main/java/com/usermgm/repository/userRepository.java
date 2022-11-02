package com.usermgm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermgm.model.user;

public interface userRepository extends JpaRepository<user,Integer> {


	
}
