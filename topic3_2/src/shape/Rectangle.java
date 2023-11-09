package shape;

import base.ShapeBase;

/**
 * This class represents a rectangle shape extends from the ShapeBase
 * base class
 */
public class Rectangle extends ShapeBase {
	
	/**
	 * Constructor for the Rectangle class
	 * @param name name of the Rectangle
	 * @param width The width of the rectangle
	 * @param height The height of the rectangle
	 */
	public Rectangle(String name, int width, int height) {
		super(name, width, height);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Method that calculates the area of the Rectangle	
	 */
	public int calculateArea() {
		return width * height;
	}

}
