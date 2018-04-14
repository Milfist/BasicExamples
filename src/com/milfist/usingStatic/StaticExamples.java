package com.milfist.usingStatic;

/**
 * Examples of using static. Attributes, methods and classes.
 * 
 * @author Mik
 *
 */
public class StaticExamples {
	
	private static double rectangleSide1 = 5;
	private static double num1 = 3;
	private static double num2 = 9;

	private static double quadrateSide = 6;
	
	public static void main (String arg[]) {		
		
		System.out.println("Static: El area de un cuadrado cuyo lado es " + quadrateSide + " : " + Area.quadrateStatic(quadrateSide));
		System.out.println("Static: El area de un rectangulo cuyos lados son " + rectangleSide1 + " y " + rectangleSide2(num1, num2) + " es " + Area.rectangleStatic(rectangleSide1, rectangleSide2(num1, num2)));
		
		Area area = new Area();
//Warning		area.quadrateStatic(quadrateSide); //The static method quadrateStatic(double) from the type Area should be accessed in a static way
		
		System.out.println("Non static: El area de un cuadrado cuyo lado es " + quadrateSide + " : " + area.quadrate(quadrateSide));
		System.out.println("Non static: El area de un rectangulo cuyos lados son " + rectangleSide1 + " y " + rectangleSide2(num1, num2) + " es " + area.rectangle(rectangleSide1, rectangleSide2(num1, num2)));

		Perimeter.quadrate();
		
		
	}
	
	public static double rectangleSide2(double num1, double num2) {
		return num1 + num2;		
	}
	
	public static class Perimeter {
        public static void quadrate(){
            System.out.println("El perimetro de un cuadrado cuyo lado es " + (quadrateSide * 4));
        }
        
    }
	
}