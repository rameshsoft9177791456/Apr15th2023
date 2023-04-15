package com.rameshsoft.automation.corejava;

public class ArraysDemo1 {
public static void main(String[] args) {
	
	int[][] i = new int[2][2];
	
	i[0][0] = 456;
	i[0][1] = 91456;
	i[1][0] = 456456;
	i[1][1] = 456;
	
	for(int i1=0; i1<i.length; i1++)
	{
		for(int j=0; j<i.length; j++)
		{
			System.out.println(i[i1][j]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
