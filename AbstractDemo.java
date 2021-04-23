package com.assignment.abstractdemo.deom;



 abstract class A{
	
	public abstract void display();
	public void show() {
		System.out.println("Inside show() of Abstrat class A");
	}
	
}
 
 
 class B extends A{
	 
	 public void display() {
		 
		 System.out.println("Inside class B");
	 }
 }

public class AbstractDemo {

	public static void main(String[] args) {
	
		B b=new B();
		b.display();
		b.show();

	}

}
