package com.rameshsoft.automation.corejava;

public class ObjectDemo implements Cloneable{
	
	public String toString() {
		return "JAVA";
	}
	public int hashCode() {
		return 456;
	}
	int id = 456;
	String res = "JOB";
	
	public void hello() {
		System.out.println(id+"  "+res);
	}
	
public static void main(String[] args) throws CloneNotSupportedException {
	
	ObjectDemo demo = new ObjectDemo();
	Object object = demo.clone();
	
	ObjectDemo demo1 = (ObjectDemo) object;
	demo1.id = 91456;
	demo1.res = "JOB";
	
	demo1.hello();
	
	
	
	
	
	
	
	
	
	
	
	
	/*int hashCode = demo.hashCode();
	System.out.println(hashCode);
	System.out.println(demo.toString());
	System.out.println(demo);
	*/

	
}
}


