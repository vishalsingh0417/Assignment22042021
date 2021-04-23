package com.assignment.motor.demo;

abstract class Motorcycle{
	
	public abstract void start();
	public void have_tyres() {
		System.out.println("There are two tyres");
		}
}

class OldBike extends Motorcycle{

	@Override
	public void start() {
		System.out.println("I start with Kick");
		
	}
	
	}
	

class NewBike extends Motorcycle{

	@Override
	public void start() {
		System.out.println("I have self start");
		
	}

	

		
	}
	
	


public class MotorDemo {

	public static void main(String[] args) {
		
		OldBike ob=new OldBike();
		ob.start();
		ob.have_tyres();
		
		System.out.println("=====================================================");
		
		NewBike nb=new NewBike();
		nb.start();
		nb.have_tyres();

	}

}
