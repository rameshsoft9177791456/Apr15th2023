package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	
	//List list = new List();
	//List list = new ArrayList<>();
	//Collection collection = new ArrayList<>();
	ArrayList al = new ArrayList();
	al.add(456);
	al.add("java");
	al.add('a');
	al.add(456);
	al.add(null);
	al.add(456);
	al.add(456);
	al.add("JOB");
	System.out.println(al);
	
	al.add(0, "selenium");
	System.out.println(al);
	
	Object object = al.get(0);
	System.out.println(object);
	
	
	
	
	
	
	
}
}
