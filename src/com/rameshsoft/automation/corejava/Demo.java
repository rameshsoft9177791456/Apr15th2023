package com.rameshsoft.automation.corejava;

abstract class DemoTest
{
	static int practHrs = 9;
	static String res = "JOB";
	
	static public void hello() {
		System.out.println("hello()");
		System.out.println(practHrs+"  "+res);
		System.out.println("java");
	}
}

public class Demo{
public static void main(String[] args) {
	System.out.println(DemoTest.practHrs);
	System.out.println(DemoTest.res);
	
	DemoTest.hello();
}
}




