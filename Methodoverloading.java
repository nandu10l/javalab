/*File          : Methodoverloading.java
 *Description   :  Java program to calculate the area of different shapes using Method Overloading
 *Author        : Nandagopan L 
 * Version      : 1.0
 * Date			: 10/10/2023
 * */
package javalab;
import java.util.Scanner;
public class Methodoverloading {
    public static void main(String [] args ) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the choice: 1. Rectangle \n 2. Triangle \n 3. Circle");
    	int choice;
    	choice =sc.nextInt();
    	Shape shape=new Shape();
    	if(choice==1) {
    	System.out.println("enter the length:");
    	int length =sc.nextInt();
    	System.out.println("enter the breadth:");
    	int breadth =sc.nextInt();
    	Shape.area(length,breadth);
    	}
    	else if(choice==2) {
    		System.out.println("enter the height:");
        	float height =sc.nextFloat();
        	System.out.println("enter the base:");
        	float base =sc.nextFloat();
        	Shape.area(height,base);
    	}
    	else if(choice==3) {
    		System.out.println("enter the radius:");
        	float radius =sc.nextFloat();
        	Shape.area(radius);
    	}
    	else {
    		System.out.println("invalid choice");
    	}
    		
    	
    	 
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
    


