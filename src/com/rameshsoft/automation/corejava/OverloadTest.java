package com.rameshsoft.automation.corejava;

class OverloadDemo
{
	public int addition(int num1,int num2) {
		int result =  num1+num2;
		System.out.println("int int Addition between 2 numbers is: "+result);
		return result;
	}
	public long addition(long num1,long num2) {
		long result =  num1+num2;
		System.out.println("long long Addition between 2 numbers is: "+result);
		return result;
	}
	public float addition(float num1,float num2) {
		float result =  num1+num2;
		System.out.println("float float Addition between 2 numbers is: "+result);
		return result;
	}
	public double addition(double num1,double num2) {
		double result =  num1+num2;
		System.out.println("double double Addition between 2 numbers is: "+result);
		return result;
	}
}

public class OverloadTest {
public static void main(String[] args) {
	OverloadDemo demo = new OverloadDemo();
	demo.addition(65,235);
	demo.addition(250l, 250l);
	demo.addition(500.50f, 500.50f);
	demo.addition(2500.0, 2500.50);
	
	
	
	//demo.addition('a', 'b');
	/*demo.addition(250l, 250l);
	demo.addition(500.50f, 500.50f);
	demo.addition(2500.0, 2500.50);
	*/
	
	
}
}




