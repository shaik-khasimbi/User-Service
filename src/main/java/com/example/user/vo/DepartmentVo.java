package com.example.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentVo {
	
	private long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	

}
