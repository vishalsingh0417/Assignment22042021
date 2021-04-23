package com.assignment.mathopdemo.demo;

abstract class MathOp{
	
	public abstract void addition();
	public abstract void subtraction();
	public abstract void multiplication();
	public abstract void division();
	
	double num1=10,num2=5;

}

class A extends MathOp{

	@Override
	public void addition() {
	System.out.println("Addition : " +(num1+num2));
		
	}

	@Override
	public void subtraction() {
		System.out.println("Subtraction : " +(num1-num2));

		
	}

	@Override
	public void multiplication() {
		System.out.println("Multiplication : " +(num1*num2));

		
	}

	@Override
	public void division() {
		System.out.println("Division : " +(num1/num2));

		
	}
	
	
}

public class MathDemo {

	public static void main(String[] args) {
		
		A a=new A();
		a.addition();
		a.subtraction();
		a.multiplication();
		a.division();

	}

}
