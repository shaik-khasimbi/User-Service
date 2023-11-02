package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.UserEntity;
import com.example.user.service.UserService;
import com.example.user.vo.ResponseTemplate;

@RestController
@RequestMapping("/userDetails")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public UserEntity saveUserDetails(@RequestBody UserEntity userEntity) {
		return userService.saveUserDetails(userEntity);
	}
	
	@GetMapping("/getDEPTInfoByUserId/{id}")
	public ResponseTemplate getuserDeatils(@PathVariable("id") Long userId) {
		return userService.getuserDeaprmentDeatils(userId);
		
	}

}
