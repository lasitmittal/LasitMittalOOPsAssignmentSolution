package com.greatlearning.service;

import com.greatlearning.model.SuperDepartment; //extending the Super Department
public class HrDepartment extends SuperDepartment {
	
	// 4 methods one by one with their respective returns as mentioned in problem statement
	
	public String departmentName() {
		return "Hr Department";
	}
	
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}

}