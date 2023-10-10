/*File          : Methodoverloading.java
 *Description   :  Java program to calculate the area of different shapes using Method Overloading
 *Author        : Nandagopan L 
 * Version      : 1.0
 * Date			: 10/10/2023
 * */
package javalab;

public class Methodoverloading {
    public static void main(String [] args ) {
    	Shape shape=new Shape();
    	Shape.area(15,30); 
    	Shape.area(12.5f,3.5f);
    	Shape.area(17.5f);
    	
    	 
       }
    }
    	class Shape{
    	  int length;
    	  int breadth;
    	  public static void area(int length, int breadth) {
    		  System.out.println("Area of Rectangle="+(length*breadth));
    	  }
    	  public static void area(float height, float base) {
    		  System.out.println("Area oftriangle="+(0.5*height*base));
    	  }
    	  public static void area(float radius) {
    		  System.out.println("Area of circle="+(3.14*radius*radius));
    	 }
    	}
    


