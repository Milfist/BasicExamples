package com.milfist.dataForRefenrence;

public class code2 {
	
	public static void main (String arg[]) {		
		Integer[] number = {123};
		addTen(number);
		System.out.println(number[0]);	
	}
	
	public static void addTen (Integer[] param) {
		param[0] += 10;		
	}
}
