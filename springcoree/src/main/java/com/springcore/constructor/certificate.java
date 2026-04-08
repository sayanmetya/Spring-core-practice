package com.springcore.constructor;

public class certificate {
       private String cerName;
       private String cerduration;
	   public certificate(String cerName, String cerduration) {
		super();
		this.cerName = cerName;
		this.cerduration = cerduration;
	   }
	   @Override
	   public String toString() {
		return "certificate [cerName=" + cerName + ", cerduration=" + cerduration + "]";
	   }
	   public certificate() {
		super();
		// TODO Auto-generated constructor stub
	   }
       
       
}
