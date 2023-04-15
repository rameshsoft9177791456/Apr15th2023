package com.rameshsoft.automation.corejava;

public class ObjectArrayDemo {
public static void main(String[] args) {
	
	Object[] obj = new Object[6];
	obj[0] = 91456;
	obj[1] = 456;
	obj[2] = "java";
	obj[3] = 456.456;
	obj[4] = 456.456f;
	obj[5] = "hardwork";
	//obj[6] = 456456;

	
	for(int i=0; i<obj.length; i++)
	{
		System.out.println(obj[i]);
	}
	
	
}
}
