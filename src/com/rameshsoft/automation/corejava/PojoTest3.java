package com.rameshsoft.automation.corejava;

class PojoDemo3
{
	private int practHrs;
	private String result;
	private double sal;
	
	public void setPractHrs(int pract){
		practHrs = pract;
	}
	
	public void setResult(String res){
		result = res;
	}
	
	public void setSal(double pay){
		sal = pay;
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

public class PojoTest3 {
public static void main(String[] args) {
	PojoDemo3 demo = new PojoDemo3();
	demo.setPractHrs(9);
	demo.setResult("JOB");
	demo.setSal(225000);
	System.out.println(demo.getPractHrs());
	System.out.println(demo.getResult());
	System.out.println(demo.getSal());
	
}
}





