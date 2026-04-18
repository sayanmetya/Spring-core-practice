package com.spring.ORM.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StuDetails")
public class Student {
	   
	   @Id
       private int stuId;
       private String stuName;
       private String stuAdd;
	   public int getStuId() {
		   return stuId;
	   }
	   public void setStuId(int stuId) {
		   this.stuId = stuId;
	   }
	   public String getStuName() {
		   return stuName;
	   }
	   public void setStuName(String stuName) {
		   this.stuName = stuName;
	   }
	   public String getStuAdd() {
		   return stuAdd;
	   }
	   public void setStuAdd(String stuAdd) {
		   this.stuAdd = stuAdd;
	   }
	   public Student(int stuId, String stuName, String stuAdd) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAdd = stuAdd;
	   }
	   public Student() {
		super();
		// TODO Auto-generated constructor stub
	   }
	   @Override
	   public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAdd=" + stuAdd + "]";
	   }
       
}
