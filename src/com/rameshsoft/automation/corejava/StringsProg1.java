package com.rameshsoft.automation.corejava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsProg1 {
public static void main(String[] args) {
	
	String str1 = "java456";
	
	int sum = 0;//15
	
	char[] ch = str1.toCharArray();
	
	for(char ch1 : ch) {
		if (Character.isDigit(ch1)) {//'6'
			int val = Character.getNumericValue(ch1);//6
			sum = sum + val;//9 + 6
		}
	}
	
	System.out.println("SUM IS: "+sum);
	
	
	
	
	
	
	
	
	
	/*Pattern pattern = Pattern.compile("[0-9]");
	Matcher matcher = pattern.matcher(str1);
	
	while(matcher.find())
	{
		String str = matcher.group();
		int val = Integer.parseInt(str);
		sum = sum + val;
	}
	System.out.println("SUM IS: "+sum);
	*/
	
	//String str2 = "456";
	
	/*int val1 = Integer.parseInt(str2);
	System.out.println(val1); //456
	
	Integer val2 = Integer.valueOf(val1);
	System.out.println(val2);
	
	Integer val3 = Integer.valueOf(str2);
	System.out.println(val3);
	
	
	double d1 = Double.parseDouble(str2);
	System.out.println(d1);
	
	*/
	
	//str1.length();
	
	/*int length = 0;
	String[] str2 = str1.split("");
	for(String str3 : str2)
	{
		System.out.println(str3);
		length++;
	}
	
	System.out.println("Length of the string is: "+length);
	*/
	
	
	/*String reverse = "";//ava
	
	for(int i=str1.length()-1; i>=0; i--)
	{
		reverse = reverse + str1.charAt(i); //"ava" +j
	}
	
	System.out.println("Reverse of the string is: "+reverse);
	*/
	
	/*StringBuilder sb = new StringBuilder(str1);
	StringBuilder sb1 = sb.reverse();
	System.out.println(sb1);*/
	
	
}
}
