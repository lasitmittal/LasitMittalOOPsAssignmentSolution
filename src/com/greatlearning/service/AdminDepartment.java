package com.greatlearning.service;

import com.greatlearning.model.*;  //extending the Super Department
	

public class AdminDepartment extends SuperDepartment {
		
	// 3 methods one by one with their respective returns as mentioned in problem statement
	
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	
	}
	
}
