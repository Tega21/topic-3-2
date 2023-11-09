package shape;

import base.ShapeBase;

/**
 * This class represents a Trapezoid shape extends from the ShapeBase base class
 */
public class Trapezoid extends ShapeBase {
	
	// Creating private variables to add for the trapezoid class since the formula is 
	// different when finding the Area
    private int base1;
    private int base2;

    /**
     * Constructor for the Trapezoid class
     * @param name name of the Trapezoid
     * @param base1 first base of the Trapezoid
     * @param base2 second base of the Trapezoid
     * @param height the height of the trapezoid
     */
    public Trapezoid(String name, int base1, int base2, int height) {
        super(name, 0, height); // Width is not used in the trapezoid
        this.base1 = base1;
        this.base2 = base2;
    }
    
    /**
     * Method to calculate area of the trapezoid
     */
    @Override
    public int calculateArea() {
        return (int) ((0.5 * (base1 + base2)) * height);
    }
}
