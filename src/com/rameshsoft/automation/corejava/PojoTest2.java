package com.rameshsoft.automation.corejava;

class PojoDemo2
{
	private int practHrs;
	private String result;
	private double sal;
	
	public void setPractHrs(int practHrs){
		this.practHrs = practHrs;
	}
	
	public void setResult(String result){
		this.result = result;
	}
	
	public void setSal(double sal){
		this.sal = sal;
	}
	
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

public class PojoTest2 {
public static void main(String[] args) {
	PojoDemo2 demo = new PojoDemo2();
	demo.setPractHrs(9);
	demo.setResult("JOB");
	demo.setSal(225000);
	System.out.println(demo.getPractHrs());
	System.out.println(demo.getResult());
	System.out.println(demo.getSal());
	
}
}





