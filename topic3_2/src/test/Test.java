package test;

import base.ShapeBase;
import shape.Circle;
import shape.Rectangle;
import shape.Trapezoid;
import shape.Triangle;

public class Test {
	
	public static void displayArea(ShapeBase shape) {
		System.out.println("This is a shape named " + shape.getName() + " with an area of " + shape.calculateArea());
	}

	public static void main(String[] args) {
		// Create an array of Base Shapes and initialize to specific shapes
		ShapeBase[] shapes = new ShapeBase[4];
		shapes[0] = new Rectangle("Rectangle", 10, 200);
		shapes[1] = new Triangle("Triangle", 10, 50);
		shapes[2] = new Circle("Circle", 20);
		shapes[3] = new Trapezoid("Triangle", 10, 20, 5);
		
		// For all Shapes display its area
		for (int i = 0; i < shapes.length; i++) {
			displayArea(shapes[i]);
		}

	}

}
