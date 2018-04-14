package com.milfist.usingStatic;

public class Area {
	
	public static double quadrateStatic(double quadrateSide){
		return Math.pow(quadrateSide, 2);
	}
	
	public static double rectangleStatic(double rectangleSide1, double rectangleSide2) {
		return rectangleSide1 * rectangleSide2;
	}
	
	public double quadrate(double quadrateSide){
		return Math.pow(quadrateSide, 2);
	}
	
	public double rectangle(double rectangleSide1, double rectangleSide2) {
		return rectangleSide1 * rectangleSide2;
	}
	
}
