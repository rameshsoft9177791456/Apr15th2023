package com.rameshsoft.automation.corejava;

abstract class AbstractTest
{
	public void study() {
		System.out.println("study");
	}
	abstract public void job();
	public abstract void sal();
}
abstract class AbstractTestOne extends AbstractTest
{
	@Override
	public void job() {
		System.out.println("job");
	}
	public void practice() {
		System.out.println("practice");
	}
}
class AbstractTestTwo extends AbstractTestOne
{
	@Override
	public void sal() {
		System.out.println("sal");
	}
	public void hardwork() {
		System.out.println("hardwork");
	}	
}

public class AbstractDemo {
public static void main(String[] args) {
	
	AbstractTestOne one = new AbstractTestTwo();
	//one.hardwork();
	one.job();
	one.practice();
	one.sal();
	one.study();
	
	
	
	//AbstractTest test = new AbstractTest();
	//AbstractTestOne one = new AbstractTestOne();
	/*AbstractTestTwo two = new AbstractTestTwo();
	two.hardwork();
	two.job();
	two.practice();
	two.sal();
	two.study();*/
	
}
}









