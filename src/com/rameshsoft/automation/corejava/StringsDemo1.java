package com.rameshsoft.automation.corejava;

public class StringsDemo1 {
public static void main(String[] args) {
	
	String str1 = " ja va ";
	
	String str2 = str1.toUpperCase();
	System.out.println(str2);
	
	String str3 = str1.toLowerCase();
	System.out.println(str3);
	
	char ch = str1.charAt(2);
	System.out.println(ch);
	
	System.out.println(str1.indexOf('s'));
	
	String str4 = str1.concat("java");
	System.out.println(str4);
	
	String str5 = str1.trim();
	System.out.println(str5);
	
	String str6 = str1.replace('a', 'd');
	System.out.println(str6);
	
	String str7 = str1.replaceAll("va", "java");
	System.out.println(str7);
	
	boolean status = str1.contains("ja");
	System.out.println(status);
	
	boolean status1 = str1.equalsIgnoreCase("java");
	System.out.println(status1);
	
	
	boolean status2 = str1.endsWith("va");
	System.out.println(status2);
	
	String[] str9 = str1.split(""); //java
	for(String str : str9) {
		System.out.println(str);
	}
	
	String[] str10 = str1.split(" ");
	for(String str : str10) {
		System.out.println(str);
	}
	
	String str11 = str1.substring(2);
	System.out.println(str11);
	
	String str12 = str1.substring(2, 4);//selenium
	System.out.println(str12);
	
	
	
	
	
	
}
}
