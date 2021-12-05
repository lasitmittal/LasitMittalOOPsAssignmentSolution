package com.greatlearning.service;

import com.greatlearning.model.SuperDepartment;  //extending the Super Department

public class TechDepartment extends SuperDepartment {
	
	// 4 methods one by one with their respective returns as mentioned in problem statement
	
	public String departmentName() {
		return "Tech Department";
	}
	
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		return "Core Java";
	}

}
