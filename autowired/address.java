package com.springcore.wire.autowired;

public class address {
    private String vill;
    private String state;
	public String getVill() {
		return vill;
	}
	public void setVill(String vill) {
		this.vill = vill;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "address [vill=" + vill + ", state=" + state + "]";
	}
	public address(String vill, String state) {
		super();
		this.vill = vill;
		this.state = state;
	}
	public address() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
