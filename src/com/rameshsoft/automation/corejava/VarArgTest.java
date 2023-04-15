package com.rameshsoft.automation.corejava;

public class VarArgTest {
	
	public void hello(int i,String... str) {
		System.out.println("VAR ARG");
	}
	
	public void hello(String str) {
		System.out.println("Normal method");
	}
	
public static void main(String[] args) {
	
	VarArgTest test = new VarArgTest();
	test.hello(456);
	test.hello(456,"JOB");
	test.hello(456456,"java","selenium","job","hardwork");
	//test.hello(456);
}
}


