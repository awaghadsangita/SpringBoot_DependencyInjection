package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	private int cust_id;
	private String custName;
	private String courseName;
	@Autowired
	private Technologies techDetails;
	public Technologies getTechDetails() {
		return techDetails;
	}
	public void setTechDetails(Technologies techDetails) {
		this.techDetails = techDetails;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void display() {
		System.out.println("Customer Object return successfully");
	}
	

}
