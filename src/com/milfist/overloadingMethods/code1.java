package com.milfist.overloadingMethods;

import java.util.Calendar;
import java.util.Date;

public class code1 {
	
	public static void main (String arg[]) {		
		
		printParam(1);
		printParam("Name");
		printParam(Calendar.getInstance().getTime());
	}
	
	public static void printParam (Integer param) {
		System.out.println("Param value = " + param );	
	}
	
	public static void printParam (String param) {
		System.out.println("Param value = " + param );	
	}
	
	public static void printParam (Date param) {
		System.out.println("Param value = " + param );	
	}
	
}
