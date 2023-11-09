package shape;

import base.ShapeBase;

/**
 * This class represents a circle extends from the ShapeBase base class
 */
public class Circle extends ShapeBase {
	
	/**
	 * Constructor for the Circle class
	 * @param name name of the Circle
	 * @param diameter this measures the diameter of the Circle
	 */
	public Circle(String name, int diameter) {
		super(name, diameter, 0);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Calculates the area of the Circle with the correct formula
	 */
	public int calculateArea() {
		double radius = width / 2.0;
		return (int) (Math.PI * radius * radius);
	}

}
