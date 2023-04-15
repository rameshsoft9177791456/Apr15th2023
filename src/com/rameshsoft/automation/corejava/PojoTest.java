package com.rameshsoft.automation.corejava;

class PojoDemo
{
	private int practHrs = 9;
	private String result = "JOB";
	private double sal = 125000;
	
	public int getPractHrs() {
		return practHrs;
	}
	
	public String getResult() {
		return result;
	}
	
	public double getSal() {
		return sal;
	}
}

public class PojoTest {
public static void main(String[] args) {
	PojoDemo demo = new PojoDemo();
	System.out.println(demo.getPractHrs());
	System.out.println(demo.getResult());
	System.out.println(demo.getSal());
	
}
}





