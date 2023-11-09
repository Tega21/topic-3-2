package shape;

import base.ShapeBase;

/**
 * Class represent a triangle shape extends from the ShapeBase
 * base class
 */
public class Triangle extends ShapeBase {

	/**
	 * Constructor for the Triangle class
	 * @param name name of the Triangle
	 * @param width width of the Triangle
	 * @param height height if the Triangle
	 */
	public Triangle(String name, int width, int height) {
		super(name, width, height);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Method that calculates the area of the Triangle
	 */
	public int calculateArea() {
		return width * height/2;
	}
	
	

}
