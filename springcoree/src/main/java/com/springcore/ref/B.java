package com.springcore.ref;

public class B {
  private int w;
  private int r;
  public int getW() {
	return w;
  }
  public void setW(int w) {
	this.w = w;
  }
  public int getR() {
	return r;
  }
  public void setR(int r) {
	this.r = r;
  }
  @Override
  public String toString() {
	return "B [w=" + w + ", r=" + r + "]";
  }
  public B(int w, int r) {
	super();
	this.w = w;
	this.r = r;
  }
  public B() {
	super();
	// TODO Auto-generated constructor stub
  }
  
}
