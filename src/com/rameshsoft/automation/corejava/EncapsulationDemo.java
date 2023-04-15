package com.rameshsoft.automation.corejava;


class EncapsulationTest
{
	private int practHrs = 9;
	private String result = "JOBS";
	
	public int getPractHrs() {
		return practHrs;
	}
	
	public String getResult() {
		return result;
	}
	
	public void hello() {
		System.out.println(practHrs+"  "+result);
	}	
}
public class EncapsulationDemo {
public static void main(String[] args) {
	EncapsulationTest test = new EncapsulationTest();
	
	System.out.println(test.getPractHrs());
	System.out.println(test.getResult());
	
	test.hello();
}
}

