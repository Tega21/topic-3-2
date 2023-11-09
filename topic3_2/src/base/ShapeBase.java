package base;

/**
 * This is the base class for all the shapes we will be creating
 * in the shape package. This class contains properties like name, 
 * width, and height and a method imported from the ShapeInterface
 * that calculates the area of the shape. 
 */
public class ShapeBase implements ShapeInterface{
	
	protected String name;
	protected int width;
	protected int height;
	
	/**
	 * Constructor for the ShapeBase class	
	 * @param name name of the shape
	 * @param width the width of the shape
	 * @param height the height of the shape
	 */
	public ShapeBase(String name, int width, int height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}
		
	/**
	 * Getter method to get the name of the shape
	 * @return the name of the shape
	 */
	
	public String getName() {
		return this.name;
	}
	
	/**
	 * Method imported from the ShapeInterface that we implement in this class
	 */
	public int calculateArea() {
		return -1;
	}
	

}
