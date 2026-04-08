package com.springcore.ref;

public class A {
   private int x;
   private int y;
   
   private B b;

   public int getX() {
	return x;
   }

   public void setX(int x) {
	this.x = x;
   }

   public int getY() {
	return y;
   }

   public void setY(int y) {
	this.y = y;
   }

   public B getB() {
	return b;
   }

   public void setB(B b) {
	this.b = b;
   }

   @Override
   public String toString() {
	return "A [x=" + x + ", y=" + y + ", b=" + b + "]";
   }

   public A(int x, int y, B b) {
	super();
	this.x = x;
	this.y = y;
	this.b = b;
   }

   public A() {
	super();
	// TODO Auto-generated constructor stub
   }
   
   
}
