package com.springcore.wire.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class person {
	@Autowired
    private address add;

	public address getAdd() {
		return add;
	}

	public void setAdd(address add) {
		this.add = add;
	}

	public person(address add) {
		super();
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
