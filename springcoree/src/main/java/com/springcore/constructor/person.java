package com.springcore.constructor;

public class person {
    private String name;
    private String address;
	private certificate cer;
	

	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public certificate getCer() {
		return cer;
	}
	public void setCer(certificate cer) {
		this.cer = cer;
	}
	public person(String name, String address, certificate cer) {
		super();
		this.name = name;
		this.address = address;
		this.cer = cer;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + ", cer=" + cer + "]";
	}
    
    
}
