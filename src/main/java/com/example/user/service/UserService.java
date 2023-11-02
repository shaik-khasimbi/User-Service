package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.entity.UserEntity;
import com.example.user.repostiory.UserRepostiory;
import com.example.user.vo.DepartmentVo;
import com.example.user.vo.ResponseTemplate;

@Service
public class UserService {
	
	@Autowired
	private UserRepostiory userRepostiory;
	
	@Autowired
	private RestTemplate restTemplate;

	public UserEntity saveUserDetails(UserEntity userEntity) {
		return userRepostiory.save(userEntity);
	}

	public ResponseTemplate getuserDeaprmentDeatils(Long userId) {
		
	 ResponseTemplate responseTemplate= new ResponseTemplate();
	 UserEntity userEntity =  userRepostiory.findByUserId(userId);
	 DepartmentVo departmentVo = restTemplate.getForObject("http://localhost:8080/departments/"+userEntity.getDepartmentId(), DepartmentVo.class);
	 responseTemplate.setUserEntity(userEntity);
	 responseTemplate.setDepartmentVo(departmentVo);
	 return responseTemplate;
	 
	}
		
}
