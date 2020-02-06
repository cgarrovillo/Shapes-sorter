/**
 * 
 */
package problemDomain;

/** ********************************************* **
 * Assignment2 - problemDomain.Pyramid.java
 * @author Christian Garrovillo
 * Information and Communications Technologies
 * Software Development	
 *
 ** ********************************************* **
 */
public class Pyramid extends Shape{

	private double side;
	
	public Pyramid(double height, double side) {
		super(height);
		setSide(side);
	}

	@Override
	public double calcBaseArea() {
		return Math.pow(getSide(), 2);
	}

	@Override
	public double calcVolume() {
		return (calcBaseArea() * getHeight()) / 3;
	}

	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nPyramid \t[calcBaseArea()=" + calcBaseArea() + ", calcVolume()=" + calcVolume()
				+ ", getSide()=" + getSide() + ", getHeight()=" + getHeight() + ", side=" + side + "]";
	}
	
}
