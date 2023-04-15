package com.rameshsoft.automation.corejava;

public class StringsDemo {
public static void main(String[] args) {
	
	StringBuilder sb1 = new StringBuilder("java");
	
	StringBuilder sb2 = sb1.append("selenium");
	
	
	System.out.println(sb1);
	System.out.println(sb2);
	
	System.out.println(sb1.toString());
	System.out.println(sb2.toString());
	
	System.out.println(sb1.hashCode());
	System.out.println(sb2.hashCode());
	
	if (sb1 == sb2) {
		System.out.println("Both are pointing to same");
	}
	else {
		System.out.println("Both are pointing to diff");
	}
	
	
	
	
	
	
	
	
	
	/*String str1 = "java";
	
	String str2 = str1.concat("selenium");
	
	System.out.println(str1);
	System.out.println(str2);
	
	System.out.println(str1.hashCode());
	System.out.println(str2.hashCode());
	
	System.out.println(str1.toString());
	System.out.println(str2.toString());
	
	if (str1 == str2) {
		System.out.println("Both are pointing same");
	}
	else {
		System.out.println("Both are pointing different");
	}*/
	
	
}
}
