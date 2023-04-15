package com.rameshsoft.automation.corejava;

class Parent
{
	final int id = 456;

	public void study() {
		//id = 456789;
		System.out.println("PC: study()");
	}
	public void job() {
		System.out.println("PC: job()");
	}
	static public void money() {
		System.out.println("PC: money()");
	}
	public void friends() {
		System.out.println("PC: friends()");
	}
}
class Child extends Parent
{
	//method hiding
	static public void money() {
		System.out.println("CC: I want more money()");
	}
	@Override
	public void study() {
		System.out.println("CC: I don't study()");
	}
	public void marriage() {
		System.out.println("CC: marriage()");
	}
	public void family() {
		System.out.println("CC: family()");
	}
	;;;;;;;;;;;;;;;;;;;;;;;;;//200 methods
}
public class OverrideTest {
public static void main(String[] args) {
	
	/*Parent parent = new Parent();
	parent.friends();
	parent.job();
	parent.money();
	parent.play();
	parent.study();
	*/
	
	/*Child child = new Child();
	child.friends();
	child.job();
	child.money();
	child.play();
	child.study();
	child.family();
	child.marriage();*/
	
	
	Parent parent = new Child();
	//parent.friends();
	//parent.job();
	parent.money();
	//parent.play();
	parent.study();
	
	
	
	
	
	
}
}
