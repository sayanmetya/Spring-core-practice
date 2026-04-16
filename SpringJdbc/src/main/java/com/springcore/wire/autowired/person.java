package com.springcore.wire.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class person {
	@Autowired
    private address add;

	public address getAdd() {
		return add;
	}
	
	public void setAdd(address add) {
		System.out.println("this is setter");
		this.add = add;
	}

	public person(address add) {
		super();
		System.out.println("thisis constructor");
		this.add = add;
	}

	public person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "person [add=" + add + "]";
	}
    
}
