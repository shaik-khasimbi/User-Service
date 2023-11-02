package com.example.user.vo;

import com.example.user.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {
	
	private UserEntity userEntity;
	
	private DepartmentVo departmentVo;

}
