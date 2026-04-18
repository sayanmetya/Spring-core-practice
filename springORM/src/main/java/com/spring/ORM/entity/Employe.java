package com.spring.ORM.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe {
	
   @Id	
   private int empId;
   private String empName;
   private String empAddress;
   private long empSalary;
   public int getEmpId() {
	return empId;
   }
   public void setEmpId(int empId) {
	this.empId = empId;
   }
   public String getEmpName() {
	return empName;
   }
   public void setEmpName(String empName) {
	this.empName = empName;
   }
   public String getEmpAddress() {
	return empAddress;
   }
   public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
   }
   public long getEmpSalary() {
	return empSalary;
   }
   public void setEmpSalary(long empSalary) {
	this.empSalary = empSalary;
   }
   public Employe(int empId, String empName, String empAddress, long empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empAddress = empAddress;
	this.empSalary = empSalary;
   }
   public Employe() {
	super();
	// TODO Auto-generated constructor stub
   }
   @Override
   public String toString() {
	return "Employe [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empSalary="
			+ empSalary + "]";
   }
   
}
