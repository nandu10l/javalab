/*File          : Abstract.java 
 *Description   : Java program to create an abstract class(Exercise to understand polymorphism)
 *Author        : Nandagopan L 
 * Version      : 1.0
 * Date			: 27/10/2023
 * */
package abs;


public class Abstract {
	public static void main(String [] args) {
		
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		Hexagon hexagon = new Hexagon();
		
		rectangle.numberofSides();
		triangle.numberofSides();
		hexagon.numberofSides();
    }
}
abstract class Shape{
	public abstract void numberofSides();
}

class Rectangle extends Shape{
	public void numberofSides() {
		System.out.println("Rectangle has 4 sides");
	}
}

class Triangle extends Shape{
	public void numberofSides() {
		System.out.println("Triangle has 3 sides");
	}
}
class Hexagon extends Shape{
	public void numberofSides() {
		System.out.println("Hexagon has 6 sides");
	}
}
